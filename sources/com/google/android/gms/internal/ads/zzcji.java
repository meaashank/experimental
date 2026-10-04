package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcji implements Runnable {
    final /* synthetic */ zzcjk zza;

    public zzcji(zzcjk zzcjkVar) {
        Objects.requireNonNull(zzcjkVar);
        this.zza = zzcjkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzt.zzB().zzd(this.zza);
    }
}
