package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzczf implements zzinw {
    private final zzczb zza;

    private zzczf(zzczb zzczbVar) {
        this.zza = zzczbVar;
    }

    public static zzczf zzc(zzczb zzczbVar) {
        return new zzczf(zzczbVar);
    }

    public static zzflo zzd(zzczb zzczbVar) {
        zzflo zzfloVarZza = zzczbVar.zza();
        zzioe.zzb(zzfloVarZza);
        return zzfloVarZza;
    }

    public final zzflo zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
