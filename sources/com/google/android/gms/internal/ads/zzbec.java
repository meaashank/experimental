package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbec extends zzifm implements zzigx {
    private static final zzbec zzd;
    private static volatile zzihe zze;
    private int zza;
    private zzben zzb;
    private zzifu zzc = zzifm.zzbC();

    static {
        zzbec zzbecVar = new zzbec();
        zzd = zzbecVar;
        zzifm.zzbu(zzbec.class, zzbecVar);
    }

    private zzbec() {
    }

    public static zzbec zzc(byte[] bArr, zziew zziewVar) throws zzige {
        return (zzbec) zzifm.zzbV(zzd, bArr, zziewVar);
    }

    public final zzben zza() {
        zzben zzbenVar = this.zzb;
        return zzbenVar == null ? zzben.zze() : zzbenVar;
    }

    public final List zzb() {
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
            return zzifm.zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002'", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzbec();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzbeb(bArr);
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
        synchronized (zzbec.class) {
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
