package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class zzicd implements zzhfo {
    static final zzhmo zza;
    private static final byte[] zzb;
    private static final byte[] zzc;

    static {
        zzhmn zzhmnVarZza = zzhmo.zza();
        zzhmnVarZza.zza(zzibq.SHA256, zzhya.zza);
        zzhmnVarZza.zza(zzibq.SHA384, zzhya.zzb);
        zzhmnVarZza.zza(zzibq.SHA512, zzhya.zzc);
        zza = zzhmnVarZza.zzb();
        zzb = new byte[0];
        zzc = new byte[]{0};
    }

    public static zzhfo zzb(zzhyg zzhygVar) throws GeneralSecurityException {
        try {
            return zziae.zze(zzhygVar);
        } catch (NoSuchProviderException unused) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) ((KeyFactory) zzibh.zzf.zzb("RSA")).generatePublic(new RSAPublicKeySpec(zzhygVar.zzd(), zzhygVar.zzf().zzd()));
            zzhyc zzhycVarZzf = zzhygVar.zzf();
            zzhmo zzhmoVar = zza;
            return new zzicc(rSAPublicKey, (zzibq) zzhmoVar.zzb(zzhycVarZzf.zzf()), (zzibq) zzhmoVar.zzb(zzhycVarZzf.zzg()), zzhycVarZzf.zzh(), zzhygVar.zze().zzc(), zzhygVar.zzf().zze().equals(zzhyb.zzc) ? zzc : zzb, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfo
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
