package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzbas implements zzfzg {
    final /* synthetic */ zzfyi zza;

    public zzbas(zzfyi zzfyiVar) {
        this.zza = zzfyiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzg
    public final void zza(int i10, long j10) {
        this.zza.zzb(i10, System.currentTimeMillis() - j10);
    }

    @Override // com.google.android.gms.internal.ads.zzfzg
    public final void zzb(int i10, long j10, String str) {
        this.zza.zzf(i10, System.currentTimeMillis() - j10, str);
    }
}
