package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class zzatk {
    private final String zza;
    private final String zzb;

    public zzatk(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzatk.class == obj.getClass()) {
            zzatk zzatkVar = (zzatk) obj;
            if (TextUtils.equals(this.zza, zzatkVar.zza) && TextUtils.equals(this.zzb, zzatkVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(str2).length() + 1);
        androidx.room.F.a(sb2, "Header[name=", str, ",value=", str2);
        sb2.append("]");
        return sb2.toString();
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
