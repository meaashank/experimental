package com.google.android.gms.internal.drive;

import com.google.android.gms.internal.drive.zzkk;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzmy {
    private static final zzmy zzvr = new zzmy(0, new int[0], new Object[0], false);
    private int count;
    private boolean zznh;
    private int zzrr;
    private Object[] zzue;
    private int[] zzvs;

    private zzmy() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzmy zza(zzmy zzmyVar, zzmy zzmyVar2) {
        int i10 = zzmyVar.count + zzmyVar2.count;
        int[] iArrCopyOf = Arrays.copyOf(zzmyVar.zzvs, i10);
        System.arraycopy(zzmyVar2.zzvs, 0, iArrCopyOf, zzmyVar.count, zzmyVar2.count);
        Object[] objArrCopyOf = Arrays.copyOf(zzmyVar.zzue, i10);
        System.arraycopy(zzmyVar2.zzue, 0, objArrCopyOf, zzmyVar.count, zzmyVar2.count);
        return new zzmy(i10, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzmy zzfa() {
        return zzvr;
    }

    public static zzmy zzfb() {
        return new zzmy();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzmy)) {
            return false;
        }
        zzmy zzmyVar = (zzmy) obj;
        int i10 = this.count;
        if (i10 == zzmyVar.count) {
            int[] iArr = this.zzvs;
            int[] iArr2 = zzmyVar.zzvs;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.zzue;
                    Object[] objArr2 = zzmyVar.zzue;
                    int i12 = this.count;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
                if (iArr[i11] != iArr2[i11]) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.count;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.zzvs;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.zzue;
        int i15 = this.count;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final void zzb(zzns zznsVar) throws IOException {
        if (this.count == 0) {
            return;
        }
        if (zznsVar.zzcd() == zzkk.zze.zzsi) {
            for (int i10 = 0; i10 < this.count; i10++) {
                zzb(this.zzvs[i10], this.zzue[i10], zznsVar);
            }
            return;
        }
        for (int i11 = this.count - 1; i11 >= 0; i11--) {
            zzb(this.zzvs[i11], this.zzue[i11], zznsVar);
        }
    }

    public final void zzbp() {
        this.zznh = false;
    }

    public final int zzcx() {
        int iZze;
        int i10 = this.zzrr;
        if (i10 != -1) {
            return i10;
        }
        int iZzcx = 0;
        for (int i11 = 0; i11 < this.count; i11++) {
            int i12 = this.zzvs[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 == 0) {
                iZze = zzjr.zze(i13, ((Long) this.zzue[i11]).longValue());
            } else if (i14 == 1) {
                iZze = zzjr.zzg(i13, ((Long) this.zzue[i11]).longValue());
            } else if (i14 == 2) {
                iZze = zzjr.zzc(i13, (zzjc) this.zzue[i11]);
            } else if (i14 == 3) {
                iZzcx = ((zzmy) this.zzue[i11]).zzcx() + (zzjr.zzab(i13) << 1) + iZzcx;
            } else {
                if (i14 != 5) {
                    throw new IllegalStateException(zzkq.zzdl());
                }
                iZze = zzjr.zzj(i13, ((Integer) this.zzue[i11]).intValue());
            }
            iZzcx = iZze + iZzcx;
        }
        this.zzrr = iZzcx;
        return iZzcx;
    }

    public final int zzfc() {
        int i10 = this.zzrr;
        if (i10 != -1) {
            return i10;
        }
        int iZzd = 0;
        for (int i11 = 0; i11 < this.count; i11++) {
            iZzd += zzjr.zzd(this.zzvs[i11] >>> 3, (zzjc) this.zzue[i11]);
        }
        this.zzrr = iZzd;
        return iZzd;
    }

    private zzmy(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zzrr = -1;
        this.count = i10;
        this.zzvs = iArr;
        this.zzue = objArr;
        this.zznh = z10;
    }

    private static void zzb(int i10, Object obj, zzns zznsVar) throws IOException {
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            zznsVar.zzi(i11, ((Long) obj).longValue());
            return;
        }
        if (i12 == 1) {
            zznsVar.zzc(i11, ((Long) obj).longValue());
            return;
        }
        if (i12 == 2) {
            zznsVar.zza(i11, (zzjc) obj);
            return;
        }
        if (i12 != 3) {
            if (i12 == 5) {
                zznsVar.zzf(i11, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzkq.zzdl());
        }
        if (zznsVar.zzcd() == zzkk.zze.zzsi) {
            zznsVar.zzak(i11);
            ((zzmy) obj).zzb(zznsVar);
            zznsVar.zzal(i11);
        } else {
            zznsVar.zzal(i11);
            ((zzmy) obj).zzb(zznsVar);
            zznsVar.zzak(i11);
        }
    }

    public final void zza(zzns zznsVar) throws IOException {
        if (zznsVar.zzcd() == zzkk.zze.zzsj) {
            for (int i10 = this.count - 1; i10 >= 0; i10--) {
                zznsVar.zza(this.zzvs[i10] >>> 3, this.zzue[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.count; i11++) {
            zznsVar.zza(this.zzvs[i11] >>> 3, this.zzue[i11]);
        }
    }

    public final void zza(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.count; i11++) {
            zzlt.zza(sb2, i10, String.valueOf(this.zzvs[i11] >>> 3), this.zzue[i11]);
        }
    }

    public final void zzb(int i10, Object obj) {
        if (this.zznh) {
            int i11 = this.count;
            int[] iArr = this.zzvs;
            if (i11 == iArr.length) {
                int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
                this.zzvs = Arrays.copyOf(iArr, i12);
                this.zzue = Arrays.copyOf(this.zzue, i12);
            }
            int[] iArr2 = this.zzvs;
            int i13 = this.count;
            iArr2[i13] = i10;
            this.zzue[i13] = obj;
            this.count = i13 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }
}
