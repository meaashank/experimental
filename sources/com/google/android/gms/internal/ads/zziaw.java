package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zziaw implements zzhfn {
    private final byte[] zza;

    private zziaw(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (!zzhlx.zza(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given private key's length is not %s", 32));
        }
        byte[] bArrZzb = zzhmi.zzb(bArr);
        this.zza = bArrZzb;
        zzhmi.zza(bArrZzb);
    }

    public static zzhfn zzb(zzhwi zzhwiVar) throws GeneralSecurityException {
        if (!zzhlx.zza(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        try {
            return zzhzj.zzb(zzhwiVar);
        } catch (GeneralSecurityException unused) {
            return new zziaw(zzhwiVar.zzf().zzc(zzheq.zza()), zzhwiVar.zze().zze().zzc(), zzhwiVar.zzd().zzc().equals(zzhwg.zzc) ? new byte[]{0} : new byte[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfn
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}
