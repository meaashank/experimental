package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcke implements zzmc {
    private final zzabv zza = new zzabv(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    @Override // com.google.android.gms.internal.ads.zzmc
    public final void zza(zzqj zzqjVar) {
        zzo(false);
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final void zzb(zzmb zzmbVar, zzzr zzzrVar, zzabe[] zzabeVarArr) {
        int i10;
        this.zzf = 0;
        for (zzabe zzabeVar : zzabeVarArr) {
            if (zzabeVar != null) {
                int i11 = this.zzf;
                int i12 = zzabeVar.zza().zzc;
                if (i12 == 0) {
                    i10 = 144310272;
                } else if (i12 == 1) {
                    i10 = 13107200;
                } else if (i12 != 2) {
                    i10 = 131072;
                    if (i12 != 3 && i12 != 5 && i12 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i10 = 131072000;
                }
                this.zzf = i11 + i10;
            }
        }
        this.zza.zzf(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final void zzc(zzqj zzqjVar) {
        zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final void zzd(zzqj zzqjVar) {
        zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final zzabp zze(zzqj zzqjVar) {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final long zzf(zzqj zzqjVar) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final boolean zzg(zzqj zzqjVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final boolean zzh(zzmb zzmbVar) {
        long j10 = zzmbVar.zze;
        boolean z10 = true;
        char c10 = j10 > this.zzc ? (char) 0 : j10 < this.zzb ? (char) 2 : (char) 1;
        int iZzg = this.zza.zzg();
        int i10 = this.zzf;
        if (c10 != 2 && (c10 != 1 || !this.zzg || iZzg >= i10)) {
            z10 = false;
        }
        this.zzg = z10;
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final boolean zzi(zzmb zzmbVar) {
        long j10 = zzmbVar.zzg ? this.zze : this.zzd;
        return j10 <= 0 || zzmbVar.zze >= j10;
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public /* synthetic */ boolean zzj(zzqj zzqjVar, zzbf zzbfVar, zzxo zzxoVar, long j10) {
        return C3343r1.i(this, zzqjVar, zzbfVar, zzxoVar, j10);
    }

    public final synchronized void zzk(int i10) {
        this.zzb = ((long) i10) * 1000;
    }

    public final synchronized void zzl(int i10) {
        this.zzc = ((long) i10) * 1000;
    }

    public final synchronized void zzm(int i10) {
        this.zzd = ((long) i10) * 1000;
    }

    public final synchronized void zzn(int i10) {
        this.zze = ((long) i10) * 1000;
    }

    @e.f0
    public final void zzo(boolean z10) {
        this.zzf = 0;
        this.zzg = false;
        if (z10) {
            this.zza.zze();
        }
    }
}
