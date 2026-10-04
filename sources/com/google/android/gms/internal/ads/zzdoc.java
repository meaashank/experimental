package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdoc implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzdoc(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzdoc zza(zziof zziofVar, zziof zziofVar2) {
        return new zzdoc(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdob((zzdga) this.zza.zzb(), (zzdli) this.zzb.zzb());
    }
}
