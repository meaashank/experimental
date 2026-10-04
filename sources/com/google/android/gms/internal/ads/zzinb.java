package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzinb extends zzifm implements zzigx {
    private static final zzinb zzd;
    private static volatile zzihe zze;
    private int zza;
    private String zzb = "";
    private zzify zzc = zzifm.zzbM();

    static {
        zzinb zzinbVar = new zzinb();
        zzd = zzinbVar;
        zzifm.zzbu(zzinb.class, zzinbVar);
    }

    private zzinb() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zza", "zzb", "zzc", zzimz.class});
        }
        if (iOrdinal == 3) {
            return new zzinb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzina(bArr);
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
        synchronized (zzinb.class) {
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
