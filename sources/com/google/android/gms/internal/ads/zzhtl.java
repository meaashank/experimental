package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public enum zzhtl implements zzifq {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    private final int zzh;

    zzhtl(int i10) {
        this.zzh = i10;
    }

    public static zzhtl zzb(int i10) {
        if (i10 == 0) {
            return UNKNOWN_HASH;
        }
        if (i10 == 1) {
            return SHA1;
        }
        if (i10 == 2) {
            return SHA384;
        }
        if (i10 == 3) {
            return SHA256;
        }
        if (i10 == 4) {
            return SHA512;
        }
        if (i10 != 5) {
            return null;
        }
        return SHA224;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzifq
    public final int zza() {
        return this == UNRECOGNIZED ? zzifz.zza() : this.zzh;
    }
}
