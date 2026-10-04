package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhpj {
    private static final zzhmt zza = zzhpi.zza;
    private static final zzhok zzb = zzhok.zzd(zzhpg.zza, zzhpf.class, zzhpn.class);
    private static final zzhok zzc = zzhok.zzd(zzhph.zza, zzhpf.class, zzhfi.class);
    private static final zzhet zzd = zzhnc.zzf("type.googleapis.com/google.crypto.tink.AesCmacKey", zzhfi.class, 3, zzhro.zzg());

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (!zzhlx.zza(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        int i10 = zzhqp.zza;
        zzhqp.zza(zzhnw.zza());
        zzhnn.zza().zzb(zza, zzhpm.class);
        zzhnt.zza().zzb(zzb);
        zzhnt.zza().zzb(zzc);
        zzhns zzhnsVarZza = zzhns.zza();
        HashMap map = new HashMap();
        zzhpm zzhpmVar = zzhqk.zzc;
        map.put("AES_CMAC", zzhpmVar);
        map.put("AES256_CMAC", zzhpmVar);
        zzhpk zzhpkVar = new zzhpk(null);
        zzhpkVar.zza(32);
        zzhpkVar.zzb(16);
        zzhpkVar.zzc(zzhpl.zzd);
        map.put("AES256_CMAC_RAW", zzhpkVar.zzd());
        zzhnsVarZza.zzd(Collections.unmodifiableMap(map));
        zzhmu.zza().zzb(zzd, true);
    }

    public static /* synthetic */ zzhpf zzb(zzhpm zzhpmVar, Integer num) throws GeneralSecurityException {
        zze(zzhpmVar);
        zzhpe zzhpeVar = new zzhpe(null);
        zzhpeVar.zza(zzhpmVar);
        zzhpeVar.zzb(zzicj.zzb(zzhpmVar.zzc()));
        zzhpeVar.zzc(num);
        return zzhpeVar.zzd();
    }

    public static /* synthetic */ zzhpn zzc(zzhpf zzhpfVar) throws GeneralSecurityException {
        zze(zzhpfVar.zzf());
        return zzhqs.zza(zzhpfVar);
    }

    public static /* synthetic */ zzhfi zzd(zzhpf zzhpfVar) throws GeneralSecurityException {
        zze(zzhpfVar.zzf());
        return zzibx.zza(zzhpfVar);
    }

    private static void zze(zzhpm zzhpmVar) throws GeneralSecurityException {
        if (zzhpmVar.zzc() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
