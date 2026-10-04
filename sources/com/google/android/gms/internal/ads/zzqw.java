package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzqw {
    public static final zzqw zza = new zzqv().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    public /* synthetic */ zzqw(zzqv zzqvVar, byte[] bArr) {
        this.zzb = zzqvVar.zze();
        this.zzc = zzqvVar.zzf();
        this.zzd = zzqvVar.zzg();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzqw.class == obj.getClass()) {
            zzqw zzqwVar = (zzqw) obj;
            if (this.zzb == zzqwVar.zzb && this.zzc == zzqwVar.zzc && this.zzd == zzqwVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z10 = this.zzb;
        boolean z11 = this.zzc;
        return (z11 ? 1 : 0) + (z11 ? 1 : 0) + ((z10 ? 1 : 0) << 2) + (this.zzd ? 1 : 0);
    }
}
