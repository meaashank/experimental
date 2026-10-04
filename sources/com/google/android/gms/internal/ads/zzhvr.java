package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhvr extends zzifm implements zzigx {
    private static final zzhvr zzb;
    private static volatile zzihe zzc;
    private int zza;

    static {
        zzhvr zzhvrVar = new zzhvr();
        zzb = zzhvrVar;
        zzifm.zzbu(zzhvr.class, zzhvrVar);
    }

    private zzhvr() {
    }

    public static zzhvr zzb(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhvr) zzifm.zzbT(zzb, zzieiVar, zziewVar);
    }

    public static zzhvr zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzhvr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhvq(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzc;
        if (zziheVar != null) {
            return zziheVar;
        }
        synchronized (zzhvr.class) {
            try {
                zzifhVar = zzc;
                if (zzifhVar == null) {
                    zzifhVar = new zzifh(zzb);
                    zzc = zzifhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzifhVar;
    }
}
