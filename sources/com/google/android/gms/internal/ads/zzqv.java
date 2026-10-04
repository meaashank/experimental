package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzqv {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzqv zza(boolean z10) {
        this.zza = z10;
        return this;
    }

    public final zzqv zzb(boolean z10) {
        this.zzb = z10;
        return this;
    }

    public final zzqv zzc(boolean z10) {
        this.zzc = z10;
        return this;
    }

    public final zzqw zzd() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzqw(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    public final /* synthetic */ boolean zze() {
        return this.zza;
    }

    public final /* synthetic */ boolean zzf() {
        return this.zzb;
    }

    public final /* synthetic */ boolean zzg() {
        return this.zzc;
    }
}
