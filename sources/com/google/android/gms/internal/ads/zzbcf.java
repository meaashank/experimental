package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbcf implements Runnable {
    final /* synthetic */ zzbcg zza;

    public zzbcf(zzbcg zzbcgVar) {
        Objects.requireNonNull(zzbcgVar);
        this.zza = zzbcgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbjg.zza(this.zza.zza);
    }
}
