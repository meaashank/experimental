package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhhv {
    public static final /* synthetic */ int zza = 0;
    private static final zzhok zzb = zzhok.zzd(zzhhu.zza, zzhia.class, zzhek.class);
    private static final zzhet zzc = zzhnc.zzf("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzhek.class, 6, zzhui.zze());
    private static final zzhmt zzd = zzhht.zza;

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (!zzhlx.zza(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        int i10 = zzhih.zza;
        zzhih.zza(zzhnw.zza());
        zzhnt.zza().zzb(zzb);
        zzhnn.zza().zzb(zzd, zzhic.class);
        zzhmu.zza().zzb(zzc, true);
    }
}
