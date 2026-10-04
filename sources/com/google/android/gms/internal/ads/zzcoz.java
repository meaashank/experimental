package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcoz implements zzinw {
    private final zzcod zza;

    private zzcoz(zzcod zzcodVar) {
        this.zza = zzcodVar;
    }

    public static zzcoz zza(zzcod zzcodVar) {
        return new zzcoz(zzcodVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        String strZze = this.zza.zze();
        zzioe.zzb(strZze);
        return strZze;
    }
}
