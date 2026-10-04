package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhic extends zzhga {
    private final String zza;
    private final zzhib zzb;

    private zzhic(String str, zzhib zzhibVar) {
        this.zza = str;
        this.zzb = zzhibVar;
    }

    public static zzhic zzb(String str, zzhib zzhibVar) {
        return new zzhic(str, zzhibVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhic)) {
            return false;
        }
        zzhic zzhicVar = (zzhic) obj;
        return zzhicVar.zza.equals(this.zza) && zzhicVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(zzhic.class, this.zza, this.zzb);
    }

    public final String toString() {
        String string = this.zzb.toString();
        String str = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 45 + string.length() + 1);
        androidx.room.F.a(sb2, "LegacyKmsAead Parameters (keyUri: ", str, ", variant: ", string);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zzb != zzhib.zzb;
    }

    public final String zzc() {
        return this.zza;
    }

    public final zzhib zzd() {
        return this.zzb;
    }
}
