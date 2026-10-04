package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfwu {

    @SuppressLint({"StaticFieldLeak"})
    private static final zzfwu zza = new zzfwu();
    private WeakReference zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public static zzfwu zza() {
        return zza;
    }

    public final void zzb(Context context) {
        if (context == null) {
            return;
        }
        this.zzb = new WeakReference(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new zzfwt(this), intentFilter);
    }

    public final void zzc() {
        KeyguardManager keyguardManager;
        Context context = (Context) this.zzb.get();
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
        zzd(this.zzc, zIsDeviceLocked);
        this.zzd = zIsDeviceLocked;
    }

    public final void zzd(boolean z10, boolean z11) {
        if ((z11 || z10) == (this.zzd || this.zzc)) {
            return;
        }
        Iterator it = zzfwk.zza().zze().iterator();
        while (it.hasNext()) {
            ((zzfvq) it.next()).zzg().zzg(z11 || z10);
        }
    }

    public final /* synthetic */ void zze(boolean z10) {
        this.zzc = z10;
    }

    public final /* synthetic */ boolean zzf() {
        return this.zzd;
    }
}
