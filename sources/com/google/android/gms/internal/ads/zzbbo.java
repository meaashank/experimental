package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbbo implements zzbbu {
    final /* synthetic */ Activity zza;

    public zzbbo(zzbbv zzbbvVar, Activity activity) {
        this.zza = activity;
        Objects.requireNonNull(zzbbvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.zza);
    }
}
