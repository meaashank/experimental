package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzadf {
    private boolean zzc;
    private int zze;
    private long zzh;
    private final zzadd zzi;
    private zzade zza = new zzade();
    private zzade zzb = new zzade();
    private long zzd = -9223372036854775807L;
    private float zzf = -1.0f;
    private float zzg = -1.0f;

    public zzadf(zzadd zzaddVar) {
        this.zzi = zzaddVar;
    }

    private final void zze() {
        boolean zZzb = this.zza.zzb();
        float fZze = zZzb ? (float) (1.0E9d / this.zza.zze()) : this.zzf;
        float f10 = this.zzg;
        if (fZze == f10) {
            return;
        }
        if (fZze != -1.0f && f10 != -1.0f) {
            float f11 = 1.0f;
            if (zZzb && this.zza.zzd() >= 5000000000L) {
                f11 = 0.1f;
            }
            if (Math.abs(fZze - this.zzg) < f11) {
                return;
            }
        } else if (fZze == -1.0f && this.zze < 30) {
            return;
        }
        this.zzg = fZze;
        this.zzi.zza(fZze);
    }

    public final void zza(float f10) {
        this.zzf = f10;
        this.zza.zza();
        this.zzb.zza();
        this.zzc = false;
        this.zzd = -9223372036854775807L;
        this.zze = 0;
        zze();
    }

    public final void zzb(long j10) {
        if (j10 == this.zzd) {
            return;
        }
        this.zzh++;
        this.zza.zzf(j10);
        if (this.zza.zzb()) {
            this.zzc = false;
        } else if (this.zzd != -9223372036854775807L) {
            if (!this.zzc || this.zzb.zzc()) {
                this.zzb.zza();
                this.zzb.zzf(this.zzd);
            }
            this.zzc = true;
            this.zzb.zzf(j10);
        }
        if (this.zzc && this.zzb.zzb()) {
            zzade zzadeVar = this.zza;
            this.zza = this.zzb;
            this.zzb = zzadeVar;
            this.zzc = false;
        }
        this.zzd = j10;
        this.zze = this.zza.zzb() ? 0 : this.zze + 1;
        zze();
    }

    public final long zzc() {
        if (this.zza.zzb()) {
            return this.zza.zze();
        }
        return -9223372036854775807L;
    }

    public final long zzd() {
        return this.zzh;
    }
}
