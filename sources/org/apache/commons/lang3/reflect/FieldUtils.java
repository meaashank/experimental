package org.apache.commons.lang3.reflect;

import com.android.launcher3.IconCache;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import org.apache.commons.lang3.ClassUtils;

/* JADX INFO: loaded from: classes6.dex */
public class FieldUtils {
    public static Field getDeclaredField(Class<?> cls, String str) {
        return getDeclaredField(cls, str, false);
    }

    public static Field getField(Class<?> cls, String str) {
        Field field = getField(cls, str, false);
        MemberUtils.setAccessibleWorkaround(field);
        return field;
    }

    public static Object readDeclaredField(Object obj, String str) throws IllegalAccessException {
        return readDeclaredField(obj, str, false);
    }

    public static Object readDeclaredStaticField(Class<?> cls, String str) throws IllegalAccessException {
        return readDeclaredStaticField(cls, str, false);
    }

    public static Object readField(Field field, Object obj) throws IllegalAccessException {
        return readField(field, obj, false);
    }

    public static Object readStaticField(Field field) throws IllegalAccessException {
        return readStaticField(field, false);
    }

    public static void writeDeclaredField(Object obj, String str, Object obj2) throws IllegalAccessException {
        writeDeclaredField(obj, str, obj2, false);
    }

    public static void writeDeclaredStaticField(Class<?> cls, String str, Object obj) throws IllegalAccessException {
        writeDeclaredStaticField(cls, str, obj, false);
    }

    public static void writeField(Field field, Object obj, Object obj2) throws IllegalAccessException {
        writeField(field, obj, obj2, false);
    }

    public static void writeStaticField(Field field, Object obj) throws IllegalAccessException {
        writeStaticField(field, obj, false);
    }

