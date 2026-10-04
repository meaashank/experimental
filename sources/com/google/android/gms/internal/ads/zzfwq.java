package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfwq implements Runnable {
    final /* synthetic */ WebView zza;
    final /* synthetic */ String zzb;

    public zzfwq(zzfwr zzfwrVar, WebView webView, String str) {
        this.zza = webView;
        this.zzb = str;
        Objects.requireNonNull(zzfwrVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfwr.zzk(this.zza, this.zzb);
    }
}
