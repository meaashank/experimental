package com.bytedance.sdk.openadsdk.utils;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.FA.mZ.Ht;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import u4.g;

/* JADX INFO: loaded from: classes3.dex */
public class WD {
    private static volatile com.bytedance.sdk.component.FA.mZ.Ht FA;
    private static volatile com.bytedance.sdk.component.FA.mZ.Ht Ht;
    private static volatile com.bytedance.sdk.component.FA.mZ.Ht Mm;
    private static volatile boolean NOt;
    private static volatile com.bytedance.sdk.component.FA.mZ.Ht TFq;
    private static volatile com.bytedance.sdk.component.FA.mZ.Ht Vor;
    private static volatile ThreadPoolExecutor ZRu;
    private static volatile com.bytedance.sdk.component.FA.mZ.Ht aT;
    private static volatile com.bytedance.sdk.component.FA.mZ.Ht mZ;
    private static volatile com.bytedance.sdk.component.FA.mZ.Ht uR;

    static {
        com.bytedance.sdk.component.FA.mZ.mZ.ZRu(new com.bytedance.sdk.component.FA.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.utils.WD.1
            @Override // com.bytedance.sdk.component.FA.mZ.ZRu
            public void ZRu(com.bytedance.sdk.component.FA.mZ.Ht ht, com.bytedance.sdk.component.FA.mZ.NOt nOt) {
                nOt.NOt();
                new RuntimeException();
            }
        });
        com.bytedance.sdk.component.FA.mZ.mZ.ZRu(new com.bytedance.sdk.component.FA.mZ.TFq() { // from class: com.bytedance.sdk.openadsdk.utils.WD.3
            @Override // com.bytedance.sdk.component.FA.mZ.TFq
            public void ZRu(final com.bytedance.sdk.component.FA.mZ.Ht ht) {
                if (Nb.ZRu || ht == null) {
                    return;
                }
                try {
                    LinkedHashMap<String, com.bytedance.sdk.component.FA.mZ.ZRu.ZRu> linkedHashMapZRu = ht.ZRu();
                    if (linkedHashMapZRu == null || linkedHashMapZRu.size() <= 0) {
                        return;
                    }
                    Iterator<Map.Entry<String, com.bytedance.sdk.component.FA.mZ.ZRu.ZRu>> it = linkedHashMapZRu.entrySet().iterator();
                    while (it.hasNext()) {
                        final com.bytedance.sdk.component.FA.mZ.ZRu.ZRu value = it.next().getValue();
                        if (value != null) {
                            com.bytedance.sdk.openadsdk.edo.mZ.ZRu();
                            com.bytedance.sdk.openadsdk.edo.mZ.ZRu("pag_thread_pool_state", false, new com.bytedance.sdk.openadsdk.edo.NOt() { // from class: com.bytedance.sdk.openadsdk.utils.WD.3.1
                                @Override // com.bytedance.sdk.openadsdk.edo.NOt
                                public com.bytedance.sdk.openadsdk.edo.ZRu.mZ getLogStats() throws Exception {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("name", value.ZRu());
                                        jSONObject.put("times", value.NOt());
                                        jSONObject.put("runMaxTime", value.Ht());
                                        jSONObject.put("waitMaxTime", value.TFq());
                                        long jNOt = value.NOt() == 0 ? 1 : value.NOt();
                                        jSONObject.put("avgRunTime", value.uR() / jNOt);
                                        jSONObject.put("avgWaitTime", value.mZ() / jNOt);
                                        jSONObject.put("poolType", ht.NOt());
                                    } catch (Exception e10) {
                                        com.bytedance.sdk.component.utils.lp.ZRu("ThreadUtils", "run: ", e10);
                                    }
                                    return com.bytedance.sdk.openadsdk.edo.ZRu.uR.NOt().ZRu("pag_thread_pool_state").NOt(jSONObject.toString());
                                }
                            });
                        }
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        });
        ZRu = null;
        NOt = false;
    }

    public static com.bytedance.sdk.component.FA.mZ.Ht FA() {
        com.bytedance.sdk.component.FA.mZ.Ht ht;
        com.bytedance.sdk.component.FA.mZ.Ht ht2 = Ht;
        if (!ZRu(ht2)) {
            return ht2;
        }
        synchronized (WD.class) {
            try {
                if (ZRu(Ht)) {
                    try {
                        Ht = ZRu(g.f239565h, Ht);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                ht = Ht;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ht;
    }

    public static boolean Ht() {
        String str = ZH() ? "pag_log" : "csj_log";
        String name = Thread.currentThread().getName();
        if (TextUtils.isEmpty(name)) {
            return false;
        }
        return name.startsWith(str);
    }

    public static ExecutorService Mm() {
        return ZH() ? WMI() : com.bytedance.sdk.component.FA.Ht.mZ();
    }

    public static ExecutorService NOt() {
        return ZH() ? yBV() : com.bytedance.sdk.component.FA.Ht.aT();
    }

    public static boolean TFq() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static com.bytedance.sdk.component.FA.mZ.Ht Vor() {
        com.bytedance.sdk.component.FA.mZ.Ht ht;
        com.bytedance.sdk.component.FA.mZ.Ht ht2 = Vor;
        if (!ZRu(ht2)) {
            return ht2;
        }
        synchronized (WD.class) {
            try {
                if (ZRu(Vor)) {
                    try {
                        Vor = ZRu("express", Vor);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                ht = Vor;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ht;
    }

    private static com.bytedance.sdk.component.FA.mZ.Ht WMI() {
        com.bytedance.sdk.component.FA.mZ.Ht ht;
        com.bytedance.sdk.component.FA.mZ.Ht ht2 = Mm;
        if (!ZRu(ht2)) {
            return ht2;
        }
        synchronized (WD.class) {
            try {
                if (ZRu(Mm)) {
                    try {
                        Mm = ZRu("io", Mm);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                ht = Mm;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ht;
    }

    public static boolean ZH() {
        if (com.bytedance.sdk.openadsdk.core.settings.yBV.kkl()) {
            return com.bytedance.sdk.openadsdk.core.settings.yBV.CH().AZ();
        }
        return true;
    }

    public static ScheduledExecutorService ZRu() {
        return com.bytedance.sdk.component.FA.Ht.Ht();
    }

    public static com.bytedance.sdk.component.FA.mZ.Ht aT() {
        com.bytedance.sdk.component.FA.mZ.Ht ht;
        com.bytedance.sdk.component.FA.mZ.Ht ht2 = aT;
        if (!ZRu(ht2)) {
            return ht2;
        }
        synchronized (WD.class) {
            try {
                if (ZRu(aT)) {
                    try {
                        aT = ZRu("net", aT);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                ht = aT;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ht;
    }

    private static com.bytedance.sdk.component.FA.mZ.Ht edo() {
        com.bytedance.sdk.component.FA.mZ.Ht ht;
        com.bytedance.sdk.component.FA.mZ.Ht ht2 = uR;
        if (!ZRu(ht2)) {
            return ht2;
        }
        synchronized (WD.class) {
            try {
                if (ZRu(uR)) {
                    try {
                        uR = ZRu("log", uR);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                ht = uR;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ht;
    }

    private static ThreadPoolExecutor lp() {
        int iFFX;
        if (ZRu == null) {
            synchronized (WD.class) {
                try {
                    if (ZRu == null) {
                        if (com.bytedance.sdk.openadsdk.core.settings.yBV.kkl()) {
                            iFFX = com.bytedance.sdk.openadsdk.core.settings.yBV.CH().FFX();
                            NOt = true;
                        } else {
                            iFFX = 4;
                        }
                        ZRu = new ThreadPoolExecutor(iFFX, Integer.MAX_VALUE, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ZRu;
    }

    public static ExecutorService mZ() {
        return ZH() ? edo() : com.bytedance.sdk.component.FA.Ht.uR();
    }

    private static com.bytedance.sdk.component.FA.mZ.Ht oK() {
        com.bytedance.sdk.component.FA.mZ.Ht ht;
        com.bytedance.sdk.component.FA.mZ.Ht ht2 = TFq;
        if (!ZRu(ht2)) {
            return ht2;
        }
        synchronized (WD.class) {
            try {
                if (ZRu(TFq)) {
                    try {
                        TFq = ZRu("aidl", TFq);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                ht = TFq;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ht;
    }

    private static ThreadPoolExecutor sAl() {
        com.bytedance.sdk.component.FA.mZ.Ht ht;
        com.bytedance.sdk.component.FA.mZ.Ht ht2 = mZ;
        if (!ZRu(ht2)) {
            return ht2;
        }
        synchronized (WD.class) {
            try {
                if (ZRu(mZ)) {
                    try {
                        mZ = ZRu("ad", mZ);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                ht = mZ;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ht;
    }

    public static ExecutorService uR() {
        return ZH() ? FA() : com.bytedance.sdk.component.FA.Ht.NOt();
    }

    private static com.bytedance.sdk.component.FA.mZ.Ht yBV() {
        com.bytedance.sdk.component.FA.mZ.Ht ht;
        com.bytedance.sdk.component.FA.mZ.Ht ht2 = FA;
        if (!ZRu(ht2)) {
            return ht2;
        }
        synchronized (WD.class) {
            try {
                if (ZRu(FA)) {
                    try {
                        FA = ZRu("image", FA);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                ht = FA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ht;
    }

    public static void TFq(final com.bytedance.sdk.component.FA.FA fa2) {
        if (Nb.ZRu) {
            return;
        }
        if (ZH()) {
            sAl().execute(new com.bytedance.sdk.component.FA.mZ.NOt(fa2.getName(), fa2) { // from class: com.bytedance.sdk.openadsdk.utils.WD.2
                @Override // java.lang.Runnable
                public void run() {
                    fa2.run();
                }
            });
            return;
        }
        ThreadPoolExecutor threadPoolExecutorLp = lp();
        threadPoolExecutorLp.execute(fa2);
        if (NOt || !com.bytedance.sdk.openadsdk.core.settings.yBV.kkl()) {
            return;
        }
        NOt = true;
        threadPoolExecutorLp.setCorePoolSize(com.bytedance.sdk.openadsdk.core.settings.yBV.CH().FFX());
    }

    public static void ZRu(Runnable runnable) {
        if (runnable == null || Nb.ZRu) {
            return;
        }
        if (TFq()) {
            runnable.run();
        } else {
            com.bytedance.sdk.openadsdk.core.edo.mZ().post(runnable);
        }
    }

    public static void NOt(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.edo.mZ().removeCallbacks(runnable);
    }

    public static void mZ(final com.bytedance.sdk.component.FA.FA fa2) {
        if (fa2 == null || Nb.ZRu) {
            return;
        }
        if (ZH()) {
            edo().execute(new com.bytedance.sdk.component.FA.mZ.NOt(fa2.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.WD.7
                @Override // java.lang.Runnable
                public void run() {
                    fa2.run();
                }
            });
        } else {
            com.bytedance.sdk.component.FA.Ht.mZ(fa2);
        }
    }

    public static void uR(final com.bytedance.sdk.component.FA.FA fa2) {
        if (fa2 == null || Nb.ZRu) {
            return;
        }
        if (ZH()) {
            sAl().execute(new com.bytedance.sdk.component.FA.mZ.NOt(fa2.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.WD.9
                @Override // java.lang.Runnable
                public void run() {
                    fa2.run();
                }
            });
        } else {
            com.bytedance.sdk.component.FA.Ht.TFq(fa2);
        }
    }

    public static void NOt(final com.bytedance.sdk.component.FA.FA fa2) {
        if (Nb.ZRu) {
            return;
        }
        if (ZH()) {
            WMI().execute(new com.bytedance.sdk.component.FA.mZ.NOt(fa2.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.WD.5
                @Override // java.lang.Runnable
                public void run() {
                    fa2.run();
                }
            });
        } else {
            com.bytedance.sdk.component.FA.Ht.NOt(fa2);
        }
    }

    public static void ZRu(final com.bytedance.sdk.component.FA.FA fa2) {
        if (Nb.ZRu) {
            return;
        }
        if (ZH()) {
            FA().execute(new com.bytedance.sdk.component.FA.mZ.NOt(fa2.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.WD.4
                @Override // java.lang.Runnable
                public void run() {
                    fa2.run();
                }
            });
        } else {
            com.bytedance.sdk.component.FA.Ht.ZRu(fa2);
        }
    }

    public static void mZ(final com.bytedance.sdk.component.FA.FA fa2, int i10) {
        if (fa2 == null || Nb.ZRu) {
            return;
        }
        if (ZH()) {
            oK().execute(new com.bytedance.sdk.component.FA.mZ.NOt(fa2.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.WD.10
                @Override // java.lang.Runnable
                public void run() {
                    fa2.run();
                }
            });
        } else {
            com.bytedance.sdk.component.FA.Ht.mZ(fa2, i10);
        }
    }

    public static void NOt(final com.bytedance.sdk.component.FA.FA fa2, int i10) {
        if (fa2 == null || Nb.ZRu) {
            return;
        }
        if (ZH()) {
            com.bytedance.sdk.component.FA.mZ.NOt nOt = new com.bytedance.sdk.component.FA.mZ.NOt(fa2.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.WD.8
                @Override // java.lang.Runnable
                public void run() {
                    fa2.run();
                }
            };
            nOt.ZRu(i10);
            edo().execute(nOt);
            return;
        }
        com.bytedance.sdk.component.FA.Ht.NOt(fa2, i10);
    }

    public static void ZRu(final com.bytedance.sdk.component.FA.FA fa2, int i10) {
        if (fa2 == null || Nb.ZRu) {
            return;
        }
        if (ZH()) {
            com.bytedance.sdk.component.FA.mZ.NOt nOt = new com.bytedance.sdk.component.FA.mZ.NOt(fa2.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.WD.6
                @Override // java.lang.Runnable
                public void run() {
                    fa2.run();
                }
            };
            nOt.ZRu(i10);
            WMI().execute(nOt);
            return;
        }
        com.bytedance.sdk.component.FA.Ht.ZRu(fa2, 5, i10);
    }

    private static Ht.ZRu NOt(String str) {
        Ht.ZRu zRu;
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        zRu = new Ht.ZRu();
        str.getClass();
        switch (str) {
            case "express":
                return zRu.ZRu(str).ZRu(2).NOt(4).mZ(0).ZRu(10000L).ZRu(true).TFq(-1).uR(10).NOt(false);
            case "ad":
                return zRu.ZRu(str).ZRu(4).NOt(4).mZ(0).ZRu(20000L).ZRu(true).TFq(-1).uR(10).NOt(false);
            case "io":
                return zRu.ZRu(str).ZRu(4).NOt(10).mZ(0).ZRu(20000L).ZRu(true).TFq(-1).uR(10).NOt(false);
            case "log":
                return zRu.ZRu(str).ZRu(4).NOt(6).mZ(2).ZRu(20000L).ZRu(true).TFq(-1).uR(10).NOt(false);
            case "net":
                return zRu.ZRu(str).ZRu(10).NOt(10).mZ(0).ZRu(10000L).ZRu(true).TFq(-1).uR(10).NOt(false);
            case "aidl":
                return zRu.ZRu(str).ZRu(2).NOt(4).mZ(0).ZRu(10000L).ZRu(true).TFq(-1).uR(10).NOt(false);
            case "cache":
                return zRu.ZRu(str).ZRu(0).NOt(0).mZ(0).ZRu(5000L).ZRu(true).TFq(-1).uR(20).NOt(false);
            case "image":
                return zRu.ZRu(str).ZRu(3).NOt(3).mZ(0).ZRu(20000L).ZRu(true).TFq(-1).uR(10).NOt(false);
            case "monitor":
                return zRu.ZRu(str).ZRu(2).NOt(2).mZ(0).ZRu(10000L).ZRu(true).TFq(-1).uR(10).NOt(false);
            default:
                return zRu.ZRu(str).ZRu(8).NOt(16).mZ(2).ZRu(20000L).ZRu(true).TFq(-1).uR(10).NOt(false);
        }
    }

    public static void ZRu(com.bytedance.sdk.component.FA.mZ.NOt nOt) {
        aT().execute(nOt);
    }

    private static boolean ZRu(com.bytedance.sdk.component.FA.mZ.Ht ht) {
        if (ht != null) {
            return !ht.mZ() && com.bytedance.sdk.openadsdk.core.settings.yBV.kkl();
        }
        return true;
    }

    private static com.bytedance.sdk.component.FA.mZ.Ht ZRu(String str, com.bytedance.sdk.component.FA.mZ.Ht ht) {
        Ht.ZRu ZRu2 = ZRu(str);
        if (ht == null) {
            return ZRu2.ZRu();
        }
        ht.ZRu(ZRu2);
        return ht;
    }

    private static Ht.ZRu ZRu(String str) {
        Ht.ZRu zRuNOt = NOt(str);
        try {
            if (com.bytedance.sdk.openadsdk.core.settings.yBV.kkl()) {
                zRuNOt.NOt(true);
                JSONObject jSONObjectJJC = com.bytedance.sdk.openadsdk.core.settings.yBV.CH().jJC();
                JSONObject jSONObjectOptJSONObject = jSONObjectJJC != null ? jSONObjectJJC.optJSONObject(str) : null;
                if (jSONObjectOptJSONObject != null) {
                    zRuNOt.NOt(true);
                    if (jSONObjectOptJSONObject.has("coreSize")) {
                        zRuNOt.ZRu(jSONObjectOptJSONObject.optInt("coreSize"));
                    }
                    if (jSONObjectOptJSONObject.has("maxSize")) {
                        zRuNOt.NOt(jSONObjectOptJSONObject.optInt("maxSize"));
                    }
                    if (jSONObjectOptJSONObject.has("createSize")) {
                        zRuNOt.mZ(jSONObjectOptJSONObject.optInt("createSize"));
                    }
                    if (jSONObjectOptJSONObject.has("keepAlive")) {
                        zRuNOt.ZRu(jSONObjectOptJSONObject.optInt("keepAlive"));
                    }
                    if (jSONObjectOptJSONObject.has("allowCoreTimeOut")) {
                        zRuNOt.ZRu(jSONObjectOptJSONObject.optBoolean("allowCoreTimeOut"));
                    }
                    if (jSONObjectOptJSONObject.has("reportLogThreshold")) {
                        zRuNOt.TFq(jSONObjectOptJSONObject.optInt("reportLogThreshold"));
                    }
                    if (jSONObjectOptJSONObject.has("logTaskCount")) {
                        zRuNOt.uR(jSONObjectOptJSONObject.optInt("logTaskCount"));
                    }
                }
            }
            return zRuNOt;
        } catch (Throwable th) {
            th.getMessage();
            return zRuNOt;
        }
    }
}
