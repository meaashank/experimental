package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaki implements zzao {
    public final float zza;
    public final int zzb;

    public zzaki(float f10, int i10) {
        this.zza = f10;
        this.zzb = i10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaki.class == obj.getClass()) {
            zzaki zzakiVar = (zzaki) obj;
            if (this.zza == zzakiVar.zza && this.zzb == zzakiVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return androidx.compose.animation.B.a(this.zza, 527, 31) + this.zzb;
    }

    public final String toString() {
        float f10 = this.zza;
        int length = String.valueOf(f10).length();
        int i10 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 47 + String.valueOf(i10).length());
        sb2.append("smta: captureFrameRate=");
        sb2.append(f10);
        sb2.append(", svcTemporalLayerCount=");
        sb2.append(i10);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public /* synthetic */ void zza(zzam zzamVar) {
        E.a(this, zzamVar);
    }
}
