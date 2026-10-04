package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Process;
import android.os.UserHandle;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class G {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Object f111246a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Method f111247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static boolean f111248c;

        @SuppressLint({"DiscouragedPrivateApi"})
        public static boolean a(int i10) {
            try {
                synchronized (f111246a) {
                    try {
                        if (!f111248c) {
                            f111248c = true;
                            f111247b = UserHandle.class.getDeclaredMethod("isApp", Integer.TYPE);
                        }
                    } finally {
                    }
                }
                Method method = f111247b;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke(null, Integer.valueOf(i10));
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return true;
        }
    }

    @e.T(24)
    public static class b {
        public static boolean a(int i10) {
            return Process.isApplicationUid(i10);
        }
    }

    public static boolean a(int i10) {
        return Build.VERSION.SDK_INT >= 24 ? b.a(i10) : a.a(i10);
    }
}
