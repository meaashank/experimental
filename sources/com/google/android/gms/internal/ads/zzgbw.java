package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgbw extends zzifm implements zzigx {
    private static final zzgbw zzn;
    private static volatile zzihe zzo;
    private int zza;
    private long zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private String zzb = "";
    private zzifx zzk = zzifm.zzbE();
    private zzifx zzl = zzifm.zzbE();
    private zzifx zzm = zzifm.zzbE();

    static {
        zzgbw zzgbwVar = new zzgbw();
        zzn = zzgbwVar;
        zzifm.zzbu(zzgbw.class, zzgbwVar);
    }

    private zzgbw() {
    }

    public static zzgbw zzp() {
        return zzn;
    }

    public final /* synthetic */ void zzA(long j10) {
        zzifx zzifxVar = this.zzl;
        if (!zzifxVar.zza()) {
            this.zzl = zzifm.zzbF(zzifxVar);
        }
        this.zzl.zzd(j10);
    }

    public final /* synthetic */ void zzB(long j10) {
        zzifx zzifxVar = this.zzm;
        if (!zzifxVar.zza()) {
            this.zzm = zzifm.zzbF(zzifxVar);
        }
        this.zzm.zzd(j10);
    }

    public final /* synthetic */ void zzC() {
        this.zzm = zzifm.zzbE();
    }

    public final String zza() {
        return this.zzb;
    }

    public final long zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final boolean zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzn, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001Ȉ\u0002ဂ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဂ\u0004\u0007\u0002\bဂ\u0005\tဂ\u0006\n%\u000b%\f%", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (iOrdinal == 3) {
            return new zzgbw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzgbv(bArr);
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
        synchronized (zzgbw.class) {
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

    public final boolean zze() {
        return this.zzf;
    }

    public final long zzg() {
        return this.zzg;
    }

    public final long zzh() {
        return this.zzh;
    }

    public final long zzi() {
        return this.zzi;
    }

    public final boolean zzj() {
        return (this.zza & 64) != 0;
    }

    public final List zzk() {
        return this.zzk;
    }

    public final int zzl() {
        return this.zzk.size();
    }

    public final int zzm() {
        return this.zzl.size();
    }

    public final List zzn() {
        return this.zzm;
    }

    public final int zzo() {
        return this.zzm.size();
    }

    public final /* synthetic */ void zzq(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final /* synthetic */ void zzr(long j10) {
        this.zza |= 1;
        this.zzc = j10;
    }

    public final /* synthetic */ void zzs(int i10) {
        this.zza |= 2;
        this.zzd = i10;
    }

    public final /* synthetic */ void zzt(boolean z10) {
        this.zza |= 4;
        this.zze = true;
    }

    public final /* synthetic */ void zzu(boolean z10) {
        this.zza |= 8;
        this.zzf = true;
    }

    public final /* synthetic */ void zzv(long j10) {
        this.zza |= 16;
        this.zzg = j10;
    }

    public final /* synthetic */ void zzw(long j10) {
        this.zzh = j10;
    }

    public final /* synthetic */ void zzx(long j10) {
        this.zza |= 32;
        this.zzi = j10;
    }

    public final /* synthetic */ void zzy(long j10) {
        this.zza |= 64;
        this.zzj = j10;
    }

    public final /* synthetic */ void zzz(long j10) {
        zzifx zzifxVar = this.zzk;
        if (!zzifxVar.zza()) {
            this.zzk = zzifm.zzbF(zzifxVar);
        }
        this.zzk.zzd(j10);
    }
}
