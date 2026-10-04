package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfqv extends zzifm implements zzigx {
    private static final zzfqv zzi;
    private static volatile zzihe zzj;
    private int zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private int zzf;
    private int zzg;
    private boolean zzh;

    static {
        zzfqv zzfqvVar = new zzfqv();
        zzi = zzfqvVar;
        zzifm.zzbu(zzfqv.class, zzfqvVar);
    }

    private zzfqv() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzi, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\f\u0005Ȉ\u0006\u0004\u0007\u0004\b\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iOrdinal == 3) {
            return new zzfqv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfqu(bArr);
        }
        if (iOrdinal == 5) {
            return zzi;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzj;
        if (zziheVar != null) {
            return zziheVar;
        }
        synchronized (zzfqv.class) {
            try {
                zzifhVar = zzj;
                if (zzifhVar == null) {
                    zzifhVar = new zzifh(zzi);
                    zzj = zzifhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzifhVar;
    }
}
