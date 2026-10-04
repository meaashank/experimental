package com.google.android.gms.internal.ads;

import androidx.compose.foundation.layout.C1709v0;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zziei implements Iterable<Byte>, Serializable {
    public static final zziei zza = new zzieg(zzifz.zza);
    private int zzb = 0;

    static {
        int i10 = zzidv.zza;
    }

    public static zzieh zzC() {
        return new zzieh(128);
    }

    public static int zzD(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(com.google.android.gms.ads.internal.util.d.a(new StringBuilder(String.valueOf(i10).length() + 21), "Beginning index: ", i10, " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(C1709v0.a(new StringBuilder(String.valueOf(i10).length() + 44 + String.valueOf(i11).length()), "Beginning index larger than ending index: ", i10, U6.j.f68738d, i11));
        }
        throw new IndexOutOfBoundsException(C1709v0.a(new StringBuilder(String.valueOf(i11).length() + 15 + String.valueOf(i12).length()), "End index: ", i11, " >= ", i12));
    }

    public static /* synthetic */ boolean zzE(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        int i13 = i10 + i12;
        zzD(i10, i13, bArr.length);
        zzD(i11, i12 + i11, bArr2.length);
        while (i10 < i13) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    private static zziei zzk(Iterator it, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "length (%s) must be >= 1", Integer.valueOf(i10)));
        }
        if (i10 == 1) {
            return (zziei) it.next();
        }
        int i11 = i10 >>> 1;
        zziei zzieiVarZzk = zzk(it, i11);
        zziei zzieiVarZzk2 = zzk(it, i10 - i11);
        if (Integer.MAX_VALUE - zzieiVarZzk.zzb() >= zzieiVarZzk2.zzb()) {
            return zzihn.zzk(zzieiVarZzk, zzieiVarZzk2);
        }
        int iZzb = zzieiVarZzk.zzb();
        int iZzb2 = zzieiVarZzk2.zzb();
        throw new IllegalArgumentException(C1709v0.a(new StringBuilder(String.valueOf(iZzb).length() + 31 + String.valueOf(iZzb2).length()), "ByteString would be too long: ", iZzb, "+", iZzb2));
    }

    public static zziei zzt(byte[] bArr, int i10, int i11) {
        try {
            return zzu(bArr, i10, i11, false);
        } catch (zzige e10) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e10);
        }
    }

    public static zziei zzu(byte[] bArr, int i10, int i11, boolean z10) throws zzige {
        if (i11 == 0) {
            return zza;
        }
        zzD(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzieg(bArr2);
    }

    public static zziei zzv(byte[] bArr) {
        try {
            return zzw(bArr, false);
        } catch (zzige e10) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e10);
        }
    }

    public static zziei zzw(byte[] bArr, boolean z10) throws zzige {
        return bArr.length == 0 ? zza : new zzieg(bArr);
    }

    public static zziei zzx(String str) {
        return str.isEmpty() ? zza : new zzieg(str.getBytes(StandardCharsets.UTF_8));
    }

    public static zziei zzy(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zza : zzk(iterable.iterator(), size);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zziei)) {
            return false;
        }
        zziei zzieiVar = (zziei) obj;
        int iZzb = zzb();
        if (iZzb != zzieiVar.zzb()) {
            return false;
        }
        if (iZzb == 0) {
            return true;
        }
        int i10 = this.zzb;
        int i11 = zzieiVar.zzb;
        if (i10 == 0 || i11 == 0 || i10 == i11) {
            return zzj(zzieiVar);
        }
        return false;
    }

    public final int hashCode() {
        int iZzl = this.zzb;
        if (iZzl == 0) {
            int iZzb = zzb();
            iZzl = zzl(iZzb, 0, iZzb);
            if (iZzl == 0) {
                iZzl = 1;
            }
            this.zzb = iZzl;
        }
        return iZzl;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzb()), zzb() <= 50 ? zzihw.zza(zzA()) : zzihw.zza(zzd(0, 47).zzA()).concat("..."));
    }

    public final byte[] zzA() {
        int iZzb = zzb();
        if (iZzb == 0) {
            return zzifz.zza;
        }
        byte[] bArr = new byte[iZzb];
        zze(bArr, 0, 0, iZzb);
        return bArr;
    }

    public final String zzB(Charset charset) {
        return zzs() ? "" : zzh(charset);
    }

    public abstract byte zza(int i10);

    public abstract int zzb();

    public abstract zziei zzc(int i10, int i11);

    public abstract zziei zzd(int i10, int i11);

    public abstract void zze(byte[] bArr, int i10, int i11, int i12);

    public abstract ByteBuffer zzf();

    public abstract void zzg(zzidz zzidzVar) throws IOException;

    public abstract String zzh(Charset charset);

    public abstract boolean zzi();

    public abstract boolean zzj(zziei zzieiVar);

    public abstract int zzl(int i10, int i11, int i12);

    public abstract zziem zzm();

    public abstract int zzp();

    public abstract boolean zzq();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public zzied iterator() {
        return new zziea(this);
    }

    public final boolean zzs() {
        return zzb() == 0;
    }

    @Deprecated
    public final void zzz(byte[] bArr, int i10, int i11, int i12) {
        zzD(0, i12, zzb());
        zzD(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            zze(bArr, 0, i11, i12);
        }
    }
}
