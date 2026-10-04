package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import e.InterfaceC4348w;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgc implements zzao {
    public final float zza;
    public final float zzb;

    public zzgc(@InterfaceC4348w(from = -90.0d, to = 90.0d) float f10, @InterfaceC4348w(from = -180.0d, to = 180.0d) float f11) {
        boolean z10 = false;
        if (f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f) {
            z10 = true;
        }
        zzguk.zzb(z10, "Invalid latitude or longitude");
        this.zza = f10;
        this.zzb = f11;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzgc.class == obj.getClass()) {
            zzgc zzgcVar = (zzgc) obj;
            if (this.zza == zzgcVar.zza && this.zzb == zzgcVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.zza) + 527;
        return Float.floatToIntBits(this.zzb) + (iFloatToIntBits * 31);
    }

    public final String toString() {
        float f10 = this.zza;
        int length = String.valueOf(f10).length();
        float f11 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 26 + String.valueOf(f11).length());
        sb2.append("xyz: latitude=");
        sb2.append(f10);
        sb2.append(", longitude=");
        sb2.append(f11);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public /* synthetic */ void zza(zzam zzamVar) {
        E.a(this, zzamVar);
    }
}
