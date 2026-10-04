package com.google.android.gms.internal.ads;

import android.view.InputEvent;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdxl {

    @Nullable
    private volatile InputEvent zza;

    @e.f0(otherwise = 3)
    public zzdxl() {
    }

    public final void zza(InputEvent inputEvent) {
        this.zza = inputEvent;
    }

    @Nullable
    public final InputEvent zzb() {
        return this.zza;
    }
}
