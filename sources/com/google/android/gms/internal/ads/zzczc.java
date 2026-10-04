package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzczc implements zzinw {
    private final zzczb zza;

    private zzczc(zzczb zzczbVar) {
        this.zza = zzczbVar;
    }

    public static zzczc zzc(zzczb zzczbVar) {
        return new zzczc(zzczbVar);
    }

    public static zzfld zzd(zzczb zzczbVar) {
        zzfld zzfldVarZzb = zzczbVar.zzb();
        zzioe.zzb(zzfldVarZzb);
        return zzfldVarZzb;
    }

    public final zzfld zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
