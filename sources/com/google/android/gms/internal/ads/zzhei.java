package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhei extends zzifm implements zzigx {
    private static final zzhei zzf;
    private static volatile zzihe zzg;
    private int zza;
    private zzhef zzb;
    private zzihy zzc;
    private zzify zzd = zzifm.zzbM();
    private zzifx zze = zzifm.zzbE();

    static {
        zzhei zzheiVar = new zzhei();
        zzf = zzheiVar;
        zzifm.zzbu(zzhei.class, zzheiVar);
    }

    private zzhei() {
    }

    public static zzheh zza() {
        return (zzheh) zzf.zzbn();
    }

    public final /* synthetic */ void zzb(zzhef zzhefVar) {
        zzhefVar.getClass();
        this.zzb = zzhefVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzc(Iterable iterable) {
        zzifx zzifxVar = this.zze;
        if (!zzifxVar.zza()) {
            this.zze = zzifm.zzbF(zzifxVar);
        }
        zzidr.zzaW(iterable, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004%", new Object[]{"zza", "zzb", "zzc", "zzd", zzihy.class, "zze"});
        }
        if (iOrdinal == 3) {
            return new zzhei();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzheh(bArr);
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
        synchronized (zzhei.class) {
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
}
