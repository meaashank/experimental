package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhft {
    public static byte[] zza(zzhfj zzhfjVar) throws GeneralSecurityException {
        return ((zzhot) zzhnw.zza().zzk(zzhfjVar, zzhot.class)).zzc().zzaN();
    }

    public static zzhfj zzb(byte[] bArr) throws GeneralSecurityException {
        try {
            zzhtw zzhtwVarZzc = zzhtw.zzc(bArr, zziew.zzb());
            zzhnw zzhnwVarZza = zzhnw.zza();
            zzhot zzhotVarZzb = zzhot.zzb(zzhtwVarZzc);
            return !zzhnwVarZza.zzi(zzhotVarZzb) ? new zzhnf(zzhotVarZzb) : zzhnwVarZza.zzj(zzhotVarZzb);
        } catch (IOException e10) {
            throw new GeneralSecurityException("Failed to parse proto", e10);
        }
    }
}
