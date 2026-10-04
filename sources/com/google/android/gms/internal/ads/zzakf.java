package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzakf extends zzajz {

    @Nullable
    public final String zza;
    public final String zzb;

    public zzakf(String str, @Nullable String str2, String str3) {
        super(str);
        this.zza = str2;
        this.zzb = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzakf.class == obj.getClass()) {
            zzakf zzakfVar = (zzakf) obj;
            if (this.zzf.equals(zzakfVar.zzf) && Objects.equals(this.zza, zzakfVar.zza) && Objects.equals(this.zzb, zzakfVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        return this.zzb.hashCode() + (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        return androidx.compose.animation.core.E0.a(new StringBuilder(str2.length() + length + 6), str, ": url=", str2);
    }
}
