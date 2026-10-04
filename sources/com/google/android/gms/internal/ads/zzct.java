package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.C2538n;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzct implements zzcs {
    final /* synthetic */ zzcu zza;
    private final short[] zzb;
    private short[] zzc;
    private short[] zzd;
    private short[] zze;
    private int zzf;
    private int zzg;
    private int zzh;

    public zzct(zzcu zzcuVar) {
        Objects.requireNonNull(zzcuVar);
        this.zza = zzcuVar;
        this.zzb = new short[zzcuVar.zzh()];
        this.zzc = new short[zzcuVar.zzh() * zzcuVar.zzg()];
        this.zzd = new short[zzcuVar.zzh() * zzcuVar.zzg()];
        this.zze = new short[zzcuVar.zzh() * zzcuVar.zzg()];
    }

    private final int zzs(short[] sArr, int i10, int i11, int i12) {
        int i13 = 1;
        int i14 = 255;
        int i15 = 0;
        int i16 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i17 = 0; i17 < i11; i17++) {
                int iZzg = this.zza.zzg() * i10;
                iAbs += Math.abs(sArr[iZzg + i17] - sArr[(iZzg + i11) + i17]);
            }
            int i18 = iAbs * i15;
            int i19 = i13 * i11;
            if (i18 < i19) {
                i13 = iAbs;
            }
            if (i18 < i19) {
                i15 = i11;
            }
            int i20 = iAbs * i14;
            int i21 = i16 * i11;
            if (i20 > i21) {
                i16 = iAbs;
            }
            if (i20 > i21) {
                i14 = i11;
            }
            i11++;
        }
        this.zzf = i13 / i15;
        this.zzg = i16 / i14;
        return i15;
    }

    private final short[] zzt(short[] sArr, int i10, int i11) {
        zzcu zzcuVar = this.zza;
        int length = sArr.length / zzcuVar.zzg();
        return i10 + i11 <= length ? sArr : Arrays.copyOf(sArr, C2538n.a(length, 3, 2, i11) * zzcuVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final void zzb(int i10, long j10, long j11) {
        int i11 = 0;
        while (true) {
            zzcu zzcuVar = this.zza;
            if (i11 >= zzcuVar.zzg()) {
                return;
            }
            short[] sArr = this.zzd;
            int iZzg = zzcuVar.zzg();
            int iZzj = zzcuVar.zzj();
            short[] sArr2 = this.zze;
            int iZzg2 = (zzcuVar.zzg() * i10) + i11;
            short s10 = sArr2[iZzg2];
            short s11 = sArr2[iZzg2 + zzcuVar.zzg()];
            long jZzm = ((long) zzcuVar.zzm()) * j10;
            long jZzl = ((long) zzcuVar.zzl()) * j11;
            long jZzl2 = ((long) (zzcuVar.zzl() + 1)) * j11;
            int i12 = i11;
            long j12 = jZzl2 - jZzl;
            long j13 = jZzl2 - jZzm;
            sArr[(iZzj * iZzg) + i12] = (short) ((((j12 - j13) * ((long) s11)) + (j13 * ((long) s10))) / j12);
            i11 = i12 + 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final boolean zzc() {
        int i10 = this.zzf;
        return i10 != 0 && this.zza.zzn() != 0 && this.zzg <= i10 * 3 && i10 + i10 > this.zzh * 3;
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final void zzd(int i10, int i11) {
        int iZzg;
        short[] sArr = this.zzc;
        int i12 = 0;
        while (true) {
            zzcu zzcuVar = this.zza;
            if (i12 >= zzcuVar.zzh() / i11) {
                return;
            }
            int i13 = 0;
            int i14 = 0;
            while (true) {
                iZzg = zzcuVar.zzg() * i11;
                if (i13 < iZzg) {
                    i14 += sArr[androidx.compose.ui.graphics.J2.a(i12, iZzg, zzcuVar.zzg() * i10, i13)];
                    i13++;
                }
            }
            this.zzb[i12] = (short) (i14 / iZzg);
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final int zze(int i10, int i11, int i12) {
        return zzs(this.zzb, 0, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final int zzf(int i10, int i11, int i12) {
        return zzs(this.zzc, i10, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final void zzg() {
        this.zzh = 0;
        this.zzf = 0;
        this.zzg = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final void zzh(int i10, int i11, int i12, int i13, int i14) {
        short[] sArr = this.zzd;
        short[] sArr2 = this.zzc;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i13 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i12 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i18] = (short) (((sArr2[i17] * i19) + ((i10 - i19) * sArr2[i16])) / i10);
                i18 += i11;
                i16 += i11;
                i17 += i11;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final void zzi() {
        this.zzh = this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final void zzj(int i10) {
        this.zzc = zzt(this.zzc, this.zza.zzi(), i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final void zzk(int i10) {
        this.zzd = zzt(this.zzd, this.zza.zzj(), i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final void zzl(int i10) {
        this.zze = zzt(this.zze, this.zza.zzk(), i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final void zzm(int i10, int i11) {
        for (int i12 = 0; i12 < this.zza.zzg() * i11; i12++) {
            this.zzc[i10 + i12] = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final void zzn(ByteBuffer byteBuffer, int i10) {
        zzcu zzcuVar = this.zza;
        byteBuffer.asShortBuffer().get(this.zzc, zzcuVar.zzi() * zzcuVar.zzg(), i10 / 2);
        byteBuffer.position(byteBuffer.position() + i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final void zzo(ByteBuffer byteBuffer, int i10) {
        zzcu zzcuVar = this.zza;
        byteBuffer.asShortBuffer().put(this.zzd, 0, zzcuVar.zzg() * i10);
        byteBuffer.position(((i10 + i10) * zzcuVar.zzg()) + byteBuffer.position());
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final /* synthetic */ Object zzp() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final /* synthetic */ Object zzq() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final /* synthetic */ Object zzr() {
        return this.zzc;
    }
}
