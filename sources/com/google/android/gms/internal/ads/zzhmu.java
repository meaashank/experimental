package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhmu {
    private static final Logger zza = Logger.getLogger(zzhmu.class.getName());
    private static final zzhmu zzd = new zzhmu();
    private final ConcurrentMap zzb = new ConcurrentHashMap();
    private final ConcurrentMap zzc = new ConcurrentHashMap();

    public static zzhmu zza() {
        return zzd;
    }

    private final synchronized zzhet zzg(String str) throws GeneralSecurityException {
        ConcurrentMap concurrentMap;
        concurrentMap = this.zzb;
        if (!concurrentMap.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 98);
            sb2.append("No key manager found for key type ");
            sb2.append(str);
            sb2.append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new GeneralSecurityException(sb2.toString());
        }
        return (zzhet) concurrentMap.get(str);
    }

    private final synchronized void zzh(zzhet zzhetVar, boolean z10, boolean z11) throws GeneralSecurityException {
        try {
            String strZzb = zzhetVar.zzb();
            if (z11) {
                ConcurrentMap concurrentMap = this.zzc;
                if (concurrentMap.containsKey(strZzb) && !((Boolean) concurrentMap.get(strZzb)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(strZzb));
                }
            }
            ConcurrentMap concurrentMap2 = this.zzb;
            zzhet zzhetVar2 = (zzhet) concurrentMap2.get(strZzb);
            if (zzhetVar2 != null && !zzhetVar2.getClass().equals(zzhetVar.getClass())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(strZzb));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strZzb, zzhetVar2.getClass().getName(), zzhetVar.getClass().getName()));
            }
            concurrentMap2.putIfAbsent(strZzb, zzhetVar);
            this.zzc.put(strZzb, Boolean.valueOf(z11));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(zzhet zzhetVar, boolean z10) throws GeneralSecurityException {
        zzf(zzhetVar, 1, z10);
    }

    public final zzhet zzc(String str, Class cls) throws GeneralSecurityException {
        zzhet zzhetVarZzg = zzg(str);
        if (zzhetVarZzg.zzc().equals(cls)) {
            return zzhetVarZzg;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(zzhetVarZzg.getClass());
        String string = zzhetVarZzg.zzc().toString();
        StringBuilder sb2 = new StringBuilder(com.bytedance.sdk.component.utils.a.a(strValueOf, name.length() + 53, 23) + string.length());
        androidx.room.F.a(sb2, "Primitive type ", name, " not supported by key manager of type ", strValueOf);
        throw new GeneralSecurityException(android.support.v4.media.e.a(sb2, ", which only supports: ", string));
    }

    public final zzhet zzd(String str) throws GeneralSecurityException {
        return zzg(str);
    }

    public final boolean zze(String str) {
        return ((Boolean) this.zzc.get(str)).booleanValue();
    }

    public final synchronized void zzf(zzhet zzhetVar, int i10, boolean z10) throws GeneralSecurityException {
        if (!zzhlx.zza(i10)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        zzh(zzhetVar, false, z10);
    }
}
