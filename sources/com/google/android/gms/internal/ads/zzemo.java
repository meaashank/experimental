package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzemo {
    private final Context zza;

    public zzemo(Context context) {
        this.zza = context;
    }

    public final ListenableFuture zza(boolean z10) {
        try {
            GetTopicsRequest getTopicsRequestBuild = new GetTopicsRequest.Builder().setAdsSdkName(MobileAds.ERROR_DOMAIN).setShouldRecordObservation(z10).build();
            TopicsManagerFutures topicsManagerFuturesA = TopicsManagerFutures.f116106a.a(this.zza);
            return topicsManagerFuturesA != null ? topicsManagerFuturesA.b(getTopicsRequestBuild) : zzhcy.zzc(new IllegalStateException());
        } catch (Exception e10) {
            return zzhcy.zzc(e10);
        }
    }
}
