package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbdy extends zzifm implements zzigx {
    private static final zzbdy zze;
    private static volatile zzihe zzf;
    private int zza;
    private int zzb;
    private String zzc = "";
    private zzifu zzd = zzifm.zzbC();

    static {
        zzbdy zzbdyVar = new zzbdy();
        zze = zzbdyVar;
        zzifm.zzbu(zzbdy.class, zzbdyVar);
    }

    private zzbdy() {
    }

    public static zzbdx zza() {
        return (zzbdx) zze.zzbn();
    }

    public final /* synthetic */ void zzc(int i10) {
        this.zzb = 15;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zze, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003'", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzbdy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzbdx(bArr);
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
        synchronized (zzbdy.class) {
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
}
