package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhnr {
    private static final zzhnr zza = new zzhnr();
    private static final zzhnq zzb = new zzhnq(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzhnr zza() {
        return zza;
    }

    public final zzhnj zzb() {
        zzhnj zzhnjVar = (zzhnj) this.zzc.get();
        return zzhnjVar == null ? zzb : zzhnjVar;
    }
}
