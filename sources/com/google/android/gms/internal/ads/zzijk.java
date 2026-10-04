package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzijk extends zzifm implements zzigx {
    private static final zzijk zze;
    private static volatile zzihe zzf;
    private int zza;
    private int zzb;
    private long zzc;
    private zziei zzd = zziei.zza;

    static {
        zzijk zzijkVar = new zzijk();
        zze = zzijkVar;
        zzifm.zzbu(zzijk.class, zzijkVar);
    }

    private zzijk() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", zzijj.zza, "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzijk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zziji(bArr);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzf;
        if (zziheVar != null) {
            return zziheVar;
        }
        synchronized (zzijk.class) {
            try {
                zzifhVar = zzf;
                if (zzifhVar == null) {
                    zzifhVar = new zzifh(zze);
                    zzf = zzifhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzifhVar;
    }
}
