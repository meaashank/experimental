package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfsr extends zzifm implements zzigx {
    private static final zzfsr zzf;
    private static volatile zzihe zzg;
    private long zza;
    private long zzb;
    private zzify zzc = zzifm.zzbM();
    private zzify zzd = zzifm.zzbM();
    private zzify zze = zzifm.zzbM();

    static {
        zzfsr zzfsrVar = new zzfsr();
        zzf = zzfsrVar;
        zzifm.zzbu(zzfsr.class, zzfsrVar);
    }

    private zzfsr() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzf, "\u0004\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0003\u0000\u0001\u0002\u0002\u0002\u0003Ț\u0004Ț\u0005Ț", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzfsr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfsq(bArr);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzg;
        if (zziheVar != null) {
            return zziheVar;
        }
        synchronized (zzfsr.class) {
            try {
                zzifhVar = zzg;
                if (zzifhVar == null) {
                    zzifhVar = new zzifh(zzf);
                    zzg = zzifhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzifhVar;
    }
}
