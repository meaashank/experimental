package com.bytedance.sdk.openadsdk.Vor;

import android.content.Context;
import com.bytedance.sdk.component.NOt.ZRu.Ht;
import com.bytedance.sdk.component.NOt.ZRu.ZH;
import com.bytedance.sdk.component.NOt.ZRu.sAl;
import com.bytedance.sdk.component.TFq.aT;
import com.bytedance.sdk.component.TFq.mZ.TFq;
import com.bytedance.sdk.component.TFq.oK;
import com.bytedance.sdk.component.TFq.to;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.utils.Cox;
import com.bytedance.sdk.openadsdk.utils.WD;
import com.bytedance.sdk.openadsdk.utils.th;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public class uR {

    public static final class ZRu {
        private static final oK ZRu = ZRu(WMI.ZRu());

        /* JADX INFO: Access modifiers changed from: private */
        public static aT NOt(String str) {
            return ZRu(ZRu.ZRu(str).TFq(Cox.uR(WMI.ZRu())).uR(Cox.mZ(WMI.ZRu())));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static aT NOt(com.bytedance.sdk.openadsdk.core.model.oK oKVar) {
            return ZRu(ZRu.ZRu(oKVar.ZRu()).ZRu(oKVar.NOt()).NOt(oKVar.mZ()).TFq(Cox.uR(WMI.ZRu())).uR(Cox.mZ(WMI.ZRu())).ZRu(oKVar.Mm()));
        }

        private static oK ZRu(Context context) {
            return com.bytedance.sdk.component.TFq.mZ.NOt.ZRu(context, new TFq.ZRu().ZRu(new com.bytedance.sdk.component.TFq.mZ.ZRu.ZRu(Math.max(Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 83886080), 10485760), 41943040L, new File(CacheDirFactory.getImageCacheDir()))).ZRu(new to() { // from class: com.bytedance.sdk.openadsdk.Vor.uR.ZRu.2
                @Override // com.bytedance.sdk.component.TFq.to
                public ExecutorService ZRu() {
                    return WD.NOt();
                }
            }).ZRu(new com.bytedance.sdk.component.TFq.uR() { // from class: com.bytedance.sdk.openadsdk.Vor.uR.ZRu.1
                @Override // com.bytedance.sdk.component.TFq.uR
                /* JADX INFO: renamed from: NOt, reason: merged with bridge method [inline-methods] */
                public com.bytedance.sdk.component.TFq.NOt.uR ZRu(com.bytedance.sdk.component.TFq.TFq tFq) {
                    ZH zhTFq = com.bytedance.sdk.openadsdk.WMI.mZ.ZRu().NOt().TFq();
                    sAl salNOt = new sAl.ZRu().NOt(tFq.ZRu()).ZRu().NOt();
                    com.bytedance.sdk.component.NOt.ZRu.oK oKVarNOt = null;
                    com.bytedance.sdk.component.TFq.NOt.TFq tFq2 = tFq.mZ() ? new com.bytedance.sdk.component.TFq.NOt.TFq() : null;
                    if (tFq2 != null) {
                        tFq2.ZRu(System.currentTimeMillis());
                    }
                    try {
                        oKVarNOt = zhTFq.ZRu(salNOt).NOt();
                        if (tFq2 != null) {
                            tFq2.NOt(System.currentTimeMillis());
                        }
                        Map<String, String> mapZRu = ZRu(tFq, oKVarNOt);
                        byte[] bArrUR = oKVarNOt.Ht().uR();
                        if (tFq2 != null) {
                            tFq2.mZ(System.currentTimeMillis());
                        }
                        com.bytedance.sdk.component.TFq.NOt.uR uRVar = new com.bytedance.sdk.component.TFq.NOt.uR(oKVarNOt.mZ(), bArrUR, "", mapZRu);
                        uRVar.ZRu(tFq2);
                        return uRVar;
                    } catch (Throwable th) {
                        try {
                            return ZRu(tFq2, th);
                        } finally {
                            com.bytedance.sdk.component.TFq.mZ.mZ.NOt.ZRu(oKVarNOt);
                        }
                    }
                }

                private Map<String, String> ZRu(com.bytedance.sdk.component.TFq.TFq tFq, com.bytedance.sdk.component.NOt.ZRu.oK oKVar) {
                    if (!tFq.NOt()) {
                        return null;
                    }
                    Ht htMm = oKVar.Mm();
                    HashMap map = new HashMap();
                    int iZRu = htMm.ZRu();
                    for (int i10 = 0; i10 < iZRu; i10++) {
                        String strZRu = htMm.ZRu(i10);
                        String strNOt = htMm.NOt(i10);
                        if (strZRu != null) {
                            map.put(strZRu, strNOt);
                        }
                    }
                    return map;
                }

                private com.bytedance.sdk.component.TFq.NOt.uR ZRu(com.bytedance.sdk.component.TFq.NOt.TFq tFq, Throwable th) {
                    th.getMessage();
                    if (tFq != null) {
                        tFq.mZ(System.currentTimeMillis());
                    }
                    com.bytedance.sdk.component.TFq.NOt.uR uRVar = new com.bytedance.sdk.component.TFq.NOt.uR(98765, th, "net failed");
                    uRVar.ZRu(tFq);
                    return uRVar;
                }
            }).ZRu());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static InputStream NOt(String str, String str2) {
            return ZRu.ZRu(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean NOt(String str, String str2, String str3) {
            return ZRu.ZRu(str, str2, str3);
        }

        private static aT ZRu(aT aTVar) {
            return th.ZRu() ? aTVar.ZRu(new TFq()) : aTVar;
        }
    }

    public static aT ZRu(String str) {
        return ZRu.NOt(str);
    }

    public static aT ZRu(com.bytedance.sdk.openadsdk.core.model.oK oKVar) {
        return ZRu.NOt(oKVar);
    }

    public static InputStream ZRu(String str, String str2) {
        return ZRu.NOt(str, str2);
    }

    public static boolean ZRu(String str, String str2, String str3) {
        return ZRu.NOt(str, str2, str3);
    }

    public static oK ZRu() {
        return ZRu.ZRu;
    }
}
