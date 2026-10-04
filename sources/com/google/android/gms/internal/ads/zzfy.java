package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfy implements zzao {
    public final int zza;

    public zzfy(int i10) {
        this.zza = i10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzfy) && this.zza == ((zzfy) obj).zza;
    }

    public final int hashCode() {
        return this.zza;
    }

    public final String toString() {
        int i10 = this.zza;
        return androidx.multidex.d.a(new StringBuilder(String.valueOf(i10).length() + 19), "Mp4AlternateGroup: ", i10);
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public /* synthetic */ void zza(zzam zzamVar) {
        E.a(this, zzamVar);
    }
}
