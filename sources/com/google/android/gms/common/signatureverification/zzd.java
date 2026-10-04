package com.google.android.gms.common.signatureverification;

import e.InterfaceC4326A;

/* JADX INFO: loaded from: classes3.dex */
public final class zzd {

    @InterfaceC4326A("Loader.class")
    private static SignatureVerificationConfiguration zza;

    public static synchronized void zza(SignatureVerificationConfiguration signatureVerificationConfiguration) {
        if (zza != null) {
            throw new IllegalStateException("Redundantly setting SignatureVerificationConfiguration");
        }
        zza = signatureVerificationConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized SignatureVerificationConfiguration zzc() {
        try {
            if (zza == null) {
                zza(new zzb());
            }
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }
}
