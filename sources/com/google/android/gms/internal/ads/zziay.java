package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zziay implements zzhfo {
    public static zzhfo zzb(zzhwo zzhwoVar) throws GeneralSecurityException {
        if (!zzhlx.zza(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        try {
            return zzhzk.zzb(zzhwoVar);
        } catch (GeneralSecurityException unused) {
            return new zziax(zzhwoVar.zzd().zzc(), zzhwoVar.zze().zzc(), zzhwoVar.zzf().zzc().equals(zzhwg.zzc) ? new byte[]{0} : new byte[0], null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfo
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
