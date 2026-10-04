package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfxd implements Runnable {
    final /* synthetic */ zzfxe zza;
    private final WebView zzb;

    public zzfxd(zzfxe zzfxeVar) {
        Objects.requireNonNull(zzfxeVar);
        this.zza = zzfxeVar;
        this.zzb = zzfxeVar.zzq();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
