package com.google.ads.mediation.unity.eventadapters;

import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.google.ads.mediation.unity.UnityReward;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;

/* JADX INFO: loaded from: classes3.dex */
public class UnityRewardedEventAdapter implements IUnityEventAdapter {
    final MediationRewardedAdCallback listener;

    /* JADX INFO: renamed from: com.google.ads.mediation.unity.eventadapters.UnityRewardedEventAdapter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$ads$mediation$unity$UnityAdsAdapterUtils$AdEvent;

        static {
            int[] iArr = new int[UnityAdsAdapterUtils.AdEvent.values().length];
            $SwitchMap$com$google$ads$mediation$unity$UnityAdsAdapterUtils$AdEvent = iArr;
            try {
                iArr[UnityAdsAdapterUtils.AdEvent.OPENED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$ads$mediation$unity$UnityAdsAdapterUtils$AdEvent[UnityAdsAdapterUtils.AdEvent.CLICKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$ads$mediation$unity$UnityAdsAdapterUtils$AdEvent[UnityAdsAdapterUtils.AdEvent.CLOSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$ads$mediation$unity$UnityAdsAdapterUtils$AdEvent[UnityAdsAdapterUtils.AdEvent.IMPRESSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$ads$mediation$unity$UnityAdsAdapterUtils$AdEvent[UnityAdsAdapterUtils.AdEvent.VIDEO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$ads$mediation$unity$UnityAdsAdapterUtils$AdEvent[UnityAdsAdapterUtils.AdEvent.REWARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$ads$mediation$unity$UnityAdsAdapterUtils$AdEvent[UnityAdsAdapterUtils.AdEvent.VIDEO_COMPLETE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public UnityRewardedEventAdapter(MediationRewardedAdCallback mediationRewardedAdCallback) {
        this.listener = mediationRewardedAdCallback;
    }

    @Override // com.google.ads.mediation.unity.eventadapters.IUnityEventAdapter
    public void sendAdEvent(UnityAdsAdapterUtils.AdEvent adEvent) {
        if (this.listener == null) {
            return;
        }
        switch (AnonymousClass1.$SwitchMap$com$google$ads$mediation$unity$UnityAdsAdapterUtils$AdEvent[adEvent.ordinal()]) {
            case 1:
                this.listener.onAdOpened();
                break;
            case 2:
                this.listener.reportAdClicked();
                break;
            case 3:
                this.listener.onAdClosed();
                break;
            case 4:
                this.listener.reportAdImpression();
                break;
            case 5:
                this.listener.onVideoStart();
                break;
            case 6:
                this.listener.onUserEarnedReward(new UnityReward());
                break;
            case 7:
                this.listener.onVideoComplete();
                break;
        }
    }
}
