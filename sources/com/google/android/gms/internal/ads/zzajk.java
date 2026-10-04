package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.collection.C1550p;

/* JADX INFO: loaded from: classes4.dex */
public final class zzajk implements zzao {
    public final long zza;

    public zzajk(long j10) {
        this.zza = j10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzajk.class == obj.getClass() && this.zza == ((zzajk) obj).zza;
    }

    public final int hashCode() {
        return C1550p.a(this.zza) + 527;
    }

    public final String toString() {
        long j10 = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 38);
        sb2.append("ThumbnailMetadata: presentationTimeUs=");
        sb2.append(j10);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public /* synthetic */ void zza(zzam zzamVar) {
        E.a(this, zzamVar);
    }
}
