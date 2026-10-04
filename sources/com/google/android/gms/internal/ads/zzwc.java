package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
final class zzwc {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzwc(String str, boolean z10, boolean z11) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zzwc.class) {
            zzwc zzwcVar = (zzwc) obj;
            if (TextUtils.equals(this.zza, zzwcVar.zza) && this.zzb == zzwcVar.zzb && this.zzc == zzwcVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() + 31) * 31) + (true != this.zzb ? 1237 : 1231)) * 31) + (true != this.zzc ? 1237 : 1231);
    }
}
