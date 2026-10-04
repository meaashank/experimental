package com.google.android.gms.internal.ads;

import androidx.collection.C1550p;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhbh implements Serializable {
    private static final zzhbh zza = new zzhbh(new long[0], 0, 0);
    private final long[] zzb;
    private final int zzc;

    private zzhbh(long[] jArr, int i10, int i11) {
        this.zzb = jArr;
        this.zzc = i11;
    }

    public static zzhbg zza(int i10) {
        return new zzhbg(i10);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhbh)) {
            return false;
        }
        zzhbh zzhbhVar = (zzhbh) obj;
        int i10 = this.zzc;
        if (i10 != zzhbhVar.zzc) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (zzc(i11) != zzhbhVar.zzc(i11)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iA = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            iA = (iA * 31) + C1550p.a(this.zzb[i10]);
        }
        return iA;
    }

    public final String toString() {
        int i10 = this.zzc;
        if (i10 == 0) {
            return HttpUrl.f225216p;
        }
        StringBuilder sb2 = new StringBuilder(i10 * 5);
        sb2.append('[');
        long[] jArr = this.zzb;
        sb2.append(jArr[0]);
        for (int i11 = 1; i11 < i10; i11++) {
            sb2.append(U6.j.f68738d);
            sb2.append(jArr[i11]);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public final int zzb() {
        return this.zzc;
    }

    public final long zzc(int i10) {
        zzguk.zzm(i10, this.zzc, FirebaseAnalytics.Param.INDEX);
        return this.zzb[i10];
    }

    public /* synthetic */ zzhbh(long[] jArr, int i10, int i11, byte[] bArr) {
        this(jArr, 0, i11);
    }
}
