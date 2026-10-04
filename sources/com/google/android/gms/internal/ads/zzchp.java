package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzchp implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcht zzb;

    public zzchp(zzcht zzchtVar, boolean z10) {
        this.zza = z10;
        Objects.requireNonNull(zzchtVar);
        this.zzb = zzchtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzI("windowVisibilityChanged", new String[]{"isVisible", String.valueOf(this.zza)});
    }
}
