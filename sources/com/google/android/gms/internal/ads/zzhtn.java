package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhtn extends zzifm implements zzigx {
    private static final zzhtn zze;
    private static volatile zzihe zzf;
    private int zza;
    private int zzb;
    private zzhtr zzc;
    private zziei zzd = zziei.zza;

    static {
        zzhtn zzhtnVar = new zzhtn();
        zze = zzhtnVar;
        zzifm.zzbu(zzhtn.class, zzhtnVar);
    }

    private zzhtn() {
    }

    public static zzhtn zzd(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhtn) zzifm.zzbT(zze, zzieiVar, zziewVar);
    }

    public static zzhtm zze() {
        return (zzhtm) zze.zzbn();
    }

    public static zzhtn zzg() {
        return zze;
    }

    public static zzihe zzh() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhtr zzb() {
        zzhtr zzhtrVar = this.zzc;
        return zzhtrVar == null ? zzhtr.zzd() : zzhtrVar;
    }

    public final zziei zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhtn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhtm(bArr);
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
        synchronized (zzhtn.class) {
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

    public final /* synthetic */ void zzi(zzhtr zzhtrVar) {
        zzhtrVar.getClass();
        this.zzc = zzhtrVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzj(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzd = zzieiVar;
    }
}
