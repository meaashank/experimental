package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgsa {
    @SuppressLint({"RestrictedApi"})
    public static zzgrz zza(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new zzgsb(new zzgsr(context));
    }
}
