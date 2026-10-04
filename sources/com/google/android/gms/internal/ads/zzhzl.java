package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhzl implements zzhfn {
    private zzhzl(zzhfn zzhfnVar, byte[] bArr, byte[] bArr2) {
    }

    public static zzhfn zzb(zzhne zzhneVar) throws GeneralSecurityException {
        zzhos zzhosVarZzc = zzhneVar.zzc(zzheq.zza());
        return new zzhzl((zzhfn) zzhmu.zza().zzc(zzhosVarZzc.zzg(), zzhfn.class).zza(zzhosVarZzc.zzb()), zzhzm.zzc(zzhosVarZzc), zzhzm.zzd(zzhosVarZzc));
    }

    @Override // com.google.android.gms.internal.ads.zzhfn
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}
