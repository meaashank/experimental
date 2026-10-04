package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfur implements Runnable {
    final /* synthetic */ zzfvd zza;

    public zzfur(zzfvd zzfvdVar) {
        Objects.requireNonNull(zzfvdVar);
        this.zza = zzfvdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzy();
    }
}
