package cb;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import e.T;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: cb.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@T(28)
@SuppressLint({"ObsoleteSdkInt"})
public class C2968d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f136245a = "d";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Object f136246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f136247c;

    static {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
                Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
                Class cls = (Class) declaredMethod.invoke(null, "dalvik.system.VMRuntime");
                Method method = (Method) declaredMethod2.invoke(cls, "getRuntime", null);
                f136247c = (Method) declaredMethod2.invoke(cls, "setHiddenApiExemptions", new Class[]{String[].class});
                f136246b = method.invoke(null, null);
            } catch (Throwable th) {
                Log.e(f136245a, "reflect bootstrap failed:", th);
            }
        }
    }

    public static boolean a(String str) {
        return b(str);
    }

    public static boolean b(String... strArr) {
        Method method;
        Object obj = f136246b;
        if (obj != null && (method = f136247c) != null) {
            try {
                method.invoke(obj, strArr);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean c() {
        return b("L");
    }

    public static boolean d(Context context) {
        String str = f136245a;
        Log.d(str, "before exemptAll");
        if (c()) {
            Log.d(str, "exemptAll success");
            return true;
        }
        Log.d(str, "exemptAll fail");
        return false;
    }
}
