package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfsf extends zzifm implements zzigx {
    private static final zzfsf zzg;
    private static volatile zzihe zzh;
    private int zzb;
    private int zzc;
    private boolean zzd;
    private boolean zzf;
    private String zza = "";
    private String zze = "";

    static {
        zzfsf zzfsfVar = new zzfsf();
        zzg = zzfsfVar;
        zzifm.zzbu(zzfsf.class, zzfsfVar);
    }

    private zzfsf() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007\u0005Ȉ\u0006\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzfsf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfse(bArr);
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
        synchronized (zzfsf.class) {
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
