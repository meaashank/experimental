package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhxn {
    private static final BigInteger zze;
    private static final BigInteger zzf;

    @Nullable
    private Integer zza = null;

    @Nullable
    private BigInteger zzb = zzhxq.zza;

    @Nullable
    private zzhxo zzc = null;
    private zzhxp zzd = zzhxp.zzd;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        zze = bigIntegerValueOf;
        zzf = bigIntegerValueOf.pow(256);
    }

    private zzhxn() {
    }

    public final zzhxn zza(int i10) {
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzhxn zzb(BigInteger bigInteger) {
        this.zzb = bigInteger;
        return this;
    }

    public final zzhxn zzc(zzhxp zzhxpVar) {
        this.zzd = zzhxpVar;
        return this;
    }

    public final zzhxn zzd(zzhxo zzhxoVar) {
        this.zzc = zzhxoVar;
        return this;
    }

    public final zzhxq zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.zza));
        }
        BigInteger bigInteger = this.zzb;
        int iCompareTo = bigInteger.compareTo(zzhxq.zza);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(zze).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(zzf) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new zzhxq(this.zza.intValue(), this.zzb, this.zzd, this.zzc, null);
    }

    public /* synthetic */ zzhxn(byte[] bArr) {
    }
}
