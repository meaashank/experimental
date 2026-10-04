package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcru implements zzinw {
    private final zziof zza;

    private zzcru(zzcrl zzcrlVar, zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzcru zzc(zzcrl zzcrlVar, zziof zziofVar) {
        return new zzcru(zzcrlVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfms zzb() {
        zzfms zzfmsVarZza = zzfms.zza(((zzcok) this.zza).zza());
        zzioe.zzb(zzfmsVarZza);
        return zzfmsVarZza;
    }
}
