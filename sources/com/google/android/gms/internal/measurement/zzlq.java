package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes4.dex */
final class zzlq {
    private static final zzlq zza = new zzlq();
    private final ConcurrentMap<Class<?>, zzlu<?>> zzc = new ConcurrentHashMap();
    private final zzlt zzb = new zzkq();

    private zzlq() {
    }

    public static zzlq zza() {
        return zza;
    }

    public final <T> zzlu<T> zza(Class<T> cls) {
        zzjv.zza(cls, "messageType");
        zzlu<T> zzluVarZza = (zzlu) this.zzc.get(cls);
        if (zzluVarZza == null) {
            zzluVarZza = this.zzb.zza(cls);
            zzjv.zza(cls, "messageType");
            zzjv.zza(zzluVarZza, "schema");
            zzlu<T> zzluVar = (zzlu) this.zzc.putIfAbsent(cls, zzluVarZza);
            if (zzluVar != null) {
                return zzluVar;
            }
        }
        return zzluVarZza;
    }

    public final <T> zzlu<T> zza(T t10) {
        return zza((Class) t10.getClass());
    }
}
