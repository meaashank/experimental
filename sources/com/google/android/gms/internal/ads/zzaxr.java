package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaxr extends zzifm implements zzigx {
    private static final zzaxr zzh;
    private static volatile zzihe zzi;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zzaxr zzaxrVar = new zzaxr();
        zzh = zzaxrVar;
        zzifm.zzbu(zzaxr.class, zzaxrVar);
    }

    private zzaxr() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzh, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new zzaxr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaxq(bArr);
        }
        if (iOrdinal == 5) {
            return zzh;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzi;
        if (zziheVar != null) {
            return zziheVar;
        }
        synchronized (zzaxr.class) {
            try {
                zzifhVar = zzi;
                if (zzifhVar == null) {
                    zzifhVar = new zzifh(zzh);
                    zzi = zzifhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzifhVar;
    }
}
