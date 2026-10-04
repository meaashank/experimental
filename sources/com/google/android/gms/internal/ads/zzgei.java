package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgei extends zzifm implements zzigx {
    private static final zzgei zzE;
    private static volatile zzihe zzF;
    private boolean zzC;
    private boolean zzD;
    private int zza;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private int zzh;
    private zzgfa zzj;
    private boolean zzk;
    private zzgfc zzn;
    private int zzc = 1;
    private boolean zzd = true;
    private String zzg = "unknown_host";
    private boolean zzi = true;
    private long zzl = 100;
    private long zzm = 2000;
    private long zzo = 10;
    private long zzp = 100;
    private long zzu = 20000;
    private String zzv = "";
    private String zzw = "";
    private long zzx = 500;
    private long zzy = androidx.appcompat.widget.e0.f86341n;
    private boolean zzz = true;
    private boolean zzA = true;
    private boolean zzB = true;

    static {
        zzgei zzgeiVar = new zzgei();
        zzE = zzgeiVar;
        zzifm.zzbu(zzgei.class, zzgeiVar);
    }

    private zzgei() {
    }

    public static zzgeg zzx() {
        return (zzgeg) zzE.zzbn();
    }

    public final /* synthetic */ void zzA(boolean z10) {
        this.zza |= 16;
        this.zzf = z10;
    }

    public final /* synthetic */ void zzB(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzg = str;
    }

    public final /* synthetic */ void zzC(zzgfa zzgfaVar) {
        zzgfaVar.getClass();
        this.zzj = zzgfaVar;
        this.zza |= 256;
    }

    public final /* synthetic */ void zzD(long j10) {
        this.zza |= 1024;
        this.zzl = j10;
    }

    public final /* synthetic */ void zzE(long j10) {
        this.zza |= 2048;
        this.zzm = j10;
    }

    public final /* synthetic */ void zzF(zzgfc zzgfcVar) {
        zzgfcVar.getClass();
        this.zzn = zzgfcVar;
        this.zza |= 4096;
    }

    public final /* synthetic */ void zzG(long j10) {
        this.zza |= 524288;
        this.zzy = j10;
    }

    public final /* synthetic */ void zzH(boolean z10) {
        this.zza |= 1048576;
        this.zzz = z10;
    }

    public final /* synthetic */ void zzI(boolean z10) {
        this.zza |= 16777216;
        this.zzD = z10;
    }

    public final int zzK() {
        int iZza = zzgek.zza(this.zzb);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzL() {
        int iZza = zzgek.zza(this.zzc);
        if (iZza == 0) {
            return 2;
        }
        return iZza;
    }

    public final int zzM() {
        int i10 = this.zzh;
        int i11 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final /* synthetic */ void zzN(int i10) {
        this.zzb = i10 - 1;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzO(int i10) {
        this.zzh = zzgeh.zza(3);
        this.zza |= 64;
    }

    public final boolean zza() {
        return this.zzd;
    }

    public final boolean zzb() {
        return this.zze;
    }

    public final boolean zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            zzifs zzifsVar = zzgej.zza;
            return zzifm.zzbv(zzE, "\u0004\u0019\u0000\u0001\u0001\u001a\u0019\u0000\u0000\u0000\u0001᠌\u0000\u0003ဈ\u0005\u0004ဇ\u0007\u0005ဉ\b\u0006ဇ\t\u0007ဂ\u000b\bဉ\f\tဇ\u0002\nဂ\r\u000bဂ\u000e\fဂ\u000f\rဈ\u0010\u000eဈ\u0011\u000fဂ\u0012\u0010ဂ\u0013\u0011ဇ\u0014\u0012ဂ\n\u0013ဇ\u0015\u0014ဇ\u0016\u0015ဇ\u0017\u0016᠌\u0001\u0017ဇ\u0003\u0018ဇ\u0004\u0019ဌ\u0006\u001aဇ\u0018", new Object[]{"zza", "zzb", zzifsVar, "zzg", "zzi", "zzj", "zzk", "zzm", "zzn", "zzd", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzl", "zzA", "zzB", "zzC", "zzc", zzifsVar, "zze", "zzf", "zzh", "zzD"});
        }
        if (iOrdinal == 3) {
            return new zzgei();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzgeg(bArr);
        }
        if (iOrdinal == 5) {
            return zzE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzF;
        if (zziheVar != null) {
            return zziheVar;
        }
        synchronized (zzgei.class) {
            try {
                zzifhVar = zzF;
                if (zzifhVar == null) {
                    zzifhVar = new zzifh(zzE);
                    zzF = zzifhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzifhVar;
    }

    public final boolean zze() {
        return this.zzi;
    }

    public final zzgfa zzg() {
        zzgfa zzgfaVar = this.zzj;
        return zzgfaVar == null ? zzgfa.zzg() : zzgfaVar;
    }

    public final boolean zzh() {
        return this.zzk;
    }

    public final long zzi() {
        return this.zzl;
    }

    public final long zzj() {
        return this.zzm;
    }

    public final zzgfc zzk() {
        zzgfc zzgfcVar = this.zzn;
        return zzgfcVar == null ? zzgfc.zzj() : zzgfcVar;
    }

    public final long zzl() {
        return this.zzo;
    }

    public final long zzm() {
        return this.zzp;
    }

    public final long zzn() {
        return this.zzu;
    }

    public final String zzo() {
        return this.zzv;
    }

    public final String zzp() {
        return this.zzw;
    }

    public final long zzq() {
        return this.zzx;
    }

    public final long zzr() {
        return this.zzy;
    }

    public final boolean zzs() {
        return this.zzz;
    }

    public final boolean zzt() {
        return this.zzA;
    }

    public final boolean zzu() {
        return this.zzB;
    }

    public final boolean zzv() {
        return this.zzC;
    }

    public final boolean zzw() {
        return this.zzD;
    }

    public final /* synthetic */ void zzy(boolean z10) {
        this.zza |= 4;
        this.zzd = z10;
    }

    public final /* synthetic */ void zzz(boolean z10) {
        this.zza |= 8;
        this.zze = z10;
    }
}
