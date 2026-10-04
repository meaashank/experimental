package com.bytedance.sdk.openadsdk.uR.ZRu;

import android.content.Context;
import com.bytedance.sdk.component.Ht.ZRu.ZRu;
import com.bytedance.sdk.openadsdk.core.WMI;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class uR {
    public static AtomicInteger ZRu = new AtomicInteger(0);
    public static final AtomicBoolean NOt = new AtomicBoolean(false);

    public static void NOt() {
        com.bytedance.sdk.component.Ht.ZRu.NOt.mZ();
    }

    public static void ZRu(Context context, boolean z10) {
        if (NOt.compareAndSet(false, true)) {
            com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu(new ZRu.C0404ZRu().ZRu(new aT()).NOt(com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu.mZ()).mZ(com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu.TFq()).ZRu(com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu.uR()).ZRu(z10).ZRu(new ZH()).ZRu(FA.ZRu).NOt(WMI.uR().edo()).ZRu(WMI.uR().oK()).ZRu(WMI.uR().wZ()).ZRu(), context);
            NOt();
        }
    }

    public static void mZ() {
        try {
            com.bytedance.sdk.component.Ht.ZRu.NOt.uR();
            com.bytedance.sdk.component.Ht.ZRu.NOt.TFq();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("AdLogSwitchUtils", th.getMessage());
        }
    }

    public static void ZRu(com.bytedance.sdk.openadsdk.uR.ZRu zRu) {
        com.bytedance.sdk.component.Ht.ZRu.uR.ZRu.ZRu zRu2 = new com.bytedance.sdk.component.Ht.ZRu.uR.ZRu.ZRu(zRu.uR(), zRu);
        zRu2.NOt(zRu.TFq() ? (byte) 1 : (byte) 2);
        zRu2.ZRu((byte) 0);
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.NOt()) {
            ZRu(WMI.ZRu(), com.bytedance.sdk.openadsdk.multipro.NOt.mZ());
        }
        com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu(zRu2);
    }

    public static com.bytedance.sdk.openadsdk.edo.mZ.NOt ZRu() {
        return lp.ZRu;
    }

    public static void ZRu(final List<String> list, final int i10, final String str) {
        if (list == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.uR.mZ.ZRu(new com.bytedance.sdk.component.FA.FA("track") { // from class: com.bytedance.sdk.openadsdk.uR.ZRu.uR.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.Ht.ZRu.NOt.NOt()) {
                    uR.ZRu(WMI.ZRu(), com.bytedance.sdk.openadsdk.multipro.NOt.mZ());
                }
                com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu(com.bytedance.sdk.openadsdk.core.lp.ZRu(WMI.ZRu()), list, true, i10, str);
            }
        });
    }

    public static void ZRu(String str) {
        ZRu(str, false);
    }

    public static void ZRu(String str, boolean z10) {
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.NOt()) {
            ZRu(WMI.ZRu(), com.bytedance.sdk.openadsdk.multipro.NOt.mZ());
        }
        com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu(str, z10);
    }
}
