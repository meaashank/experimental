package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zziew {
    static final zziew zza = new zziew(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zziew zzd = null;
    private static volatile int zzf = 1;
    private final Map zze;

    public zziew() {
        this.zze = new HashMap();
    }

    public static boolean zza() {
        return false;
    }

    public static zziew zzb() {
        int i10 = zzidv.zza;
        return zza;
    }

    public static zziew zzc() {
        zziew zziewVar = zzd;
        if (zziewVar != null) {
            return zziewVar;
        }
        synchronized (zziew.class) {
            try {
                zziew zziewVar2 = zzd;
                if (zziewVar2 != null) {
                    return zziewVar2;
                }
                int i10 = zzidv.zza;
                zziew zziewVarZzb = zzife.zzb(zziew.class);
                zzd = zziewVarZzb;
                return zziewVarZzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzifk zzd(zzigw zzigwVar, int i10) {
        return (zzifk) this.zze.get(new zziev(zzigwVar, i10));
    }

    public zziew(boolean z10) {
        this.zze = Collections.EMPTY_MAP;
    }
}
