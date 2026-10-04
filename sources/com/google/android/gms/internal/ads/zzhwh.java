package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhwh extends zzhym {
    private final zzhwg zza;

    private zzhwh(zzhwg zzhwgVar) {
        this.zza = zzhwgVar;
    }

    public static zzhwh zzb(zzhwg zzhwgVar) {
        return new zzhwh(zzhwgVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhwh) && ((zzhwh) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhwh.class, this.zza);
    }

    public final String toString() {
        String string = this.zza.toString();
        return androidx.compose.animation.core.E0.a(new StringBuilder(string.length() + 30), "Ed25519 Parameters (variant: ", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zza != zzhwg.zzd;
    }

    public final zzhwg zzc() {
        return this.zza;
    }
}
