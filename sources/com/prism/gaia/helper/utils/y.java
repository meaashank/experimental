package com.prism.gaia.helper.utils;

import com.android.launcher3.IconCache;
import com.prism.gaia.exception.ReflectException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f165228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165229b = true;

    public class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f165230a;

        public a(boolean z10) {
            this.f165230a = z10;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            try {
                return new y(y.this.f165228a).f(name, objArr).f165228a;
            } catch (ReflectException e10) {
                if (this.f165230a) {
                    Map map = (Map) y.this.f165228a;
                    int length = objArr == null ? 0 : objArr.length;
                    if (length == 0 && name.startsWith(w7.i.f240158w)) {
                        return map.get(y.C(name.substring(3)));
                    }
                    if (length == 0 && name.startsWith("is")) {
                        return map.get(y.C(name.substring(2)));
                    }
                    if (length == 1 && name.startsWith("set")) {
                        map.put(y.C(name.substring(3)), objArr[0]);
                        return null;
                    }
                }
                throw e10;
            }
        }
    }

    public static class b {
    }

    public y(Class<?> cls) {
        this.f165228a = cls;
    }

    public static y A(Constructor<?> constructor, Object... objArr) throws ReflectException {
        try {
            return new y(((Constructor) c(constructor)).newInstance(objArr));
        } catch (Exception e10) {
            throw new ReflectException(e10);
        }
    }

    public static y B(Method method, Object obj, Object... objArr) throws ReflectException {
        try {
            c(method);
            if (method.getReturnType() != Void.TYPE) {
                return new y(method.invoke(obj, objArr));
            }
            method.invoke(obj, objArr);
            return new y(obj);
        } catch (Exception e10) {
            throw new ReflectException(e10);
        }
    }

    public static String C(String str) {
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            return str.toLowerCase();
        }
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }

    public static Class<?>[] G(Object... objArr) {
        if (objArr == null) {
            return new Class[0];
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            clsArr[i10] = obj == null ? b.class : obj.getClass();
        }
        return clsArr;
    }

    public static Object H(Object obj) {
        return obj instanceof y ? ((y) obj).p() : obj;
    }

    public static Class<?> I(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return cls.isPrimitive() ? Boolean.TYPE == cls ? Boolean.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : Byte.TYPE == cls ? Byte.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Character.TYPE == cls ? Character.class : Void.TYPE == cls ? Void.class : cls : cls;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T extends java.lang.reflect.AccessibleObject> T c(T r2) {
        /*
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            boolean r0 = r2 instanceof java.lang.reflect.Member
            if (r0 == 0) goto L24
            r0 = r2
            java.lang.reflect.Member r0 = (java.lang.reflect.Member) r0
            int r1 = r0.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
            if (r1 == 0) goto L24
            java.lang.Class r0 = r0.getDeclaringClass()
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 == 0) goto L24
            goto L2e
        L24:
            boolean r0 = r2.isAccessible()
            if (r0 != 0) goto L2e
            r0 = 1
            r2.setAccessible(r0)
        L2e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.gaia.helper.utils.y.c(java.lang.reflect.AccessibleObject):java.lang.reflect.AccessibleObject");
    }

    public static Class<?> n(String str) throws ReflectException {
        try {
            return Class.forName(str);
        } catch (Exception e10) {
            throw new ReflectException(e10);
        }
    }

    public static Class<?> o(String str, ClassLoader classLoader) throws ReflectException {
        try {
            return Class.forName(str, true, classLoader);
        } catch (Exception e10) {
            throw new ReflectException(e10);
        }
    }

    public static String r(Method method) {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append(Modifier.toString(method.getModifiers()));
        sb2.append(C4.q.f17581a);
        sb2.append(method.getReturnType().getName());
        sb2.append(C4.q.f17581a);
        sb2.append(method.getName());
        sb2.append("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        for (Class<?> cls : parameterTypes) {
            sb2.append(cls.getName());
            sb2.append(U6.j.f68738d);
        }
        if (parameterTypes.length > 0) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(")");
        return sb2.toString();
    }

    public static y w(Class<?> cls) {
        return new y(cls);
    }

    public static y x(Object obj) {
        return new y(obj);
    }

    public static y y(String str) throws ReflectException {
        return new y(n(str));
    }

    public static y z(String str, ClassLoader classLoader) throws ReflectException {
        return new y(o(str, classLoader));
    }

    public y D(String str, Object obj) throws ReflectException {
        try {
            Field fieldL = l(str);
            fieldL.setAccessible(true);
            fieldL.set(this.f165228a, H(obj));
            return this;
        } catch (Exception e10) {
            throw new ReflectException(e10);
        }
    }

    public final Method E(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> clsF = F();
        for (Method method : clsF.getMethods()) {
            if (s(method, str, clsArr)) {
                return method;
            }
        }
        do {
            for (Method method2 : clsF.getDeclaredMethods()) {
                if (s(method2, str, clsArr)) {
                    return method2;
                }
            }
            clsF = clsF.getSuperclass();
        } while (clsF != null);
        StringBuilder sbA = androidx.activity.result.i.a("No similar method ", str, " with params ");
        sbA.append(Arrays.toString(clsArr));
        sbA.append(" could be found on type ");
        sbA.append(F());
        sbA.append(IconCache.EMPTY_CLASS_NAME);
        throw new NoSuchMethodException(sbA.toString());
    }

    public Class<?> F() {
        return this.f165229b ? (Class) this.f165228a : this.f165228a.getClass();
    }

    public <P> P d(Class<P> cls) {
        return (P) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(this.f165228a instanceof Map));
    }

    public y e(String str) throws ReflectException {
        return f(str, new Object[0]);
    }

    public boolean equals(Object obj) {
        return (obj instanceof y) && this.f165228a.equals(((y) obj).p());
    }

    public y f(String str, Object... objArr) throws ReflectException {
        Class<?>[] clsArrG = G(objArr);
        try {
            try {
                return B(j(str, clsArrG), this.f165228a, objArr);
            } catch (NoSuchMethodException e10) {
                throw new ReflectException(e10);
            }
        } catch (NoSuchMethodException unused) {
            return B(E(str, clsArrG), this.f165228a, objArr);
        }
    }

    public y g(String str, Object... objArr) throws ReflectException {
        Class<?>[] clsArrG = G(objArr);
        Method[] declaredMethods = F().getDeclaredMethods();
        int length = declaredMethods.length;
        Method method = null;
        int i10 = 0;
        char c10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Method method2 = declaredMethods[i10];
            if (s(method2, str, clsArrG)) {
                c10 = 2;
                method = method2;
                break;
            }
            if (v(method2, str, clsArrG)) {
                c10 = 1;
            } else {
                if (!method2.getName().equals(str) || method2.getParameterTypes().length != 0 || c10 != 0) {
                }
                i10++;
            }
            method = method2;
            i10++;
        }
        if (method != null) {
            if (c10 == 0) {
                objArr = new Object[0];
            }
            if (c10 == 1) {
                objArr = new Object[]{objArr};
            }
            return B(method, this.f165228a, objArr);
        }
        String strA = w.y.a("no method found for ", str);
        StringBuilder sbA = androidx.activity.result.i.a("No best method ", str, " with params ");
        sbA.append(Arrays.toString(clsArrG));
        sbA.append(" could be found on type ");
        sbA.append(F());
        sbA.append(IconCache.EMPTY_CLASS_NAME);
        throw new ReflectException(strA, new NoSuchMethodException(sbA.toString()));
    }

    public y h() throws ReflectException {
        return i(new Object[0]);
    }

    public int hashCode() {
        return this.f165228a.hashCode();
    }

    public y i(Object... objArr) throws ReflectException {
        Class<?>[] clsArrG = G(objArr);
        try {
            return A(F().getDeclaredConstructor(clsArrG), objArr);
        } catch (NoSuchMethodException e10) {
            for (Constructor<?> constructor : F().getDeclaredConstructors()) {
                if (t(constructor.getParameterTypes(), clsArrG)) {
                    return A(constructor, objArr);
                }
            }
            throw new ReflectException(e10);
        }
    }

    public Method j(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> clsF = F();
        try {
            return clsF.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            do {
                try {
                    return clsF.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException unused2) {
                    clsF = clsF.getSuperclass();
                }
            } while (clsF != null);
            throw new NoSuchMethodException();
        }
    }

    public y k(String str) throws ReflectException {
        try {
            return new y(l(str).get(this.f165228a));
        } catch (Exception e10) {
            throw new ReflectException(this.f165228a.getClass().getName(), e10);
        }
    }

    public final Field l(String str) throws ReflectException {
        Class<?> clsF = F();
        try {
            return clsF.getField(str);
        } catch (NoSuchFieldException e10) {
            do {
                try {
                    return (Field) c(clsF.getDeclaredField(str));
                } catch (NoSuchFieldException unused) {
                    clsF = clsF.getSuperclass();
                }
            } while (clsF != null);
            throw new ReflectException(e10);
        }
    }

    public Map<String, y> m() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class<?> clsF = F();
        do {
            for (Field field : clsF.getDeclaredFields()) {
                if ((!this.f165229b) ^ Modifier.isStatic(field.getModifiers())) {
                    String name = field.getName();
                    if (!linkedHashMap.containsKey(name)) {
                        linkedHashMap.put(name, k(name));
                    }
                }
            }
            clsF = clsF.getSuperclass();
        } while (clsF != null);
        return linkedHashMap;
    }

    public <T> T p() {
        return (T) this.f165228a;
    }

    public <T> T q(String str) throws ReflectException {
        return (T) k(str).f165228a;
    }

    public final boolean s(Method method, String str, Class<?>[] clsArr) {
        return method.getName().equals(str) && t(method.getParameterTypes(), clsArr);
    }

    public final boolean t(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < clsArr2.length; i10++) {
            if (clsArr2[i10] != b.class && !I(clsArr[i10]).isAssignableFrom(I(clsArr2[i10]))) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return this.f165228a.toString();
    }

    public final boolean u(Class<?>[] clsArr) {
        return clsArr.length > 0 && clsArr[0].isAssignableFrom(Object[].class);
    }

    public final boolean v(Method method, String str, Class<?>[] clsArr) {
        return method.getName().equals(str) && u(method.getParameterTypes());
    }

    public y(Object obj) {
        this.f165228a = obj;
    }
}
