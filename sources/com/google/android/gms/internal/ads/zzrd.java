package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzrd {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private int zzd = 0;

    public final zzrd zza(boolean z10) {
        this.zza = z10;
        return this;
    }

    public final zzrd zzb(boolean z10) {
        this.zzb = z10;
        return this;
    }

    public final zzrd zzc(boolean z10) {
        this.zzc = z10;
        return this;
    }

    public final zzrd zzd(int i10) {
        this.zzd = i10;
        return this;
    }

    public final zzre zze() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzre(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }

    public final /* synthetic */ boolean zzf() {
        return this.zza;
    }

    public final /* synthetic */ boolean zzg() {
        return this.zzb;
    }

    public final /* synthetic */ boolean zzh() {
        return this.zzc;
    }

    public final /* synthetic */ int zzi() {
        return this.zzd;
    }
}
