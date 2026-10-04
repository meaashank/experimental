package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaze extends zzifm implements zzigx {
    private static final zzaze zzc;
    private static volatile zzihe zzd;
    private zzifx zza = zzifm.zzbE();
    private zzifx zzb = zzifm.zzbE();

    static {
        zzaze zzazeVar = new zzaze();
        zzc = zzazeVar;
        zzifm.zzbu(zzaze.class, zzazeVar);
    }

    private zzaze() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzc, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001%\u0002%", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzaze();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzazd(bArr);
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
        synchronized (zzaze.class) {
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
