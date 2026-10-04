package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhef extends zzifm implements zzigx {
    private static final zzhef zzd;
    private static volatile zzihe zze;
    private int zza;
    private long zzb;
    private int zzc;

    static {
        zzhef zzhefVar = new zzhef();
        zzd = zzhefVar;
        zzifm.zzbu(zzhef.class, zzhefVar);
    }

    private zzhef() {
    }

    public static zzhee zza() {
        return (zzhee) zzd.zzbn();
    }

    public final /* synthetic */ void zzb(long j10) {
        this.zza |= 1;
        this.zzb = j10;
    }

    public final /* synthetic */ void zzd(int i10) {
        this.zzc = i10 - 1;
        this.zza |= 2;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", "zzc", zzhec.zza});
        }
        if (iOrdinal == 3) {
            return new zzhef();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhee(bArr);
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
        synchronized (zzhef.class) {
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
