package com.google.android.gms.internal.ads;

import android.view.Surface;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzadg extends zzvr {
    public zzadg(Throwable th, @Nullable zzvs zzvsVar, @Nullable Surface surface) {
        super(th, zzvsVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}
