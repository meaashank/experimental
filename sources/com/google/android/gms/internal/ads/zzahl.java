package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.compose.foundation.layout.C1713x0;

/* JADX INFO: loaded from: classes4.dex */
public final class zzahl {
    public static final zzahl zza = new zzahl(0, 0);
    public final long zzb;
    public final long zzc;

    public zzahl(long j10, long j11) {
        this.zzb = j10;
        this.zzc = j11;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahl.class == obj.getClass()) {
            zzahl zzahlVar = (zzahl) obj;
            if (this.zzb == zzahlVar.zzb && this.zzc == zzahlVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        long j10 = this.zzb;
        int length = String.valueOf(j10).length();
        long j11 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(j11).length() + 1);
        C1713x0.a(sb2, "[timeUs=", j10, ", position=");
        return android.support.v4.media.session.f.a(sb2, j11, "]");
    }
}
