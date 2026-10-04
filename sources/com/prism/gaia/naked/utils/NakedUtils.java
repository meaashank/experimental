package com.prism.gaia.naked.utils;

import android.os.Bundle;
import cb.i;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedDouble;
import com.prism.gaia.naked.entity.NakedFloat;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedLong;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.entity.NakedStaticBoolean;
import com.prism.gaia.naked.entity.NakedStaticDouble;
import com.prism.gaia.naked.entity.NakedStaticFloat;
import com.prism.gaia.naked.entity.NakedStaticInt;
import com.prism.gaia.naked.entity.NakedStaticLong;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.entity.NakedStaticObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import s0.x;
import v8.C5705o;

/* JADX INFO: loaded from: classes6.dex */
public final class NakedUtils {
    private static HashMap<Class<?>, Constructor<?>> NAKED_TYPES = null;
    private static final String STATIC_FIELD_FOR_ORG_CLASS = "ORG_CLASS";
    private static final String TAG = "asdf-".concat("NakedUtils");
    private static IClassLoaderHelper classLoaderHelper;

    public interface IClassLoaderHelper {
        Class<?> findClass(String str) throws ClassNotFoundException;

        ClassLoader findClassLoader(String str);
    }

    static {
        HashMap<Class<?>, Constructor<?>> map = new HashMap<>();
        NAKED_TYPES = map;
        try {
            map.put(NakedObject.class, NakedObject.class.getConstructor(Class.class, Field.class));
            NAKED_TYPES.put(NakedMethod.class, NakedMethod.class.getConstructor(Class.class, Field.class));
            NAKED_TYPES.put(NakedBoolean.class, NakedBoolean.class.getConstructor(Class.class, Field.class));
            NAKED_TYPES.put(NakedInt.class, NakedInt.class.getConstructor(Class.class, Field.class));
            NAKED_TYPES.put(NakedLong.class, NakedLong.class.getConstructor(Class.class, Field.class));
            NAKED_TYPES.put(NakedFloat.class, NakedFloat.class.getConstructor(Class.class, Field.class));
            NAKED_TYPES.put(NakedDouble.class, NakedDouble.class.getConstructor(Class.class, Field.class));
            NAKED_TYPES.put(NakedConstructor.class, NakedConstructor.class.getConstructor(Class.class, Field.class));
            NAKED_TYPES.put(NakedStaticObject.class, NakedStaticObject.class.getConstructor(Class.class, Field.class));
            NAKED_TYPES.put(NakedStaticMethod.class, NakedStaticMethod.class.getConstructor(Class.class, Field.class));
            NAKED_TYPES.put(NakedStaticBoolean.class, NakedStaticBoolean.class.getConstructor(Class.class, Field.class));
            NAKED_TYPES.put(NakedStaticInt.class, NakedStaticInt.class.getConstructor(Class.class, Field.class));
            NAKED_TYPES.put(NakedStaticLong.class, NakedStaticLong.class.getConstructor(Class.class, Field.class));
            NAKED_TYPES.put(NakedStaticFloat.class, NakedStaticFloat.class.getConstructor(Class.class, Field.class));
            NAKED_TYPES.put(NakedStaticDouble.class, NakedStaticDouble.class.getConstructor(Class.class, Field.class));
        } catch (Exception unused) {
        }
    }

    public static Class<?> classForName(String str) throws ClassNotFoundException {
        ClassLoader classLoaderFindClassLoader;
        IClassLoaderHelper iClassLoaderHelper = classLoaderHelper;
        return (iClassLoaderHelper == null || (classLoaderFindClassLoader = iClassLoaderHelper.findClassLoader(str)) == null) ? Class.forName(str) : Class.forName(str, true, classLoaderFindClassLoader);
    }

    public static String getConstructorDescStr(Constructor<?> constructor) {
        if (constructor == null) {
            return "(null constructor)";
        }
        return constructor.getDeclaringClass().getCanonicalName() + " constructor";
    }

