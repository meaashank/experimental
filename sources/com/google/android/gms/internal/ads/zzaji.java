package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.collection.C1550p;
import androidx.compose.foundation.layout.C1713x0;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaji implements zzao {
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public zzaji(long j10, long j11, long j12, long j13, long j14) {
        this.zza = j10;
        this.zzb = j11;
        this.zzc = j12;
        this.zzd = j13;
        this.zze = j14;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaji.class == obj.getClass()) {
            zzaji zzajiVar = (zzaji) obj;
            if (this.zza == zzajiVar.zza && this.zzb == zzajiVar.zzb && this.zzc == zzajiVar.zzc && this.zzd == zzajiVar.zzd && this.zze == zzajiVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iA = C1550p.a(this.zza) + 527;
        int iA2 = C1550p.a(this.zzc) + ((C1550p.a(this.zzb) + (iA * 31)) * 31);
        return C1550p.a(this.zze) + ((C1550p.a(this.zzd) + (iA2 * 31)) * 31);
    }

    public final String toString() {
        long j10 = this.zza;
        int length = String.valueOf(j10).length();
        long j11 = this.zzb;
        int length2 = String.valueOf(j11).length();
        long j12 = this.zzc;
        int length3 = String.valueOf(j12).length();
        long j13 = this.zzd;
        int length4 = String.valueOf(j13).length();
        long j14 = this.zze;
        StringBuilder sb2 = new StringBuilder(length + 54 + length2 + 31 + length3 + 21 + length4 + 12 + String.valueOf(j14).length());
        C1713x0.a(sb2, "Motion photo metadata: photoStartPosition=", j10, ", photoSize=");
        sb2.append(j11);
        C1713x0.a(sb2, ", photoPresentationTimestampUs=", j12, ", videoStartPosition=");
        sb2.append(j13);
        sb2.append(", videoSize=");
        sb2.append(j14);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public /* synthetic */ void zza(zzam zzamVar) {
        E.a(this, zzamVar);
    }
}
