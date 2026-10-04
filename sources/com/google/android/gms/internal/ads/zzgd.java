package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.collection.C1550p;
import androidx.compose.foundation.layout.C1713x0;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgd implements zzao {
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzgd(long j10, long j11, long j12) {
        this.zza = j10;
        this.zzb = j11;
        this.zzc = j12;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgd)) {
            return false;
        }
        zzgd zzgdVar = (zzgd) obj;
        return this.zza == zzgdVar.zza && this.zzb == zzgdVar.zzb && this.zzc == zzgdVar.zzc;
    }

    public final int hashCode() {
        int iA = C1550p.a(this.zza) + 527;
        return C1550p.a(this.zzc) + ((C1550p.a(this.zzb) + (iA * 31)) * 31);
    }

    public final String toString() {
        long j10 = this.zza;
        int length = String.valueOf(j10).length();
        long j11 = this.zzb;
        int length2 = String.valueOf(j11).length();
        long j12 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 48 + length2 + 12 + String.valueOf(j12).length());
        C1713x0.a(sb2, "Mp4Timestamp: creation time=", j10, ", modification time=");
        sb2.append(j11);
        sb2.append(", timescale=");
        sb2.append(j12);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public /* synthetic */ void zza(zzam zzamVar) {
        E.a(this, zzamVar);
    }
}
