package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhrg extends zzhrj {
    private final int zza;

    private zzhrg(int i10) {
        this.zza = i10;
    }

    public static zzhrg zzb(int i10) throws GeneralSecurityException {
        if (i10 == 16 || i10 == 32) {
            return new zzhrg(i10);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i10 * 8)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhrg) && ((zzhrg) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhrg.class, Integer.valueOf(this.zza));
    }

    public final String toString() {
        int i10 = this.zza;
        return com.google.android.gms.ads.internal.util.d.a(new StringBuilder(String.valueOf(i10).length() + 34), "AesCmac PRF Parameters (", i10, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return false;
    }

    public final int zzc() {
        return this.zza;
    }
}
