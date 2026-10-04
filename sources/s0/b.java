package S0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.T;
import e.W;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Method f68107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f68108b;

    @T(23)
    public static class a {
        @Nullable
        @SuppressLint({"MissingPermission"})
        @W(U6.b.f68570g)
        public static String a(TelephonyManager telephonyManager, int i10) {
            return telephonyManager.getDeviceId(i10);
        }
    }

    /* JADX INFO: renamed from: S0.b$b, reason: collision with other inner class name */
    @T(26)
    public static class C0108b {
        @Nullable
        @SuppressLint({"MissingPermission"})
        @W(U6.b.f68570g)
        public static String a(TelephonyManager telephonyManager) {
            return telephonyManager.getImei();
        }
    }

    @T(30)
    public static class c {
        public static int a(TelephonyManager telephonyManager) {
            return telephonyManager.getSubscriptionId();
        }
    }

    @Nullable
    @SuppressLint({"MissingPermission"})
    @W(U6.b.f68570g)
    public static String a(@NonNull TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C0108b.a(telephonyManager);
        }
        int iB = b(telephonyManager);
        return (iB == Integer.MAX_VALUE || iB == -1) ? telephonyManager.getDeviceId() : telephonyManager.getDeviceId(S0.a.a(iB));
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static int b(@NonNull TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 30) {
            return c.a(telephonyManager);
        }
        try {
            if (f68108b == null) {
                Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getSubId", null);
                f68108b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Integer num = (Integer) f68108b.invoke(telephonyManager, null);
            if (num == null || num.intValue() == -1) {
                return Integer.MAX_VALUE;
            }
            return num.intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return Integer.MAX_VALUE;
        }
    }
}
