package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbzi extends zzbof {
    private final NativeAd.OnNativeAdLoadedListener zza;

    public zzbzi(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.zza = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zze(zzbom zzbomVar) {
        this.zza.onNativeAdLoaded(new zzbzd(zzbomVar));
    }
}
