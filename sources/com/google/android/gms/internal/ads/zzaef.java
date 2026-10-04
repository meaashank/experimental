package com.google.android.gms.internal.ads;

import android.view.Surface;

/* JADX INFO: loaded from: classes4.dex */
@e.T(30)
final class zzaef {
    public static void zza(Surface surface, float f10) {
        try {
            surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e10) {
            zzeh.zzf("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
        }
    }
}
