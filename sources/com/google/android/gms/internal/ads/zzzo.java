package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class zzzo implements zzxm, zzxl {
    private final zzxm zza;
    private final long zzb;
    private zzxl zzc;

    public zzzo(zzxm zzxmVar, long j10) {
        this.zza = zzxmVar;
        this.zzb = j10;
    }

    public final zzxm zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzxm, com.google.android.gms.internal.ads.zzzi
    public final long zzb() {
        long jZzb = this.zza.zzb();
        if (jZzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzb + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzxm, com.google.android.gms.internal.ads.zzzi
    public final long zzc() {
        long jZzc = this.zza.zzc();
        if (jZzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzc + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzxm, com.google.android.gms.internal.ads.zzzi
    public final boolean zzd(zzme zzmeVar) {
        long j10 = zzmeVar.zza;
        long j11 = this.zzb;
        zzmd zzmdVarZza = zzmeVar.zza();
        zzmdVarZza.zza(j10 - j11);
        return this.zza.zzd(zzmdVarZza.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzxm, com.google.android.gms.internal.ads.zzzi
    public final boolean zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzxm, com.google.android.gms.internal.ads.zzzi
    public final void zzf(long j10) {
        this.zza.zzf(j10 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzl(zzxl zzxlVar, long j10) {
        this.zzc = zzxlVar;
        this.zza.zzl(this, j10 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzm() throws IOException {
        this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final zzzr zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final long zzo(zzabe[] zzabeVarArr, boolean[] zArr, zzzg[] zzzgVarArr, boolean[] zArr2, long j10) {
        zzzg[] zzzgVarArr2 = new zzzg[zzzgVarArr.length];
        int i10 = 0;
        while (true) {
            zzzg zzzgVarZze = null;
            if (i10 >= zzzgVarArr.length) {
                break;
            }
            zzzn zzznVar = (zzzn) zzzgVarArr[i10];
            if (zzznVar != null) {
                zzzgVarZze = zzznVar.zze();
            }
            zzzgVarArr2[i10] = zzzgVarZze;
            i10++;
        }
        zzxm zzxmVar = this.zza;
        long j11 = this.zzb;
        long jZzo = zzxmVar.zzo(zzabeVarArr, zArr, zzzgVarArr2, zArr2, j10 - j11);
        for (int i11 = 0; i11 < zzzgVarArr.length; i11++) {
            zzzg zzzgVar = zzzgVarArr2[i11];
            if (zzzgVar == null) {
                zzzgVarArr[i11] = null;
            } else {
                zzzg zzzgVar2 = zzzgVarArr[i11];
                if (zzzgVar2 == null || ((zzzn) zzzgVar2).zze() != zzzgVar) {
                    zzzgVarArr[i11] = new zzzn(zzzgVar, j11);
                }
            }
        }
        return jZzo + j11;
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final void zzp(zzxm zzxmVar) {
        zzxl zzxlVar = this.zzc;
        zzxlVar.getClass();
        zzxlVar.zzp(this);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzq(long j10, boolean z10) {
        this.zza.zzq(j10 - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final long zzr() {
        long jZzr = this.zza.zzr();
        if (jZzr == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jZzr + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzzh
    public final /* bridge */ /* synthetic */ void zzs(zzzi zzziVar) {
        zzxl zzxlVar = this.zzc;
        zzxlVar.getClass();
        zzxlVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final long zzt(long j10) {
        long j11 = this.zzb;
        return this.zza.zzt(j10 - j11) + j11;
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final long zzu(long j10, zznm zznmVar) {
        long j11 = this.zzb;
        return this.zza.zzu(j10 - j11, zznmVar) + j11;
    }
}
