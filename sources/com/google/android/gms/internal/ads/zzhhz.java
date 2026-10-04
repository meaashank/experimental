package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhhz {
    public static final /* synthetic */ int zza = 0;
    private static final zzhet zzb = zzhnc.zzf("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzhek.class, 3, zzhum.zze());
    private static final zzhmt zzc = zzhhy.zza;
    private static final zzhok zzd = zzhok.zzd(zzhhx.zza, zzhii.class, zzhek.class);

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (!zzhlx.zza(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        int i10 = zzhir.zza;
        zzhir.zza(zzhnw.zza());
        zzhnn.zza().zzb(zzc, zzhim.class);
        zzhnt.zza().zzb(zzd);
        zzhmu.zza().zzb(zzb, true);
    }
}
