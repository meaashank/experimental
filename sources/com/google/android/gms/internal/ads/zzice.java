package com.google.android.gms.internal.ads;

import com.prism.commons.utils.C3860y;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzice {
    public static String zza(zzibq zzibqVar) throws GeneralSecurityException {
        zzicf.zzb(zzibqVar);
        return zzibqVar.toString().concat("withECDSA");
    }

    public static String zzb(zzibq zzibqVar) throws GeneralSecurityException {
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return C3860y.f162169b;
        }
        if (iOrdinal == 1) {
            return "SHA-224";
        }
        if (iOrdinal == 2) {
            return "SHA-256";
        }
        if (iOrdinal == 3) {
            return "SHA-384";
        }
        if (iOrdinal == 4) {
            return "SHA-512";
        }
        throw new GeneralSecurityException("Unsupported hash ".concat(zzibqVar.toString()));
    }
}
