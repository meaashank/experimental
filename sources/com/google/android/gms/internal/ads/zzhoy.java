package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzhoy {
    private final Class zza;
    private final zzich zzb;

    public /* synthetic */ zzhoy(Class cls, zzich zzichVar, byte[] bArr) {
        this.zza = cls;
        this.zzb = zzichVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhoy)) {
            return false;
        }
        zzhoy zzhoyVar = (zzhoy) obj;
        return zzhoyVar.zza.equals(this.zza) && zzhoyVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        zzich zzichVar = this.zzb;
        String simpleName = this.zza.getSimpleName();
        String strValueOf = String.valueOf(zzichVar);
        return androidx.compose.animation.core.E0.a(new StringBuilder(simpleName.length() + 21 + strValueOf.length()), simpleName, ", object identifier: ", strValueOf);
    }
}
