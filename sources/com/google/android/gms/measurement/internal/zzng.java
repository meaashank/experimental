package com.google.android.gms.measurement.internal;

import e.g0;

/* JADX INFO: loaded from: classes4.dex */
final class zzng {
    final /* synthetic */ zznb zza;
    private zznf zzb;

    public zzng(zznb zznbVar) {
        this.zza = zznbVar;
    }

    @g0
    public final void zza(long j10) {
        this.zzb = new zznf(this, this.zza.zzb().currentTimeMillis(), j10);
        this.zza.zzc.postDelayed(this.zzb, 2000L);
    }

    @g0
    public final void zza() {
        this.zza.zzt();
        if (this.zzb != null) {
            this.zza.zzc.removeCallbacks(this.zzb);
        }
        this.zza.zzk().zzn.zza(false);
        this.zza.zza(false);
        if (this.zza.zze().zza(zzbh.zzcl) && this.zza.zzm().zzau()) {
            this.zza.zzj().zzp().zza("Retrying trigger URI registration in foreground");
            this.zza.zzm().zzas();
        }
    }
}
