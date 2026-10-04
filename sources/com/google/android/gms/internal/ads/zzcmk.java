package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcmk implements Runnable {
    final /* synthetic */ zzcmp zza;

    public zzcmk(zzcmp zzcmpVar) {
        Objects.requireNonNull(zzcmpVar);
        this.zza = zzcmpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}
