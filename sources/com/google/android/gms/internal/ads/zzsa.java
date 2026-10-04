package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzsa {
    private final zzv zza;

    @Nullable
    private zzhbf zzb = null;
    private zzbf zzc = zzbf.zza;

    @Nullable
    private zzxo zzd = null;

    public zzsa(zzv zzvVar) {
        this.zza = zzvVar;
    }

    public final zzsa zza(@Nullable zzhbf zzhbfVar) {
        this.zzb = zzhbfVar;
        return this;
    }

    public final zzsa zzb(zzbf zzbfVar) {
        this.zzc = zzbfVar;
        return this;
    }

    public final zzsa zzc(@Nullable zzxo zzxoVar) {
        this.zzd = zzxoVar;
        return this;
    }

    public final zzsb zzd() {
        zzxo zzxoVar;
        if (!this.zzc.zzg() && (zzxoVar = this.zzd) != null) {
            zzguk.zza(this.zzc.zze(zzxoVar.zza) != -1);
        }
        return new zzsb(this, null);
    }

    public final /* synthetic */ zzv zze() {
        return this.zza;
    }

    public final /* synthetic */ zzhbf zzf() {
        return this.zzb;
    }

    public final /* synthetic */ zzbf zzg() {
        return this.zzc;
    }

    public final /* synthetic */ zzxo zzh() {
        return this.zzd;
    }
}
