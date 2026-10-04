package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.utils.xY;
import com.bytedance.sdk.openadsdk.utils.Yx;
import com.prism.gaia.download.j;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ZH {
    private static final AtomicInteger ZRu = new AtomicInteger(0);
    private static final AtomicBoolean NOt = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public static void mZ(final String str) {
        com.bytedance.sdk.openadsdk.utils.WD.mZ(new com.bytedance.sdk.component.FA.FA("ipv6") { // from class: com.bytedance.sdk.openadsdk.core.ZH.1
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObjectZRu;
                final String strCvm = com.bytedance.sdk.openadsdk.core.settings.yBV.CH().cvm();
                com.bytedance.sdk.openadsdk.edo.mZ.ZRu(0, strCvm);
                if (TextUtils.isEmpty(strCvm)) {
                    com.bytedance.sdk.openadsdk.edo.mZ.ZRu(-1, strCvm, -1, "url is null");
                    return;
                }
                com.bytedance.sdk.component.Mm.NOt.uR uRVarNOt = com.bytedance.sdk.openadsdk.WMI.mZ.ZRu().NOt().NOt();
                try {
                    uRVarNOt.NOt(strCvm);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("connect_type", com.bytedance.sdk.component.utils.xY.ZRu(WMI.ZRu(), 0L));
                    jSONObject.put("device_id", Long.parseLong(str));
                    jSONObject.put(j.b.a.f164784c, com.bytedance.sdk.openadsdk.uR.ZRu.mZ.ZRu().NOt());
                    if (com.bytedance.sdk.openadsdk.core.settings.yBV.CH().ZRu(PangleEncryptConstant.CryptDataScene.APP_LOG)) {
                        jSONObjectZRu = PangleEncryptManager.encryptType4(jSONObject, new to(PangleEncryptConstant.CryptDataScene.DUAL_EVENT));
                        if (jSONObjectZRu == null || jSONObjectZRu.optInt("cypher") != 4) {
                            xY.NOt(false);
                        } else {
                            xY.NOt(true);
                            uRVarNOt.NOt("x-pgli18n", "4");
                            uRVarNOt.NOt("Content-Type", "application/json; charset=utf-8");
                        }
                    } else {
                        jSONObjectZRu = com.bytedance.sdk.component.utils.ZRu.ZRu(jSONObject);
                        if (ZH.NOt(jSONObjectZRu)) {
                            uRVarNOt.NOt("Content-Encoding", "union_sdk_encode");
                        }
                    }
                    if (ZH.NOt(jSONObjectZRu)) {
                        jSONObject = jSONObjectZRu;
                    }
                    uRVarNOt.NOt("Content-Type", "application/json; charset=utf-8");
                    uRVarNOt.NOt("User-Agent", Yx.mZ());
                    uRVarNOt.ZRu(jSONObject);
                    uRVarNOt.ZRu(6);
                    uRVarNOt.ZRu("send_i_p_v6");
                    uRVarNOt.ZRu(new com.bytedance.sdk.component.Mm.ZRu.ZRu() { // from class: com.bytedance.sdk.openadsdk.core.ZH.1.1
                        @Override // com.bytedance.sdk.component.Mm.ZRu.ZRu
                        public void ZRu(com.bytedance.sdk.component.Mm.NOt.mZ mZVar, com.bytedance.sdk.component.Mm.NOt nOt) {
                            if (nOt.Ht()) {
                                com.bytedance.sdk.openadsdk.edo.mZ.ZRu(1, strCvm);
                            } else {
                                com.bytedance.sdk.openadsdk.edo.mZ.ZRu(-1, strCvm, nOt.ZRu(), nOt.NOt());
                                ZH.uR();
                            }
                        }

                        @Override // com.bytedance.sdk.component.Mm.ZRu.ZRu
                        public void ZRu(com.bytedance.sdk.component.Mm.NOt.mZ mZVar, IOException iOException) {
                            if (iOException != null) {
                                com.bytedance.sdk.openadsdk.edo.mZ.ZRu(-1, strCvm, 1, iOException.getMessage());
                            }
                            ZH.uR();
                        }
                    });
                } catch (Exception e10) {
                    com.bytedance.sdk.openadsdk.edo.mZ.ZRu(-1, strCvm, -2, e10.getMessage());
                    com.bytedance.sdk.component.utils.lp.NOt("build ipv6 request failed:" + e10.getMessage());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void uR() {
        if (ZRu.getAndIncrement() <= 0) {
            com.bytedance.sdk.openadsdk.utils.WD.ZRu().schedule(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ZH.2
                @Override // java.lang.Runnable
                public void run() {
                    ZH.mZ(lp.ZRu(WMI.ZRu()));
                }
            }, 10000L, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mZ() {
        ZRu.set(0);
    }

    public static class ZRu implements xY.ZRu {
        private static final AtomicBoolean ZRu = new AtomicBoolean(false);
        private static volatile long NOt = -1;

        private ZRu() {
        }

        public static void ZRu() {
            if (ZRu.compareAndSet(false, true)) {
                NOt = System.currentTimeMillis();
                com.bytedance.sdk.component.utils.xY.ZRu(new ZRu(), WMI.ZRu());
            }
        }

        public void NOt() {
            com.bytedance.sdk.component.utils.xY.ZRu(this);
        }

        @Override // com.bytedance.sdk.component.utils.xY.ZRu
        public void ZRu(Context context, Intent intent, boolean z10, int i10) {
            if (System.currentTimeMillis() - NOt >= 2000 && i10 != 0) {
                ZH.mZ();
                ZH.mZ(lp.ZRu(WMI.ZRu()));
                NOt();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean NOt(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    public static void ZRu(String str) {
        AtomicBoolean atomicBoolean = NOt;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!com.bytedance.sdk.component.utils.oK.FA(WMI.ZRu())) {
                atomicBoolean.set(false);
            } else {
                ZRu.ZRu();
                mZ(str);
            }
        }
    }
}
