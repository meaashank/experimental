package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhhj {
    public static final /* synthetic */ int zza = 0;
    private static final zzhok zzb = zzhok.zzd(zzhhg.zza, zzhhf.class, zzhek.class);
    private static final zzhmt zzc = zzhhi.zza;
    private static final zzhno zzd = zzhhh.zza;
    private static final zzhet zze = zzhnc.zzf("type.googleapis.com/google.crypto.tink.AesGcmSivKey", zzhek.class, 3, zzhso.zze());

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (!zzhlx.zza(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        int i10 = zzhkm.zza;
        zzhkm.zza(zzhnw.zza());
        zzhns zzhnsVarZza = zzhns.zza();
        HashMap map = new HashMap();
        zzhhk zzhhkVar = new zzhhk(null);
        zzhhkVar.zza(16);
        zzhhl zzhhlVar = zzhhl.zza;
        zzhhkVar.zzb(zzhhlVar);
        map.put("AES128_GCM_SIV", zzhhkVar.zzc());
        zzhhk zzhhkVar2 = new zzhhk(null);
        zzhhkVar2.zza(16);
        zzhhl zzhhlVar2 = zzhhl.zzc;
        zzhhkVar2.zzb(zzhhlVar2);
        map.put("AES128_GCM_SIV_RAW", zzhhkVar2.zzc());
        zzhhk zzhhkVar3 = new zzhhk(null);
        zzhhkVar3.zza(32);
        zzhhkVar3.zzb(zzhhlVar);
        map.put("AES256_GCM_SIV", zzhhkVar3.zzc());
        zzhhk zzhhkVar4 = new zzhhk(null);
        zzhhkVar4.zza(32);
        zzhhkVar4.zzb(zzhhlVar2);
        map.put("AES256_GCM_SIV_RAW", zzhhkVar4.zzc());
        zzhnsVarZza.zzd(Collections.unmodifiableMap(map));
        zzhnp.zza().zzb(zzd, zzhhm.class);
        zzhnn.zza().zzb(zzc, zzhhm.class);
        zzhnt.zza().zzb(zzb);
        zzhmu.zza().zzb(zze, true);
    }
}
