package i5;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f202855a = "album_";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f202856b = 6;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f202857c = 23;

    public static void a(String str, Object... objArr) {
        e(str, 3, null, objArr);
    }

    public static void b(String str, Throwable th, Object... objArr) {
        e(str, 6, th, objArr);
    }

    public static void c(String str, Object... objArr) {
        e(str, 6, null, objArr);
    }

    public static void d(String str, Object... objArr) {
        e(str, 4, null, objArr);
    }

    public static void e(String str, int i10, Throwable th, Object... objArr) {
        String string;
        if (th == null && objArr != null && objArr.length == 1) {
            string = objArr[0].toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            if (objArr != null) {
                for (Object obj : objArr) {
                    sb2.append(obj);
                }
            }
            if (th != null) {
                sb2.append("\n");
                sb2.append(Log.getStackTraceString(th));
            }
            string = sb2.toString();
        }
        Log.println(i10, str, string);
    }

    public static String f(Class cls) {
        return g(cls.getSimpleName());
    }

    public static String g(String str) {
        int length = str.length();
        int i10 = f202856b;
        if (length <= 23 - i10) {
            return f202855a.concat(str);
        }
        return f202855a + str.substring(0, 22 - i10);
    }

    public static void h(String str, Object... objArr) {
        e(str, 2, null, objArr);
    }

    public static void i(String str, Throwable th, Object... objArr) {
        e(str, 5, th, objArr);
    }

    public static void j(String str, Object... objArr) {
        e(str, 5, null, objArr);
    }
}
