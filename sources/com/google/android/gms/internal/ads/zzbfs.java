package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbfs implements zzbft {
    final /* synthetic */ Activity zza;

    public zzbfs(zzbfu zzbfuVar, Activity activity) {
        this.zza = activity;
        Objects.requireNonNull(zzbfuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.zza);
    }
}
