package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzchn implements Runnable {
    final /* synthetic */ zzcht zza;

    public zzchn(zzcht zzchtVar) {
        Objects.requireNonNull(zzchtVar);
        this.zza = zzchtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzI("surfaceCreated", new String[0]);
    }
}
