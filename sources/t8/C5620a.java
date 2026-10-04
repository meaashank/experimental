package t8;

import android.os.Process;
import com.prism.gaia.client.GaiaContext;
import y8.C5842a;

/* JADX INFO: renamed from: t8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5620a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f239213a = "asdf-".concat(C5620a.class.getSimpleName());

    public static boolean a(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            Object obj = objArr[0];
            if (obj instanceof String) {
                String str = (String) obj;
                String strR = GaiaContext.j().r();
                if (strR == null || !strR.equals(str)) {
                    throw new SecurityException("PID " + Process.myPid() + " does not have permission android.permission.CLEAR_APP_USER_DATA to clear data of package " + str);
                }
                C5842a c5842aM = C5842a.m();
                GaiaContext gaiaContext = GaiaContext.f164212y;
                boolean zC = c5842aM.c(str, gaiaContext.Z());
                gaiaContext.Z();
                b(objArr, str, zC);
                return zC;
            }
        }
        return false;
    }

    public static void b(Object[] objArr, String str, boolean z10) {
        for (Object obj : objArr) {
            if (obj != null && !(obj instanceof String) && !(obj instanceof Integer) && !(obj instanceof Boolean)) {
                for (Class<?> cls : obj.getClass().getInterfaces()) {
                    if (cls.getName().endsWith("IPackageDataObserver")) {
                        try {
                            cls.getMethod("onRemoveCompleted", String.class, Boolean.TYPE).invoke(obj, str, Boolean.valueOf(z10));
                            return;
                        } catch (Throwable unused) {
                            return;
                        }
                    }
                }
            }
        }
    }
}
