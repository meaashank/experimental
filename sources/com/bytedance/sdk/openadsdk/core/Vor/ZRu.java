package com.bytedance.sdk.openadsdk.core.Vor;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.Vor;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.core.edo;
import com.bytedance.sdk.openadsdk.core.lp;
import com.bytedance.sdk.openadsdk.edo.ZRu.uR;
import com.bytedance.sdk.openadsdk.utils.OCA;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class ZRu {
    private volatile boolean NOt;
    private PglSSManager ZRu;
    private volatile boolean mZ = true;
    private volatile boolean uR = false;

    public ZRu() {
        ZRu();
    }

    private boolean FA() {
        if (!this.NOt && this.mZ) {
            ZRu();
        }
        return this.NOt;
    }

    private void Vor() {
        if (this.ZRu == null) {
            this.ZRu = PglSSManager.getInstance();
        }
    }

    private Class aT() {
        Class<?> cls;
        try {
            cls = Class.forName("com.pgl.ssdk.ces.out.PglSSManager");
        } catch (Throwable unused) {
            cls = null;
        }
        try {
            this.mZ = true;
            return cls;
        } catch (Throwable unused2) {
            this.mZ = false;
            return cls;
        }
    }

    public long Ht() {
        if (!FA()) {
            return 0L;
        }
        Vor();
        PglSSManager pglSSManager = this.ZRu;
        if (pglSSManager != null) {
            return pglSSManager.getECForBidding();
        }
        return 0L;
    }

    public int Mm() {
        if (this.mZ) {
            return PglSSManager.getInitStatus();
        }
        return 5;
    }

    public boolean NOt() {
        return this.NOt;
    }

    public String TFq() {
        if (!FA()) {
            return "";
        }
        Vor();
        PglSSManager pglSSManager = this.ZRu;
        return pglSSManager != null ? pglSSManager.getSofChara() : "";
    }

    public void mZ() {
        if (FA()) {
            Vor();
            if (this.ZRu != null) {
                edo.NOt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Vor.ZRu.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            HashMap map = new HashMap();
                            map.put(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ, WMI.uR().bDW());
                            ZRu.this.ZRu.setCustomInfo(map);
                        } catch (Throwable th) {
                            OCA.NOt("MSSdkImpl", "setCustomInfo", th.getMessage());
                        }
                    }
                });
            }
        }
    }

    public String uR() {
        if (!FA()) {
            return "";
        }
        Vor();
        PglSSManager pglSSManager = this.ZRu;
        return pglSSManager != null ? pglSSManager.getToken() : "";
    }

    public void NOt(String str) {
        if (FA()) {
            Vor();
            PglSSManager pglSSManager = this.ZRu;
            if (pglSSManager != null) {
                pglSSManager.setDeviceId(str);
            }
        }
    }

    public synchronized void ZRu() {
        if (!this.NOt) {
            try {
                Context contextZRu = WMI.ZRu();
                String strUR = Vor.NOt().uR();
                if (TextUtils.isEmpty(strUR)) {
                    strUR = Vor.ZRu("app_id", Long.MAX_VALUE);
                }
                if (TextUtils.isEmpty(strUR)) {
                    return;
                }
                PglSSManager.init(contextZRu, PglSSConfig.builder().setAppId(strUR).setOVRegionType(0).setAdsdkVersion(BuildConfig.VERSION_NAME).build(), null, null, lp.ZRu(contextZRu), com.bytedance.sdk.openadsdk.qF.ZRu.NOt.ZRu.ZRu().NOt());
                Vor();
                this.NOt = true;
            } catch (Throwable unused) {
                aT();
                this.NOt = false;
            }
            try {
                if (this.mZ) {
                    mZ(PglSSManager.getLoadError());
                }
            } catch (Throwable th) {
                OCA.NOt("mssdk", th.getMessage());
            }
        }
    }

    private void mZ(final String str) {
        if (this.uR || TextUtils.isEmpty(str)) {
            return;
        }
        WMI.TFq().ZRu(new com.bytedance.sdk.openadsdk.edo.NOt() { // from class: com.bytedance.sdk.openadsdk.core.Vor.ZRu.2
            @Override // com.bytedance.sdk.openadsdk.edo.NOt
            public com.bytedance.sdk.openadsdk.edo.ZRu.mZ getLogStats() throws Exception {
                return uR.NOt().ZRu("secsdk_init_error").NOt(str);
            }
        }, false);
        this.uR = true;
    }

    public void ZRu(String str) {
        if (FA()) {
            Vor();
            PglSSManager pglSSManager = this.ZRu;
            if (pglSSManager != null) {
                pglSSManager.setGaid(str);
            }
        }
    }

    public void ZRu(String str, Map<String, Object> map) {
        if (FA()) {
            Vor();
            PglSSManager pglSSManager = this.ZRu;
            if (pglSSManager != null) {
                pglSSManager.reportNow(str, map);
            }
        }
    }

    public void ZRu(MotionEvent motionEvent) {
        if (NOt()) {
            Vor();
            PglSSManager pglSSManager = this.ZRu;
            if (pglSSManager != null) {
                pglSSManager.checkEventVirtual(motionEvent);
            }
        }
    }

    public Map<String, String> ZRu(String str, byte[] bArr) {
        Map<String, String> featureHash;
        return (!FA() || (featureHash = this.ZRu.getFeatureHash(str, bArr)) == null) ? new HashMap() : featureHash;
    }
}
