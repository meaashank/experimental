package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzmd {
    private long zza;
    private float zzb;
    private long zzc;

    public zzmd() {
        this.zza = -9223372036854775807L;
        this.zzb = -3.4028235E38f;
        this.zzc = -9223372036854775807L;
    }

    public final zzmd zza(long j10) {
        this.zza = j10;
        return this;
    }

    public final zzmd zzb(float f10) {
        boolean z10 = true;
        if (f10 <= 0.0f && f10 != -3.4028235E38f) {
            z10 = false;
        }
        zzguk.zza(z10);
        this.zzb = f10;
        return this;
    }

    public final zzmd zzc(long j10) {
        boolean z10 = true;
        if (j10 < 0) {
            if (j10 == -9223372036854775807L) {
                j10 = -9223372036854775807L;
            } else {
                z10 = false;
            }
        }
        zzguk.zza(z10);
        this.zzc = j10;
        return this;
    }

    public final zzme zzd() {
        return new zzme(this, null);
    }

    public final /* synthetic */ long zze() {
        return this.zza;
    }

    public final /* synthetic */ float zzf() {
        return this.zzb;
    }

    public final /* synthetic */ long zzg() {
        return this.zzc;
    }

    public /* synthetic */ zzmd(zzme zzmeVar, byte[] bArr) {
        this.zza = zzmeVar.zza;
        this.zzb = zzmeVar.zzb;
        this.zzc = zzmeVar.zzc;
    }
}
