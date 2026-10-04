package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhnn {
    public static final /* synthetic */ int zza = 0;
    private static final zzhmt zzc = zzhnm.zza;
    private static final zzhnn zzd = zzd();
    private final Map zzb = new HashMap();

    public static zzhnn zza() {
        return zzd;
    }

    private static zzhnn zzd() {
        zzhnn zzhnnVar = new zzhnn();
        try {
            zzhnnVar.zzb(zzc, zzhnf.class);
            return zzhnnVar;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException("unexpected error.", e10);
        }
    }

    private final synchronized zzhes zze(zzhfj zzhfjVar, @Nullable Integer num) throws GeneralSecurityException {
        zzhmt zzhmtVar;
        zzhmtVar = (zzhmt) this.zzb.get(zzhfjVar.getClass());
        if (zzhmtVar == null) {
            String string = zzhfjVar.toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 86);
            sb2.append("Cannot create a new key for parameters ");
            sb2.append(string);
            sb2.append(": no key creator for this class was registered.");
            throw new GeneralSecurityException(sb2.toString());
        }
        return zzhmtVar.zza(zzhfjVar, num);
    }

    public final synchronized void zzb(zzhmt zzhmtVar, Class cls) throws GeneralSecurityException {
        try {
            Map map = this.zzb;
            zzhmt zzhmtVar2 = (zzhmt) map.get(cls);
            if (zzhmtVar2 != null && !zzhmtVar2.equals(zzhmtVar)) {
                String string = cls.toString();
                StringBuilder sb2 = new StringBuilder(string.length() + 60);
                sb2.append("Different key creator for parameters class ");
                sb2.append(string);
                sb2.append(" already inserted");
                throw new GeneralSecurityException(sb2.toString());
            }
            map.put(cls, zzhmtVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final zzhes zzc(zzhfj zzhfjVar, @Nullable Integer num) throws GeneralSecurityException {
        return zze(zzhfjVar, num);
    }
}
