package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgc {
    static final zzgc zza = new zzgc(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile int zze = 1;
    private final Map zzd;

    public zzgc() {
        this.zzd = new HashMap();
    }

    public static boolean zzb() {
        return false;
    }

    public final zzgo zza(zzhr zzhrVar, int i10) {
        return (zzgo) this.zzd.get(new zzgb(zzhrVar, i10));
    }

    public zzgc(boolean z10) {
        this.zzd = Collections.EMPTY_MAP;
    }
}
