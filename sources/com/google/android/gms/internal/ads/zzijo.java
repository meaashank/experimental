package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzijo extends zzifm implements zzigx {
    private static final zzijo zzy;
    private static volatile zzihe zzz;
    private int zza;
    private int zzb;
    private boolean zzc;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzp;
    private long zzu;
    private boolean zzw;
    private String zzd = "";
    private zzify zze = zzifm.zzbM();
    private String zzj = "";
    private zzify zzo = zzifm.zzbM();
    private zzifu zzv = zzifm.zzbC();
    private zzifu zzx = zzifm.zzbC();

    static {
        zzijo zzijoVar = new zzijo();
        zzy = zzijoVar;
        zzifm.zzbu(zzijo.class, zzijoVar);
    }

    private zzijo() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzy, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zza", "zzb", zzijn.zza, "zzc", "zzd", "zze", "zzf", zzijl.zza, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzijk.class, "zzp", "zzu", "zzv", zzijc.zza(), "zzw", "zzx", zzijm.zza});
        }
        if (iOrdinal == 3) {
            return new zzijo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzijh(bArr);
        }
        if (iOrdinal == 5) {
            return zzy;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzz;
        if (zziheVar != null) {
            return zziheVar;
        }
        synchronized (zzijo.class) {
            try {
                zzifhVar = zzz;
                if (zzifhVar == null) {
                    zzifhVar = new zzifh(zzy);
                    zzz = zzifhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzifhVar;
    }
}
