package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
final class zzgru extends zzgsv {
    private final int zza;

    @Nullable
    private final String zzb;
    private final int zzc;

    @Nullable
    private final Boolean zzd;

    public /* synthetic */ zzgru(int i10, String str, int i11, Boolean bool, byte[] bArr) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = i11;
        this.zzd = bool;
    }

    public final boolean equals(Object obj) {
        String str;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgsv) {
            zzgsv zzgsvVar = (zzgsv) obj;
            if (this.zza == zzgsvVar.zza() && ((str = this.zzb) != null ? str.equals(zzgsvVar.zzb()) : zzgsvVar.zzb() == null) && this.zzc == zzgsvVar.zzc() && ((bool = this.zzd) != null ? bool.equals(zzgsvVar.zzd()) : zzgsvVar.zzd() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i10 = this.zza;
        int i11 = this.zzc;
        Boolean bool = this.zzd;
        return ((((iHashCode ^ ((i10 ^ 1000003) * 1000003)) * 1000003) ^ i11) * 1000003) ^ (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        int i10 = this.zza;
        int length = String.valueOf(i10).length();
        String str = this.zzb;
        int length2 = String.valueOf(str).length();
        int i11 = this.zzc;
        int length3 = String.valueOf(i11).length();
        Boolean bool = this.zzd;
        StringBuilder sb2 = new StringBuilder(length + 46 + length2 + 9 + length3 + 17 + String.valueOf(bool).length() + 1);
        sb2.append("OverlayDisplayState{statusCode=");
        sb2.append(i10);
        sb2.append(", sessionToken=");
        sb2.append(str);
        sb2.append(", uiMode=");
        sb2.append(i11);
        sb2.append(", userInteracted=");
        sb2.append(bool);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgsv
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgsv
    @Nullable
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgsv
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgsv
    @Nullable
    public final Boolean zzd() {
        return this.zzd;
    }
}
