package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcva implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzcva(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzcva zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzcva(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbfd zzbfdVar = (zzbfd) this.zza.zzb();
        return new zzcut(zzbfdVar.zzd(), (zzbvj) this.zzb.zzb(), zzfou.zzc());
    }
}
