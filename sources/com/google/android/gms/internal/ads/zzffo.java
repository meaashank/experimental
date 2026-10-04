package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzffo implements zzinw {
    private final zzffn zza;

    private zzffo(zzffn zzffnVar) {
        this.zza = zzffnVar;
    }

    public static zzffo zzc(zzffn zzffnVar) {
        return new zzffo(zzffnVar);
    }

    public static String zzd(zzffn zzffnVar) {
        String strZza = zzffnVar.zza();
        zzioe.zzb(strZza);
        return strZza;
    }

    public final String zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
