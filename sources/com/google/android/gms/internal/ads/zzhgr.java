package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhgr {
    public static final /* synthetic */ int zza = 0;
    private static final zzhok zzb = zzhok.zzd(zzhgp.zza, zzhgo.class, zzhek.class);
    private static final zzhet zzc = zzhnc.zzf("type.googleapis.com/google.crypto.tink.AesEaxKey", zzhek.class, 3, zzhse.zzg());
    private static final zzhmt zzd = zzhgq.zza;

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (!zzhlx.zza(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        int i10 = zzhjy.zza;
        zzhjy.zza(zzhnw.zza());
        zzhnt.zza().zzb(zzb);
        zzhns zzhnsVarZza = zzhns.zza();
        HashMap map = new HashMap();
        map.put("AES128_EAX", zzhjb.zzc);
        zzhgs zzhgsVar = new zzhgs(null);
        zzhgsVar.zzb(16);
        zzhgsVar.zza(16);
        zzhgsVar.zzc(16);
        zzhgt zzhgtVar = zzhgt.zzc;
        zzhgsVar.zzd(zzhgtVar);
        map.put("AES128_EAX_RAW", zzhgsVar.zze());
        map.put("AES256_EAX", zzhjb.zzd);
        zzhgs zzhgsVar2 = new zzhgs(null);
        zzhgsVar2.zzb(16);
        zzhgsVar2.zza(32);
        zzhgsVar2.zzc(16);
        zzhgsVar2.zzd(zzhgtVar);
        map.put("AES256_EAX_RAW", zzhgsVar2.zze());
        zzhnsVarZza.zzd(Collections.unmodifiableMap(map));
        zzhnn.zza().zzb(zzd, zzhgu.class);
        zzhmu.zza().zzb(zzc, true);
    }
}
