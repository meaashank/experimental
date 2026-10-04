package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbsd implements Runnable {
    final /* synthetic */ zzbsg zza;

    public zzbsd(zzbsg zzbsgVar) {
        Objects.requireNonNull(zzbsgVar);
        this.zza = zzbsgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }
}
