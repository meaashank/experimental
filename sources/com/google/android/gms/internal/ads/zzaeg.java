package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import e.InterfaceC4335i;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzaeg implements DisplayManager.DisplayListener {
    public static final /* synthetic */ int zze = 0;
    final Choreographer zza;
    final DisplayManager zzb;
    volatile long zzc = -9223372036854775807L;
    volatile long zzd = -9223372036854775807L;

    public /* synthetic */ zzaeg(Choreographer choreographer, DisplayManager displayManager, byte[] bArr) {
        this.zza = choreographer;
        this.zzb = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }

    @InterfaceC4335i
    public void zza() {
        this.zzb.registerDisplayListener(this, zzfm.zzd(null));
    }

    @InterfaceC4335i
    public void zzb() {
        throw null;
    }
}
