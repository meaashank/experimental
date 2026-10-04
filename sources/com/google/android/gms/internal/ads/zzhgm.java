package com.google.android.gms.internal.ads;

import androidx.compose.foundation.layout.C1711w0;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhgm extends zzhga {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzhgl zze;
    private final zzhgk zzf;

    public /* synthetic */ zzhgm(int i10, int i11, int i12, int i13, zzhgl zzhglVar, zzhgk zzhgkVar, byte[] bArr) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = zzhglVar;
        this.zzf = zzhgkVar;
    }

    public static zzhgj zzb() {
        return new zzhgj(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhgm)) {
            return false;
        }
        zzhgm zzhgmVar = (zzhgm) obj;
        return zzhgmVar.zza == this.zza && zzhgmVar.zzb == this.zzb && zzhgmVar.zzc == this.zzc && zzhgmVar.zzd == this.zzd && zzhgmVar.zze == this.zze && zzhgmVar.zzf == this.zzf;
    }

    public final int hashCode() {
        return Objects.hash(zzhgm.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf);
    }

    public final String toString() {
        zzhgk zzhgkVar = this.zzf;
        String strValueOf = String.valueOf(this.zze);
        String strValueOf2 = String.valueOf(zzhgkVar);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i10 = this.zzc;
        int length3 = String.valueOf(i10).length();
        int i11 = this.zzd;
        int length4 = String.valueOf(i11).length();
        int i12 = this.zza;
        int length5 = String.valueOf(i12).length();
        int i13 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 48 + length2 + 2 + length3 + 14 + length4 + 16 + length5 + 19 + String.valueOf(i13).length() + 15);
        androidx.room.F.a(sb2, "AesCtrHmacAead Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        C1711w0.a(sb2, U6.j.f68738d, i10, "-byte IV, and ", i11);
        C1711w0.a(sb2, "-byte tags, and ", i12, "-byte AES key, and ", i13);
        sb2.append("-byte HMAC key)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zze != zzhgl.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        return this.zzd;
    }

    public final int zzf() {
        return this.zzc;
    }

    public final zzhgl zzg() {
        return this.zze;
    }

    public final zzhgk zzh() {
        return this.zzf;
    }
}
