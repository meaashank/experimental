package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class zzion extends v.f {
    private final WeakReference zza;

    public zzion(zzbkh zzbkhVar) {
        this.zza = new WeakReference(zzbkhVar);
    }

    @Override // v.f
    public final void onCustomTabsServiceConnected(ComponentName componentName, androidx.browser.customtabs.a aVar) {
        zzbkh zzbkhVar = (zzbkh) this.zza.get();
        if (zzbkhVar != null) {
            zzbkhVar.zzf(aVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbkh zzbkhVar = (zzbkh) this.zza.get();
        if (zzbkhVar != null) {
            zzbkhVar.zzg();
        }
    }
}
