package t8;

import com.prism.commons.utils.C3838b;
import com.prism.gaia.client.GaiaContext;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f239214a = "asdf-".concat(b.class.getSimpleName());

    public static void a(Method method, String str, String str2) {
        String strR = GaiaContext.j().r();
        String strV = GaiaContext.f164212y.v();
        if (strR == null || strV == null || strR.equals(strV) || strV.equals(str) || strR.equals(str)) {
            return;
        }
        if (str == null) {
            if (method != null) {
                method.getDeclaringClass().getClass();
            }
            if (method == null) {
                return;
            }
            method.getName();
            return;
        }
        if (method != null) {
            method.getDeclaringClass().getClass();
        }
        if (method == null) {
            return;
        }
        method.getName();
    }

    public static Class<?>[] b(Class cls) {
        HashSet hashSet = new HashSet();
        c(cls, hashSet);
        Class<?>[] clsArr = new Class[hashSet.size()];
        hashSet.toArray(clsArr);
        return clsArr;
    }

    public static void c(Class cls, HashSet<Class<?>> hashSet) {
        Class<?>[] interfaces = cls.getInterfaces();
        if (interfaces.length != 0) {
            hashSet.addAll(Arrays.asList(interfaces));
        }
        if (cls.getSuperclass() != Object.class) {
            c(cls.getSuperclass(), hashSet);
        }
    }

    public static <T> T d(Object[] objArr, Class<T> cls) {
        int iJ;
        if (objArr == null || (iJ = C3838b.j(objArr, cls)) == -1) {
            return null;
        }
        return (T) objArr[iJ];
    }

    public static String e(Object[] objArr) {
        int iJ;
        if (objArr == null || (iJ = C3838b.j(objArr, String.class)) == -1) {
            return null;
        }
        String str = (String) objArr[iJ];
        objArr[iJ] = GaiaContext.j().v();
        return str;
    }

    public static String f(Object[] objArr) {
        int iL = C3838b.l(objArr, String.class);
        if (iL == -1) {
            return null;
        }
        String str = (String) objArr[iL];
        objArr[iL] = GaiaContext.j().v();
        return str;
    }

    public static String g(Object[] objArr, int i10) {
        int iK = C3838b.k(objArr, String.class, i10);
        if (iK == -1) {
            return null;
        }
        String str = (String) objArr[iK];
        objArr[iK] = GaiaContext.j().v();
        return str;
    }
}
