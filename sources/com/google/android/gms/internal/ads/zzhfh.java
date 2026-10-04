package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhfh {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzhfg zza(String str) throws GeneralSecurityException {
        for (zzhfg zzhfgVar : zza) {
            if (zzhfgVar.zza()) {
                return zzhfgVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
