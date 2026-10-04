package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhyc extends zzhym {
    public static final BigInteger zza = BigInteger.valueOf(65537);
    private final int zzb;
    private final BigInteger zzc;
    private final zzhyb zzd;
    private final zzhya zze;
    private final zzhya zzf;
    private final int zzg;

    public /* synthetic */ zzhyc(int i10, BigInteger bigInteger, zzhyb zzhybVar, zzhya zzhyaVar, zzhya zzhyaVar2, int i11, byte[] bArr) {
        this.zzb = i10;
        this.zzc = bigInteger;
        this.zzd = zzhybVar;
        this.zze = zzhyaVar;
        this.zzf = zzhyaVar2;
        this.zzg = i11;
    }

    public static zzhxz zzb() {
        return new zzhxz(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhyc)) {
            return false;
        }
        zzhyc zzhycVar = (zzhyc) obj;
        return zzhycVar.zzb == this.zzb && Objects.equals(zzhycVar.zzc, this.zzc) && Objects.equals(zzhycVar.zzd, this.zzd) && Objects.equals(zzhycVar.zze, this.zze) && Objects.equals(zzhycVar.zzf, this.zzf) && zzhycVar.zzg == this.zzg;
    }

    public final int hashCode() {
        return Objects.hash(zzhyc.class, Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze, this.zzf, Integer.valueOf(this.zzg));
    }

    public final String toString() {
        BigInteger bigInteger = this.zzc;
        zzhya zzhyaVar = this.zzf;
        zzhya zzhyaVar2 = this.zze;
        String strValueOf = String.valueOf(this.zzd);
        String strValueOf2 = String.valueOf(zzhyaVar2);
        String strValueOf3 = String.valueOf(zzhyaVar);
        String strValueOf4 = String.valueOf(bigInteger);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i10 = this.zzg;
        int length4 = String.valueOf(i10).length();
        int length5 = strValueOf4.length();
        int i11 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 55 + length2 + 17 + length3 + 19 + length4 + 18 + length5 + 6 + String.valueOf(i11).length() + 13);
        androidx.room.F.a(sb2, "RSA SSA PSS Parameters (variant: ", strValueOf, ", signature hashType: ", strValueOf2);
        sb2.append(", mgf1 hashType: ");
        sb2.append(strValueOf3);
        sb2.append(", saltLengthBytes: ");
        sb2.append(i10);
        sb2.append(", publicExponent: ");
        sb2.append(strValueOf4);
        sb2.append(", and ");
        sb2.append(i11);
        sb2.append("-bit modulus)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zzd != zzhyb.zzd;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final BigInteger zzd() {
        return this.zzc;
    }

    public final zzhyb zze() {
        return this.zzd;
    }

    public final zzhya zzf() {
        return this.zze;
    }

    public final zzhya zzg() {
        return this.zzf;
    }

    public final int zzh() {
        return this.zzg;
    }
}
