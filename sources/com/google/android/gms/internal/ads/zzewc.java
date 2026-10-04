package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class zzewc {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    @Nullable
    private zzewb zzb;

    public final void zza(boolean z10) {
        this.zza.set(true);
    }

    public final boolean zzb() {
        return this.zza.get();
    }

    public final void zzc(zzewb zzewbVar) {
        this.zzb = zzewbVar;
    }

    @Nullable
    public final zzewb zzd() {
        return this.zzb;
    }
}
