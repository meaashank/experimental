package N6;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.prism.fusionadsdk.internal.config.AdFillControlConfig;
import java.util.HashMap;
import w.y;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f64746b = "fusionadsdk_total_fill_rate";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f64747c = "req_";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f64748d = "fill_";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f64745a = com.prism.fusionadsdkbase.a.f162373j.concat(a.class.getSimpleName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f64749e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap<String, Integer> f64750f = new HashMap<>();

    public static long a(long j10, int i10) {
        if (j10 <= 0 || i10 <= 0) {
            return 0L;
        }
        return i10 >= 100 ? j10 : ((j10 * ((long) i10)) + 99) / 100;
    }

    public static String b(String str) {
        return y.a(f64748d, str);
    }

    public static int c(String str) {
        Integer num = f64750f.get(str);
        if (num != null) {
            return Math.max(0, num.intValue());
        }
        return 0;
    }

    public static SharedPreferences d(Context context) {
        return context.getApplicationContext().getSharedPreferences(f64746b, 0);
    }

    public static String e(String str) {
        return y.a(f64747c, str);
    }

    public static boolean f(AdFillControlConfig adFillControlConfig) {
        return adFillControlConfig != null && adFillControlConfig.enabled;
    }

    public static void g(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (f64749e) {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f64746b, 0);
            long jMax = Math.max(0L, sharedPreferences.getLong(b(str), 0L)) + 1;
            sharedPreferences.edit().putLong(b(str), jMax).apply();
            j(str, c(str) - 1);
            StringBuilder sb2 = new StringBuilder("markFilled placement=");
            sb2.append(str);
            sb2.append("; fillCount=");
            sb2.append(jMax);
        }
    }

    public static int h(int i10) {
        if (i10 < 0) {
            return 0;
        }
        return Math.min(i10, 100);
    }

    public static void i(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (f64749e) {
            j(str, c(str) - 1);
            StringBuilder sb2 = new StringBuilder("release placement=");
            sb2.append(str);
            sb2.append("; pendingCount=");
            sb2.append(c(str));
        }
    }

    public static void j(String str, int i10) {
        if (i10 <= 0) {
            f64750f.remove(str);
        } else {
            f64750f.put(str, Integer.valueOf(i10));
        }
    }

    public static boolean k(Context context, String str, AdFillControlConfig adFillControlConfig) {
        boolean z10;
        if (context == null || TextUtils.isEmpty(str) || !f(adFillControlConfig)) {
            return true;
        }
        int iH = h(adFillControlConfig.percent);
        synchronized (f64749e) {
            try {
                SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f64746b, 0);
                long jMax = Math.max(0L, sharedPreferences.getLong(e(str), 0L)) + 1;
                long jMax2 = Math.max(0L, sharedPreferences.getLong(b(str), 0L));
                long jC = c(str);
                long jA = a(jMax, iH);
                z10 = (jMax2 + jC) + 1 <= jA;
                sharedPreferences.edit().putLong(e(str), jMax).apply();
                if (z10) {
                    j(str, ((int) jC) + 1);
                }
                StringBuilder sb2 = new StringBuilder("tryAcquire placement=");
                sb2.append(str);
                sb2.append("; percent=");
                sb2.append(iH);
                sb2.append("; requestCount=");
                sb2.append(jMax);
                sb2.append("; fillCount=");
                sb2.append(jMax2);
                sb2.append("; pendingCount=");
                sb2.append(jC);
                sb2.append("; maxFillCount=");
                sb2.append(jA);
                sb2.append("; allowFill=");
                sb2.append(z10);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }
}
