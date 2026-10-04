package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhvd extends zzifm implements zzigx {
    private static final zzhvd zzd;
    private static volatile zzihe zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzhvd zzhvdVar = new zzhvd();
        zzd = zzhvdVar;
        zzifm.zzbu(zzhvd.class, zzhvdVar);
    }

    private zzhvd() {
    }

    public static zzhvc zzd() {
        return (zzhvc) zzd.zzbn();
    }

    public static zzhvd zze() {
        return zzd;
    }

    public final zzhtl zza() {
        zzhtl zzhtlVarZzb = zzhtl.zzb(this.zza);
        return zzhtlVarZzb == null ? zzhtl.UNRECOGNIZED : zzhtlVarZzb;
    }

    public final zzhtl zzb() {
        zzhtl zzhtlVarZzb = zzhtl.zzb(this.zzb);
        return zzhtlVarZzb == null ? zzhtl.UNRECOGNIZED : zzhtlVarZzb;
    }

    public final int zzc() {
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
            return zzifm.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhvd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhvc(bArr);
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
        synchronized (zzhvd.class) {
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

    public final /* synthetic */ void zzg(zzhtl zzhtlVar) {
        this.zza = zzhtlVar.zza();
    }

    public final /* synthetic */ void zzh(zzhtl zzhtlVar) {
        this.zzb = zzhtlVar.zza();
    }

    public final /* synthetic */ void zzi(int i10) {
        this.zzc = i10;
    }
}
