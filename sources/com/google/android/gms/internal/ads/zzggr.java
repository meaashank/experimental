package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzggr extends zzifm implements zzigx {
    private static final zzggr zzf;
    private static volatile zzihe zzg;
    private int zza;
    private zzggt zzb;
    private zziei zzc;
    private zziei zzd;
    private int zze;

    static {
        zzggr zzggrVar = new zzggr();
        zzf = zzggrVar;
        zzifm.zzbu(zzggr.class, zzggrVar);
    }

    private zzggr() {
        zziei zzieiVar = zziei.zza;
        this.zzc = zzieiVar;
        this.zzd = zzieiVar;
    }

    public static zzggq zzd() {
        return (zzggq) zzf.zzbn();
    }

    public final zzggt zza() {
        zzggt zzggtVar = this.zzb;
        return zzggtVar == null ? zzggt.zzh() : zzggtVar;
    }

    public final zziei zzb() {
        return this.zzc;
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
            return zzifm.zzbv(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", zzghh.zza});
        }
        if (iOrdinal == 3) {
            return new zzggr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzggq(bArr);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzg;
        if (zziheVar != null) {
            return zziheVar;
        }
        synchronized (zzggr.class) {
            try {
                zzifhVar = zzg;
                if (zzifhVar == null) {
                    zzifhVar = new zzifh(zzf);
                    zzg = zzifhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzifhVar;
    }

    public final /* synthetic */ void zze(zzggt zzggtVar) {
        zzggtVar.getClass();
        this.zzb = zzggtVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzg(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zza |= 2;
        this.zzc = zzieiVar;
    }

    public final /* synthetic */ void zzh(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zza |= 4;
        this.zzd = zzieiVar;
    }

    public final int zzj() {
        int iZza = zzghi.zza(this.zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final /* synthetic */ void zzk(int i10) {
        this.zze = i10 - 1;
        this.zza |= 8;
    }
}
