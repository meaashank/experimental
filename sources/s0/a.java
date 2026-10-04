package S0;

import android.os.Build;
import android.telephony.SubscriptionManager;
import e.T;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
@T(22)
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Method f68106a;

    /* JADX INFO: renamed from: S0.a$a, reason: collision with other inner class name */
    @T(29)
    public static class C0107a {
        public static int a(int i10) {
            return SubscriptionManager.getSlotIndex(i10);
        }
    }

    public static int a(int i10) {
        if (i10 == -1) {
            return -1;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            return C0107a.a(i10);
        }
        try {
            if (f68106a == null) {
                Class cls = Integer.TYPE;
                if (i11 >= 26) {
                    f68106a = SubscriptionManager.class.getDeclaredMethod("getSlotIndex", cls);
                } else {
                    f68106a = SubscriptionManager.class.getDeclaredMethod("getSlotId", cls);
                }
                f68106a.setAccessible(true);
            }
            Integer num = (Integer) f68106a.invoke(null, Integer.valueOf(i10));
            if (num != null) {
                return num.intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return -1;
    }
}
