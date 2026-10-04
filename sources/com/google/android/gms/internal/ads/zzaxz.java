package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaxz extends zzifm implements zzigx {
    private static final zzaxz zzg;
    private static volatile zzihe zzh;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzb = 100;
    private long zze = 300;
    private long zzf = 1000;

    static {
        zzaxz zzaxzVar = new zzaxz();
        zzg = zzaxzVar;
        zzifm.zzbu(zzaxz.class, zzaxzVar);
    }

    private zzaxz() {
    }

    public static zzaxz zza() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzaxz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaxy(bArr);
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
        synchronized (zzaxz.class) {
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
