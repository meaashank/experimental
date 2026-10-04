package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhhm extends zzhga {
    private final int zza;
    private final zzhhl zzb;

    public /* synthetic */ zzhhm(int i10, zzhhl zzhhlVar, byte[] bArr) {
        this.zza = i10;
        this.zzb = zzhhlVar;
    }

    public static zzhhk zzb() {
        return new zzhhk(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhhm)) {
            return false;
        }
        zzhhm zzhhmVar = (zzhhm) obj;
        return zzhhmVar.zza == this.zza && zzhhmVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzhhm.class, Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        int length = strValueOf.length();
        int i10 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 33 + String.valueOf(i10).length() + 10);
        sb2.append("AesGcmSiv Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(U6.j.f68738d);
        sb2.append(i10);
        sb2.append("-byte key)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zzb != zzhhl.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzhhl zzd() {
        return this.zzb;
    }
}
