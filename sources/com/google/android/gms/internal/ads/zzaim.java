package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class zzaim implements zzafs {
    private final zzagu zza;
    private final int zzb;
    private final zzago zzc = new zzago();

    public /* synthetic */ zzaim(zzagu zzaguVar, int i10, byte[] bArr) {
        this.zza = zzaguVar;
        this.zzb = i10;
    }

    private final long zzc(zzagi zzagiVar) throws IOException {
        while (zzagiVar.zzm() < zzagiVar.zzo() - 6) {
            zzagu zzaguVar = this.zza;
            int i10 = this.zzb;
            zzago zzagoVar = this.zzc;
            long jZzm = zzagiVar.zzm();
            zzeu zzeuVar = new zzeu(17);
            zzagiVar.zzi(zzeuVar.zzi(), 0, 2);
            if (zzeuVar.zzo() != i10) {
                zzagiVar.zzl();
                zzagiVar.zzk((int) (jZzm - zzagiVar.zzn()));
            } else {
                zzeuVar.zzf(zzagl.zzb(zzagiVar, zzeuVar.zzi(), 2, 15) + 2);
                zzagiVar.zzl();
                zzagiVar.zzk((int) (jZzm - zzagiVar.zzn()));
                if (zzagp.zza(zzeuVar, zzaguVar, i10, zzagoVar)) {
                    break;
                }
            }
            zzagiVar.zzk(1);
        }
        if (zzagiVar.zzm() < zzagiVar.zzo() - 6) {
            return this.zzc.zza;
        }
        zzagiVar.zzk((int) (zzagiVar.zzo() - zzagiVar.zzm()));
        return this.zza.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    public final zzafr zza(zzagi zzagiVar, long j10) throws IOException {
        long jZzn = zzagiVar.zzn();
        long jZzc = zzc(zzagiVar);
        long jZzm = zzagiVar.zzm();
        zzagiVar.zzk(Math.max(6, this.zza.zzc));
        long jZzc2 = zzc(zzagiVar);
        return (jZzc > j10 || jZzc2 <= j10) ? jZzc2 <= j10 ? zzafr.zzb(jZzc2, zzagiVar.zzm()) : zzafr.zza(jZzc, jZzn) : zzafr.zzc(jZzm);
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    public /* synthetic */ void zzb() {
        C3361w.a(this);
    }
}
