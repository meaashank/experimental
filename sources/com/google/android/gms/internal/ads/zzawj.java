package com.google.android.gms.internal.ads;

import androidx.compose.material.C1846b;

/* JADX INFO: loaded from: classes4.dex */
public final class zzawj {
    public int zza;
    public zzawe zzb;
    public zzavs zzc;
    public zzavv zzd;

    public zzawj() {
        this(new zzavv(1));
    }

    private final long zzg() throws zzawg, zzawi {
        int i10 = ((((~1246322141) & 272302173) | 1841378864) + ((1246322141 & 825937997) | 658822930)) - (-1823634633);
        int i11 = 1600766768 % 649830540;
        int i12 = ((((~680326130) & 1378702392) | 3315809) + ((680326130 & 1913472410) | 739293607)) - 2048099035;
        int i13 = 1743768897 % 152059765;
        int i14 = ((((~973294814) & 1252035530) | 51191353) + ((973294814 & 1755616710) | 889459732)) - 1494176168;
        int i15 = 1861701682 % 1196748250;
        int i16 = ((((~29116548) & 174422021) | 84710160) + ((29116548 & (-1973327347)) | (-1266641286))) - (-1891729929);
        int i17 = 2091729405 % 1207774949;
        int i18 = ((((~80201211) & 1629524354) | 38778411) + ((80201211 & 1977746312) | 382371455)) - 1921480783;
        int i19 = 1050760512 % 184320788;
        int i20 = 0;
        long j10 = 0;
        while (i20 < (i10 ^ i11)) {
            try {
                zzavs zzavsVar = this.zzc;
                zzawe zzaweVar = this.zzb;
                int i21 = i10;
                int i22 = this.zza;
                int i23 = i11;
                this.zza = i22 + 1;
                byte bZza = zzavsVar.zza(zzaweVar, i22);
                int i24 = i14 ^ i15;
                j10 |= ((long) ((i12 ^ i13) & bZza)) << i20;
                if (i20 == i24) {
                    if (bZza > 1) {
                        throw new zzawg();
                    }
                    i20 = i24;
                }
                if ((bZza & (i16 ^ i17)) == 0) {
                    return (j10 >>> 1) ^ (-(1 & j10));
                }
                i20 += i18 ^ i19;
                i10 = i21;
                i11 = i23;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzawi(e10);
            }
        }
        throw new zzawg();
    }

    private static final void zzh(long j10) throws zzawh {
        long[] jArr = {141540322, 456640674, 1141397064, 993500330, 1614820873, 3337980909L, 410218731, 1716462158, 477127367};
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        if (j10 % (((((((~j11) & j12) | j13) + ((j11 & j14) | j15)) - j16) + jArr[6]) ^ (jArr[7] % 477127367)) != 0) {
            throw new zzawh();
        }
    }

    public final void zza(long j10) throws zzawh, zzawi {
        long[] jArr = {2139842053, 728564241, 750932242, 1403848321, 1892818418, 4558981222L, 1919655804, 1856374729, 899334107};
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        long j17 = jArr[6];
        long j18 = jArr[7];
        zzh(j10);
        long j19 = j10 / (((((((~j11) & j12) | j13) + ((j11 & j14) | j15)) - j16) + j17) ^ (j18 % 899334107));
        if (j19 < 0 || j19 > this.zzb.zza.length) {
            throw new zzawi();
        }
        this.zza = (int) j19;
    }

    public final long zzb() {
        long[] jArr = {491705403, 818579170, 1201981453, 810223590, 1243973916, 3701563257L, 554701476, 1889947178, 1780695788};
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        return ((long) this.zza) * (((((((~j10) & j11) | j12) + ((j10 & j13) | j14)) - j15) + jArr[6]) ^ (jArr[7] % 1780695788));
    }

    public final long zzc() throws zzawi {
        try {
            zzavs zzavsVar = this.zzc;
            zzawe zzaweVar = this.zzb;
            this.zza = this.zza + 1;
            return zzavsVar.zza(zzaweVar, r2);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzawi(e10);
        }
    }

    public final int zzd() throws zzawi {
        int i10 = ((((~413360099) & 1621678468) | 84323740) + ((413360099 & 1621644360) | 385888249)) - 1513564466;
        int i11 = 1609416931 % 1031126087;
        int i12 = ((((~978587665) & 1228171537) | 1025392332) + ((978587665 & 1075859857) | 983056096)) - (-1589113644);
        int i13 = 1723578341 % 672563970;
        int i14 = ((((~1163384280) & 546336857) | 505597090) + ((1163384280 & 546323033) | 358992768)) - 1346988633;
        int i15 = 1124734562 % 530406424;
        int i16 = ((((~217161528) & 116398273) | 202500381) + ((217161528 & 316821712) | 269928733)) - 410012058;
        int i17 = 529302443 % 418646579;
        try {
            zzavs zzavsVar = this.zzc;
            zzawe zzaweVar = this.zzb;
            int i18 = this.zza;
            this.zza = i18 + 1;
            int i19 = i10 ^ i11;
            int iZza = zzavsVar.zza(zzaweVar, i18) & i19;
            zzavs zzavsVar2 = this.zzc;
            zzawe zzaweVar2 = this.zzb;
            int i20 = this.zza;
            this.zza = i20 + 1;
            int iZza2 = iZza | ((zzavsVar2.zza(zzaweVar2, i20) & i19) << (i12 ^ i13));
            zzavs zzavsVar3 = this.zzc;
            zzawe zzaweVar3 = this.zzb;
            int i21 = this.zza;
            this.zza = i21 + 1;
            int iZza3 = iZza2 | ((i19 & zzavsVar3.zza(zzaweVar3, i21)) << (i14 ^ i15));
            zzavs zzavsVar4 = this.zzc;
            zzawe zzaweVar4 = this.zzb;
            int i22 = this.zza;
            this.zza = i22 + 1;
            return iZza3 | (zzavsVar4.zza(zzaweVar4, i22) << (i16 ^ i17));
        } catch (IndexOutOfBoundsException e10) {
            throw new zzawi(e10);
        }
    }

    public final long zze() throws zzawg, zzawi {
        return zzg();
    }

    public final zzawe zzf(long j10) throws zzawh, zzawi {
        int[] iArr = {1667674495, 1502201381, 1197125461, 478240810, 622476187, -1652496091, 840440151, 1203013321, 774318984};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int iA = C1846b.a((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16);
        zzh(zzb() + j10);
        int i18 = this.zza;
        long j11 = i18;
        zzawe zzaweVar = this.zzb;
        long j12 = (j10 >> ((i17 % 774318984) ^ iA)) + j11;
        if (j12 > zzaweVar.zza.length || j12 < j11) {
            throw new zzawi();
        }
        try {
            int i19 = (int) j12;
            zzawe zzaweVarZzb = this.zzc.zzb(zzaweVar, i18, i19);
            this.zza = i19;
            return zzaweVarZzb;
        } catch (IndexOutOfBoundsException e10) {
            throw new AssertionError(zzawc.zza("CEiv6BFfPnitUE+D"), e10);
        }
    }

    public zzawj(zzavv zzavvVar) {
        this(zzawe.zzb, 0, new zzavt());
        this.zzd = zzavvVar;
    }

    private zzawj(zzawe zzaweVar, int i10, zzavs zzavsVar) {
        this.zzb = zzaweVar;
        this.zza = i10;
        this.zzc = zzavsVar;
    }

    public zzawj(zzawe zzaweVar, int i10, zzavs zzavsVar, zzavv zzavvVar) {
        this(zzaweVar, i10, zzavsVar);
        this.zzd = zzavvVar;
    }
}
