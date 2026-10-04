package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzfxr implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (zzfxu.zzc != null) {
            zzfxu.zzc.post(zzfxu.zzk);
            zzfxu.zzc.postDelayed(zzfxu.zzl, 200L);
        }
    }
}
