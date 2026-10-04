package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhfy {
    private static final zzhep zza = new zzhfx();

    public static zzhep zza() throws GeneralSecurityException {
        if (zzhly.zza()) {
            throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
        }
        return zza;
    }
}
