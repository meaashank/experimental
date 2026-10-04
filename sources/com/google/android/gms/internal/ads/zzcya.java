package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcya implements zzdfd, zzbfg, zzdir {
    private final zzfld zza;
    private final zzdeh zzb;
    private final zzdfm zzc;
    private final zzdgi zzf;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();
    private final AtomicBoolean zzg = new AtomicBoolean();

    public zzcya(zzfld zzfldVar, zzdeh zzdehVar, zzdfm zzdfmVar, zzdgi zzdgiVar) {
        this.zza = zzfldVar;
        this.zzb = zzdehVar;
        this.zzc = zzdfmVar;
        this.zzf = zzdgiVar;
    }

    private final void zzd() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzdH() {
        if (this.zza.zze == 4) {
            zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzdI() {
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final void zzdj(zzbff zzbffVar) {
        int i10 = this.zza.zze;
        if (i10 == 1) {
            if (zzbffVar.zzj) {
                zzd();
            }
        } else if (i10 == 4 && zzbffVar.zzj && this.zzg.compareAndSet(false, true)) {
            this.zzf.zza();
        }
        if (zzbffVar.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final synchronized void zzg() {
        int i10 = this.zza.zze;
        if (i10 == 1 || i10 == 4) {
            return;
        }
        zzd();
    }
}
