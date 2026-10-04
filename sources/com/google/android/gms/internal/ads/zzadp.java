package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: loaded from: classes4.dex */
public final class zzadp extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzado zzd;
    private boolean zze;

    public /* synthetic */ zzadp(zzado zzadoVar, SurfaceTexture surfaceTexture, boolean z10, byte[] bArr) {
        super(surfaceTexture);
        this.zzd = zzadoVar;
        this.zza = z10;
    }

    public static synchronized boolean zza(Context context) {
        if (!zzc) {
            try {
            } catch (zzdx e10) {
                zzeh.zze("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(e10.getMessage())));
            }
            int i10 = zzdy.zza(context) ? zzdy.zzb() ? 1 : 2 : 0;
            zzb = i10;
            zzc = true;
        }
        return zzb != 0;
    }

    public static zzadp zzb(Context context, boolean z10) {
        boolean z11 = true;
        if (z10 && !zza(context)) {
            z11 = false;
        }
        zzguk.zzi(z11);
        return new zzado().zza(z10 ? zzb : 0);
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        zzado zzadoVar = this.zzd;
        synchronized (zzadoVar) {
            try {
                if (!this.zze) {
                    zzadoVar.zzb();
                    this.zze = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
