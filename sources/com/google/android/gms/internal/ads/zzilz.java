package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzilz extends zzifm implements zzigx {
    private static final zzilz zzp;
    private static volatile zzihe zzu;
    private int zza;
    private boolean zzh;
    private double zzi;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private String zzb = "";
    private String zzc = "";
    private int zzd = 4;
    private zzify zze = zzifm.zzbM();
    private String zzf = "";
    private String zzg = "";
    private zzify zzj = zzifm.zzbM();

    static {
        zzilz zzilzVar = new zzilz();
        zzp = zzilzVar;
        zzifm.zzbu(zzilz.class, zzilzVar);
    }

    private zzilz() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzp, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zza", "zzb", "zzd", zzily.zza, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzilx.class, "zzc", "zzk", zzilv.zza, "zzl", "zzm", "zzn", "zzo"});
        }
        if (iOrdinal == 3) {
            return new zzilz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzilu(bArr);
        }
        if (iOrdinal == 5) {
            return zzp;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzu;
        if (zziheVar != null) {
            return zziheVar;
        }
        synchronized (zzilz.class) {
            try {
                zzifhVar = zzu;
                if (zzifhVar == null) {
                    zzifhVar = new zzifh(zzp);
                    zzu = zzifhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzifhVar;
    }
}
