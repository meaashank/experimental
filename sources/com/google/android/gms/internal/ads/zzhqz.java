package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhqz implements zzhfi {
    private zzhqz(zzhfi zzhfiVar, int i10, byte[] bArr) {
    }

    public static zzhfi zza(zzhne zzhneVar) throws GeneralSecurityException {
        zzhos zzhosVarZzc = zzhneVar.zzc(zzheq.zza());
        zzhfi zzhfiVar = (zzhfi) zzhmu.zza().zzc(zzhosVarZzc.zzg(), zzhfi.class).zza(zzhosVarZzc.zzb());
        zzhfm zzhfmVarZzd = zzhosVarZzc.zzd();
        return new zzhqz(zzhfiVar, zzhor.zze(zzhfmVarZzd), zzhor.zza(zzhfmVarZzd, zzhneVar.zzb()).zzc());
    }
}
