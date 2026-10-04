package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhjo extends zzhga {
    private final zzhjn zza;

    private zzhjo(zzhjn zzhjnVar) {
        this.zza = zzhjnVar;
    }

    public static zzhjo zzb(zzhjn zzhjnVar) {
        return new zzhjo(zzhjnVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhjo) && ((zzhjo) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhjo.class, this.zza);
    }

    public final String toString() {
        String string = this.zza.toString();
        return androidx.compose.animation.core.E0.a(new StringBuilder(string.length() + 40), "XChaCha20Poly1305 Parameters (variant: ", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zza != zzhjn.zzc;
    }

    public final zzhjn zzc() {
        return this.zza;
    }
}
