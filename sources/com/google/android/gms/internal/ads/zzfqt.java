package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfqt extends zzifm implements zzigx {
    private static final zzfqt zzc;
    private static volatile zzihe zzd;
    private int zza;
    private long zzb;

    static {
        zzfqt zzfqtVar = new zzfqt();
        zzc = zzfqtVar;
        zzifm.zzbu(zzfqt.class, zzfqtVar);
    }

    private zzfqt() {
    }

    public static zzfqs zza() {
        return (zzfqs) zzc.zzbn();
    }

    public final /* synthetic */ void zzb(long j10) {
        this.zzb = j10;
    }

    public final /* synthetic */ void zzd(int i10) {
        this.zza = i10 - 2;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzfqt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfqs(bArr);
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
        synchronized (zzfqt.class) {
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
