package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzilt extends zzifm implements zzigx {
    private static final zzilt zzh;
    private static volatile zzihe zzi;
    private int zza;
    private int zzb;
    private int zze;
    private String zzc = "";
    private zzifu zzd = zzifm.zzbC();
    private zzify zzf = zzifm.zzbM();
    private zziei zzg = zziei.zza;

    static {
        zzilt zziltVar = new zzilt();
        zzh = zziltVar;
        zzifm.zzbu(zzilt.class, zziltVar);
    }

    private zzilt() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzh, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", zzilr.class, "zzg"});
        }
        if (iOrdinal == 3) {
            return new zzilt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzils(bArr);
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
        synchronized (zzilt.class) {
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
