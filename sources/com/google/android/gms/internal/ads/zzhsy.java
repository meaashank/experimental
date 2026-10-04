package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhsy extends zzifm implements zzigx {
    private static final zzhsy zzd;
    private static volatile zzihe zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzhsy zzhsyVar = new zzhsy();
        zzd = zzhsyVar;
        zzifm.zzbu(zzhsy.class, zzhsyVar);
    }

    private zzhsy() {
    }

    public static zzhsx zzb() {
        return (zzhsx) zzd.zzbn();
    }

    public static zzhsy zzc() {
        return zzd;
    }

    public final zzhtl zza() {
        zzhtl zzhtlVarZzb = zzhtl.zzb(this.zza);
        return zzhtlVarZzb == null ? zzhtl.UNRECOGNIZED : zzhtlVarZzb;
    }

    public final /* synthetic */ void zzd(zzhtl zzhtlVar) {
        this.zza = zzhtlVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhsy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhsx(bArr);
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
        synchronized (zzhsy.class) {
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

    public final int zzg() {
        int i10 = this.zzb;
        int i11 = i10 != 0 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? 0 : 7 : 6 : 5 : 4 : 2;
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final int zzh() {
        int i10 = this.zzc;
        int i11 = i10 != 0 ? i10 != 1 ? i10 != 2 ? 0 : 4 : 3 : 2;
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final /* synthetic */ void zzi(int i10) {
        this.zzb = zzhtk.zza(i10);
    }

    public final /* synthetic */ void zzj(int i10) {
        this.zzc = zzhtd.zza(i10);
    }
}
