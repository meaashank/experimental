package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdq {
    public static final zzdq zza = new zzdq(0, 0, false);
    private final int zzb;
    private final int zzc;
    private final boolean zzd;

    private zzdq(int i10, int i11, boolean z10) {
        this.zzd = z10;
        this.zzb = i10;
        this.zzc = i11;
    }

    public final int zza() {
        zzguk.zzi(this.zzd);
        return this.zzb;
    }

    public final int zzb() {
        zzguk.zzi(this.zzd);
        return this.zzc;
    }

    public final boolean zzc() {
        return this.zzd;
    }

    public zzdq(int i10, int i11) {
        this(i10, i11, true);
    }
}
