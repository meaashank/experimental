package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
final class zzekt extends zzekw {

    @Nullable
    private final String zza;
    private final String zzb;

    @Nullable
    private final Drawable zzc;

    public zzekt(@Nullable String str, String str2, @Nullable Drawable drawable) {
        this.zza = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.zzb = str2;
        this.zzc = drawable;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzekw) {
            zzekw zzekwVar = (zzekw) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzekwVar.zza()) : zzekwVar.zza() == null) {
                if (this.zzb.equals(zzekwVar.zzb()) && ((drawable = this.zzc) != null ? drawable.equals(zzekwVar.zzc()) : zzekwVar.zzc() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.zzb.hashCode();
        Drawable drawable = this.zzc;
        return (iHashCode * 1000003) ^ (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        String str = this.zza;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        String str2 = this.zzb;
        StringBuilder sb2 = new StringBuilder(str2.length() + length + 42 + 7 + length2 + 1);
        androidx.room.F.a(sb2, "OfflineAdAssets{advertiserName=", str, ", imageUrl=", str2);
        return androidx.compose.animation.core.E0.a(sb2, ", icon=", strValueOf, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzekw
    @Nullable
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzekw
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzekw
    @Nullable
    public final Drawable zzc() {
        return this.zzc;
    }
}
