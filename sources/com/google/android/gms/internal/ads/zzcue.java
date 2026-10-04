package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcue implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzcue(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzcue zza(zziof zziofVar, zziof zziofVar2) {
        return new zzcue(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcud(((zzczc) this.zza).zza(), ((zzcpd) this.zzb).zzb());
    }
}
