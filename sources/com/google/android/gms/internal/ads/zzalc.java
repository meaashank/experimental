package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.compose.foundation.layout.C1711w0;

/* JADX INFO: loaded from: classes4.dex */
public final class zzalc {
    public final int zza;
    public final int zzb;
    public final float zzc;

    private zzalc(int i10, int i11, float f10) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = f10;
    }

    public static /* synthetic */ zzalc zza(int i10) {
        int i11 = i10 >> 13;
        if (i11 == 0) {
            return null;
        }
        return new zzalc(i11, (i10 >> 10) & 7, ((i10 & 511) * ((i10 & 512) != 0 ? -1 : 1)) / 10.0f);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzalc)) {
            return false;
        }
        zzalc zzalcVar = (zzalc) obj;
        return this.zza == zzalcVar.zza && this.zzb == zzalcVar.zzb && Float.compare(this.zzc, zzalcVar.zzc) == 0;
    }

    public final int hashCode() {
        int i10 = this.zza;
        float f10 = this.zzc;
        return Float.floatToIntBits(f10) + (((i10 * 31) + this.zzb) * 31);
    }

    public final String toString() {
        int i10 = this.zza;
        int length = String.valueOf(i10).length();
        int i11 = this.zzb;
        int length2 = String.valueOf(i11).length();
        float f10 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 28 + length2 + 7 + String.valueOf(f10).length() + 1);
        C1711w0.a(sb2, "GainField{name=", i10, ", originator=", i11);
        sb2.append(", gain=");
        sb2.append(f10);
        sb2.append("}");
        return sb2.toString();
    }
}
