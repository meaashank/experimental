package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfrp extends zzifm implements zzigx {
    private static final zzfrp zzc;
    private static volatile zzihe zzd;
    private int zza;
    private zzfrm zzb;

    static {
        zzfrp zzfrpVar = new zzfrp();
        zzc = zzfrpVar;
        zzifm.zzbu(zzfrp.class, zzfrpVar);
    }

    private zzfrp() {
    }

    public static zzfro zza() {
        return (zzfro) zzc.zzbn();
    }

    public final /* synthetic */ void zzb(zzfrm zzfrmVar) {
        zzfrmVar.getClass();
        this.zzb = zzfrmVar;
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
            return zzifm.zzbv(zzc, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzfrp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfro(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzd;
        if (zziheVar != null) {
            return zziheVar;
        }
        synchronized (zzfrp.class) {
            try {
                zzifhVar = zzd;
                if (zzifhVar == null) {
                    zzifhVar = new zzifh(zzc);
                    zzd = zzifhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzifhVar;
    }
}
