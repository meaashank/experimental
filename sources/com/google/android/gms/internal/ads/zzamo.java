package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
final class zzamo {
    public final zzamw zza;
    public final zzamz zzb;
    public final zzaht zzc;

    @Nullable
    public final zzahu zzd;
    public int zze;

    @Nullable
    private zzv zzf;

    public zzamo(zzamw zzamwVar, zzamz zzamzVar, zzaht zzahtVar) {
        this.zza = zzamwVar;
        this.zzb = zzamzVar;
        this.zzc = zzahtVar;
        this.zzd = "audio/true-hd".equals(zzamwVar.zzg.zzp) ? new zzahu() : null;
    }

    public final /* synthetic */ zzv zza() {
        return this.zzf;
    }

    public final /* synthetic */ void zzb(zzv zzvVar) {
        this.zzf = zzvVar;
    }
}
