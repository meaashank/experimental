package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzfrc implements zzhcv {
    final /* synthetic */ zzfrg zza;
    final /* synthetic */ zzfqw zzb;
    final /* synthetic */ boolean zzc;

    public zzfrc(zzfrg zzfrgVar, zzfqw zzfqwVar, boolean z10) {
        this.zza = zzfrgVar;
        this.zzb = zzfqwVar;
        this.zzc = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        zzfqw zzfqwVar = this.zzb;
        if (zzfqwVar.zzb()) {
            zzfrg zzfrgVar = this.zza;
            zzfqwVar.zzj(th);
            zzfqwVar.zzd(false);
            zzfrgVar.zza(zzfqwVar);
            if (this.zzc) {
                zzfrgVar.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zzb(Object obj) {
        zzfqw zzfqwVar = this.zzb;
        zzfqwVar.zzd(true);
        zzfrg zzfrgVar = this.zza;
        zzfrgVar.zza(zzfqwVar);
        if (this.zzc) {
            zzfrgVar.zzh();
        }
    }
}
