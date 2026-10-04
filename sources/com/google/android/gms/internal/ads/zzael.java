package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzael {
    private final zzaed zza;
    private final zzaee zzf;
    private final zzadf zzg;
    private long zzl;
    private final zzadb zzm;
    private final zzaeb zzb = new zzaeb();
    private final zzfi zzc = new zzfi(10);
    private final zzfi zzd = new zzfi(10);
    private final zzej zze = new zzej(16);
    private long zzh = -9223372036854775807L;
    private zzbv zzk = zzbv.zza;
    private long zzi = -9223372036854775807L;
    private long zzj = -9223372036854775807L;

    public zzael(zzadb zzadbVar, zzaed zzaedVar, zzaee zzaeeVar, zzadf zzadfVar) {
        this.zzm = zzadbVar;
        this.zza = zzaedVar;
        this.zzf = zzaeeVar;
        this.zzg = zzadfVar;
    }

    private static Object zzh(zzfi zzfiVar) {
        zzguk.zza(zzfiVar.zzc() > 0);
        while (zzfiVar.zzc() > 1) {
            zzfiVar.zzd();
        }
        Object objZzd = zzfiVar.zzd();
        objZzd.getClass();
        return objZzd;
    }

    public final void zza() {
        this.zze.zze();
        this.zzh = -9223372036854775807L;
        this.zzi = -9223372036854775807L;
        this.zzj = -9223372036854775807L;
        zzfi zzfiVar = this.zzd;
        if (zzfiVar.zzc() > 0) {
            this.zzl = ((Long) zzh(zzfiVar)).longValue();
        }
        zzfi zzfiVar2 = this.zzc;
        if (zzfiVar2.zzc() > 0) {
            zzfiVar2.zza(0L, (zzbv) zzh(zzfiVar2));
        }
    }

    public final void zzb(long j10, long j11) throws zzjn {
        while (true) {
            zzej zzejVar = this.zze;
            if (zzejVar.zzd()) {
                return;
            }
            zzfi zzfiVar = this.zzd;
            long jZzc = zzejVar.zzc();
            Long l10 = (Long) zzfiVar.zze(jZzc);
            if (l10 != null && l10.longValue() != this.zzl) {
                this.zzl = l10.longValue();
                this.zza.zzb(2);
            }
            zzadf zzadfVar = this.zzg;
            zzadfVar.zzb(1000 * jZzc);
            zzaed zzaedVar = this.zza;
            long j12 = this.zzl;
            zzaeb zzaebVar = this.zzb;
            int iZzl = zzaedVar.zzl(jZzc, j10, j11, j12, false, false, zzadfVar.zzc(), zzadfVar.zzd(), zzaebVar);
            if (iZzl != 5 && iZzl != 4) {
                this.zzf.zza(jZzc, zzaebVar.zza());
            }
            if (iZzl == 0 || iZzl == 1) {
                this.zzi = jZzc;
                long jZzb = zzejVar.zzb();
                zzbv zzbvVar = (zzbv) this.zzc.zze(jZzb);
                if (zzbvVar != null && !zzbvVar.equals(zzbv.zza) && !zzbvVar.equals(this.zzk)) {
                    this.zzk = zzbvVar;
                    this.zzm.zza(zzbvVar);
                }
                this.zzm.zzb(iZzl == 0 ? System.nanoTime() : zzaebVar.zzb(), jZzb, zzaedVar.zzg());
            } else if (iZzl == 2 || iZzl == 3) {
                this.zzi = jZzc;
                zzejVar.zzb();
                final zzadb zzadbVar = this.zzm;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzacz
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzadbVar.zza.zzB().zzc();
                    }
                };
                zzadc zzadcVar = zzadbVar.zza;
                zzadcVar.zzC().execute(runnable);
                ((zzafb) zzadcVar.zzz().remove()).zzb();
            } else if (iZzl != 4) {
                return;
            } else {
                this.zzi = jZzc;
            }
        }
    }

    public final void zzc(int i10, int i11) {
        long j10 = this.zzh;
        this.zzc.zza(j10 == -9223372036854775807L ? 0L : j10 + 1, new zzbv(i10, i11, 1.0f));
    }

    public final void zzd(int i10, long j10) {
        if (this.zze.zzd()) {
            this.zza.zzb(i10);
            this.zzl = j10;
        } else {
            zzfi zzfiVar = this.zzd;
            long j11 = this.zzh;
            zzfiVar.zza(j11 == -9223372036854775807L ? -4611686018427387904L : j11 + 1, Long.valueOf(j10));
        }
    }

    public final void zze(long j10) {
        this.zze.zza(j10);
        this.zzh = j10;
        this.zzj = -9223372036854775807L;
    }

    public final void zzf() {
        long j10 = this.zzh;
        if (j10 == -9223372036854775807L) {
            j10 = Long.MIN_VALUE;
            this.zzh = Long.MIN_VALUE;
            this.zzi = Long.MIN_VALUE;
        }
        this.zzj = j10;
    }

    public final boolean zzg() {
        long j10 = this.zzj;
        return j10 != -9223372036854775807L && this.zzi == j10;
    }
}
