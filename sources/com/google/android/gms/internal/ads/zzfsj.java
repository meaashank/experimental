package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfsj extends zzifm implements zzigx {
    private static final zzfsj zzb;
    private static volatile zzihe zzc;
    private zzify zza = zzifm.zzbM();

    static {
        zzfsj zzfsjVar = new zzfsj();
        zzb = zzfsjVar;
        zzifm.zzbu(zzfsj.class, zzfsjVar);
    }

    private zzfsj() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zzfsh.class});
        }
        if (iOrdinal == 3) {
            return new zzfsj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfsi(bArr);
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
        synchronized (zzfsj.class) {
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
