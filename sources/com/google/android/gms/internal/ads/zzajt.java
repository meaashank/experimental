package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzajt extends zzajz {
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzajt(String str, String str2, String str3) {
        super("COMM");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajt.class == obj.getClass()) {
            zzajt zzajtVar = (zzajt) obj;
            if (Objects.equals(this.zzb, zzajtVar.zzb) && Objects.equals(this.zza, zzajtVar.zza) && Objects.equals(this.zzc, zzajtVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() + ((this.zza.hashCode() + 527) * 31);
        String str = this.zzc;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zzc;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zza;
        int length3 = str3.length() + length + 11;
        String str4 = this.zzb;
        StringBuilder sb2 = new StringBuilder(str4.length() + length3 + 14 + 7 + length2);
        androidx.room.F.a(sb2, str, ": language=", str3, ", description=");
        return androidx.compose.animation.core.E0.a(sb2, str4, ", text=", str2);
    }
}
