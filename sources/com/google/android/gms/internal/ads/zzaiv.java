package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzaiv {
    protected final zzaht zza;

    public zzaiv(zzaht zzahtVar) {
        this.zza = zzahtVar;
    }

    public abstract boolean zza(zzeu zzeuVar) throws zzat;

    public abstract boolean zzb(zzeu zzeuVar, long j10) throws zzat;

    public final boolean zzf(zzeu zzeuVar, long j10) throws zzat {
        return zza(zzeuVar) && zzb(zzeuVar, j10);
    }
}
