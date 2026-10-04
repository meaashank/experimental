package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhys extends zzhym {
    private final zzhyp zza;
    private final zzhyq zzb;
    private final zzhyr zzc;

    private zzhys(zzhyp zzhypVar, int i10, zzhyq zzhyqVar, zzhyr zzhyrVar) {
        this.zza = zzhypVar;
        this.zzb = zzhyqVar;
        this.zzc = zzhyrVar;
    }

    public static zzhys zzb(zzhyr zzhyrVar) {
        return new zzhys(zzhyp.zza, 64, zzhyq.zza, zzhyrVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhys)) {
            return false;
        }
        zzhys zzhysVar = (zzhys) obj;
        return zzhysVar.zza == this.zza && zzhysVar.zzb == this.zzb && zzhysVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Objects.hash(zzhys.class, this.zza, 64, this.zzb, this.zzc);
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String string2 = this.zzb.toString();
        int length2 = string2.length();
        String string3 = this.zzc.toString();
        StringBuilder sb2 = new StringBuilder(length + 12 + length2 + 20 + string3.length());
        androidx.room.F.a(sb2, "SLH-DSA-", string, "-128", string2);
        return android.support.v4.media.e.a(sb2, " instance, variant: ", string3);
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zzc != zzhyr.zzb;
    }
}
