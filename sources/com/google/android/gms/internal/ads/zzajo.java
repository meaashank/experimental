package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.compose.foundation.layout.C1709v0;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzajo implements zzao {
    public final int zza;

    @Nullable
    public final String zzb;

    @Nullable
    public final String zzc;

    @Nullable
    public final String zzd;
    public final boolean zze;
    public final int zzf;

    public zzajo(int i10, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z10, int i11) {
        boolean z11 = true;
        if (i11 != -1 && i11 <= 0) {
            z11 = false;
        }
        zzguk.zza(z11);
        this.zza = i10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z10;
        this.zzf = i11;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajo.class == obj.getClass()) {
            zzajo zzajoVar = (zzajo) obj;
            if (this.zza == zzajoVar.zza && Objects.equals(this.zzb, zzajoVar.zzb) && Objects.equals(this.zzc, zzajoVar.zzc) && Objects.equals(this.zzd, zzajoVar.zzd) && this.zze == zzajoVar.zze && this.zzf == zzajoVar.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i10 = this.zza;
        String str2 = this.zzc;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i11 = ((i10 + 527) * 31) + iHashCode;
        String str3 = this.zzd;
        return (((((((i11 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.zze ? 1 : 0)) * 31) + this.zzf;
    }

    public final String toString() {
        String str = this.zzc;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        int i10 = this.zza;
        int length3 = String.valueOf(i10).length();
        int i11 = this.zzf;
        StringBuilder sb2 = new StringBuilder(length + 28 + length2 + 11 + length3 + 19 + String.valueOf(i11).length());
        androidx.room.F.a(sb2, "IcyHeaders: name=\"", str, "\", genre=\"", str2);
        return C1709v0.a(sb2, "\", bitrate=", i10, ", metadataInterval=", i11);
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final void zza(zzam zzamVar) {
        String str = this.zzc;
        if (str != null) {
            zzamVar.zzv(str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            zzamVar.zzu(str2);
        }
    }
}
