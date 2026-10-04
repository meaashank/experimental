package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.C1497c;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaju extends zzajz {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;

    public zzaju(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaju.class == obj.getClass()) {
            zzaju zzajuVar = (zzaju) obj;
            if (Objects.equals(this.zza, zzajuVar.zza) && Objects.equals(this.zzb, zzajuVar.zzb) && Objects.equals(this.zzc, zzajuVar.zzc) && Arrays.equals(this.zzd, zzajuVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return Arrays.hashCode(this.zzd) + ((this.zzc.hashCode() + ((this.zzb.hashCode() + (((str != null ? str.hashCode() : 0) + 527) * 31)) * 31)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zzb;
        int length3 = str3.length() + C1497c.a(length, 11, length2, 11);
        String str4 = this.zzc;
        StringBuilder sb2 = new StringBuilder(str4.length() + length3 + 14);
        androidx.room.F.a(sb2, str, ": mimeType=", str2, ", filename=");
        return androidx.compose.animation.core.E0.a(sb2, str3, ", description=", str4);
    }
}
