package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgdo extends zzgdm {
    private static zzgdo zzd;

    private zzgdo(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzgdo zzh(Context context) {
        zzgdo zzgdoVar;
        synchronized (zzgdo.class) {
            try {
                if (zzd == null) {
                    zzd = new zzgdo(context);
                }
                zzgdoVar = zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgdoVar;
    }

    public final zzgdj zzi(long j10, boolean z10) throws IOException {
        synchronized (zzgdo.class) {
            try {
                if (this.zzc.zzc()) {
                    return zza(null, null, j10, z10);
                }
                return new zzgdj();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzj() throws IOException {
        synchronized (zzgdo.class) {
            try {
                if (zzg(false)) {
                    zzc(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
