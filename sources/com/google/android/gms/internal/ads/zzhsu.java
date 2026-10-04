package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhsu extends zzifm implements zzigx {
    private static final zzhsu zza;
    private static volatile zzihe zzb;

    static {
        zzhsu zzhsuVar = new zzhsu();
        zza = zzhsuVar;
        zzifm.zzbu(zzhsu.class, zzhsuVar);
    }

    private zzhsu() {
    }

    public static zzhsu zza(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhsu) zzifm.zzbT(zza, zzieiVar, zziewVar);
    }

    public static zzhsu zzb() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        byte[] bArr = null;
        if (iOrdinal == 2) {
            return zzifm.zzbv(zza, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new zzhsu();
        }
        if (iOrdinal == 4) {
            return new zzhst(bArr);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzb;
        if (zziheVar != null) {
            return zziheVar;
        }
        synchronized (zzhsu.class) {
            try {
                zzifhVar = zzb;
                if (zzifhVar == null) {
                    zzifhVar = new zzifh(zza);
                    zzb = zzifhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzifhVar;
    }
}
