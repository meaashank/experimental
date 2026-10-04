package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhjh extends zzhga {
    private final zzhjg zza;
    private final int zzb;

    private zzhjh(zzhjg zzhjgVar, int i10) {
        this.zza = zzhjgVar;
        this.zzb = i10;
    }

    public static zzhjh zzb(zzhjg zzhjgVar, int i10) throws GeneralSecurityException {
        if (i10 < 8 || i10 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new zzhjh(zzhjgVar, i10);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhjh)) {
            return false;
        }
        zzhjh zzhjhVar = (zzhjh) obj;
        return zzhjhVar.zza == this.zza && zzhjhVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzhjh.class, this.zza, Integer.valueOf(this.zzb));
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        int i10 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 48 + String.valueOf(i10).length() + 1);
        sb2.append("X-AES-GCM Parameters (variant: ");
        sb2.append(string);
        sb2.append("salt_size_bytes: ");
        sb2.append(i10);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zza != zzhjg.zzb;
    }

    public final zzhjg zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }
}
