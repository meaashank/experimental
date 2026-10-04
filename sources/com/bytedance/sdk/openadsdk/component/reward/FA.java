package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.qF;
import com.bytedance.sdk.openadsdk.utils.WD;
import com.bytedance.sdk.openadsdk.utils.fcs;
import com.bytedance.sdk.openadsdk.utils.xY;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
class FA extends PAGRewardedAd {
    private boolean FA;
    private final AtomicBoolean Ht = new AtomicBoolean(false);
    private final String Mm = xY.ZRu();
    private final com.bytedance.sdk.openadsdk.core.model.ZRu NOt;
    private boolean TFq;
    private boolean Vor;
    private final Context ZRu;
    private final AdSlot mZ;
    private com.bytedance.sdk.openadsdk.ZRu.TFq.ZRu uR;

    public FA(Context context, com.bytedance.sdk.openadsdk.core.model.ZRu zRu, AdSlot adSlot) {
        this.ZRu = context;
        this.NOt = zRu;
        this.mZ = adSlot;
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
            com.bytedance.sdk.component.utils.lp.ZRu("TTRewardVideoAdImpl", th.getMessage());
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

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionCallback(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback) {
        this.uR = new Vor(pAGRewardedAdInteractionCallback);
        ZRu(0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionListener(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener) {
        this.uR = new Vor(pAGRewardedAdInteractionListener);
        ZRu(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void show(@androidx.annotation.Nullable android.app.Activity r13) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.FA.show(android.app.Activity):void");
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        if (this.FA) {
            return;
        }
        fcs.ZRu(this.NOt.TFq(), d10);
        this.FA = true;
    }

    public void ZRu() {
        if (this.Ht.get()) {
            return;
        }
        this.TFq = true;
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
            WD.mZ(new com.bytedance.sdk.component.FA.FA("Reward_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.reward.FA.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.ZRu ZRu = com.bytedance.sdk.openadsdk.multipro.aidl.ZRu.ZRu();
                    if (i10 != 0 || FA.this.uR == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.multipro.aidl.NOt.uR uRVar = new com.bytedance.sdk.openadsdk.multipro.aidl.NOt.uR(FA.this.uR);
                    IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(ZRu.ZRu(0));
                    if (iListenerManagerAsInterface != null) {
                        try {
                            iListenerManagerAsInterface.registerRewardVideoListener(FA.this.Mm, uRVar);
                        } catch (RemoteException e10) {
                            com.bytedance.sdk.component.utils.lp.ZRu("TTRewardVideoAdImpl", e10.getMessage());
                        }
                    }
                }
            }, 5);
        }
    }

    public static boolean ZRu(com.bytedance.sdk.openadsdk.core.model.ZRu zRu) {
        qF qFVarTFq;
        com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.NOt nOtQg;
        String strLp;
        if (zRu == null || (qFVarTFq = zRu.TFq()) == null) {
            return false;
        }
        String strZRu = com.bytedance.sdk.openadsdk.OCA.ZRu.ZRu("rviv_new_arch_not_support_style", (String) null);
        if (TextUtils.isEmpty(strZRu)) {
            return true;
        }
        try {
            JSONArray jSONArray = new JSONArray(strZRu);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                int i11 = jSONArray.getInt(i10);
                if (i11 != 0) {
                    if (qFVarTFq.yBV() == i11) {
                        return false;
                    }
                    if (i11 == 8 && (nOtQg = qFVarTFq.Qg()) != null && (strLp = nOtQg.lp()) != null && Uri.parse(strLp).getQueryParameterNames().contains("show_landingpage")) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Exception unused) {
            return true;
        }
    }
}
