package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzacp implements Spatializer$OnSpatializerStateChangedListener {
    final /* synthetic */ Runnable zza;

    public zzacp(zzacr zzacrVar, Runnable runnable) {
        this.zza = runnable;
        Objects.requireNonNull(zzacrVar);
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        this.zza.run();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        this.zza.run();
    }
}
