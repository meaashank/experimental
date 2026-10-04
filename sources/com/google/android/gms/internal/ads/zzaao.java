package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzaao implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzaao(zzv zzvVar, int i10) {
        this.zza = 1 == (zzvVar.zze & 1);
        this.zzb = C3355u1.c(i10, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzaao zzaaoVar) {
        return zzgwz.zzg().zzd(this.zzb, zzaaoVar.zzb).zzd(this.zza, zzaaoVar.zza).zze();
    }
}
