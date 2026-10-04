package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhuk extends zzifm implements zzigx {
    private static final zzhuk zzb;
    private static volatile zzihe zzc;
    private String zza = "";

    static {
        zzhuk zzhukVar = new zzhuk();
        zzb = zzhukVar;
        zzifm.zzbu(zzhuk.class, zzhukVar);
    }

    private zzhuk() {
    }

    public static zzhuk zzb(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhuk) zzifm.zzbT(zzb, zzieiVar, zziewVar);
    }

    public static zzhuj zzc() {
        return (zzhuj) zzb.zzbn();
    }

    public static zzhuk zzd() {
        return zzb;
    }

    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzhuk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhuj(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzc;
        if (zziheVar != null) {
            return zziheVar;
        }
        synchronized (zzhuk.class) {
            try {
                zzifhVar = zzc;
                if (zzifhVar == null) {
                    zzifhVar = new zzifh(zzb);
                    zzc = zzifhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzifhVar;
    }

    public final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza = str;
    }
}
