package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhwr extends zzhym {
    private final zzhwp zza;
    private final zzhwq zzb;

    private zzhwr(zzhwp zzhwpVar, zzhwq zzhwqVar) {
        this.zza = zzhwpVar;
        this.zzb = zzhwqVar;
    }

    public static zzhwr zzb(zzhwp zzhwpVar, zzhwq zzhwqVar) {
        return new zzhwr(zzhwpVar, zzhwqVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhwr)) {
            return false;
        }
        zzhwr zzhwrVar = (zzhwr) obj;
        return zzhwrVar.zza == this.zza && zzhwrVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzhwr.class, this.zza, this.zzb);
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String string2 = this.zzb.toString();
        StringBuilder sb2 = new StringBuilder(length + 47 + string2.length() + 1);
        androidx.room.F.a(sb2, "ML-DSA Parameters (ML-DSA instance: ", string, ", variant: ", string2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zzb != zzhwq.zzb;
    }
}
