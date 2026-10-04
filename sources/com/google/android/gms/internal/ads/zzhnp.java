package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhnp {
    private static final zzhnp zzb = new zzhnp();
    private final ConcurrentMap zza = new ConcurrentHashMap();

    public static zzhnp zza() {
        return zzb;
    }

    public final void zzb(zzhno zzhnoVar, Class cls) throws GeneralSecurityException {
        zzhno zzhnoVar2 = (zzhno) this.zza.putIfAbsent(cls, zzhnoVar);
        if (zzhnoVar2 != null && !zzhnoVar2.equals(zzhnoVar)) {
            throw new GeneralSecurityException("Different key creator for parameters class already inserted");
        }
    }
}
