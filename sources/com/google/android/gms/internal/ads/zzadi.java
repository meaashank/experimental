package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzadi implements zzafb {
    final /* synthetic */ zzvp zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzadn zzd;

    public zzadi(zzadn zzadnVar, zzvp zzvpVar, int i10, long j10) {
        this.zza = zzvpVar;
        this.zzb = i10;
        this.zzc = j10;
        Objects.requireNonNull(zzadnVar);
        this.zzd = zzadnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final void zza(long j10) {
        this.zzd.zzaD(this.zza, this.zzb, this.zzc, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final void zzb() {
        this.zzd.zzaA(this.zza, this.zzb, this.zzc);
    }
}
