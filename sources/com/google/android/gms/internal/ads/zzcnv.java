package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcnv implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzcnv(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzcnv zza(zziof zziofVar, zziof zziofVar2) {
        return new zzcnv(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcnu((zzcnl) this.zza.zzb(), (zzeaj) this.zzb.zzb());
    }
}
