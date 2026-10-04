package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbcd implements Runnable {
    final /* synthetic */ zzbcg zza;

    public zzbcd(zzbcg zzbcgVar) {
        Objects.requireNonNull(zzbcgVar);
        this.zza = zzbcgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzr();
    }
}
