package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcho implements Runnable {
    final /* synthetic */ zzcht zza;

    public zzcho(zzcht zzchtVar) {
        Objects.requireNonNull(zzchtVar);
        this.zza = zzchtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzI("surfaceDestroyed", new String[0]);
    }
}
