package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzatj {
    private final Executor zza;

    public zzatj(Handler handler) {
        this.zza = new zzath(this, handler);
    }

    public final void zza(zzats zzatsVar, zzaty zzatyVar, Runnable runnable) {
        zzatsVar.zzp();
        zzatsVar.zzc("post-response");
        ((zzath) this.zza).zza.post(new zzati(zzatsVar, zzatyVar, runnable));
    }

    public final void zzb(zzats zzatsVar, zzaub zzaubVar) {
        zzatsVar.zzc("post-error");
        ((zzath) this.zza).zza.post(new zzati(zzatsVar, zzaty.zzb(zzaubVar), null));
    }
}
