package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzayr extends zzifm implements zzigx {
    private static final zzayr zzd;
    private static volatile zzihe zze;
    private int zza;
    private int zzb;
    private long zzc = -1;

    static {
        zzayr zzayrVar = new zzayr();
        zzd = zzayrVar;
        zzifm.zzbu(zzayr.class, zzayrVar);
    }

    private zzayr() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zza", "zzb", zzaye.zza, "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzayr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzayq(bArr);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzihe zziheVar = zze;
        if (zziheVar != null) {
            return zziheVar;
        }
        synchronized (zzayr.class) {
            try {
                zzifhVar = zze;
                if (zzifhVar == null) {
                    zzifhVar = new zzifh(zzd);
                    zze = zzifhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzifhVar;
    }
}
