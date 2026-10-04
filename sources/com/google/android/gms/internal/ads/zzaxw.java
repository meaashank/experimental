package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaxw extends zzifm implements zzigx {
    private static final zzaxw zzi;
    private static volatile zzihe zzj;
    private int zza;
    private long zzb;
    private long zzc;
    private int zzd;
    private long zzg;
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        zzaxw zzaxwVar = new zzaxw();
        zzi = zzaxwVar;
        zzifm.zzbu(zzaxw.class, zzaxwVar);
    }

    private zzaxw() {
    }

    public static zzaxv zza() {
        return (zzaxv) zzi.zzbn();
    }

    public final /* synthetic */ void zzb(long j10) {
        this.zza |= 1;
        this.zzb = j10;
    }

    public final /* synthetic */ void zzc(long j10) {
        this.zza |= 2;
        this.zzc = j10;
    }

    public final /* synthetic */ void zzd(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzi, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", zzaxx.zza, "zze", "zzf", "zzg", "zzh"});
        }
        if (iOrdinal == 3) {
            return new zzaxw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaxv(bArr);
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
        synchronized (zzaxw.class) {
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
        this.zza |= 16;
        this.zzf = str;
    }

    public final /* synthetic */ void zzg(long j10) {
        this.zza |= 32;
        this.zzg = j10;
    }

    public final /* synthetic */ void zzh(String str) {
        this.zza |= 64;
        this.zzh = str;
    }

    public final /* synthetic */ void zzj(int i10) {
        this.zzd = i10 - 1;
        this.zza |= 4;
    }
}
