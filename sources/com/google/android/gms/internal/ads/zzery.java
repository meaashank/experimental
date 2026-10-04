package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class zzery implements com.google.android.gms.ads.internal.zzg {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzddn zzb;
    private final zzdeh zzc;
    private final zzdly zzd;
    private final zzdlq zze;
    private final zzcuy zzf;

    public zzery(zzddn zzddnVar, zzdeh zzdehVar, zzdly zzdlyVar, zzdlq zzdlqVar, zzcuy zzcuyVar) {
        this.zzb = zzddnVar;
        this.zzc = zzdehVar;
        this.zzd = zzdlyVar;
        this.zze = zzdlqVar;
        this.zzf = zzcuyVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzdr();
            this.zze.zza(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
