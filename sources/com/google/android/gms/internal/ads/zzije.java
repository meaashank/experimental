package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzije extends zzifm implements zzigx {
    private static final zzije zzd;
    private static volatile zzihe zze;
    private int zza;
    private long zzb;
    private long zzc;

    static {
        zzije zzijeVar = new zzije();
        zzd = zzijeVar;
        zzifm.zzbu(zzije.class, zzijeVar);
    }

    private zzije() {
    }

    public static zzijd zzc() {
        return (zzijd) zzd.zzbn();
    }

    public final /* synthetic */ void zzd(int i10) {
        this.zza = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzije();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzijd(bArr);
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
        synchronized (zzije.class) {
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

    public final /* synthetic */ void zze(long j10) {
        this.zzb = j10;
    }

    public final /* synthetic */ void zzg(long j10) {
        this.zzc = j10;
    }
}
