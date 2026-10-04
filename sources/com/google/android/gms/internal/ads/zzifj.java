package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzifj implements zzifa {
    final int zza;
    final zziin zzb;
    final boolean zzc;
    final boolean zzd;

    public zzifj(zzifr zzifrVar, int i10, zziin zziinVar, boolean z10, boolean z11) {
        this.zza = i10;
        this.zzb = zziinVar;
        this.zzc = z10;
        this.zzd = z11;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zzifj) obj).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzifa
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzifa
    public final zziin zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzifa
    public final zziio zzc() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzifa
    public final boolean zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzifa
    public final boolean zze() {
        return this.zzd;
    }
}
