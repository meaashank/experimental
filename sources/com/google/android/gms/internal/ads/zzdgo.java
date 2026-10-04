package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
final class zzdgo implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzdgq zzdgqVar = (zzdgq) this.zza.get();
        if (zzdgqVar != null) {
            zzdgqVar.zzs(zzdgn.zza);
        }
    }
}
