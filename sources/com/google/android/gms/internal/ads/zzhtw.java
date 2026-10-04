package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhtw extends zzifm implements zzigx {
    private static final zzhtw zzd;
    private static volatile zzihe zze;
    private String zza = "";
    private zziei zzb = zziei.zza;
    private int zzc;

    static {
        zzhtw zzhtwVar = new zzhtw();
        zzd = zzhtwVar;
        zzifm.zzbu(zzhtw.class, zzhtwVar);
    }

    private zzhtw() {
    }

    public static zzhtw zzc(byte[] bArr, zziew zziewVar) throws zzige {
        return (zzhtw) zzifm.zzbV(zzd, bArr, zziewVar);
    }

    public static zzhtv zzd() {
        return (zzhtv) zzd.zzbn();
    }

    public static zzhtv zze(zzhtw zzhtwVar) {
        return (zzhtv) zzd.zzbo(zzhtwVar);
    }

    public static zzhtw zzg() {
        return zzd;
    }

    public final String zza() {
        return this.zza;
    }

    public final zziei zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhtw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhtv(bArr);
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
        synchronized (zzhtw.class) {
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

    public final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void zzi(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzb = zzieiVar;
    }

    public final int zzk() {
        int iZzb = zzhup.zzb(this.zzc);
        if (iZzb == 0) {
            return 1;
        }
        return iZzb;
    }

    public final /* synthetic */ void zzl(int i10) {
        this.zzc = zzhup.zza(i10);
    }
}
