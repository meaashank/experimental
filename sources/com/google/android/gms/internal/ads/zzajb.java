package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzajb implements zzagh {
    private zzagk zzb;
    private int zzc;
    private int zzd;
    private int zze;

    @Nullable
    private zzaji zzg;
    private zzagi zzh;
    private zzahp zzi;

    @Nullable
    private zzamp zzj;
    private final zzeu zza = new zzeu(2);
    private long zzf = -1;

    private final int zzh(zzagi zzagiVar) throws IOException {
        zzeu zzeuVar = this.zza;
        zzeuVar.zza(2);
        zzagiVar.zzi(zzeuVar.zzi(), 0, 2);
        return zzeuVar.zzt();
    }

    private final int zzi(zzagi zzagiVar) throws IOException {
        zzeu zzeuVar = this.zza;
        zzeuVar.zza(2);
        zzagiVar.zzi(zzeuVar.zzi(), 0, 2);
        return zzeuVar.zzt() - 2;
    }

    private final void zzj() {
        zzagk zzagkVar = this.zzb;
        zzagkVar.getClass();
        zzagkVar.zzv();
        this.zzb.zzw(new zzahj(-9223372036854775807L, 0L));
        this.zzc = 6;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean zza(zzagi zzagiVar) throws IOException {
        int iZzi;
        if (zzh(zzagiVar) == 65496) {
            while (true) {
                int iZzh = zzh(zzagiVar);
                this.zzd = iZzh;
                if (iZzh == 65498 || (iZzi = zzi(zzagiVar)) < 0) {
                    break;
                }
                if (this.zzd != 65505) {
                    zzagiVar.zzk(iZzi);
                } else {
                    zzeu zzeuVar = this.zza;
                    zzeuVar.zza(iZzi);
                    zzagiVar.zzi(zzeuVar.zzi(), 0, iZzi);
                    if (!Objects.equals(zzeuVar.zzM((char) 0), "http://ns.adobe.com/xap/1.0/") ? false : zzaje.zzb(zzeuVar.zzM((char) 0))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public /* synthetic */ List zzb() {
        return C3365x.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzc(zzagk zzagkVar) {
        this.zzb = zzagkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0190  */
    @Override // com.google.android.gms.internal.ads.zzagh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzd(com.google.android.gms.internal.ads.zzagi r26, com.google.android.gms.internal.ads.zzahh r27) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajb.zzd(com.google.android.gms.internal.ads.zzagi, com.google.android.gms.internal.ads.zzahh):int");
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j10, long j11) {
        if (j10 == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzamp zzampVar = this.zzj;
            zzampVar.getClass();
            zzampVar.zze(j10, j11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public /* synthetic */ zzagh zzg() {
        return C3365x.b(this);
    }
}
