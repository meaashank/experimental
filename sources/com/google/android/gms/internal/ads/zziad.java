package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class zziad implements zzhfn {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};

    private zziad(RSAPrivateCrtKey rSAPrivateCrtKey, zzhya zzhyaVar, zzhya zzhyaVar2, int i10, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhlx.zza(2)) {
            throw new GeneralSecurityException("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzicf.zzc(rSAPrivateCrtKey.getModulus().bitLength());
        zzicf.zzd(rSAPrivateCrtKey.getPublicExponent());
        zziae.zzc(zzhyaVar);
        zziae.zzd(zzhyaVar, zzhyaVar2, i10);
    }

    public static zzhfn zzb(zzhye zzhyeVar) throws GeneralSecurityException {
        Provider providerZzb = zziae.zzb();
        if (providerZzb == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", providerZzb);
        zzhyc zzhycVarZzd = zzhyeVar.zzd();
        return new zziad((RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(zzhyeVar.zze().zzd(), zzhycVarZzd.zzd(), zzhyeVar.zzi().zzb(zzheq.zza()), zzhyeVar.zzf().zzb(zzheq.zza()), zzhyeVar.zzh().zzb(zzheq.zza()), zzhyeVar.zzj().zzb(zzheq.zza()), zzhyeVar.zzk().zzb(zzheq.zza()), zzhyeVar.zzl().zzb(zzheq.zza()))), zzhycVarZzd.zzf(), zzhycVarZzd.zzg(), zzhycVarZzd.zzh(), zzhyeVar.zze().zze().zzc(), zzhycVarZzd.zze().equals(zzhyb.zzc) ? zzb : zza, providerZzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhfn
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}
