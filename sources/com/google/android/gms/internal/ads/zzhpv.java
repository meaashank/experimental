package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhpv {
    public static final /* synthetic */ int zza = 0;
    private static final zzhok zzb = zzhok.zzd(zzhpr.zza, zzhpq.class, zzhpn.class);
    private static final zzhok zzc = zzhok.zzd(zzhpu.zza, zzhpq.class, zzhfi.class);
    private static final zzhet zzd = zzhnc.zzf("type.googleapis.com/google.crypto.tink.HmacKey", zzhfi.class, 3, zzhtn.zzh());
    private static final zzhno zze = zzhpt.zza;
    private static final zzhmt zzf = zzhps.zza;
    private static final int zzg = 2;

    public static void zza(boolean z10) throws GeneralSecurityException {
        int i10 = zzg;
        if (!zzhlx.zza(i10)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i11 = zzhqy.zza;
        zzhqy.zza(zzhnw.zza());
        zzhnt.zza().zzb(zzb);
        zzhnt.zza().zzb(zzc);
        zzhns zzhnsVarZza = zzhns.zza();
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", zzhqk.zza);
        zzhpw zzhpwVar = new zzhpw(null);
        zzhpwVar.zza(32);
        zzhpwVar.zzb(16);
        zzhpy zzhpyVar = zzhpy.zzd;
        zzhpwVar.zzc(zzhpyVar);
        zzhpx zzhpxVar = zzhpx.zzc;
        zzhpwVar.zzd(zzhpxVar);
        map.put("HMAC_SHA256_128BITTAG_RAW", zzhpwVar.zze());
        zzhpw zzhpwVar2 = new zzhpw(null);
        zzhpwVar2.zza(32);
        zzhpwVar2.zzb(32);
        zzhpy zzhpyVar2 = zzhpy.zza;
        zzhpwVar2.zzc(zzhpyVar2);
        zzhpwVar2.zzd(zzhpxVar);
        map.put("HMAC_SHA256_256BITTAG", zzhpwVar2.zze());
        zzhpw zzhpwVar3 = new zzhpw(null);
        zzhpwVar3.zza(32);
        zzhpwVar3.zzb(32);
        zzhpwVar3.zzc(zzhpyVar);
        zzhpwVar3.zzd(zzhpxVar);
        map.put("HMAC_SHA256_256BITTAG_RAW", zzhpwVar3.zze());
        zzhpw zzhpwVar4 = new zzhpw(null);
        zzhpwVar4.zza(64);
        zzhpwVar4.zzb(16);
        zzhpwVar4.zzc(zzhpyVar2);
        zzhpx zzhpxVar2 = zzhpx.zze;
        zzhpwVar4.zzd(zzhpxVar2);
        map.put("HMAC_SHA512_128BITTAG", zzhpwVar4.zze());
        zzhpw zzhpwVar5 = new zzhpw(null);
        zzhpwVar5.zza(64);
        zzhpwVar5.zzb(16);
        zzhpwVar5.zzc(zzhpyVar);
        zzhpwVar5.zzd(zzhpxVar2);
        map.put("HMAC_SHA512_128BITTAG_RAW", zzhpwVar5.zze());
        zzhpw zzhpwVar6 = new zzhpw(null);
        zzhpwVar6.zza(64);
        zzhpwVar6.zzb(32);
        zzhpwVar6.zzc(zzhpyVar2);
        zzhpwVar6.zzd(zzhpxVar2);
        map.put("HMAC_SHA512_256BITTAG", zzhpwVar6.zze());
        zzhpw zzhpwVar7 = new zzhpw(null);
        zzhpwVar7.zza(64);
        zzhpwVar7.zzb(32);
        zzhpwVar7.zzc(zzhpyVar);
        zzhpwVar7.zzd(zzhpxVar2);
        map.put("HMAC_SHA512_256BITTAG_RAW", zzhpwVar7.zze());
        map.put("HMAC_SHA512_512BITTAG", zzhqk.zzb);
        zzhpw zzhpwVar8 = new zzhpw(null);
        zzhpwVar8.zza(64);
        zzhpwVar8.zzb(64);
        zzhpwVar8.zzc(zzhpyVar);
        zzhpwVar8.zzd(zzhpxVar2);
        map.put("HMAC_SHA512_512BITTAG_RAW", zzhpwVar8.zze());
        zzhnsVarZza.zzd(Collections.unmodifiableMap(map));
        zzhnn.zza().zzb(zzf, zzhpz.class);
        zzhnp.zza().zzb(zze, zzhpz.class);
        zzhmu.zza().zzf(zzd, i10, true);
    }
}
