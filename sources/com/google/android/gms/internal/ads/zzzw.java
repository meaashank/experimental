package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzzw {
    public final long zza;
    public final long zzb;

    public zzzw(long j10, long j11) {
        this.zza = j10;
        this.zzb = j11;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzzw)) {
            return false;
        }
        zzzw zzzwVar = (zzzw) obj;
        return this.zza == zzzwVar.zza && this.zzb == zzzwVar.zzb;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}