    public static Field getField(Class<?> cls, String str, boolean z10) {
        try {
            return cls.getDeclaredField(str);
        } catch (Exception e10) {
            if (z10) {
                i.a(GaiaContext.j().p());
                return getField(cls, str, false);
            }
            handleException(e10);
            return null;
        }
    }

    public static String getFieldDescStr(Field field) {
        if (field == null) {
            return "(null field)";
        }
        return field.getDeclaringClass().getCanonicalName() + " with field(" + field.getName() + ")";
    }

    public static String getMethodDescStr(Method method) {
        if (method == null) {
            return "(null method)";
        }
        return method.getDeclaringClass().getCanonicalName() + " with method(" + method.getName() + ")";
    }

    public static Class<?> getOriginalClass(Class<?> cls) {
        try {
            Class.forName(cls.getName());
            return (Class) cls.getField(STATIC_FIELD_FOR_ORG_CLASS).get(null);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public static Class<?> getProtoType(String str) {
        if (str.equals("int")) {
            return Integer.TYPE;
        }
        if (str.equals("long")) {
            return Long.TYPE;
        }
        if (str.equals(x.b.f238265f)) {
            return Boolean.TYPE;
        }
        if (str.equals("byte")) {
            return Byte.TYPE;
        }
        if (str.equals("short")) {
            return Short.TYPE;
        }
        if (str.equals("char")) {
            return Character.TYPE;
        }
        if (str.equals(x.b.f238262c)) {
            return Float.TYPE;
        }
        if (str.equals("double")) {
            return Double.TYPE;
        }
        if (str.equals("void")) {
            return Void.TYPE;
        }
        return null;
    }

    public static void handleException(Throwable th) {
        th.getMessage();
        Bundle bundle = new Bundle();
        bundle.putString("MSG", th.getMessage());
        C5705o.c().a(new RuntimeException("naked failed", th), "NAKED_FAIL", bundle);
    }

    public static Class<?> nake(Class<?> cls, String str) {
        try {
            return nake(cls, classForName(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static Class<?> nakeWithEx(Class<?> cls, String str) throws Exception {
        return nakeWithEx(cls, classForName(str));
    }

    public static void setClassLoaderHelper(IClassLoaderHelper iClassLoaderHelper) {
        classLoaderHelper = iClassLoaderHelper;
    }

    public static Class<?> tryNake(Class<?> cls, String str) {
        try {
            return tryNake(cls, classForName(str));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static Class nake(Class<?> cls, Class<?> cls2) {
        Constructor<?> constructor;
        if (cls2 == null) {
            return null;
        }
        for (Field field : cls.getDeclaredFields()) {
            try {
                if (Modifier.isStatic(field.getModifiers()) && (constructor = NAKED_TYPES.get(field.getType())) != null) {
                    field.set(null, constructor.newInstance(cls2, field));
                }
            } catch (Exception e10) {
                field.getName();
                e10.getMessage();
            }
        }
        return cls2;
    }

    public static Class nakeWithEx(Class<?> cls, Class<?> cls2) throws Exception {
        Constructor<?> constructor;
        for (Field field : cls.getDeclaredFields()) {
            if (Modifier.isStatic(field.getModifiers()) && (constructor = NAKED_TYPES.get(field.getType())) != null) {
                field.set(null, constructor.newInstance(cls2, field));
            }
        }
        return cls2;
    }

    public static Class<?> tryNake(Class<?> cls, Class<?> cls2) {
        Constructor<?> constructor;
        if (cls2 == null) {
            return null;
        }
        try {
            for (Field field : cls.getDeclaredFields()) {
                try {
                    if (Modifier.isStatic(field.getModifiers()) && (constructor = NAKED_TYPES.get(field.getType())) != null) {
                        field.set(null, constructor.newInstance(cls2, field));
                    }
                } catch (Exception unused) {
                    field.getName();
                }
            }
            return cls2;
        } catch (Exception unused2) {
            cls.getCanonicalName();
            return null;
        }
    }
}
