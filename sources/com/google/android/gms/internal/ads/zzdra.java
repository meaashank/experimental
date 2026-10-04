package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdra {
    zzbnt zza;
    zzbnq zzb;
    zzbog zzc;
    zzbod zzd;
    zzbtc zze;
    final androidx.collection.U0 zzf = new androidx.collection.U0();
    final androidx.collection.U0 zzg = new androidx.collection.U0();

    public final zzdra zza(zzbnt zzbntVar) {
        this.zza = zzbntVar;
        return this;
    }

    public final zzdra zzb(zzbnq zzbnqVar) {
        this.zzb = zzbnqVar;
        return this;
    }

    public final zzdra zzc(zzbog zzbogVar) {
        this.zzc = zzbogVar;
        return this;
    }

    public final zzdra zzd(zzbod zzbodVar) {
        this.zzd = zzbodVar;
        return this;
    }

    public final zzdra zze(zzbtc zzbtcVar) {
        this.zze = zzbtcVar;
        return this;
    }

    public final zzdra zzf(String str, zzbnz zzbnzVar, @Nullable zzbnw zzbnwVar) {
        this.zzf.put(str, zzbnzVar);
        if (zzbnwVar != null) {
            this.zzg.put(str, zzbnwVar);
        }
        return this;
    }

    public final zzdrb zzg() {
        return new zzdrb(this, null);
    }
}
