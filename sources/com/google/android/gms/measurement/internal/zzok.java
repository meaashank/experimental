package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import e.f0;

/* JADX INFO: loaded from: classes4.dex */
@f0
public final class zzok {
    final Context zza;

    @f0
    public zzok(Context context) {
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.zza = applicationContext;
    }
}
