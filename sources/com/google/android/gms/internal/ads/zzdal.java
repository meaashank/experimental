package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdal implements com.google.android.gms.ads.internal.client.zza {
    private final zzdap zza;
    private final zzflw zzb;

    public zzdal(zzdap zzdapVar, zzflw zzflwVar) {
        this.zza = zzdapVar;
        this.zzb = zzflwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zza.zza(this.zzb.zzg);
    }
}
