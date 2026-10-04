package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhqs implements zzhpn {
    public zzhqs(zzhpf zzhpfVar) {
    }

    public static zzhpn zza(zzhpf zzhpfVar) throws GeneralSecurityException {
        if (!zzhlx.zza(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        Provider providerZza = zzhmb.zza();
        if (providerZza != null) {
            try {
                return zzhqr.zza(zzhpfVar, providerZza);
            } catch (GeneralSecurityException unused) {
            }
        }
        return new zzhqs(zzhpfVar);
    }
}
