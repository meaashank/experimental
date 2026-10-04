package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzadh implements zzafa {
    final /* synthetic */ zzadn zza;

    public zzadh(zzadn zzadnVar) {
        Objects.requireNonNull(zzadnVar);
        this.zza = zzadnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void zza() {
        zznd zzndVarZzbe = this.zza.zzbe();
        if (zzndVarZzbe != null) {
            zzndVarZzbe.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void zzb() {
        zzadn zzadnVar = this.zza;
        if (zzadnVar.zzbs() != null) {
            zzadnVar.zzbr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void zzc() {
        zzadn zzadnVar = this.zza;
        if (zzadnVar.zzbs() != null) {
            zzadnVar.zzaB(0, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void zzd(zzbv zzbvVar) {
    }
}
