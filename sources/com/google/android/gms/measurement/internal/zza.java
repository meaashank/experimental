package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes4.dex */
final class zza implements Runnable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ long zzb;
    private final /* synthetic */ zzb zzc;

    public zza(zzb zzbVar, String str, long j10) {
        this.zza = str;
        this.zzb = j10;
        this.zzc = zzbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzb.zza(this.zzc, this.zza, this.zzb);
    }
}
