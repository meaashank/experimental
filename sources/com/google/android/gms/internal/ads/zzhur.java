package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class zzhur extends zzifm implements zzigx {
    public static final /* synthetic */ int zza = 0;
    private static final zzhur zzd;
    private static volatile zzihe zze;
    private String zzb = "";
    private zzify zzc = zzifm.zzbM();

    static {
        zzhur zzhurVar = new zzhur();
        zzd = zzhurVar;
        zzifm.zzbu(zzhur.class, zzhurVar);
    }

    private zzhur() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzd, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzb", "zzc", zzhty.class});
        }
        if (iOrdinal == 3) {
            return new zzhur();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhuq(bArr);
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
        synchronized (zzhur.class) {
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
