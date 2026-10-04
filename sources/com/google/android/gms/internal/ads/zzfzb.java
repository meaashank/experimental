package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfzb extends zzifm implements zzigx {
    private static final zzfzb zzf;
    private static volatile zzihe zzg;
    private int zza;
    private zzifu zzb = zzifm.zzbC();
    private String zzc = "";
    private String zzd = "";
    private String zze = "";

    static {
        zzfzb zzfzbVar = new zzfzb();
        zzf = zzfzbVar;
        zzifm.zzbu(zzfzb.class, zzfzbVar);
    }

    private zzfzb() {
    }

    public static zzfza zza() {
        return (zzfza) zzf.zzbn();
    }

    public final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzc = str;
    }

    public final /* synthetic */ void zzd(int i10) {
        zzifu zzifuVar = this.zzb;
        if (!zzifuVar.zza()) {
            this.zzb = zzifm.zzbD(zzifuVar);
        }
        this.zzb.zzi(2);
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zza", "zzb", zzfyz.zza, "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzfzb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfza(bArr);
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
        synchronized (zzfzb.class) {
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