    public static Field getDeclaredField(Class<?> cls, String str, boolean z10) {
        if (cls == null) {
            throw new IllegalArgumentException("The class must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("The field name must not be null");
        }
        try {
            Field declaredField = cls.getDeclaredField(str);
            if (MemberUtils.isAccessible(declaredField)) {
                return declaredField;
            }
            if (!z10) {
                return null;
            }
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    public static Object readDeclaredField(Object obj, String str, boolean z10) throws IllegalAccessException {
        if (obj == null) {
            throw new IllegalArgumentException("target object must not be null");
        }
        Class<?> cls = obj.getClass();
        Field declaredField = getDeclaredField(cls, str, z10);
        if (declaredField != null) {
            return readField(declaredField, obj);
        }
        throw new IllegalArgumentException("Cannot locate declared field " + cls.getName() + IconCache.EMPTY_CLASS_NAME + str);
    }

    public static Object readDeclaredStaticField(Class<?> cls, String str, boolean z10) throws IllegalAccessException {
        Field declaredField = getDeclaredField(cls, str, z10);
        if (declaredField != null) {
            return readStaticField(declaredField, false);
        }
        throw new IllegalArgumentException("Cannot locate declared field " + cls.getName() + IconCache.EMPTY_CLASS_NAME + str);
    }

    public static Object readField(Field field, Object obj, boolean z10) throws IllegalAccessException {
        if (field == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        if (!z10 || field.isAccessible()) {
            MemberUtils.setAccessibleWorkaround(field);
        } else {
            field.setAccessible(true);
        }
        return field.get(obj);
    }

    public static Object readStaticField(Field field, boolean z10) throws IllegalAccessException {
        if (field == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        if (Modifier.isStatic(field.getModifiers())) {
            return readField(field, (Object) null, z10);
        }
        throw new IllegalArgumentException("The field '" + field.getName() + "' is not static");
    }

    public static void writeDeclaredField(Object obj, String str, Object obj2, boolean z10) throws IllegalAccessException {
        if (obj == null) {
            throw new IllegalArgumentException("target object must not be null");
        }
        Class<?> cls = obj.getClass();
        Field declaredField = getDeclaredField(cls, str, z10);
        if (declaredField != null) {
            writeField(declaredField, obj, obj2);
            return;
        }
        throw new IllegalArgumentException("Cannot locate declared field " + cls.getName() + IconCache.EMPTY_CLASS_NAME + str);
    }

    public static void writeDeclaredStaticField(Class<?> cls, String str, Object obj, boolean z10) throws IllegalAccessException {
        Field declaredField = getDeclaredField(cls, str, z10);
        if (declaredField != null) {
            writeField(declaredField, (Object) null, obj);
            return;
        }
        throw new IllegalArgumentException("Cannot locate declared field " + cls.getName() + IconCache.EMPTY_CLASS_NAME + str);
    }

    public static void writeField(Field field, Object obj, Object obj2, boolean z10) throws IllegalAccessException {
        if (field == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        if (!z10 || field.isAccessible()) {
            MemberUtils.setAccessibleWorkaround(field);
        } else {
            field.setAccessible(true);
        }
        field.set(obj, obj2);
    }

    public static void writeStaticField(Field field, Object obj, boolean z10) throws IllegalAccessException {
        if (field == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        if (Modifier.isStatic(field.getModifiers())) {
            writeField(field, (Object) null, obj, z10);
            return;
        }
        throw new IllegalArgumentException("The field '" + field.getName() + "' is not static");
    }

    public static Field getField(Class<?> cls, String str, boolean z10) {
        Field declaredField;
        if (cls == null) {
            throw new IllegalArgumentException("The class must not be null");
        }
        if (str != null) {
            for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                try {
                    declaredField = superclass.getDeclaredField(str);
                } catch (NoSuchFieldException unused) {
                }
                if (!Modifier.isPublic(declaredField.getModifiers())) {
                    if (z10) {
                        declaredField.setAccessible(true);
                    } else {
                        continue;
                    }
                }
                return declaredField;
            }
            Iterator<Class<?>> it = ClassUtils.getAllInterfaces(cls).iterator();
            Field field = null;
            while (it.hasNext()) {
                try {
                    Field field2 = it.next().getField(str);
                    if (field != null) {
                        throw new IllegalArgumentException("Reference to field " + str + " is ambiguous relative to " + cls + "; a matching field exists on two or more implemented interfaces.");
                    }
                    field = field2;
                } catch (NoSuchFieldException unused2) {
                }
            }
            return field;
        }
        throw new IllegalArgumentException("The field name must not be null");
    }

    public static Object readStaticField(Class<?> cls, String str) throws IllegalAccessException {
        return readStaticField(cls, str, false);
    }

    public static void writeStaticField(Class<?> cls, String str, Object obj) throws IllegalAccessException {
        writeStaticField(cls, str, obj, false);
    }

    public static Object readField(Object obj, String str) throws IllegalAccessException {
        return readField(obj, str, false);
    }

    public static Object readStaticField(Class<?> cls, String str, boolean z10) throws IllegalAccessException {
        Field field = getField(cls, str, z10);
        if (field != null) {
            return readStaticField(field, false);
        }
        throw new IllegalArgumentException("Cannot locate field " + str + " on " + cls);
    }

    public static void writeField(Object obj, String str, Object obj2) throws IllegalAccessException {
        writeField(obj, str, obj2, false);
    }

    public static void writeStaticField(Class<?> cls, String str, Object obj, boolean z10) throws IllegalAccessException {
        Field field = getField(cls, str, z10);
        if (field != null) {
            writeStaticField(field, obj);
            return;
        }
        throw new IllegalArgumentException("Cannot locate field " + str + " on " + cls);
    }

    public static Object readField(Object obj, String str, boolean z10) throws IllegalAccessException {
        if (obj != null) {
            Class<?> cls = obj.getClass();
            Field field = getField(cls, str, z10);
            if (field != null) {
                return readField(field, obj);
            }
            throw new IllegalArgumentException("Cannot locate field " + str + " on " + cls);
        }
        throw new IllegalArgumentException("target object must not be null");
    }

    public static void writeField(Object obj, String str, Object obj2, boolean z10) throws IllegalAccessException {
        if (obj != null) {
            Class<?> cls = obj.getClass();
            Field field = getField(cls, str, z10);
            if (field != null) {
                writeField(field, obj, obj2);
                return;
            }
            throw new IllegalArgumentException("Cannot locate declared field " + cls.getName() + IconCache.EMPTY_CLASS_NAME + str);
        }
        throw new IllegalArgumentException("target object must not be null");
    }
}
