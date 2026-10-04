package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbcl implements Runnable {
    final /* synthetic */ zzbcn zza;

    public zzbcl(zzbcn zzbcnVar) {
        Objects.requireNonNull(zzbcnVar);
        this.zza = zzbcnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzd();
    }
}
