package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import q4.c;
import t7.C5617a;

/* JADX INFO: loaded from: classes2.dex */
public class xY {
    private static final Object ZRu = new Object();
    private static final Map<ZRu, Object> NOt = new ConcurrentHashMap();
    private static AtomicBoolean mZ = new AtomicBoolean(false);
    private static volatile int uR = -1;
    private static volatile long TFq = 0;
    private static volatile int Ht = 60000;
    private static yBV Mm = null;
    private static final AtomicBoolean FA = new AtomicBoolean(false);

    public static class NOt extends BroadcastReceiver {
        private NOt() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z10 = false;
            boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
            if (xY.NOt != null && xY.NOt.size() > 0) {
                z10 = true;
            }
            xY.NOt(context, intent, z10, booleanExtra);
        }
    }

    public interface ZRu {
        void ZRu(Context context, Intent intent, boolean z10, int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void NOt(final Context context, final Intent intent, final boolean z10, final boolean z11) {
        if (!z10 && z11) {
            uR = 0;
        } else if (FA.compareAndSet(false, true)) {
            com.bytedance.sdk.component.FA.Ht.NOt(new com.bytedance.sdk.component.FA.FA("getNetworkType") { // from class: com.bytedance.sdk.component.utils.xY.1
                @Override // java.lang.Runnable
                public void run() {
                    int unused = xY.uR = z11 ? 0 : xY.NOt(context);
                    xY.FA.set(false);
                    if (z10) {
                        xY.NOt(context, intent, xY.uR, z11);
                    }
                }
            });
        }
    }

    private static int mZ(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(C5617a.f239212e)).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    return type != 1 ? 1 : 4;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return 2;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return 3;
                    case 13:
                    case 18:
                    case 19:
                        yBV ybv = Mm;
                        return (ybv == null || !ybv.ZRu(context, telephonyManager)) ? 5 : 6;
                    case 20:
                        return 6;
                    default:
                        String subtypeName = activeNetworkInfo.getSubtypeName();
                        return (TextUtils.isEmpty(subtypeName) || !(subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000"))) ? 1 : 3;
                }
            }
            return 0;
        } catch (Throwable unused) {
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void NOt(Context context, Intent intent, int i10, boolean z10) {
        Map<ZRu, Object> map = NOt;
        if (map == null || map.size() <= 0) {
            return;
        }
        for (ZRu zRu : map.keySet()) {
            if (zRu != null) {
                zRu.ZRu(context, intent, !z10, i10);
            }
        }
    }

    public static int ZRu(Context context, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (TFq + j10 <= jElapsedRealtime) {
            return NOt(context);
        }
        if (uR == -1) {
            return NOt(context);
        }
        if (jElapsedRealtime - TFq >= Ht) {
            NOt(context, (Intent) null, false, false);
        }
        return uR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int NOt(Context context) {
        uR = mZ(context);
        TFq = SystemClock.elapsedRealtime();
        return uR;
    }

    public static void ZRu(ZRu zRu, Context context) {
        if (zRu == null) {
            return;
        }
        if (!mZ.get()) {
            try {
                context.registerReceiver(new NOt(), new IntentFilter(c.f226807e));
                mZ.set(true);
            } catch (Throwable unused) {
            }
        }
        NOt.put(zRu, ZRu);
    }

    public static void ZRu(ZRu zRu) {
        if (zRu == null) {
            return;
        }
        NOt.remove(zRu);
    }
}
