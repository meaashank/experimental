package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbr;

/* JADX INFO: loaded from: classes4.dex */
final class zzhdn extends zzhbr.zzf implements Runnable {
    private final Runnable zza;

    public zzhdn(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th) {
            zzb(th);
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final String zzd() {
        String string = this.zza.toString();
        return androidx.compose.animation.core.E0.a(new StringBuilder(string.length() + 7), "task=[", string, "]");
    }
}
