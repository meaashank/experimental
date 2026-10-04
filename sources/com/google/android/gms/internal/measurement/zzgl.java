package com.google.android.gms.internal.measurement;

import androidx.annotation.Nullable;
import e.InterfaceC4326A;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgl {

    @Nullable
    @InterfaceC4326A("GservicesDelegateSupplier.class")
    private static zzgk zza;

    public static synchronized zzgk zza() {
        try {
            if (zza == null) {
                zza(new zzgn());
            }
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }

    private static synchronized void zza(zzgk zzgkVar) {
        if (zza == null) {
            zza = zzgkVar;
        } else {
            throw new IllegalStateException("init() already called");
        }
    }
}
