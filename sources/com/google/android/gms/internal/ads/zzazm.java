package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzazm extends zzifm implements zzigx {
    private static final zzazm zzi;
    private static volatile zzihe zzj;
    private int zza;
    private long zzd;
    private long zzf;
    private long zzg;
    private String zzb = "";
    private String zzc = "";
    private String zze = "D";
    private String zzh = "";

    static {
        zzazm zzazmVar = new zzazm();
        zzi = zzazmVar;
        zzifm.zzbu(zzazm.class, zzazmVar);
    }

    private zzazm() {
    }

    public static zzazl zza() {
        return (zzazl) zzi.zzbn();
    }

    public final /* synthetic */ void zzb(String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void zzc(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void zzd(long j10) {
        this.zza |= 4;
        this.zzd = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzi, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iOrdinal == 3) {
            return new zzazm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzazl(bArr);
        }
        if (iOrdinal == 5) {
            return zzi;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzj;
        if (zziheVar != null) {
            return zziheVar;
        }
        synchronized (zzazm.class) {
            try {
                zzifhVar = zzj;
                if (zzifhVar == null) {
                    zzifhVar = new zzifh(zzi);
                    zzj = zzifhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzifhVar;
    }

    public final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void zzg(long j10) {
        this.zza |= 16;
        this.zzf = j10;
    }

    public final /* synthetic */ void zzh(long j10) {
        this.zza |= 32;
        this.zzg = j10;
    }

    public final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zza |= 64;
        this.zzh = str;
    }
}
