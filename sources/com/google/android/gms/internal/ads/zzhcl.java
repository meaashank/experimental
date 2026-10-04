package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzhcl extends zzhdf {
    private final Executor zza;
    final /* synthetic */ zzhcm zzb;

    public zzhcl(zzhcm zzhcmVar, Executor executor) {
        Objects.requireNonNull(zzhcmVar);
        this.zzb = zzhcmVar;
        executor.getClass();
        this.zza = executor;
    }

    public abstract void zzb(Object obj);

    @Override // com.google.android.gms.internal.ads.zzhdf
    public final boolean zzd() {
        return this.zzb.isDone();
    }

    public final void zze() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e10) {
            this.zzb.zzb(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdf
    public final void zzf(Object obj) {
        this.zzb.zzD(null);
        zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhdf
    public final void zzg(Throwable th) {
        zzhcm zzhcmVar = this.zzb;
        zzhcmVar.zzD(null);
        if (th instanceof ExecutionException) {
            zzhcmVar.zzb(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            zzhcmVar.cancel(false);
        } else {
            zzhcmVar.zzb(th);
        }
    }
}
