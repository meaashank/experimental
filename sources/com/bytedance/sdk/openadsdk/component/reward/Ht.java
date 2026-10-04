package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.qF;
import com.bytedance.sdk.openadsdk.utils.WD;
import com.bytedance.sdk.openadsdk.utils.fcs;
import com.bytedance.sdk.openadsdk.utils.xY;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
class Ht extends PAGInterstitialAd {
    private boolean FA;
    private final com.bytedance.sdk.openadsdk.core.model.ZRu NOt;
    private boolean Vor;
    private final Context ZRu;
    private com.bytedance.sdk.openadsdk.ZRu.mZ.NOt mZ;
    private final AtomicBoolean TFq = new AtomicBoolean(false);
    private boolean Ht = false;
    private boolean uR = false;
    private final String Mm = xY.ZRu();

    public Ht(Context context, com.bytedance.sdk.openadsdk.core.model.ZRu zRu) {
        this.ZRu = context;
        this.NOt = zRu;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        com.bytedance.sdk.openadsdk.core.model.ZRu zRu = this.NOt;
        if (zRu == null || zRu.TFq() == null || this.NOt.TFq().zkn() == null) {
            return null;
        }
        try {
            return this.NOt.TFq().zkn().get(str);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("TTFullScreenVideoAdImpl", th.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        com.bytedance.sdk.openadsdk.core.model.ZRu zRu = this.NOt;
        if (zRu == null || zRu.TFq() == null) {
            return null;
        }
        return this.NOt.TFq().zkn();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d10, String str, String str2) {
        if (this.Vor) {
            return;
        }
        fcs.ZRu(this.NOt.TFq(), d10, str, str2);
        this.Vor = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionCallback(PAGInterstitialAdInteractionCallback pAGInterstitialAdInteractionCallback) {
        this.mZ = new com.bytedance.sdk.openadsdk.component.mZ.ZRu(pAGInterstitialAdInteractionCallback);
        ZRu(1);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionListener(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.mZ = new com.bytedance.sdk.openadsdk.component.mZ.ZRu(pAGInterstitialAdInteractionListener);
        ZRu(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void show(android.app.Activity r12) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.Ht.show(android.app.Activity):void");
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        if (this.FA) {
            return;
        }
        fcs.ZRu(this.NOt.TFq(), d10);
        this.FA = true;
    }

    public void ZRu(boolean z10) {
        this.Ht = z10;
    }

    public void ZRu() {
        if (this.TFq.get()) {
            return;
        }
        this.uR = true;
    }

    private static boolean ZRu(qF qFVar) {
        if (qFVar == null) {
            return false;
        }
        int iYBV = qFVar.yBV();
        return (qFVar.xY() != 2 || iYBV == 5 || iYBV == 33 || iYBV == 6 || iYBV == 19 || iYBV == 12) ? false : true;
    }

    private void ZRu(final int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
            WD.mZ(new com.bytedance.sdk.component.FA.FA("FullScreen_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.reward.Ht.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.ZRu ZRu = com.bytedance.sdk.openadsdk.multipro.aidl.ZRu.ZRu();
                    if (i10 != 1 || Ht.this.mZ == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.multipro.aidl.NOt.mZ mZVar = new com.bytedance.sdk.openadsdk.multipro.aidl.NOt.mZ(Ht.this.mZ);
                    IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(ZRu.ZRu(1));
                    if (iListenerManagerAsInterface != null) {
                        try {
                            iListenerManagerAsInterface.registerFullVideoListener(Ht.this.Mm, mZVar);
                        } catch (RemoteException e10) {
                            com.bytedance.sdk.component.utils.lp.ZRu("TTFullScreenVideoAdImpl", e10.getMessage());
                        }
                    }
                }
            }, 5);
        }
    }
}
