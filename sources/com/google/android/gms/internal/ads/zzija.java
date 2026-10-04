package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzija extends zzifm implements zzigx {
    private static final zzija zzc;
    private static volatile zzihe zzd;
    private zzifu zza = zzifm.zzbC();
    private zzifu zzb = zzifm.zzbC();

    static {
        zzija zzijaVar = new zzija();
        zzc = zzijaVar;
        zzifm.zzbu(zzija.class, zzijaVar);
    }

    private zzija() {
    }

    public static zzija zzc(byte[] bArr, zziew zziewVar) throws zzige {
        return (zzija) zzifm.zzbV(zzc, bArr, zziewVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u0016\u0003\u0016", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzija();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zziiz(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzd;
        if (zziheVar != null) {
            return zziheVar;
        }
        synchronized (zzija.class) {
            try {
                zzifhVar = zzd;
                if (zzifhVar == null) {
                    zzifhVar = new zzifh(zzc);
                    zzd = zzifhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzifhVar;
    }
}
