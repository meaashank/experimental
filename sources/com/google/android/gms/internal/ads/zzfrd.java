package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzfrd implements zzhcv {
    final /* synthetic */ zzfrg zza;
    final /* synthetic */ zzfqw zzb;

    public zzfrd(zzfrg zzfrgVar, zzfqw zzfqwVar) {
        this.zza = zzfrgVar;
        this.zzb = zzfqwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        zzfqw zzfqwVar = this.zzb;
        zzfqwVar.zzj(th);
        zzfqwVar.zzd(false);
        this.zza.zza(zzfqwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zzb(Object obj) {
    }
}
