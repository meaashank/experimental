package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhuv extends zzifm implements zzigx {
    private static final zzhuv zzb;
    private static volatile zzihe zzc;
    private int zza;

    static {
        zzhuv zzhuvVar = new zzhuv();
        zzb = zzhuvVar;
        zzifm.zzbu(zzhuv.class, zzhuvVar);
    }

    private zzhuv() {
    }

    public static zzhuu zzb() {
        return (zzhuu) zzb.zzbn();
    }

    public static zzhuv zzc() {
        return zzb;
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
            return zzifm.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzhuv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhuu(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzc;
        if (zziheVar != null) {
            return zziheVar;
        }
        synchronized (zzhuv.class) {
            try {
                zzifhVar = zzc;
                if (zzifhVar == null) {
                    zzifhVar = new zzifh(zzb);
                    zzc = zzifhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzifhVar;
    }
}
