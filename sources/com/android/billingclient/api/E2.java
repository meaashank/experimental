package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zzc;

/* JADX INFO: loaded from: classes2.dex */
public final class E2 {
    public static synchronized double a(Context context) {
        return ((Double) e(new C2(), Double.valueOf(2.0d))).doubleValue();
    }

    public static synchronized long b(Context context) {
        return ((Long) e(new B2(), 3L)).longValue();
    }

    public static synchronized long c(Context context) {
        return ((Long) e(new C3076z2(), 100L)).longValue();
    }

    public static synchronized long d(Context context) {
        return ((Long) e(new A2(), 60000L)).longValue();
    }

    public static Object e(D2 d22, Object obj) {
        try {
            return d22.zza();
        } catch (Exception e10) {
            zzc.zzn("RuntimeFlags", "Fail to get the runtime flags: ".concat(e10.toString()));
            return obj;
        }
    }
}
