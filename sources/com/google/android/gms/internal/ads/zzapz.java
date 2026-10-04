package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzapz implements zzagh {
    private final zzaqa zza = new zzaqa(null, 0, "audio/ac4");
    private final zzeu zzb = new zzeu(16384);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean zza(zzagi zzagiVar) throws IOException {
        int i10;
        zzeu zzeuVar = new zzeu(10);
        int i11 = 0;
        while (true) {
            zzagiVar.zzi(zzeuVar.zzi(), 0, 10);
            zzeuVar.zzh(0);
            if (zzeuVar.zzx() != 4801587) {
                break;
            }
            zzeuVar.zzk(3);
            int iZzG = zzeuVar.zzG();
            i11 += iZzG + 10;
            zzagiVar.zzk(iZzG);
        }
        zzagiVar.zzl();
        zzagiVar.zzk(i11);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = 7;
            zzagiVar.zzi(zzeuVar.zzi(), 0, 7);
            zzeuVar.zzh(0);
            int iZzt = zzeuVar.zzt();
            if (iZzt == 44096 || iZzt == 44097) {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArrZzi = zzeuVar.zzi();
                if (bArrZzi.length < 7) {
                    i10 = -1;
                } else {
                    int i15 = ((bArrZzi[2] & 255) << 8) | (bArrZzi[3] & 255);
                    if (i15 == 65535) {
                        i15 = ((bArrZzi[4] & 255) << 16) | ((bArrZzi[5] & 255) << 8) | (bArrZzi[6] & 255);
                    } else {
                        i14 = 4;
                    }
                    if (iZzt == 44097) {
                        i14 += 2;
                    }
                    i10 = i15 + i14;
                }
                if (i10 == -1) {
                    return false;
                }
                zzagiVar.zzk(i10 - 7);
            } else {
                zzagiVar.zzl();
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                zzagiVar.zzk(i13);
                i12 = 0;
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
        int iZza = zzagiVar.zza(zzeuVar.zzi(), 0, 16384);
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
