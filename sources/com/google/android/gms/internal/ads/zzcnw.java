package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcnw {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcnw(int i10, int i11, int i12) {
        this.zzc = i10;
        this.zzb = i11;
        this.zza = i12;
    }

    public static zzcnw zza(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        return zzrVar.zzd ? new zzcnw(3, 0, 0) : zzrVar.zzi ? new zzcnw(2, 0, 0) : zzrVar.zzh ? new zzcnw(0, 0, 0) : new zzcnw(1, zzrVar.zzf, zzrVar.zzc);
    }

    public static zzcnw zzb() {
        return new zzcnw(0, 0, 0);
    }

    public static zzcnw zzc(int i10, int i11) {
        return new zzcnw(1, i10, i11);
    }

    public static zzcnw zzd() {
        return new zzcnw(4, 0, 0);
    }

    public static zzcnw zze() {
        return new zzcnw(5, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 2;
    }

    public final boolean zzg() {
        return this.zzc == 3;
    }

    public final boolean zzh() {
        return this.zzc == 0;
    }

    public final boolean zzi() {
        return this.zzc == 4;
    }

    public final boolean zzj() {
        return this.zzc == 5;
    }
}
