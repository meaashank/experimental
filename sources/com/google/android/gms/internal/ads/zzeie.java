package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeie {
    private final zzcob zza;
    private final Context zzb;
    private final Executor zzc;

    public zzeie(zzcob zzcobVar, Context context, Executor executor) {
        this.zza = zzcobVar;
        this.zzb = context;
        this.zzc = executor;
    }

    public final void zza() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeid
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzb();
            }
        });
    }

    public final /* synthetic */ void zzb() {
        zzeig zzeigVarZzh = this.zza.zzh();
        zzeigVarZzh.zzb(this.zzb);
        zzeigVarZzh.zza().zza().zza();
    }
}
