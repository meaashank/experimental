package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgdp {
    private static zzgdp zzb;
    final zzgdl zza;

    private zzgdp(Context context) {
        this.zza = zzgdl.zza(context);
        zzgdk.zza(context);
    }

    public static final zzgdp zza(Context context) {
        zzgdp zzgdpVar;
        synchronized (zzgdp.class) {
            try {
                if (zzb == null) {
                    zzb = new zzgdp(context);
                }
                zzgdpVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgdpVar;
    }

    public final void zzb(@Nullable zzgdj zzgdjVar) throws IOException {
        synchronized (zzgdp.class) {
            zzgdl zzgdlVar = this.zza;
            zzgdlVar.zzf("vendor_scoped_gpid_v2_id");
            zzgdlVar.zzf("vendor_scoped_gpid_v2_creation_time");
        }
    }
}
