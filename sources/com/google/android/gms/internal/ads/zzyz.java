package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
final class zzyz implements zzabo {
    public long zza;
    public long zzb;

    @Nullable
    public zzabn zzc;

    @Nullable
    public zzyz zzd;

    public zzyz(long j10, int i10) {
        zza(j10, 65536);
    }

    public final void zza(long j10, int i10) {
        zzguk.zzi(this.zzc == null);
        this.zza = j10;
        this.zzb = j10 + 65536;
    }

    public final int zzb(long j10) {
        long j11 = j10 - this.zza;
        int i10 = this.zzc.zzb;
        return (int) j11;
    }

    public final zzyz zzc() {
        this.zzc = null;
        zzyz zzyzVar = this.zzd;
        this.zzd = null;
        return zzyzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final zzabn zzd() {
        zzabn zzabnVar = this.zzc;
        zzabnVar.getClass();
        return zzabnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    @Nullable
    public final zzabo zze() {
        zzyz zzyzVar = this.zzd;
        if (zzyzVar == null || zzyzVar.zzc == null) {
            return null;
        }
        return zzyzVar;
    }
}
