package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzayz extends zzifm implements zzigx {
    private static final zzayz zzj;
    private static volatile zzihe zzk;
    private int zza;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;

    static {
        zzayz zzayzVar = new zzayz();
        zzj = zzayzVar;
        zzifm.zzbu(zzayz.class, zzayzVar);
    }

    private zzayz() {
    }

    public static zzayy zza() {
        return (zzayy) zzj.zzbn();
    }

    public final /* synthetic */ void zzb(long j10) {
        this.zza |= 1;
        this.zzb = j10;
    }

    public final /* synthetic */ void zzc(long j10) {
        this.zza |= 4;
        this.zzd = j10;
    }

    public final /* synthetic */ void zzd(long j10) {
        this.zza |= 8;
        this.zze = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzj, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new zzayz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzayy(bArr);
        }
        if (iOrdinal == 5) {
            return zzj;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzk;
        if (zziheVar != null) {
            return zziheVar;
        }
        synchronized (zzayz.class) {
            try {
                zzifhVar = zzk;
                if (zzifhVar == null) {
                    zzifhVar = new zzifh(zzj);
                    zzk = zzifhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzifhVar;
    }

    public final /* synthetic */ void zze(long j10) {
        this.zza |= 16;
        this.zzf = j10;
    }

    public final /* synthetic */ void zzg(long j10) {
        this.zza |= 32;
        this.zzg = j10;
    }
}
