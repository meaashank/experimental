package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzeeg extends AdListener {
    final /* synthetic */ zzeem zza;

    public zzeeg(zzeem zzeemVar) {
        Objects.requireNonNull(zzeemVar);
        this.zza = zzeemVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zza.zzf(zzeem.zzl(loadAdError));
    }
}
