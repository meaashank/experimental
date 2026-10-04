package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhwn {
    public static final /* synthetic */ int zza = 0;
    private static final zzhok zzb = zzhok.zzd(zzhwl.zza, zzhwi.class, zzhfn.class);
    private static final zzhok zzc = zzhok.zzd(zzhwm.zza, zzhwo.class, zzhfo.class);
    private static final zzhfk zzd = zzhnc.zze("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", zzhfn.class, zzhth.zzg());
    private static final zzhet zze = zzhnc.zzf("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", zzhfo.class, 5, zzhtj.zzg());
    private static final zzhno zzf = zzhwk.zza;
    private static final zzhmt zzg = zzhwj.zza;

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (!zzhlx.zza(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        int i10 = zzhzi.zza;
        zzhzi.zza(zzhnw.zza());
        zzhns zzhnsVarZza = zzhns.zza();
        HashMap map = new HashMap();
        map.put("ED25519", zzhwh.zzb(zzhwg.zza));
        zzhwg zzhwgVar = zzhwg.zzd;
        map.put("ED25519_RAW", zzhwh.zzb(zzhwgVar));
        map.put("ED25519WithRawOutput", zzhwh.zzb(zzhwgVar));
        zzhnsVarZza.zzd(Collections.unmodifiableMap(map));
        zzhnn.zza().zzb(zzg, zzhwh.class);
        zzhnp.zza().zzb(zzf, zzhwh.class);
        zzhnt.zza().zzb(zzb);
        zzhnt.zza().zzb(zzc);
        zzhmu.zza().zzb(zzd, true);
        zzhmu.zza().zzb(zze, false);
    }
}
