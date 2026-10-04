package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzilo extends zzifm implements zzigx {
    private static final zzilo zzd;
    private static volatile zzihe zze;
    private int zza;
    private int zzb;
    private String zzc = "";

    static {
        zzilo zziloVar = new zzilo();
        zzd = zziloVar;
        zzifm.zzbu(zzilo.class, zziloVar);
    }

    private zzilo() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zza", "zzb", zziln.zza, "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzilo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzilm(bArr);
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
        synchronized (zzilo.class) {
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
