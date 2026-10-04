package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgrh {
    private final zzggk zza;
    private final zzgdq zzb;

    public zzgrh(zzgdq zzgdqVar, zzggk zzggkVar) {
        this.zza = zzggkVar;
        this.zzb = zzgdqVar;
    }

    public final zzgrf zza(int i10) {
        return new zzgrf(i10, this.zzb, this.zza);
    }

    public final void zzb(int i10) {
        this.zza.zzb(i10 - 1, -1L, null, null);
    }

    public final void zzc(int i10, String str) {
        this.zza.zzb(i10 - 1, -1L, null, str);
    }

    public final void zzd(int i10, Throwable th) {
        this.zza.zzb(i10 - 1, -1L, th, null);
    }

    public final ListenableFuture zze(int i10, ListenableFuture listenableFuture) {
        zzgrf zzgrfVarZza = zza(i10);
        zzgrfVarZza.zza();
        zzhcy.zzr(listenableFuture, new zzgrg(this, zzgrfVarZza), zzhdp.zza());
        return listenableFuture;
    }

    public final void zzf(int i10, Runnable runnable) {
        try {
            zza(i10).zza();
            runnable.run();
        } finally {
        }
    }
}
