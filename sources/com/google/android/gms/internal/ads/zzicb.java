package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class zzicb implements zzhfn {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};

    public static zzhfn zzb(zzhye zzhyeVar) throws GeneralSecurityException {
        try {
            return zziad.zzb(zzhyeVar);
        } catch (NoSuchProviderException unused) {
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) ((KeyFactory) zzibh.zzf.zzb("RSA")).generatePrivate(new RSAPrivateCrtKeySpec(zzhyeVar.zze().zzd(), zzhyeVar.zzd().zzd(), zzhyeVar.zzi().zzb(zzheq.zza()), zzhyeVar.zzf().zzb(zzheq.zza()), zzhyeVar.zzh().zzb(zzheq.zza()), zzhyeVar.zzj().zzb(zzheq.zza()), zzhyeVar.zzk().zzb(zzheq.zza()), zzhyeVar.zzl().zzb(zzheq.zza())));
            zzhyc zzhycVarZzd = zzhyeVar.zzd();
            zzhmo zzhmoVar = zzicd.zza;
            return new zzica(rSAPrivateCrtKey, (zzibq) zzhmoVar.zzb(zzhycVarZzd.zzf()), (zzibq) zzhmoVar.zzb(zzhycVarZzd.zzg()), zzhycVarZzd.zzh(), zzhyeVar.zze().zze().zzc(), zzhyeVar.zzd().zze().equals(zzhyb.zzc) ? zzb : zza, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfn
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}
