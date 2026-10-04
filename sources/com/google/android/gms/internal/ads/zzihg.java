package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes4.dex */
final class zzihg {
    private static final zzihg zza = new zzihg();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzign zzb = new zzign();

    private zzihg() {
    }

    public static zzihg zza() {
        return zza;
    }

    private <T> zziho<T> zzc(Class<T> cls) {
        ConcurrentMap concurrentMap = this.zzc;
        zziho<T> zzihoVarZza = this.zzb.zza(cls);
        zziho<T> zzihoVar = (zziho) concurrentMap.putIfAbsent(cls, zzihoVarZza);
        return zzihoVar != null ? zzihoVar : zzihoVarZza;
    }

    public final zziho zzb(Class cls) {
        Object obj = this.zzc.get(cls);
        return obj == null ? zzc(cls) : (zziho) obj;
    }
}
