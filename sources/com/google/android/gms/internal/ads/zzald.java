package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzald implements zzao {
    public final float zza;

    @Nullable
    public final zzalc zzb;

    @Nullable
    public final zzalc zzc;

    private zzald(float f10, @Nullable zzalc zzalcVar, @Nullable zzalc zzalcVar2) {
        this.zza = f10;
        this.zzb = zzalcVar;
        this.zzc = zzalcVar2;
    }

    @Nullable
    public static zzald zzb(float f10, int i10, int i11) {
        zzalc zzalcVarZza = zzalc.zza(i10);
        zzalc zzalcVarZza2 = zzalc.zza(i11);
        if (f10 <= 0.0f && zzalcVarZza == null && zzalcVarZza2 == null) {
            return null;
        }
        return new zzald(f10, zzalcVarZza, zzalcVarZza2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzald)) {
            return false;
        }
        zzald zzaldVar = (zzald) obj;
        return Float.compare(this.zza, zzaldVar.zza) == 0 && Objects.equals(this.zzb, zzaldVar.zzb) && Objects.equals(this.zzc, zzaldVar.zzc);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.zza) * 31;
        zzalc zzalcVar = this.zzb;
        int iHashCode = (iFloatToIntBits + (zzalcVar != null ? zzalcVar.hashCode() : 0)) * 31;
        zzalc zzalcVar2 = this.zzc;
        return iHashCode + (zzalcVar2 != null ? zzalcVar2.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        String strValueOf2 = String.valueOf(this.zzc);
        float f10 = this.zza;
        int length = String.valueOf(f10).length();
        StringBuilder sb2 = new StringBuilder(length + 37 + strValueOf.length() + 10 + strValueOf2.length());
        sb2.append("ReplayGain Xing/Info: peak=");
        sb2.append(f10);
        sb2.append(", field 1=");
        sb2.append(strValueOf);
        return android.support.v4.media.e.a(sb2, ", field 2=", strValueOf2);
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public /* synthetic */ void zza(zzam zzamVar) {
        E.a(this, zzamVar);
    }
}
