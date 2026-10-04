package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgdn extends zzgdm {
    private static zzgdn zzd;

    private zzgdn(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzgdn zzh(Context context) {
        zzgdn zzgdnVar;
        synchronized (zzgdn.class) {
            try {
                if (zzd == null) {
                    zzd = new zzgdn(context);
                }
                zzgdnVar = zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgdnVar;
    }

    public final zzgdj zzi(long j10, boolean z10) throws IOException {
        zzgdj zzgdjVarZza;
        synchronized (zzgdn.class) {
            zzgdjVarZza = zza(null, null, j10, z10);
        }
        return zzgdjVarZza;
    }

    public final zzgdj zzj(String str, String str2, long j10, boolean z10) throws IOException {
        zzgdj zzgdjVarZza;
        synchronized (zzgdn.class) {
            zzgdjVarZza = zza(str, str2, j10, z10);
        }
        return zzgdjVarZza;
    }

    public final void zzk() throws IOException {
        synchronized (zzgdn.class) {
            zzc(false);
        }
    }

    public final void zzl() throws IOException {
        synchronized (zzgdn.class) {
            zzc(true);
        }
    }
}
