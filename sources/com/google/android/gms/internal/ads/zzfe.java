package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfe extends IllegalStateException {
    public final int zza;
    public final int zzb;

    public zzfe(int i10, int i11) {
        super(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? com.google.android.gms.ads.internal.util.d.a(new StringBuilder(String.valueOf(i11).length() + 31), "Player stuck suppressed for ", i11, " ms") : com.google.android.gms.ads.internal.util.d.a(new StringBuilder(String.valueOf(i11).length() + 43), "Player stuck playing without ending for ", i11, " ms") : com.google.android.gms.ads.internal.util.d.a(new StringBuilder(String.valueOf(i11).length() + 45), "Player stuck playing with no progress for ", i11, " ms") : com.google.android.gms.ads.internal.util.d.a(new StringBuilder(String.valueOf(i11).length() + 47), "Player stuck buffering with no progress for ", i11, " ms") : com.google.android.gms.ads.internal.util.d.a(new StringBuilder(String.valueOf(i11).length() + 46), "Player stuck buffering and not loading for ", i11, " ms"));
        this.zza = i10;
        this.zzb = i11;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfe.class == obj.getClass()) {
            zzfe zzfeVar = (zzfe) obj;
            if (this.zza == zzfeVar.zza && this.zzb == zzfeVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza + 527) * 31) + this.zzb;
    }
}
