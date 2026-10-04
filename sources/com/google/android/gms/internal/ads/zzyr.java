package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzyr implements zzzg {
    final /* synthetic */ zzyu zza;
    private final int zzb;

    public zzyr(zzyu zzyuVar, int i10) {
        Objects.requireNonNull(zzyuVar);
        this.zza = zzyuVar;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final boolean zza() {
        return this.zza.zzh(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final void zzb() throws IOException {
        this.zza.zzi(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final int zzc(zzma zzmaVar, zziy zziyVar, int i10) {
        return this.zza.zzk(this.zzb, zzmaVar, zziyVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final int zzd(long j10) {
        return this.zza.zzp(this.zzb, j10);
    }

    public final /* synthetic */ int zze() {
        return this.zzb;
    }
}
