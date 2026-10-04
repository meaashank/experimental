package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzimh extends zzifm implements zzigx {
    private static final zzimh zzn;
    private static volatile zzihe zzo;
    private int zza;
    private int zzd;
    private boolean zzf;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private zzimm zzk;
    private zzimg zzm;
    private String zzb = "";
    private String zzc = "";
    private int zze = 1;
    private String zzg = "";
    private String zzl = "";

    static {
        zzimh zzimhVar = new zzimh();
        zzn = zzimhVar;
        zzifm.zzbu(zzimh.class, zzimhVar);
    }

    private zzimh() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzn, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bင\u0007\t᠌\b\nဉ\t\u000bဈ\n\fဉ\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", zzimq.zza, "zze", zzimp.zza, "zzf", "zzg", "zzh", "zzi", "zzj", zzimi.zza, "zzk", "zzl", "zzm"});
        }
        if (iOrdinal == 3) {
            return new zzimh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzime(bArr);
        }
        if (iOrdinal == 5) {
            return zzn;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzo;
        if (zziheVar != null) {
            return zziheVar;
        }
        synchronized (zzimh.class) {
            try {
                zzifhVar = zzo;
                if (zzifhVar == null) {
                    zzifhVar = new zzifh(zzn);
                    zzo = zzifhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzifhVar;
    }
}
