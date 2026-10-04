package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaqc implements zzagh {
    private final zzaqd zza;
    private final zzeu zzb;
    private final zzeu zzc;
    private final zzet zzd;
    private zzagk zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;

    public zzaqc() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean zza(zzagi zzagiVar) throws IOException {
        zzeu zzeuVar;
        int i10 = 0;
        while (true) {
            zzeuVar = this.zzc;
            zzagiVar.zzi(zzeuVar.zzi(), 0, 10);
            zzeuVar.zzh(0);
            if (zzeuVar.zzx() != 4801587) {
                break;
            }
            zzeuVar.zzk(3);
            int iZzG = zzeuVar.zzG();
            i10 += iZzG + 10;
            zzagiVar.zzk(iZzG);
        }
        zzagiVar.zzl();
        zzagiVar.zzk(i10);
        if (this.zzg == -1) {
            this.zzg = i10;
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = i10;
        do {
            zzagiVar.zzi(zzeuVar.zzi(), 0, 2);
            zzeuVar.zzh(0);
            if (zzaqd.zze(zzeuVar.zzt())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                zzagiVar.zzi(zzeuVar.zzi(), 0, 4);
                zzet zzetVar = this.zzd;
                zzetVar.zzf(14);
                int iZzj = zzetVar.zzj(13);
                if (iZzj <= 6) {
                    i13++;
                    zzagiVar.zzl();
                    zzagiVar.zzk(i13);
                } else {
                    zzagiVar.zzk(iZzj - 6);
                    i12 += iZzj;
                }
            } else {
                i13++;
                zzagiVar.zzl();
                zzagiVar.zzk(i13);
            }
            i11 = 0;
            i12 = 0;
        } while (i13 - i10 < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public /* synthetic */ List zzb() {
        return C3365x.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzc(zzagk zzagkVar) {
        this.zze = zzagkVar;
        this.zza.zzb(zzagkVar, new zzarv(Integer.MIN_VALUE, 0, 1));
        zzagkVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzd(zzagi zzagiVar, zzahh zzahhVar) throws IOException {
        this.zze.getClass();
        zzeu zzeuVar = this.zzb;
        int iZza = zzagiVar.zza(zzeuVar.zzi(), 0, 2048);
        if (!this.zzi) {
            this.zze.zzw(new zzahj(-9223372036854775807L, 0L));
            this.zzi = true;
        }
        if (iZza == -1) {
            return -1;
        }
        zzeuVar.zzh(0);
        zzeuVar.zzf(iZza);
        if (!this.zzh) {
            this.zza.zzc(this.zzf, 4);
            this.zzh = true;
        }
        this.zza.zzd(zzeuVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j10, long j11) {
        this.zzh = false;
        this.zza.zza();
        this.zzf = j11;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public /* synthetic */ zzagh zzg() {
        return C3365x.b(this);
    }

    public zzaqc(int i10) {
        this.zza = new zzaqd(true, null, 0, "audio/mp4a-latm");
        this.zzb = new zzeu(2048);
        this.zzg = -1L;
        zzeu zzeuVar = new zzeu(10);
        this.zzc = zzeuVar;
        byte[] bArrZzi = zzeuVar.zzi();
        this.zzd = new zzet(bArrZzi, bArrZzi.length);
    }
}
