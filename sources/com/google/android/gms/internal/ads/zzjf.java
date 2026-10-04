package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzjf {
    public final String zza;
    public final zzv zzb;
    public final zzv zzc;
    public final int zzd;
    public final int zze;

    public zzjf(String str, zzv zzvVar, zzv zzvVar2, int i10, int i11) {
        boolean z10;
        if (i10 != 0) {
            z10 = false;
            if (i11 == 0) {
                i11 = 0;
                z10 = true;
            }
        } else {
            z10 = true;
        }
        zzguk.zza(z10);
        zzguk.zza(true ^ TextUtils.isEmpty(str));
        this.zza = str;
        this.zzb = zzvVar;
        zzvVar2.getClass();
        this.zzc = zzvVar2;
        this.zzd = i10;
        this.zze = i11;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzjf.class == obj.getClass()) {
            zzjf zzjfVar = (zzjf) obj;
            if (this.zzd == zzjfVar.zzd && this.zze == zzjfVar.zze && this.zza.equals(zzjfVar.zza) && this.zzb.equals(zzjfVar.zzb) && this.zzc.equals(zzjfVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzd + 527;
        String str = this.zza;
        int iHashCode = str.hashCode() + (((i10 * 31) + this.zze) * 31);
        int iHashCode2 = this.zzb.hashCode() + (iHashCode * 31);
        return this.zzc.hashCode() + (iHashCode2 * 31);
    }
}
