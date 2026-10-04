package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhza implements zzhfn {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};

    private zzhza(ECPrivateKey eCPrivateKey, zzibq zzibqVar, zziba zzibaVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhlx.zza(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        zzice.zza(zzibqVar);
    }

    public static zzhfn zzb(zzhvz zzhvzVar) throws GeneralSecurityException {
        Provider providerZza = zzhmb.zza();
        return new zzhza((ECPrivateKey) (providerZza != null ? KeyFactory.getInstance("EC", providerZza) : (KeyFactory) zzibh.zzf.zzb("EC")).generatePrivate(new ECPrivateKeySpec(zzhvzVar.zzf().zzb(zzheq.zza()), zzibb.zzb((zziaz) zzhzb.zzc.zzb(zzhvzVar.zzd().zzd())))), (zzibq) zzhzb.zza.zzb(zzhvzVar.zzd().zze()), (zziba) zzhzb.zzb.zzb(zzhvzVar.zzd().zzc()), zzhvzVar.zze().zze().zzc(), zzhvzVar.zzd().zzf().equals(zzhvw.zzc) ? zzb : zza, providerZza);
    }

    @Override // com.google.android.gms.internal.ads.zzhfn
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}
