package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhpm extends zzhqc {
    private final int zza;
    private final int zzb;
    private final zzhpl zzc;

    public /* synthetic */ zzhpm(int i10, int i11, zzhpl zzhplVar, byte[] bArr) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzhplVar;
    }

    public static zzhpk zzb() {
        return new zzhpk(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhpm)) {
            return false;
        }
        zzhpm zzhpmVar = (zzhpm) obj;
        return zzhpmVar.zza == this.zza && zzhpmVar.zze() == zze() && zzhpmVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Objects.hash(zzhpm.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        int length = strValueOf.length();
        int i10 = this.zzb;
        int length2 = String.valueOf(i10).length();
        int i11 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 32 + length2 + 16 + String.valueOf(i11).length() + 10);
        sb2.append("AES-CMAC Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(U6.j.f68738d);
        sb2.append(i10);
        return com.google.android.gms.ads.internal.util.d.a(sb2, "-byte tags, and ", i11, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zzc != zzhpl.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzhpl zzhplVar = this.zzc;
        if (zzhplVar == zzhpl.zzd) {
            return this.zzb;
        }
        if (zzhplVar == zzhpl.zza || zzhplVar == zzhpl.zzb || zzhplVar == zzhpl.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzhpl zzf() {
        return this.zzc;
    }
}
