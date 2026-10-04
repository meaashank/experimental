package org.apache.commons.lang3.reflect;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import org.apache.commons.lang3.ClassUtils;

/* JADX INFO: loaded from: classes6.dex */
abstract class MemberUtils {
    private static final int ACCESS_TEST = 7;
    private static final Class<?>[] ORDERED_PRIMITIVE_TYPES = {Byte.TYPE, Short.TYPE, Character.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE};

    public static int compareParameterTypes(Class<?>[] clsArr, Class<?>[] clsArr2, Class<?>[] clsArr3) {
        float totalTransformationCost = getTotalTransformationCost(clsArr3, clsArr);
        float totalTransformationCost2 = getTotalTransformationCost(clsArr3, clsArr2);
        if (totalTransformationCost < totalTransformationCost2) {
            return -1;
        }
        return totalTransformationCost2 < totalTransformationCost ? 1 : 0;
    }

    private static float getObjectTransformationCost(Class<?> cls, Class<?> cls2) {
        if (cls2.isPrimitive()) {
            return getPrimitivePromotionCost(cls, cls2);
        }
        float f10 = 0.0f;
        while (true) {
            if (cls != null && !cls2.equals(cls)) {
                if (cls2.isInterface() && ClassUtils.isAssignable(cls, cls2)) {
                    f10 += 0.25f;
                    break;
                }
                f10 += 1.0f;
                cls = cls.getSuperclass();
            } else {
                break;
            }
        }
        return cls == null ? f10 + 1.5f : f10;
    }

    private static float getPrimitivePromotionCost(Class<?> cls, Class<?> cls2) {
        float f10;
        if (cls.isPrimitive()) {
            f10 = 0.0f;
        } else {
            cls = ClassUtils.wrapperToPrimitive(cls);
            f10 = 0.1f;
        }
        int i10 = 0;
        while (cls != cls2) {
            Class<?>[] clsArr = ORDERED_PRIMITIVE_TYPES;
            if (i10 >= clsArr.length) {
                break;
            }
            if (cls == clsArr[i10]) {
                f10 += 0.1f;
                if (i10 < clsArr.length - 1) {
                    cls = clsArr[i10 + 1];
                }
            }
            i10++;
        }
        return f10;
    }

    private static float getTotalTransformationCost(Class<?>[] clsArr, Class<?>[] clsArr2) {
        float objectTransformationCost = 0.0f;
        for (int i10 = 0; i10 < clsArr.length; i10++) {
            objectTransformationCost += getObjectTransformationCost(clsArr[i10], clsArr2[i10]);
        }
        return objectTransformationCost;
    }

    public static boolean isAccessible(Member member) {
        return (member == null || !Modifier.isPublic(member.getModifiers()) || member.isSynthetic()) ? false : true;
    }

    public static boolean isPackageAccess(int i10) {
        return (i10 & 7) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setAccessibleWorkaround(AccessibleObject accessibleObject) {
        if (accessibleObject == 0 || accessibleObject.isAccessible()) {
            return;
        }
        Member member = (Member) accessibleObject;
        if (Modifier.isPublic(member.getModifiers()) && isPackageAccess(member.getDeclaringClass().getModifiers())) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException unused) {
            }
        }
    }
}
