package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhev {
    public static final zzhtw zza(zzhfj zzhfjVar) {
        try {
            return ((zzhot) zzhnw.zza().zzk(null, zzhot.class)).zzc();
        } catch (GeneralSecurityException e10) {
            throw new zzhpc("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e10);
        }
    }

    public static final zzhfj zzb(zzhfj zzhfjVar) throws GeneralSecurityException {
        return zzhfjVar != null ? zzhfjVar : zzhft.zzb(zza(null).zzaN());
    }
}
