package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzapw implements zzagh {
    private final zzapx zza = new zzapx(null, 0, "audio/ac3");
    private final zzeu zzb = new zzeu(2786);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean zza(zzagi zzagiVar) throws IOException {
        zzeu zzeuVar = new zzeu(10);
        int i10 = 0;
        while (true) {
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
        int i11 = 0;
        int i12 = i10;
        while (true) {
            zzagiVar.zzi(zzeuVar.zzi(), 0, 6);
            zzeuVar.zzh(0);
            if (zzeuVar.zzt() != 2935) {
                zzagiVar.zzl();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                zzagiVar.zzk(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iZzd = zzafh.zzd(zzeuVar.zzi());
                if (iZzd == -1) {
                    return false;
                }
                zzagiVar.zzk(iZzd - 6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public /* synthetic */ List zzb() {
        return C3365x.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzc(zzagk zzagkVar) {
        this.zza.zzb(zzagkVar, new zzarv(Integer.MIN_VALUE, 0, 1));
        zzagkVar.zzv();
        zzagkVar.zzw(new zzahj(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzd(zzagi zzagiVar, zzahh zzahhVar) throws IOException {
        zzeu zzeuVar = this.zzb;
        int iZza = zzagiVar.zza(zzeuVar.zzi(), 0, 2786);
        if (iZza == -1) {
            return -1;
        }
        zzeuVar.zzh(0);
        zzeuVar.zzf(iZza);
        if (!this.zzc) {
            this.zza.zzc(0L, 4);
            this.zzc = true;
        }
        this.zza.zzd(zzeuVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j10, long j11) {
        this.zzc = false;
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public /* synthetic */ zzagh zzg() {
        return C3365x.b(this);
    }
}
