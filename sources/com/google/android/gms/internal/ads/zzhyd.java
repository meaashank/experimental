package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhyd {

    @Nullable
    private zzhyg zza = null;

    @Nullable
    private zzici zzb = null;

    @Nullable
    private zzici zzc = null;

    @Nullable
    private zzici zzd = null;

    @Nullable
    private zzici zze = null;

    @Nullable
    private zzici zzf = null;

    @Nullable
    private zzici zzg = null;

    private zzhyd() {
    }

    public final zzhyd zza(zzhyg zzhygVar) {
        this.zza = zzhygVar;
        return this;
    }

    public final zzhyd zzb(zzici zziciVar, zzici zziciVar2) {
        this.zzc = zziciVar;
        this.zzd = zziciVar2;
        return this;
    }

    public final zzhyd zzc(zzici zziciVar) {
        this.zzb = zziciVar;
        return this;
    }

    public final zzhyd zzd(zzici zziciVar, zzici zziciVar2) {
        this.zze = zziciVar;
        this.zzf = zziciVar2;
        return this;
    }

    public final zzhyd zze(zzici zziciVar) {
        this.zzg = zziciVar;
        return this;
    }

    public final zzhye zzf() throws GeneralSecurityException {
        zzhyg zzhygVar = this.zza;
        if (zzhygVar == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        if (this.zzc == null || this.zzd == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        if (this.zze == null || this.zzf == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        if (this.zzg == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger bigIntegerZzd = zzhygVar.zzf().zzd();
        BigInteger bigIntegerZzd2 = this.zza.zzd();
        BigInteger bigIntegerZzb = this.zzc.zzb(zzheq.zza());
        BigInteger bigIntegerZzb2 = this.zzd.zzb(zzheq.zza());
        BigInteger bigIntegerZzb3 = this.zzb.zzb(zzheq.zza());
        BigInteger bigIntegerZzb4 = this.zze.zzb(zzheq.zza());
        BigInteger bigIntegerZzb5 = this.zzf.zzb(zzheq.zza());
        BigInteger bigIntegerZzb6 = this.zzg.zzb(zzheq.zza());
        if (!bigIntegerZzb.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        if (!bigIntegerZzb2.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!bigIntegerZzb.multiply(bigIntegerZzb2).equals(bigIntegerZzd2)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigIntegerZzb.subtract(bigInteger);
        BigInteger bigIntegerSubtract2 = bigIntegerZzb2.subtract(bigInteger);
        if (!bigIntegerZzd.multiply(bigIntegerZzb3).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!bigIntegerZzd.multiply(bigIntegerZzb4).mod(bigIntegerSubtract).equals(bigInteger)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!bigIntegerZzd.multiply(bigIntegerZzb5).mod(bigIntegerSubtract2).equals(bigInteger)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (bigIntegerZzb2.multiply(bigIntegerZzb6).mod(bigIntegerZzb).equals(bigInteger)) {
            return new zzhye(this.zza, this.zzc, this.zzd, this.zzb, this.zze, this.zzf, this.zzg, null);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }

    public /* synthetic */ zzhyd(byte[] bArr) {
    }
}
