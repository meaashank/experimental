package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.h5.OnH5AdsEventListener;

/* JADX INFO: loaded from: classes4.dex */
@e.T(api = 21)
public final class zzbrf extends zzbrh {
    private final OnH5AdsEventListener zza;

    public zzbrf(OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zza(String str) {
        this.zza.onH5AdsEvent(str);
    }
}
