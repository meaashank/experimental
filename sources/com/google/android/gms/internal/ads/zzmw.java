package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzmw {
    private static final zzxo zzu = new zzxo(new Object(), -1);
    public final zzbf zza;
    public final zzxo zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;

    @Nullable
    public final zzjn zzf;
    public final boolean zzg;
    public final zzzr zzh;
    public final zzabm zzi;
    public final List zzj;
    public final zzxo zzk;
    public final boolean zzl;
    public final int zzm;
    public final int zzn;
    public final zzav zzo;
    public final boolean zzp = false;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;
    public volatile long zzt;

    public zzmw(zzbf zzbfVar, zzxo zzxoVar, long j10, long j11, int i10, @Nullable zzjn zzjnVar, boolean z10, zzzr zzzrVar, zzabm zzabmVar, List list, zzxo zzxoVar2, boolean z11, int i11, int i12, zzav zzavVar, long j12, long j13, long j14, long j15, boolean z12) {
        this.zza = zzbfVar;
        this.zzb = zzxoVar;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = i10;
        this.zzf = zzjnVar;
        this.zzg = z10;
        this.zzh = zzzrVar;
        this.zzi = zzabmVar;
        this.zzj = list;
        this.zzk = zzxoVar2;
        this.zzl = z11;
        this.zzm = i11;
        this.zzn = i12;
        this.zzo = zzavVar;
        this.zzq = j12;
        this.zzr = j13;
        this.zzs = j14;
        this.zzt = j15;
    }

    public static zzmw zza(zzabm zzabmVar) {
        zzbf zzbfVar = zzbf.zza;
        zzxo zzxoVar = zzu;
        return new zzmw(zzbfVar, zzxoVar, -9223372036854775807L, 0L, 1, null, false, zzzr.zza, zzabmVar, zzgxm.zzi(), zzxoVar, false, 1, 0, zzav.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zzxo zzb() {
        return zzu;
    }

    @CheckResult
    public final zzmw zzc(zzxo zzxoVar, long j10, long j11, long j12, long j13, zzzr zzzrVar, zzabm zzabmVar, List list) {
        zzxo zzxoVar2 = this.zzk;
        boolean z10 = this.zzl;
        int i10 = this.zzm;
        int i11 = this.zzn;
        zzav zzavVar = this.zzo;
        long j14 = this.zzq;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new zzmw(this.zza, zzxoVar, j11, j12, this.zze, this.zzf, this.zzg, zzzrVar, zzabmVar, list, zzxoVar2, z10, i10, i11, zzavVar, j14, j13, j10, jElapsedRealtime, false);
    }

    @CheckResult
    public final zzmw zzd(zzbf zzbfVar) {
        return new zzmw(zzbfVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzmw zze(int i10) {
        return new zzmw(this.zza, this.zzb, this.zzc, this.zzd, i10, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzmw zzf(@Nullable zzjn zzjnVar) {
        return new zzmw(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzjnVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzmw zzg(boolean z10) {
        return new zzmw(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, z10, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzmw zzh(zzxo zzxoVar) {
        return new zzmw(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzxoVar, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzmw zzi(boolean z10, int i10, int i11) {
        return new zzmw(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z10, i10, i11, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final boolean zzj() {
        return this.zze == 3 && this.zzl && this.zzn == 0;
    }
}
