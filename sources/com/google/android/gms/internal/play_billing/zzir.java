package com.google.android.gms.internal.play_billing;

import androidx.appcompat.widget.C1497c;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzir {
    private static final zzir zza = new zzir(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzir(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzir zzc() {
        return zza;
    }

    public static zzir zze(zzir zzirVar, zzir zzirVar2) {
        int i10 = zzirVar.zzb + zzirVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzirVar.zzc, i10);
        System.arraycopy(zzirVar2.zzc, 0, iArrCopyOf, zzirVar.zzb, zzirVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzirVar.zzd, i10);
        System.arraycopy(zzirVar2.zzd, 0, objArrCopyOf, zzirVar.zzb, zzirVar2.zzb);
        return new zzir(i10, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzir zzf() {
        return new zzir(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i10) {
        int[] iArr = this.zzc;
        if (i10 > iArr.length) {
            int i11 = this.zzb;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i10);
            this.zzd = Arrays.copyOf(this.zzd, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzir)) {
            return false;
        }
        zzir zzirVar = (zzir) obj;
        int i10 = this.zzb;
        if (i10 == zzirVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzirVar.zzc;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzirVar.zzd;
                    int i12 = this.zzb;
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
        int i10 = this.zzb;
        int i11 = i10 + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.zzd;
        int i15 = this.zzb;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final int zza() {
        int iZzy;
        int iZzz;
        int iZzy2;
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iA = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.zzd[i11]).getClass();
                    iZzy2 = zzfx.zzy(i13 << 3) + 8;
                } else if (i14 == 2) {
                    int i15 = i13 << 3;
                    zzfp zzfpVar = (zzfp) this.zzd[i11];
                    int iZzy3 = zzfx.zzy(i15);
                    int iZzd = zzfpVar.zzd();
                    iA = b.a(iZzd, iZzd, iZzy3, iA);
                } else if (i14 == 3) {
                    int iZzy4 = zzfx.zzy(i13 << 3);
                    iZzy = iZzy4 + iZzy4;
                    iZzz = ((zzir) this.zzd[i11]).zza();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(new zzha("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i11]).getClass();
                    iZzy2 = zzfx.zzy(i13 << 3) + 4;
                }
                iA = iZzy2 + iA;
            } else {
                int i16 = i13 << 3;
                long jLongValue = ((Long) this.zzd[i11]).longValue();
                iZzy = zzfx.zzy(i16);
                iZzz = zzfx.zzz(jLongValue);
            }
            iA = iZzz + iZzy + iA;
        }
        this.zze = iA;
        return iA;
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iA = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11] >>> 3;
            zzfp zzfpVar = (zzfp) this.zzd[i11];
            int iZzy = zzfx.zzy(8);
            int iZzy2 = zzfx.zzy(i12) + zzfx.zzy(16);
            int iZzy3 = zzfx.zzy(24);
            int iZzd = zzfpVar.zzd();
            iA = C1497c.a(iZzy + iZzy, iZzy2, a.a(iZzd, iZzd, iZzy3), iA);
        }
        this.zze = iA;
        return iA;
    }

    public final zzir zzd(zzir zzirVar) {
        if (zzirVar.equals(zza)) {
            return this;
        }
        zzg();
        int i10 = this.zzb + zzirVar.zzb;
        zzm(i10);
        System.arraycopy(zzirVar.zzc, 0, this.zzc, this.zzb, zzirVar.zzb);
        System.arraycopy(zzirVar.zzd, 0, this.zzd, this.zzb, zzirVar.zzb);
        this.zzb = i10;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzht.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    public final void zzj(int i10, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    public final void zzk(zzji zzjiVar) throws IOException {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzjiVar.zzx(this.zzc[i10] >>> 3, this.zzd[i10]);
        }
    }

    public final void zzl(zzji zzjiVar) throws IOException {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 >>> 3;
                int i13 = i11 & 7;
                if (i13 == 0) {
                    zzjiVar.zzt(i12, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    zzjiVar.zzm(i12, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    zzjiVar.zzd(i12, (zzfp) obj);
                } else if (i13 == 3) {
                    zzjiVar.zzG(i12);
                    ((zzir) obj).zzl(zzjiVar);
                    zzjiVar.zzh(i12);
                } else {
                    if (i13 != 5) {
                        throw new RuntimeException(new zzha("Protocol message tag had invalid wire type."));
                    }
                    zzjiVar.zzk(i12, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzir() {
        this(0, new int[8], new Object[8], true);
    }
}
