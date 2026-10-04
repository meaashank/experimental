package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
final class zzmg {
    public final zzxm zza;
    public final Object zzb;
    public final zzzg[] zzc;
    public boolean zzd;
    public boolean zze;
    public boolean zzf;
    public zzmh zzg;
    public boolean zzh;
    private final boolean[] zzi;
    private final zzng[] zzj;
    private final zzabl zzk;
    private final zzmv zzl;

    @Nullable
    private zzmg zzm;
    private zzzr zzn;
    private zzabm zzo;
    private long zzp;

    public zzmg(zzng[] zzngVarArr, long j10, zzabl zzablVar, zzabp zzabpVar, zzmv zzmvVar, zzmh zzmhVar, zzabm zzabmVar, long j11) {
        this.zzj = zzngVarArr;
        this.zzp = j10;
        this.zzk = zzablVar;
        this.zzl = zzmvVar;
        zzxo zzxoVar = zzmhVar.zza;
        this.zzb = zzxoVar.zza;
        this.zzg = zzmhVar;
        this.zzn = zzzr.zza;
        this.zzo = zzabmVar;
        this.zzc = new zzzg[2];
        this.zzi = new boolean[2];
        this.zza = zzmvVar.zze(zzxoVar, zzabpVar, zzmhVar.zzb);
    }

    private final void zzt() {
        if (!zzv()) {
            return;
        }
        int i10 = 0;
        while (true) {
            zzabm zzabmVar = this.zzo;
            if (i10 >= zzabmVar.zza) {
                return;
            }
            zzabmVar.zza(i10);
            zzabe zzabeVar = this.zzo.zzc[i10];
            i10++;
        }
    }

    private final void zzu() {
        if (!zzv()) {
            return;
        }
        int i10 = 0;
        while (true) {
            zzabm zzabmVar = this.zzo;
            if (i10 >= zzabmVar.zza) {
                return;
            }
            zzabmVar.zza(i10);
            zzabe zzabeVar = this.zzo.zzc[i10];
            i10++;
        }
    }

    private final boolean zzv() {
        return this.zzm == null;
    }

    public final long zza() {
        return this.zzp;
    }

    public final void zzb(long j10) {
        this.zzp = j10;
    }

    public final long zzc() {
        return this.zzg.zzb + this.zzp;
    }

    public final boolean zzd() {
        if (this.zze) {
            return !this.zzf || this.zza.zzb() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean zze() {
        if (this.zze) {
            return zzd() || zzf() - this.zzg.zzb >= -9223372036854775807L;
        }
        return false;
    }

    public final long zzf() {
        if (!this.zze) {
            return this.zzg.zzb;
        }
        long jZzb = this.zzf ? this.zza.zzb() : Long.MIN_VALUE;
        return jZzb == Long.MIN_VALUE ? this.zzg.zze : jZzb;
    }

    public final long zzg() {
        if (this.zze) {
            return this.zza.zzc();
        }
        return 0L;
    }

    public final void zzh(float f10, zzbf zzbfVar, boolean z10) throws zzjn {
        this.zze = true;
        this.zzn = this.zza.zzn();
        zzabm zzabmVarZzk = zzk(f10, zzbfVar, z10);
        zzmh zzmhVar = this.zzg;
        long jMax = zzmhVar.zzb;
        long j10 = zzmhVar.zze;
        if (j10 != -9223372036854775807L && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jZzl = zzl(zzabmVarZzk, jMax, false);
        long j11 = this.zzp;
        zzmh zzmhVar2 = this.zzg;
        this.zzp = (zzmhVar2.zzb - jZzl) + j11;
        this.zzg = zzmhVar2.zza(jZzl, zzmhVar2.zzc);
    }

    public final void zzi(long j10) {
        zzguk.zzi(zzv());
        if (this.zze) {
            this.zza.zzf(j10 - this.zzp);
        }
    }

    public final void zzj(zzme zzmeVar) {
        zzguk.zzi(zzv());
        this.zza.zzd(zzmeVar);
    }

    public final zzabm zzk(float f10, zzbf zzbfVar, boolean z10) throws zzjn {
        zzzr zzzrVar = this.zzn;
        zzxo zzxoVar = this.zzg.zza;
        zzabl zzablVar = this.zzk;
        zzng[] zzngVarArr = this.zzj;
        zzabm zzabmVarZzr = zzablVar.zzr(zzngVarArr, zzzrVar, zzxoVar, zzbfVar);
        for (int i10 = 0; i10 < zzabmVarZzr.zza; i10++) {
            if (zzabmVarZzr.zza(i10)) {
                if (zzabmVarZzr.zzc[i10] == null) {
                    zzngVarArr[i10].zza();
                    z = false;
                }
                zzguk.zzi(z);
            } else {
                zzguk.zzi(zzabmVarZzr.zzc[i10] == null);
            }
        }
        for (zzabe zzabeVar : zzabmVarZzr.zzc) {
        }
        return zzabmVarZzr;
    }

    public final long zzl(zzabm zzabmVar, long j10, boolean z10) {
        return zzm(zzabmVar, j10, false, new boolean[2]);
    }

    public final long zzm(zzabm zzabmVar, long j10, boolean z10, boolean[] zArr) {
        zzng[] zzngVarArr;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= zzabmVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzi;
            if (z10 || !zzabmVar.zzb(this.zzo, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        int i11 = 0;
        while (true) {
            zzngVarArr = this.zzj;
            if (i11 >= 2) {
                break;
            }
            zzngVarArr[i11].zza();
            i11++;
        }
        zzu();
        this.zzo = zzabmVar;
        zzt();
        zzxm zzxmVar = this.zza;
        zzabe[] zzabeVarArr = zzabmVar.zzc;
        boolean[] zArr3 = this.zzi;
        zzzg[] zzzgVarArr = this.zzc;
        long jZzo = zzxmVar.zzo(zzabeVarArr, zArr3, zzzgVarArr, zArr, j10);
        for (int i12 = 0; i12 < 2; i12++) {
            zzngVarArr[i12].zza();
        }
        this.zzf = false;
        for (int i13 = 0; i13 < 2; i13++) {
            if (zzzgVarArr[i13] != null) {
                zzguk.zzi(zzabmVar.zza(i13));
                zzngVarArr[i13].zza();
                this.zzf = true;
            } else {
                zzguk.zzi(zzabeVarArr[i13] == null);
            }
        }
        return jZzo;
    }

    public final void zzn() {
        zzu();
        try {
            this.zzl.zzf(this.zza);
        } catch (RuntimeException e10) {
            zzeh.zzf("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public final void zzo(@Nullable zzmg zzmgVar) {
        if (zzmgVar == this.zzm) {
            return;
        }
        zzu();
        this.zzm = zzmgVar;
        zzt();
    }

    @Nullable
    public final zzmg zzp() {
        return this.zzm;
    }

    public final zzzr zzq() {
        return this.zzn;
    }

    public final zzabm zzr() {
        return this.zzo;
    }

    public final void zzs(zzxl zzxlVar, long j10) {
        this.zzd = true;
        this.zza.zzl(zzxlVar, j10);
    }
}
