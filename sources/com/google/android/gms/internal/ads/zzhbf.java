package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhbf implements Serializable {
    private static final zzhbf zza = new zzhbf(new int[0], 0, 0);
    private final int[] zzb;
    private final int zzc;

    private zzhbf(int[] iArr, int i10, int i11) {
        this.zzb = iArr;
        this.zzc = i11;
    }

    public static zzhbf zza() {
        return zza;
    }

    public static zzhbf zzb(int i10, int i11, int i12) {
        return new zzhbf(new int[]{0, 2, 1}, 0, 3);
    }

    public static zzhbf zzc(int i10, int i11, int i12, int i13, int i14) {
        return new zzhbf(new int[]{0, 2, 1, 3, 4}, 0, 5);
    }

    public static zzhbf zzd(int i10, int i11, int i12, int i13, int i14, int i15) {
        return new zzhbf(new int[]{0, 2, 1, 5, 3, 4}, 0, 6);
    }

    public static zzhbf zze(int i10, int... iArr) {
        int length = iArr.length;
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        iArr2[0] = 0;
        System.arraycopy(iArr, 0, iArr2, 1, length);
        return new zzhbf(iArr2, 0, i11);
    }

    public static zzhbf zzf(int[] iArr) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        return new zzhbf(iArrCopyOf, 0, iArrCopyOf.length);
    }

    public static zzhbe zzg(int i10) {
        zzguk.zzd(i10 >= 0, "Invalid initialCapacity: %s", i10);
        return new zzhbe(i10);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhbf)) {
            return false;
        }
        zzhbf zzhbfVar = (zzhbf) obj;
        int i10 = this.zzc;
        if (i10 != zzhbfVar.zzc) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (zzi(i11) != zzhbfVar.zzi(i11)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            i10 = (i10 * 31) + this.zzb[i11];
        }
        return i10;
    }

    public final String toString() {
        int i10 = this.zzc;
        if (i10 == 0) {
            return HttpUrl.f225216p;
        }
        StringBuilder sb2 = new StringBuilder(i10 * 5);
        sb2.append('[');
        int[] iArr = this.zzb;
        sb2.append(iArr[0]);
        for (int i11 = 1; i11 < i10; i11++) {
            sb2.append(U6.j.f68738d);
            sb2.append(iArr[i11]);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public final int zzh() {
        return this.zzc;
    }

    public final int zzi(int i10) {
        zzguk.zzm(i10, this.zzc, FirebaseAnalytics.Param.INDEX);
        return this.zzb[i10];
    }

    public /* synthetic */ zzhbf(int[] iArr, int i10, int i11, byte[] bArr) {
        this(iArr, 0, i11);
    }
}
