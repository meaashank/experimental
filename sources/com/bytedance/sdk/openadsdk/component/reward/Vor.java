package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;

/* JADX INFO: loaded from: classes3.dex */
public class Vor implements com.bytedance.sdk.openadsdk.ZRu.TFq.ZRu {
    private final PAGRewardedAdInteractionCallback NOt;
    private final PAGRewardedAdInteractionListener ZRu;

    public Vor(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener) {
        this.ZRu = pAGRewardedAdInteractionListener;
        this.NOt = null;
    }

    @Override // com.bytedance.sdk.openadsdk.ZRu.TFq.ZRu
    public void NOt() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.ZRu;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdDismissed();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.NOt;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ZRu.TFq.ZRu
    public void ZRu() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.ZRu;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdShowed();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.NOt;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.ZRu;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdClicked();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.NOt;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdClicked();
        }
    }

    public Vor(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback) {
        this.NOt = pAGRewardedAdInteractionCallback;
        this.ZRu = null;
    }

    @Override // com.bytedance.sdk.openadsdk.ZRu.TFq.ZRu
    public void ZRu(boolean z10, int i10, String str, int i11, String str2) {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.ZRu;
        if (pAGRewardedAdInteractionListener != null) {
            if (z10) {
                pAGRewardedAdInteractionListener.onUserEarnedReward(new PAGRewardItem(i10, str));
                return;
            } else {
                pAGRewardedAdInteractionListener.onUserEarnedRewardFail(i11, str2);
                return;
            }
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.NOt;
        if (pAGRewardedAdInteractionCallback != null) {
            if (z10) {
                pAGRewardedAdInteractionCallback.onUserEarnedReward(new PAGRewardItem(i10, str));
            } else {
                pAGRewardedAdInteractionCallback.onUserEarnedRewardFail(new PAGErrorModel(i11, str2));
            }
        }
    }
}
