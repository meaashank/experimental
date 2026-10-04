package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbee extends zzifm implements zzigx {
    private static final zzbee zzc;
    private static volatile zzihe zzd;
    private int zza;
    private zzaxe zzb;

    static {
        zzbee zzbeeVar = new zzbee();
        zzc = zzbeeVar;
        zzifm.zzbu(zzbee.class, zzbeeVar);
    }

    private zzbee() {
    }

    public static zzbed zza() {
        return (zzbed) zzc.zzbn();
    }

    public final /* synthetic */ void zzb(zzaxe zzaxeVar) {
        zzaxeVar.getClass();
        this.zzb = zzaxeVar;
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
            return zzifm.zzbv(zzc, "\u0004\u0001\u0000\u0001\u0012\u0012\u0001\u0000\u0000\u0000\u0012ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzbee();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzbed(bArr);
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
        synchronized (zzbee.class) {
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
