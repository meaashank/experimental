package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhhs extends zzhga {
    private final zzhhr zza;

    private zzhhs(zzhhr zzhhrVar) {
        this.zza = zzhhrVar;
    }

    public static zzhhs zzb(zzhhr zzhhrVar) {
        return new zzhhs(zzhhrVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhhs) && ((zzhhs) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhhs.class, this.zza);
    }

    public final String toString() {
        String string = this.zza.toString();
        return androidx.compose.animation.core.E0.a(new StringBuilder(string.length() + 39), "ChaCha20Poly1305 Parameters (variant: ", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zza != zzhhr.zzc;
    }

    public final zzhhr zzc() {
        return this.zza;
    }
}
