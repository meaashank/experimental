package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class zzinr {
    final LinkedHashMap zza;

    public zzinr(int i10) {
        this.zza = zzint.zzc(i10);
    }

    public final zzinr zza(Object obj, zziof zziofVar) {
        zzioe.zza(obj, "key");
        zzioe.zza(zziofVar, "provider");
        this.zza.put(obj, zziofVar);
        return this;
    }
}
