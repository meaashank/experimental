package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfqr extends zzifm implements zzigx {
    private static final zzfqr zzg;
    private static volatile zzihe zzh;
    private long zza;
    private zzifu zzb = zzifm.zzbC();
    private zzify zzc = zzifm.zzbM();
    private zzify zzd = zzifm.zzbM();
    private zzify zze = zzifm.zzbM();
    private zzify zzf = zzifm.zzbM();

    static {
        zzfqr zzfqrVar = new zzfqr();
        zzg = zzfqrVar;
        zzifm.zzbu(zzfqr.class, zzfqrVar);
    }

    private zzfqr() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0005\u0000\u0001\u0002\u0002,\u0003Ț\u0004Ț\u0005Ț\u0006Ț", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzfqr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfqq(bArr);
        }
        if (iOrdinal == 5) {
            return zzg;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzh;
        if (zziheVar != null) {
            return zziheVar;
        }
        synchronized (zzfqr.class) {
            try {
                zzifhVar = zzh;
                if (zzifhVar == null) {
                    zzifhVar = new zzifh(zzg);
                    zzh = zzifhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzifhVar;
    }
}
