package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaxe extends zzifm implements zzigx {
    private static final zzaxe zzu;
    private static volatile zzihe zzv;
    private int zza;
    private long zzc;
    private int zzg;
    private long zzi;
    private long zzl;
    private long zzm;
    private int zzo;
    private int zzp;
    private zzify zzb = zzifm.zzbM();
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";
    private zzifu zzn = zzifm.zzbC();

    static {
        zzaxe zzaxeVar = new zzaxe();
        zzu = zzaxeVar;
        zzifm.zzbu(zzaxe.class, zzaxeVar);
    }

    private zzaxe() {
    }

    public static zzaxd zza() {
        return (zzaxd) zzu.zzbn();
    }

    public final /* synthetic */ void zzb(zzaxw zzaxwVar) {
        zzaxwVar.getClass();
        zzify zzifyVar = this.zzb;
        if (!zzifyVar.zza()) {
            this.zzb = zzifm.zzbN(zzifyVar);
        }
        this.zzb.add(zzaxwVar);
    }

    public final /* synthetic */ void zzc() {
        this.zzb = zzifm.zzbM();
    }

    public final /* synthetic */ void zzd(long j10) {
        this.zza |= 1;
        this.zzc = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzu, "\u0004\u000f\u0000\u0001\bB\u000f\u0000\u0002\u0000\b\u001b\u0015ဂ\u0000\u0016ဈ\u0001\u0017ဈ\u0002\u0018ဈ\u0003\u0019᠌\u0004(ဈ\u0005)ဂ\u0006<ဈ\u0007=ဈ\b>ဂ\t?ဂ\n@'Aဌ\u000bBဌ\f", new Object[]{"zza", "zzb", zzaxw.class, "zzc", "zzd", "zze", "zzf", "zzg", zzaxu.zza, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        if (iOrdinal == 3) {
            return new zzaxe();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaxd(bArr);
        }
        if (iOrdinal == 5) {
            return zzu;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzv;
        if (zziheVar != null) {
            return zziheVar;
        }
        synchronized (zzaxe.class) {
            try {
                zzifhVar = zzv;
                if (zzifhVar == null) {
                    zzifhVar = new zzifh(zzu);
                    zzv = zzifhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzifhVar;
    }

    public final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzd = str;
    }

    public final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zza |= 4;
        this.zze = str;
    }

    public final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zza |= 8;
        this.zzf = str;
    }

    public final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzh = str;
    }

    public final /* synthetic */ void zzj(long j10) {
        this.zza |= 64;
        this.zzi = j10;
    }

    public final /* synthetic */ void zzk(String str) {
        str.getClass();
        this.zza |= 128;
        this.zzj = str;
    }

    public final /* synthetic */ void zzl(String str) {
        str.getClass();
        this.zza |= 256;
        this.zzk = str;
    }

    public final /* synthetic */ void zzm(long j10) {
        this.zza |= 512;
        this.zzl = j10;
    }

    public final /* synthetic */ void zzn(long j10) {
        this.zza |= 1024;
        this.zzm = j10;
    }

    public final /* synthetic */ void zzo(Iterable iterable) {
        zzifu zzifuVar = this.zzn;
        if (!zzifuVar.zza()) {
            this.zzn = zzifm.zzbD(zzifuVar);
        }
        zzidr.zzaW(iterable, this.zzn);
    }

    public final /* synthetic */ void zzq(int i10) {
        this.zzg = i10 - 1;
        this.zza |= 16;
    }

    public final /* synthetic */ void zzr(int i10) {
        this.zzo = zzbel.zza(i10);
        this.zza |= 2048;
    }

    public final /* synthetic */ void zzs(int i10) {
        this.zzp = 1;
        this.zza |= 4096;
    }
}
