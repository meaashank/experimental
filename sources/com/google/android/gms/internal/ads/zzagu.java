package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteOrder;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class zzagu {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;

    @Nullable
    public final zzagt zzk;

    @Nullable
    private final zzap zzl;

    @e.f0
    public zzagu(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, @Nullable zzagt zzagtVar, @Nullable zzap zzapVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
        this.zzf = zzf(i14);
        this.zzg = i15;
        this.zzh = i16;
        this.zzi = zzg(i16);
        this.zzj = j10;
        this.zzk = zzagtVar;
        this.zzl = zzapVar;
    }

    private static int zzf(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    private static int zzg(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 20) {
            return 5;
        }
        if (i10 != 24) {
            return i10 != 32 ? -1 : 7;
        }
        return 6;
    }

    public final long zza() {
        long j10 = this.zzj;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.zze);
    }

    public final long zzb(long j10) {
        String str = zzfm.zza;
        return Math.max(0L, Math.min((j10 * ((long) this.zze)) / 1000000, this.zzj - 1));
    }

    public final zzv zzc(byte[] bArr, @Nullable zzap zzapVar) {
        bArr[4] = -128;
        zzap zzapVarZzd = zzd(zzapVar);
        zzt zztVar = new zzt();
        zztVar.zzo("audio/flac");
        int i10 = this.zzd;
        if (i10 <= 0) {
            i10 = -1;
        }
        zztVar.zzp(i10);
        zztVar.zzH(this.zzg);
        zztVar.zzJ(this.zze);
        zztVar.zzK(zzfm.zzC(this.zzh, ByteOrder.LITTLE_ENDIAN));
        zztVar.zzr(Collections.singletonList(bArr));
        zztVar.zzl(zzapVarZzd);
        return zztVar.zzQ();
    }

    @Nullable
    public final zzap zzd(@Nullable zzap zzapVar) {
        zzap zzapVar2 = this.zzl;
        return zzapVar2 == null ? zzapVar : zzapVar2.zzf(zzapVar);
    }

    public final zzagu zze(@Nullable zzagt zzagtVar) {
        return new zzagu(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzagtVar, this.zzl);
    }

    public zzagu(byte[] bArr, int i10) {
        zzet zzetVar = new zzet(bArr, bArr.length);
        zzetVar.zzf(i10 * 8);
        this.zza = zzetVar.zzj(16);
        this.zzb = zzetVar.zzj(16);
        this.zzc = zzetVar.zzj(24);
        this.zzd = zzetVar.zzj(24);
        int iZzj = zzetVar.zzj(20);
        this.zze = iZzj;
        this.zzf = zzf(iZzj);
        this.zzg = zzetVar.zzj(3) + 1;
        int iZzj2 = zzetVar.zzj(5) + 1;
        this.zzh = iZzj2;
        this.zzi = zzg(iZzj2);
        this.zzj = zzetVar.zzk(36);
        this.zzk = null;
        this.zzl = null;
    }
}
