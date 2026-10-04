package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import e.InterfaceC4348w;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbv {
    public static final zzbv zza = new zzbv(0, 0, 1.0f);

    @e.D(from = 0)
    public final int zzb;

    @e.D(from = 0)
    public final int zzc;

    @InterfaceC4348w(from = 0.0d, fromInclusive = false)
    public final float zzd;

    static {
        String str = zzfm.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public zzbv(@e.D(from = 0) int i10, @e.D(from = 0) int i11, @InterfaceC4348w(from = 0.0d, fromInclusive = false) float f10) {
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = f10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbv) {
            zzbv zzbvVar = (zzbv) obj;
            if (this.zzb == zzbvVar.zzb && this.zzc == zzbvVar.zzc && this.zzd == zzbvVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb + DefaultImageHeaderParser.f139854k;
        float f10 = this.zzd;
        return Float.floatToRawIntBits(f10) + (((i10 * 31) + this.zzc) * 31);
    }
}
