package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbdr implements Runnable {
    final /* synthetic */ zzbds zza;

    public zzbdr(zzbds zzbdsVar) {
        Objects.requireNonNull(zzbdsVar);
        this.zza = zzbdsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }
}
