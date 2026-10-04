package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zziem {
    public static final /* synthetic */ int zze = 0;
    private static volatile int zzf = 100;
    int zza;
    int zzb;
    final int zzc = zzf;
    Object zzd;

    private zziem() {
    }

    public static zziem zzH(InputStream inputStream, int i10) {
        return inputStream == null ? zzI(zzifz.zza, 0, 0, false) : new zziel(inputStream, 4096, null);
    }

    public static zziem zzI(byte[] bArr, int i10, int i11, boolean z10) {
        zziek zziekVar = new zziek(bArr, i10, i11, z10, null);
        try {
            zziekVar.zzB(i11);
            return zziekVar;
        } catch (zzige e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int zzM(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    public static long zzN(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }

    public static int zzO(int i10, InputStream inputStream) throws IOException {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            i11 |= (i13 & 127) << i12;
            if ((i13 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        while (i12 < 64) {
            int i14 = inputStream.read();
            if (i14 == -1) {
                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if ((i14 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw new zzige("CodedInputStream encountered a malformed varint.");
    }

    public abstract int zzB(int i10) throws zzige;

    public abstract void zzC(int i10);

    public abstract boolean zzD() throws IOException;

    public abstract int zzE();

    public final void zzJ() throws zzige {
        if (this.zza + this.zzb >= this.zzc) {
            throw new zzige("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void zzK() throws zzige {
        if (this.zzb == 0) {
            zzb(0);
        }
    }

    public final void zzL() throws IOException {
        int iZza;
        do {
            iZza = zza();
            if (iZza == 0) {
                return;
            }
            zzJ();
            this.zzb++;
            this.zzb--;
        } while (zzc(iZza));
    }

    public abstract int zza() throws IOException;

    public abstract void zzb(int i10) throws zzige;

    public abstract boolean zzc(int i10) throws IOException;

    public abstract double zzd() throws IOException;

    public abstract float zze() throws IOException;

    public abstract long zzf() throws IOException;

    public abstract long zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract long zzi() throws IOException;

    public abstract int zzj() throws IOException;

    public abstract boolean zzk() throws IOException;

    public abstract String zzl() throws IOException;

    public abstract String zzm() throws IOException;

    public abstract zziei zzn() throws IOException;

    public abstract int zzo() throws IOException;

    public abstract int zzp() throws IOException;

    public abstract int zzq() throws IOException;

    public abstract long zzr() throws IOException;

    public abstract int zzs() throws IOException;

    public abstract long zzt() throws IOException;

    public /* synthetic */ zziem(byte[] bArr) {
    }
}
