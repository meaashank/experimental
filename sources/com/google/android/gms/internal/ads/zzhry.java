package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhry extends zzifm implements zzigx {
    private static final zzhry zze;
    private static volatile zzihe zzf;
    private int zza;
    private int zzb;
    private zzhsc zzc;
    private zziei zzd = zziei.zza;

    static {
        zzhry zzhryVar = new zzhry();
        zze = zzhryVar;
        zzifm.zzbu(zzhry.class, zzhryVar);
    }

    private zzhry() {
    }

    public static zzhrx zzd() {
        return (zzhrx) zze.zzbn();
    }

    public static zzhry zze() {
        return zze;
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhsc zzb() {
        zzhsc zzhscVar = this.zzc;
        return zzhscVar == null ? zzhsc.zzc() : zzhscVar;
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
            return new zzhry();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhrx(bArr);
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
        synchronized (zzhry.class) {
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

    public final /* synthetic */ void zzg(zzhsc zzhscVar) {
        zzhscVar.getClass();
        this.zzc = zzhscVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzh(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzd = zzieiVar;
    }
}
