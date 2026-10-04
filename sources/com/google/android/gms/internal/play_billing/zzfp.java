package com.google.android.gms.internal.play_billing;

import U6.j;
import androidx.collection.N0;
import androidx.compose.foundation.text.C1758e;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzfp implements Iterable, Serializable {
    public static final zzfp zza = new zzfn(zzgv.zza);
    private int zzb = 0;

    static {
        int i10 = zzfc.zza;
    }

    public static int zzj(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(N0.a("Beginning index: ", i10, " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(C1758e.a("Beginning index larger than ending index: ", i10, j.f68738d, i11));
        }
        throw new IndexOutOfBoundsException(C1758e.a("End index: ", i11, " >= ", i12));
    }

    public static zzfp zzk(byte[] bArr, int i10, int i11) {
        try {
            zzj(i10, i10 + i11, bArr.length);
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return new zzfn(bArr2);
        } catch (zzhb e10) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e10);
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzl(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        int i13 = i10 + i12;
        zzj(i10, i13, bArr.length);
        zzj(i11, i12 + i11, bArr2.length);
        while (i10 < i13) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfp)) {
            return false;
        }
        zzfp zzfpVar = (zzfp) obj;
        int iZzd = zzd();
        if (iZzd != zzfpVar.zzd()) {
            return false;
        }
        if (iZzd == 0) {
            return true;
        }
        int i10 = this.zzb;
        int i11 = zzfpVar.zzb;
        if (i10 == 0 || i11 == 0 || i10 == i11) {
            return zzh(zzfpVar);
        }
        return false;
    }

    public final int hashCode() {
        int iZzc = this.zzb;
        if (iZzc == 0) {
            int iZzd = zzd();
            iZzc = zzc(iZzd, 0, iZzd);
            if (iZzc == 0) {
                iZzc = 1;
            }
            this.zzb = iZzc;
        }
        return iZzc;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzfh(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzd()), zzd() <= 50 ? zzio.zza(zzm()) : zzio.zza(zze(0, 47).zzm()).concat("..."));
    }

    public abstract byte zza(int i10);

    public abstract int zzc(int i10, int i11, int i12);

    public abstract int zzd();

    public abstract zzfp zze(int i10, int i11);

    public abstract void zzf(byte[] bArr, int i10, int i11, int i12);

    public abstract void zzg(zzfg zzfgVar) throws IOException;

    public abstract boolean zzh(zzfp zzfpVar);

    public final byte[] zzm() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return zzgv.zza;
        }
        byte[] bArr = new byte[iZzd];
        zzf(bArr, 0, 0, iZzd);
        return bArr;
    }
}
