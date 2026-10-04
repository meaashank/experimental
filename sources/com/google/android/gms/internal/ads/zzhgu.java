package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.C1497c;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhgu extends zzhga {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzhgt zzd;

    public /* synthetic */ zzhgu(int i10, int i11, int i12, zzhgt zzhgtVar, byte[] bArr) {
        this.zza = i10;
        this.zzb = i11;
        this.zzd = zzhgtVar;
    }

    public static zzhgs zzb() {
        return new zzhgs(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhgu)) {
            return false;
        }
        zzhgu zzhguVar = (zzhgu) obj;
        return zzhguVar.zza == this.zza && zzhguVar.zzb == this.zzb && zzhguVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhgu.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        int length = strValueOf.length();
        int i10 = this.zzb;
        int length2 = String.valueOf(i10).length();
        int length3 = String.valueOf(16).length();
        int i11 = this.zza;
        StringBuilder sb2 = new StringBuilder(C1497c.a(length + 30 + length2 + 10 + length3, 15, String.valueOf(i11).length(), 10));
        sb2.append("AesEax Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(U6.j.f68738d);
        sb2.append(i10);
        return com.google.android.gms.ads.internal.util.d.a(sb2, "-byte IV, 16-byte tag, and ", i11, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zzd != zzhgt.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final zzhgt zze() {
        return this.zzd;
    }
}
