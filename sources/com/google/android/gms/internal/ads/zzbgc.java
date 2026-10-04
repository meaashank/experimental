package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbgc implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzbgg zzb;

    public zzbgc(zzbgg zzbggVar, View view) {
        this.zza = view;
        Objects.requireNonNull(zzbggVar);
        this.zzb = zzbggVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
