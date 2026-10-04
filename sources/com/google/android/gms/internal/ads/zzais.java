package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class zzais implements zzagh {
    private zzagk zzf;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private zzaiq zzo;
    private zzaiw zzp;
    private final zzeu zza = new zzeu(4);
    private final zzeu zzb = new zzeu(9);
    private final zzeu zzc = new zzeu(11);
    private final zzeu zzd = new zzeu();
    private final zzait zze = new zzait();
    private int zzg = 1;

    private final zzeu zzh(zzagi zzagiVar) throws IOException {
        zzeu zzeuVar = this.zzd;
        if (this.zzl > zzeuVar.zzj()) {
            int iZzj = zzeuVar.zzj();
            zzeuVar.zzb(new byte[Math.max(iZzj + iZzj, this.zzl)], 0);
        } else {
            zzeuVar.zzh(0);
        }
        zzeuVar.zzf(this.zzl);
        zzagiVar.zzc(zzeuVar.zzi(), 0, this.zzl);
        return zzeuVar;
    }

    @RequiresNonNull({"extractorOutput"})
    private final void zzi() {
        if (this.zzn) {
            return;
        }
        this.zzf.zzw(new zzahj(-9223372036854775807L, 0L));
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean zza(zzagi zzagiVar) throws IOException {
        zzeu zzeuVar = this.zza;
        zzagiVar.zzi(zzeuVar.zzi(), 0, 3);
        zzeuVar.zzh(0);
        if (zzeuVar.zzx() != 4607062) {
            return false;
        }
        zzagiVar.zzi(zzeuVar.zzi(), 0, 2);
        zzeuVar.zzh(0);
        if ((zzeuVar.zzt() & 250) != 0) {
            return false;
        }
        zzagiVar.zzi(zzeuVar.zzi(), 0, 4);
        zzeuVar.zzh(0);
        int iZzB = zzeuVar.zzB();
        zzagiVar.zzl();
        zzagiVar.zzk(iZzB);
        zzagiVar.zzi(zzeuVar.zzi(), 0, 4);
        zzeuVar.zzh(0);
        return zzeuVar.zzB() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public /* synthetic */ List zzb() {
        return C3365x.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzc(zzagk zzagkVar) {
        this.zzf = zzagkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzagh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzd(com.google.android.gms.internal.ads.zzagi r17, com.google.android.gms.internal.ads.zzahh r18) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzais.zzd(com.google.android.gms.internal.ads.zzagi, com.google.android.gms.internal.ads.zzahh):int");
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j10, long j11) {
        if (j10 == 0) {
            this.zzg = 1;
            this.zzh = false;
        } else {
            this.zzg = 3;
        }
        this.zzj = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public /* synthetic */ zzagh zzg() {
        return C3365x.b(this);
    }
}
