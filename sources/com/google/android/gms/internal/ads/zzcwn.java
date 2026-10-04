package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcwn implements zzinw {
    private final zzcwk zza;

    private zzcwn(zzcwk zzcwkVar) {
        this.zza = zzcwkVar;
    }

    public static zzcwn zzc(zzcwk zzcwkVar) {
        return new zzcwn(zzcwkVar);
    }

    public static zzfle zzd(zzcwk zzcwkVar) {
        zzfle zzfleVarZzd = zzcwkVar.zzd();
        zzioe.zzb(zzfleVarZzd);
        return zzfleVarZzd;
    }

    public final zzfle zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
