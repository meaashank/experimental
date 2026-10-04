package com.mbridge.msdk.newinterstitial.out;

import android.content.Context;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.out.strategy.base.BidAdHandler;
import com.mbridge.msdk.out.strategy.component.BidComponentStrategy;
import com.mbridge.msdk.out.strategy.legacy.interstitial.BidNewInterstitialStrategy;

/* JADX INFO: loaded from: classes5.dex */
public class MBBidNewInterstitialHandler extends BidAdHandler {
    public MBBidNewInterstitialHandler(Context context, String str, String str2) {
        super(context, str, str2);
    }

    @Override // com.mbridge.msdk.out.strategy.base.BaseAdHandler
    public void initStrategy(String str, String str2) {
        this.legacyBidVideoAdStrategy = new BidNewInterstitialStrategy(str2, str);
        this.componentBidVideoAdStrategy = new BidComponentStrategy(str2, str, MBSupportMuteAdType.INTERSTITIAL_VIDEO);
    }

    public MBBidNewInterstitialHandler(String str, String str2) {
        super(str, str2);
    }
}
