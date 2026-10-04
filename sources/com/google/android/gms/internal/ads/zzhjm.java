package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhjm {
    public static final /* synthetic */ int zza = 0;
    private static final zzhok zzb = zzhok.zzd(zzhjl.zza, zzhji.class, zzhek.class);
    private static final zzhet zzc = zzhnc.zzf("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzhek.class, 3, zzhvp.zze());
    private static final zzhno zzd = zzhjj.zza;
    private static final zzhmt zze = zzhjk.zza;

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (!zzhlx.zza(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i10 = zzhlq.zza;
        zzhlq.zza(zzhnw.zza());
        zzhnt.zza().zzb(zzb);
        zzhns zzhnsVarZza = zzhns.zza();
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", zzhjo.zzb(zzhjn.zza));
        map.put("XCHACHA20_POLY1305_RAW", zzhjo.zzb(zzhjn.zzc));
        zzhnsVarZza.zzd(Collections.unmodifiableMap(map));
        zzhnn.zza().zzb(zze, zzhjo.class);
        zzhnp.zza().zzb(zzd, zzhjo.class);
        zzhmu.zza().zzb(zzc, true);
    }
}
