package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfu {
    private boolean zza;

    public zzfu(Context context, Looper looper, zzdp zzdpVar) {
        context.getApplicationContext();
        zzdpVar.zzd(looper, null);
        zzdpVar.zzd(Looper.getMainLooper(), null);
    }

    public final void zza(boolean z10) {
        if (this.zza == z10) {
            return;
        }
        this.zza = z10;
    }
}
