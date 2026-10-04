package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.C1497c;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhhd extends zzhga {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzhhc zzd;

    public /* synthetic */ zzhhd(int i10, int i11, int i12, zzhhc zzhhcVar, byte[] bArr) {
        this.zza = i10;
        this.zzd = zzhhcVar;
    }

    public static zzhhb zzb() {
        return new zzhhb(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhhd)) {
            return false;
        }
        zzhhd zzhhdVar = (zzhhd) obj;
        return zzhhdVar.zza == this.zza && zzhhdVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhhd.class, Integer.valueOf(this.zza), 12, 16, this.zzd);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        int length = strValueOf.length();
        int length2 = String.valueOf(12).length();
        int length3 = String.valueOf(16).length();
        int i10 = this.zza;
        StringBuilder sb2 = new StringBuilder(C1497c.a(length + 30 + length2 + 10 + length3, 15, String.valueOf(i10).length(), 10));
        sb2.append("AesGcm Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", 12-byte IV, 16-byte tag, and ");
        sb2.append(i10);
        sb2.append("-byte key)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zzd != zzhhc.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzhhc zzd() {
        return this.zzd;
    }
}
