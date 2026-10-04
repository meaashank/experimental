package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgz {
    private byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze = 0;

    public zzgz(byte[] bArr, int i10, int i11) {
        this.zza = bArr;
        this.zzc = i10;
        this.zzd = i10;
        this.zzb = i11;
        zzk();
    }

    private final int zzi() {
        int i10 = 0;
        while (!zze()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? zzf(i10) : 0);
    }

    private final boolean zzj(int i10) {
        int i11 = i10 - 2;
        if (this.zzc > i11 || i10 >= this.zzb) {
            return false;
        }
        byte[] bArr = this.zza;
        return bArr[i10] == 3 && bArr[i11] == 0 && bArr[i10 + (-1)] == 0;
    }

    private final void zzk() {
        int i10;
        int i11 = this.zzd;
        boolean z10 = false;
        if (i11 >= 0 && (i11 < (i10 = this.zzb) || (i11 == i10 && this.zze == 0))) {
            z10 = true;
        }
        zzguk.zzi(z10);
    }

    public final void zza() {
        int i10 = this.zze + 1;
        this.zze = i10;
        if (i10 == 8) {
            this.zze = 0;
            int i11 = this.zzd;
            this.zzd = i11 + (true == zzj(i11 + 1) ? 2 : 1);
        }
        zzk();
    }

    public final void zzb(int i10) {
        int i11 = this.zzd;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.zzd = i13;
        int i14 = (i10 - (i12 * 8)) + this.zze;
        this.zze = i14;
        if (i14 > 7) {
            this.zzd = i13 + 1;
            this.zze = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.zzd) {
                zzk();
                return;
            } else if (zzj(i11)) {
                this.zzd++;
                i11 += 2;
            }
        }
    }

    public final void zzc() {
        int i10 = this.zze;
        if (i10 > 0) {
            zzb(8 - i10);
        }
    }

    public final boolean zzd(int i10) {
        int i11 = this.zzd;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.zze + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 > this.zzb) {
                break;
            }
            if (zzj(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.zzb;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public final boolean zze() {
        int i10 = this.zza[this.zzd] & (128 >> this.zze);
        zza();
        return i10 != 0;
    }

    public final int zzf(int i10) {
        int i11;
        this.zze += i10;
        int i12 = 0;
        while (true) {
            i11 = this.zze;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.zze = i13;
            byte[] bArr = this.zza;
            int i14 = this.zzd;
            i12 |= (bArr[i14] & 255) << i13;
            if (true != zzj(i14 + 1)) {
                i = 1;
            }
            this.zzd = i14 + i;
        }
        byte[] bArr2 = this.zza;
        int i15 = this.zzd;
        int i16 = i12 | ((bArr2[i15] & 255) >> (8 - i11));
        int i17 = 32 - i10;
        if (i11 == 8) {
            this.zze = 0;
            this.zzd = i15 + (true != zzj(i15 + 1) ? 1 : 2);
        }
        int i18 = ((-1) >>> i17) & i16;
        zzk();
        return i18;
    }

    public final int zzg() {
        return zzi();
    }

    public final int zzh() {
        int iZzi = zzi();
        int i10 = iZzi % 2;
        return ((iZzi + 1) / 2) * (i10 == 0 ? -1 : 1);
    }
}
