package com.bytedance.sdk.openadsdk.api.init;

import android.text.TextUtils;
import com.bytedance.sdk.component.Mm.uR.mZ;
import com.bytedance.sdk.component.utils.lp;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.api.PAGConstant;
import com.bytedance.sdk.openadsdk.core.fcs;
import com.bytedance.sdk.openadsdk.utils.OCA;
import com.bytedance.sdk.openadsdk.utils.Yx;

/* JADX INFO: loaded from: classes3.dex */
public final class PAGConfig implements InitConfig {
    private static String ZH;
    private boolean FA;
    private boolean NOt;
    private String Vor;
    private String ZRu;
    private String aT;
    private int mZ;
    private int uR = -1;
    private int TFq = -1;
    private int Ht = -1;
    private int Mm = 0;

    public static class Builder {
        private boolean NOt;
        private String[] Vor;
        private String ZH;
        private String ZRu;
        private String aT;
        private int mZ;
        private int uR = -1;
        private int TFq = -1;
        private int Ht = -1;
        private int Mm = 0;
        private boolean FA = false;

        public Builder appIcon(int i10) {
            this.mZ = i10;
            return this;
        }

        public Builder appId(String str) {
            this.ZRu = str;
            return this;
        }

        public PAGConfig build() {
            PAGConfig pAGConfig = new PAGConfig();
            pAGConfig.NOt(this.ZRu);
            pAGConfig.NOt(this.uR);
            pAGConfig.ZRu(this.mZ);
            pAGConfig.TFq(this.Mm);
            pAGConfig.NOt(this.FA);
            pAGConfig.mZ(this.TFq);
            pAGConfig.uR(this.Ht);
            pAGConfig.ZRu(this.NOt);
            pAGConfig.mZ(this.aT);
            pAGConfig.ZRu(this.ZH);
            return pAGConfig;
        }

        public Builder debugLog(boolean z10) {
            this.NOt = z10;
            return this;
        }

        public Builder needClearTaskReset(String... strArr) {
            this.Vor = strArr;
            return this;
        }

        public Builder setChildDirected(@PAGConstant.PAGChildDirectedType int i10) {
            this.uR = i10;
            return this;
        }

        public Builder setDoNotSell(@PAGConstant.PAGDoNotSellType int i10) {
            this.Ht = i10;
            return this;
        }

        public Builder setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i10) {
            this.TFq = i10;
            return this;
        }

        public Builder setPackageName(String str) {
            this.aT = str;
            return this;
        }

        public Builder setUserData(String str) {
            this.ZH = str;
            return this;
        }

        public Builder supportMultiProcess(boolean z10) {
            this.FA = z10;
            return this;
        }

        public Builder titleBarTheme(int i10) {
            this.Mm = i10;
            return this;
        }

        public Builder useTextureView(boolean z10) {
            return this;
        }
    }

    public static void debugLog(boolean z10) {
        if (fcs.ZRu() != null) {
            if (z10) {
                fcs.ZRu().TFq(1);
                fcs.ZRu().ZRu();
                return;
            }
            fcs.ZRu().TFq(0);
            mZ.ZRu(mZ.ZRu.OFF);
            lp.mZ();
            com.bykv.vk.openvk.ZRu.ZRu.ZRu.Mm.mZ.NOt();
            OCA.NOt();
        }
    }

    public static int getChildDirected() {
        if (Yx.Vor("getCoppa")) {
            return fcs.ZRu().NOt();
        }
        return -1;
    }

    public static int getDoNotSell() {
        if (Yx.Vor("getCCPA")) {
            return fcs.ZRu().Ht();
        }
        return -1;
    }

    public static int getGDPRConsent() {
        if (!Yx.Vor("getGdpr")) {
            return -1;
        }
        int iMZ = fcs.ZRu().mZ();
        if (iMZ == 1) {
            return 0;
        }
        if (iMZ == 0) {
            return 1;
        }
        return iMZ;
    }

    public static void setAppIconId(int i10) {
        if (fcs.ZRu() != null) {
            fcs.ZRu().Ht(i10);
        }
    }

    public static void setChildDirected(@PAGConstant.PAGChildDirectedType int i10) {
        if (Yx.Vor("setCoppa")) {
            if (i10 < -1 || i10 > 1) {
                i10 = -1;
            }
            fcs.ZRu().NOt(i10);
        }
    }

    public static void setDoNotSell(@PAGConstant.PAGDoNotSellType int i10) {
        if (Yx.Vor("setCCPA")) {
            if (i10 < -1 || i10 > 1) {
                i10 = -1;
            }
            fcs.ZRu().uR(i10);
        }
    }

    public static void setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i10) {
        Yx.Vor("setGdpr");
        if (i10 < -1 || i10 > 1) {
            i10 = -1;
        }
        fcs.ZRu().mZ(i10);
    }

    public static void setPackageName(String str) {
        ZH = str;
    }

    public static void setUserData(String str) {
        if (fcs.ZRu() != null) {
            fcs.ZRu().NOt(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getAppIconId() {
        return this.mZ;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getAppId() {
        return this.ZRu;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getCcpa() {
        return this.Ht;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getCoppa() {
        return this.uR;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getData() {
        return this.aT;
    }

    public boolean getDebugLog() {
        return this.NOt;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getGdpr() {
        return this.TFq;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getPackageName() {
        return TextUtils.isEmpty(this.Vor) ? ZH : this.Vor;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getTitleBarTheme() {
        return this.Mm;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isSupportMultiProcess() {
        return this.FA;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isUseTextureView() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public void TFq(int i10) {
        this.Mm = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uR(int i10) {
        if (i10 < -1 || i10 > 1) {
            i10 = -1;
        }
        this.Ht = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZ(int i10) {
        if (i10 < -1 || i10 > 1) {
            i10 = -1;
        }
        this.TFq = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NOt(String str) {
        this.ZRu = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(String str) {
        this.aT = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZ(String str) {
        this.Vor = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NOt(int i10) {
        if (i10 < -1 || i10 > 1) {
            i10 = -1;
        }
        this.uR = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(boolean z10) {
        this.NOt = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NOt(boolean z10) {
        this.FA = z10;
        com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.ZRu(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(int i10) {
        this.mZ = i10;
    }
}
