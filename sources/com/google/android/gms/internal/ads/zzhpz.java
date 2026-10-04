package com.google.android.gms.internal.ads;

import androidx.compose.foundation.layout.C1711w0;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhpz extends zzhqc {
    private final int zza;
    private final int zzb;
    private final zzhpy zzc;
    private final zzhpx zzd;

    public /* synthetic */ zzhpz(int i10, int i11, zzhpy zzhpyVar, zzhpx zzhpxVar, byte[] bArr) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzhpyVar;
        this.zzd = zzhpxVar;
    }

    public static zzhpw zzb() {
        return new zzhpw(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhpz)) {
            return false;
        }
        zzhpz zzhpzVar = (zzhpz) obj;
        return zzhpzVar.zza == this.zza && zzhpzVar.zze() == zze() && zzhpzVar.zzc == this.zzc && zzhpzVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhpz.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        zzhpx zzhpxVar = this.zzd;
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(zzhpxVar);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i10 = this.zzb;
        int length3 = String.valueOf(i10).length();
        int i11 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 38 + length2 + 2 + length3 + 16 + String.valueOf(i11).length() + 10);
        androidx.room.F.a(sb2, "HMAC Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        C1711w0.a(sb2, U6.j.f68738d, i10, "-byte tags, and ", i11);
        sb2.append("-byte key)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zzc != zzhpy.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzhpy zzhpyVar = this.zzc;
        if (zzhpyVar == zzhpy.zzd) {
            return this.zzb;
        }
        if (zzhpyVar == zzhpy.zza || zzhpyVar == zzhpy.zzb || zzhpyVar == zzhpy.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzhpy zzf() {
        return this.zzc;
    }

    public final zzhpx zzg() {
        return this.zzd;
    }
}
