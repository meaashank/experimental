package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhxq extends zzhym {
    public static final BigInteger zza = BigInteger.valueOf(65537);
    private final int zzb;
    private final BigInteger zzc;
    private final zzhxp zzd;
    private final zzhxo zze;

    public /* synthetic */ zzhxq(int i10, BigInteger bigInteger, zzhxp zzhxpVar, zzhxo zzhxoVar, byte[] bArr) {
        this.zzb = i10;
        this.zzc = bigInteger;
        this.zzd = zzhxpVar;
        this.zze = zzhxoVar;
    }

    public static zzhxn zzb() {
        return new zzhxn(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhxq)) {
            return false;
        }
        zzhxq zzhxqVar = (zzhxq) obj;
        return zzhxqVar.zzb == this.zzb && Objects.equals(zzhxqVar.zzc, this.zzc) && zzhxqVar.zzd == this.zzd && zzhxqVar.zze == this.zze;
    }

    public final int hashCode() {
        return Objects.hash(zzhxq.class, Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze);
    }

    public final String toString() {
        BigInteger bigInteger = this.zzc;
        zzhxo zzhxoVar = this.zze;
        String strValueOf = String.valueOf(this.zzd);
        String strValueOf2 = String.valueOf(zzhxoVar);
        String strValueOf3 = String.valueOf(bigInteger);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i10 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 47 + length2 + 18 + length3 + 6 + String.valueOf(i10).length() + 13);
        androidx.room.F.a(sb2, "RSA SSA PKCS1 Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        sb2.append(", publicExponent: ");
        sb2.append(strValueOf3);
        sb2.append(", and ");
        sb2.append(i10);
        sb2.append("-bit modulus)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zzd != zzhxp.zzd;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final BigInteger zzd() {
        return this.zzc;
    }

    public final zzhxp zze() {
        return this.zzd;
    }

    public final zzhxo zzf() {
        return this.zze;
    }
}
