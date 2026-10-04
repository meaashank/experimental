package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcns extends Thread {
    final /* synthetic */ Runnable zza;
    final /* synthetic */ zzcnt zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcns(zzcnt zzcntVar, Runnable runnable, String str, Runnable runnable2) {
        super(runnable, str);
        this.zza = runnable2;
        Objects.requireNonNull(zzcntVar);
        this.zzb = zzcntVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.zzb.zza());
        this.zza.run();
    }
}
