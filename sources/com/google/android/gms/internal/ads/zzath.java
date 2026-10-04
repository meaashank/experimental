package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class zzath implements Executor {
    final /* synthetic */ Handler zza;

    public zzath(zzatj zzatjVar, Handler handler) {
        this.zza = handler;
        Objects.requireNonNull(zzatjVar);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.post(runnable);
    }
}
