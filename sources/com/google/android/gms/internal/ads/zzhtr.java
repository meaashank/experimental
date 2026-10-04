package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhtr extends zzifm implements zzigx {
    private static final zzhtr zzc;
    private static volatile zzihe zzd;
    private int zza;
    private int zzb;

    static {
        zzhtr zzhtrVar = new zzhtr();
        zzc = zzhtrVar;
        zzifm.zzbu(zzhtr.class, zzhtrVar);
    }

    private zzhtr() {
    }

    public static zzhtq zzc() {
        return (zzhtq) zzc.zzbn();
    }

    public static zzhtr zzd() {
        return zzc;
    }

    public final zzhtl zza() {
        zzhtl zzhtlVarZzb = zzhtl.zzb(this.zza);
        return zzhtlVarZzb == null ? zzhtl.UNRECOGNIZED : zzhtlVarZzb;
    }

    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzhtr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhtq(bArr);
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
        synchronized (zzhtr.class) {
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

    public final /* synthetic */ void zze(zzhtl zzhtlVar) {
        this.zza = zzhtlVar.zza();
    }

    public final /* synthetic */ void zzg(int i10) {
        this.zzb = i10;
    }
}
