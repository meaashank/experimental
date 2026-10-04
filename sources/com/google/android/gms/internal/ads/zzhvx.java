package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhvx extends zzhym {
    private final zzhvv zza;
    private final zzhvt zzb;
    private final zzhvu zzc;
    private final zzhvw zzd;

    public /* synthetic */ zzhvx(zzhvv zzhvvVar, zzhvt zzhvtVar, zzhvu zzhvuVar, zzhvw zzhvwVar, byte[] bArr) {
        this.zza = zzhvvVar;
        this.zzb = zzhvtVar;
        this.zzc = zzhvuVar;
        this.zzd = zzhvwVar;
    }

    public static zzhvs zzb() {
        return new zzhvs(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhvx)) {
            return false;
        }
        zzhvx zzhvxVar = (zzhvx) obj;
        return zzhvxVar.zza == this.zza && zzhvxVar.zzb == this.zzb && zzhvxVar.zzc == this.zzc && zzhvxVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhvx.class, this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final String toString() {
        String string = this.zzd.toString();
        int length = string.length();
        String string2 = this.zzc.toString();
        int length2 = string2.length();
        String string3 = this.zza.toString();
        int length3 = string3.length();
        String string4 = this.zzb.toString();
        StringBuilder sb2 = new StringBuilder(length + 39 + length2 + 12 + length3 + 9 + string4.length() + 1);
        androidx.room.F.a(sb2, "ECDSA Parameters (variant: ", string, ", hashType: ", string2);
        androidx.room.F.a(sb2, ", encoding: ", string3, ", curve: ", string4);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zzd != zzhvw.zzd;
    }

    public final zzhvv zzc() {
        return this.zza;
    }

    public final zzhvt zzd() {
        return this.zzb;
    }

    public final zzhvu zze() {
        return this.zzc;
    }

    public final zzhvw zzf() {
        return this.zzd;
    }
}
