package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfxx {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private zzfxw zzd = null;

    public zzfxx() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        zzfxw zzfxwVar = (zzfxw) this.zzc.poll();
        this.zzd = zzfxwVar;
        if (zzfxwVar != null) {
            zzfxwVar.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzfxw zzfxwVar) {
        zzfxwVar.zzb(this);
        this.zzc.add(zzfxwVar);
        if (this.zzd == null) {
            zzc();
        }
    }

    public final void zzb(zzfxw zzfxwVar) {
        this.zzd = null;
        zzc();
    }
}
