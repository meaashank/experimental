package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfwp {

    @SuppressLint({"StaticFieldLeak"})
    private static final zzfwp zza = new zzfwp();
    private Context zzb;

    private zzfwp() {
    }

    public static zzfwp zza() {
        return zza;
    }

    public final Context zzb() {
        return this.zzb;
    }

    public final void zzc(Context context) {
        this.zzb = context != null ? context.getApplicationContext() : null;
    }
}
