package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.collection.C1550p;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzajh implements zzajg {
    private final long zza;
    private final long zzb;
    private final boolean zzc;

    @Nullable
    private final zzx zzd;

    public zzajh(long j10, long j11, boolean z10, @Nullable zzx zzxVar) {
        boolean z11 = true;
        if (j10 != -9223372036854775807L && j11 != -9223372036854775807L && j10 > j11) {
            z11 = false;
        }
        zzguk.zza(z11);
        this.zza = j10;
        this.zzb = j11;
        this.zzc = z10;
        this.zzd = zzxVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajh.class == obj.getClass()) {
            zzajh zzajhVar = (zzajh) obj;
            if (this.zza == zzajhVar.zza && this.zzb == zzajhVar.zzb && this.zzc == zzajhVar.zzc && Objects.equals(this.zzd, zzajhVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iA = C1550p.a(this.zzb) + ((C1550p.a(this.zza) + 527) * 31);
        zzx zzxVar = this.zzd;
        return (((iA * 31) + (this.zzc ? 1 : 0)) * 31) + (zzxVar != null ? zzxVar.hashCode() : 0);
    }

    public final String toString() {
        String string;
        long j10 = this.zza;
        Object objValueOf = j10 == -9223372036854775807L ? "UNSET" : Long.valueOf(j10);
        long j11 = this.zzb;
        String string2 = objValueOf.toString();
        if (j11 == -9223372036854775807L) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j11).length() + 12);
            sb2.append(", endTimeMs=");
            sb2.append(j11);
            string = sb2.toString();
        }
        boolean z10 = this.zzc;
        zzx zzxVar = this.zzd;
        String strConcat = zzxVar == null ? "" : ", title=".concat(zzxVar.toString());
        String str = true == z10 ? ", hidden" : "";
        StringBuilder sb3 = new StringBuilder(str.length() + string.length() + string2.length() + 21 + strConcat.length());
        androidx.room.F.a(sb3, "Chapter: startTimeMs=", string2, string, str);
        sb3.append(strConcat);
        return sb3.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public /* synthetic */ void zza(zzam zzamVar) {
        E.a(this, zzamVar);
    }
}
