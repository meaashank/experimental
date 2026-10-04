package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhuo extends zzifm implements zzigx {
    private static final zzhuo zzd;
    private static volatile zzihe zze;
    private int zza;
    private String zzb = "";
    private zzhtw zzc;

    static {
        zzhuo zzhuoVar = new zzhuo();
        zzd = zzhuoVar;
        zzifm.zzbu(zzhuo.class, zzhuoVar);
    }

    private zzhuo() {
    }

    public static zzhuo zzc(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhuo) zzifm.zzbT(zzd, zzieiVar, zziewVar);
    }

    public static zzhun zzd() {
        return (zzhun) zzd.zzbn();
    }

    public static zzhuo zze() {
        return zzd;
    }

    public final String zza() {
        return this.zzb;
    }

    public final zzhtw zzb() {
        zzhtw zzhtwVar = this.zzc;
        return zzhtwVar == null ? zzhtw.zzg() : zzhtwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhuo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhun(bArr);
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
        synchronized (zzhuo.class) {
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

    public final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final /* synthetic */ void zzh(zzhtw zzhtwVar) {
        zzhtwVar.getClass();
        this.zzc = zzhtwVar;
        this.zza |= 1;
    }
}
