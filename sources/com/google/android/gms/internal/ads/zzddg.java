package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzddg implements zzinw {
    private final zzdcz zza;

    private zzddg(zzdcz zzdczVar) {
        this.zza = zzdczVar;
    }

    public static zzddg zzc(zzdcz zzdczVar) {
        return new zzddg(zzdczVar);
    }

    public static zzflw zzd(zzdcz zzdczVar) {
        zzflw zzflwVarZzb = zzdczVar.zzb();
        zzioe.zzb(zzflwVarZzb);
        return zzflwVarZzb;
    }

    public final zzflw zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
