package com.bytedance.sdk.openadsdk.uR.ZRu;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu {
    public static final NOt ZRu = new NOt(0);
    public static final NOt NOt = new NOt(1);
    public static final NOt mZ = new NOt(2);
    public static final NOt uR = new NOt(0);
    public static final NOt TFq = new NOt(1);
    public static final NOt Ht = new NOt(2);

    public static void NOt() {
        try {
            com.bytedance.sdk.openadsdk.edo.mZ.NOt("net_upload_monitor", com.bytedance.sdk.openadsdk.multipro.uR.ZRu.NOt("tt_sdk_event_net_ad", "tt_sdk_event_net_ad", ""));
            com.bytedance.sdk.openadsdk.multipro.uR.ZRu.ZRu("tt_sdk_event_net_ad");
            com.bytedance.sdk.openadsdk.edo.mZ.NOt("net_upload_monitor", com.bytedance.sdk.openadsdk.multipro.uR.ZRu.NOt("tt_sdk_event_net_state", "tt_sdk_event_net_state", ""));
            com.bytedance.sdk.openadsdk.multipro.uR.ZRu.ZRu("tt_sdk_event_net_state");
            com.bytedance.sdk.openadsdk.edo.mZ.NOt("net_upload_monitor", com.bytedance.sdk.openadsdk.multipro.uR.ZRu.NOt("tt_sdk_event_net_trail", "tt_sdk_event_net_trail", ""));
            com.bytedance.sdk.openadsdk.multipro.uR.ZRu.ZRu("tt_sdk_event_net_trail");
            com.bytedance.sdk.openadsdk.edo.mZ.NOt("db_upload_monitor", com.bytedance.sdk.openadsdk.multipro.uR.ZRu.NOt("tt_sdk_event_db_ad", "tt_sdk_event_db_ad", ""));
            com.bytedance.sdk.openadsdk.multipro.uR.ZRu.ZRu("tt_sdk_event_db_ad");
            com.bytedance.sdk.openadsdk.edo.mZ.NOt("db_upload_monitor", com.bytedance.sdk.openadsdk.multipro.uR.ZRu.NOt("tt_sdk_event_db_state", "tt_sdk_event_db_state", ""));
            com.bytedance.sdk.openadsdk.multipro.uR.ZRu.ZRu("tt_sdk_event_db_state");
            com.bytedance.sdk.openadsdk.edo.mZ.NOt("db_upload_monitor", com.bytedance.sdk.openadsdk.multipro.uR.ZRu.NOt("tt_sdk_event_db_trail", "tt_sdk_event_db_trail", ""));
            com.bytedance.sdk.openadsdk.multipro.uR.ZRu.ZRu("tt_sdk_event_db_trail");
        } catch (Throwable unused) {
        }
    }

    public static void ZRu(NOt nOt, boolean z10, int i10, long j10) {
        try {
            nOt.Mm.getAndSet(true);
            if (z10) {
                nOt.ZRu.incrementAndGet();
                nOt.mZ.addAndGet(j10);
                return;
            }
            nOt.NOt.incrementAndGet();
            Integer num = nOt.Ht.get(Integer.valueOf(i10));
            if (num != null) {
                nOt.Ht.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() + 1));
            } else {
                nOt.Ht.put(Integer.valueOf(i10), 1);
            }
        } catch (Throwable unused) {
        }
    }

    public static void ZRu(NOt nOt, boolean z10) {
        try {
            nOt.Mm.getAndSet(true);
            if (z10) {
                nOt.ZRu.incrementAndGet();
            } else {
                nOt.NOt.incrementAndGet();
            }
        } catch (Throwable unused) {
        }
    }

    public static void ZRu(NOt nOt) {
        try {
            nOt.Mm.getAndSet(true);
            nOt.TFq.incrementAndGet();
        } catch (Throwable unused) {
        }
    }

    public static void ZRu() {
        try {
            NOt nOt = ZRu;
            if (nOt.Mm.get()) {
                com.bytedance.sdk.openadsdk.multipro.uR.ZRu.ZRu("tt_sdk_event_net_ad", "tt_sdk_event_net_ad", nOt.ZRu().toString());
            }
            NOt nOt2 = NOt;
            if (nOt2.Mm.get()) {
                com.bytedance.sdk.openadsdk.multipro.uR.ZRu.ZRu("tt_sdk_event_net_state", "tt_sdk_event_net_state", nOt2.ZRu().toString());
            }
            NOt nOt3 = mZ;
            if (nOt3.Mm.get()) {
                com.bytedance.sdk.openadsdk.multipro.uR.ZRu.ZRu("tt_sdk_event_net_trail", "tt_sdk_event_net_trail", nOt3.ZRu().toString());
            }
            NOt nOt4 = uR;
            if (nOt4.Mm.get()) {
                com.bytedance.sdk.openadsdk.multipro.uR.ZRu.ZRu("tt_sdk_event_db_ad", "tt_sdk_event_db_ad", nOt4.NOt().toString());
            }
            NOt nOt5 = TFq;
            if (nOt5.Mm.get()) {
                com.bytedance.sdk.openadsdk.multipro.uR.ZRu.ZRu("tt_sdk_event_db_state", "tt_sdk_event_db_state", nOt5.NOt().toString());
            }
            NOt nOt6 = Ht;
            if (nOt6.Mm.get()) {
                com.bytedance.sdk.openadsdk.multipro.uR.ZRu.ZRu("tt_sdk_event_db_trail", "tt_sdk_event_db_trail", nOt6.NOt().toString());
            }
        } catch (Throwable unused) {
        }
    }
}
