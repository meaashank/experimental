package com.bytedance.sdk.openadsdk.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.OCA.a;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class edo {
    private static volatile HandlerThread Mm = null;
    public static long TFq = 0;
    public static volatile boolean ZRu = false;
    public static AtomicBoolean NOt = new AtomicBoolean(false);
    public static long mZ = 0;
    private static volatile int Ht = 0;
    public static float uR = 1.0f;
    private static volatile Handler FA = null;

    static {
        HandlerThread handlerThread = new HandlerThread("csj_init_handle", 10);
        Mm = handlerThread;
        handlerThread.start();
        TFq = System.currentTimeMillis();
    }

    public static void Ht() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - mZ <= 10000) {
            return;
        }
        mZ = jElapsedRealtime;
        com.bytedance.sdk.openadsdk.utils.WD.ZRu(new com.bytedance.sdk.component.FA.FA("onSharedPreferenceChanged") { // from class: com.bytedance.sdk.openadsdk.core.edo.1
            @Override // java.lang.Runnable
            public void run() {
                String strMZ = com.bytedance.sdk.openadsdk.core.settings.yBV.mZ(WMI.ZRu());
                if (TextUtils.equals(strMZ, com.bytedance.sdk.openadsdk.core.settings.yBV.uR)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.settings.yBV.CH().ZRu(6, true);
                com.bytedance.sdk.openadsdk.core.settings.yBV.uR = strMZ;
            }
        });
    }

    public static void Mm() {
        NOt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.edo.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.yBV.mZ.ZRu(new com.bytedance.sdk.openadsdk.yBV.uR() { // from class: com.bytedance.sdk.openadsdk.core.edo.2.1
                        @Override // com.bytedance.sdk.openadsdk.yBV.uR
                        public com.bytedance.sdk.openadsdk.yBV.NOt.ZRu generatorModel() {
                            return a.a("init");
                        }
                    });
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.lp.ZRu("InitHelper", th.getMessage());
                }
            }
        });
    }

    public static Handler NOt() {
        if (Mm == null || !Mm.isAlive()) {
            synchronized (edo.class) {
                try {
                    if (Mm == null || !Mm.isAlive()) {
                        HandlerThread handlerThread = new HandlerThread("csj_init_handle", -1);
                        Mm = handlerThread;
                        handlerThread.start();
                        FA = new Handler(Mm.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (FA == null) {
            synchronized (edo.class) {
                try {
                    if (FA == null) {
                        FA = new Handler(Mm.getLooper());
                    }
                } finally {
                }
            }
        }
        return FA;
    }

    public static boolean TFq() {
        return uR() == 1;
    }

    public static void ZRu(long j10) {
        TFq = j10;
    }

    public static Handler mZ() {
        return new Handler(Looper.getMainLooper());
    }

    public static int uR() {
        return Ht;
    }

    public static long ZRu() {
        return TFq;
    }

    public static void ZRu(int i10) {
        Ht = i10;
    }

    public static void ZRu(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                if ("mediation".equals(jSONObject.optString("name", ""))) {
                    Vor.NOt().NOt(jSONObject.optString("value", ""));
                    return;
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("InitHelper", th.getMessage());
        }
    }
}
