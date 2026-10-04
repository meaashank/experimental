package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzben extends zzifm implements zzigx {
    private static final zzben zzd;
    private static volatile zzihe zze;
    private int zza;
    private zzbep zzb;
    private zziei zzc = zziei.zza;

    static {
        zzben zzbenVar = new zzben();
        zzd = zzbenVar;
        zzifm.zzbu(zzben.class, zzbenVar);
    }

    private zzben() {
    }

    public static zzben zze() {
        return zzd;
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final zzbep zzb() {
        zzbep zzbepVar = this.zzb;
        return zzbepVar == null ? zzbep.zzd() : zzbepVar;
    }

    public final boolean zzc() {
        return (this.zza & 2) != 0;
    }

    public final zziei zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzben();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzbem(bArr);
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
        synchronized (zzben.class) {
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
