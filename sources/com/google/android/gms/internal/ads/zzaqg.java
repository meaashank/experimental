package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaqg implements zzaqh {
    private final List zza;
    private final zzaht[] zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private final String zzb = "video/mp2t";
    private long zzg = -9223372036854775807L;

    public zzaqg(List list, String str) {
        this.zza = list;
        this.zzc = new zzaht[list.size()];
    }

    private final boolean zzg(zzeu zzeuVar, int i10) {
        if (zzeuVar.zzd() == 0) {
            return false;
        }
        if (zzeuVar.zzs() != i10) {
            this.zzd = false;
        }
        this.zze--;
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza() {
        this.zzd = false;
        this.zzg = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzb(zzagk zzagkVar, zzarv zzarvVar) {
        int i10 = 0;
        while (true) {
            zzaht[] zzahtVarArr = this.zzc;
            if (i10 >= zzahtVarArr.length) {
                return;
            }
            zzars zzarsVar = (zzars) this.zza.get(i10);
            zzarvVar.zza();
            zzaht zzahtVarZzs = zzagkVar.zzs(zzarvVar.zzb(), 3);
            zzt zztVar = new zzt();
            zztVar.zza(zzarvVar.zzc());
            zztVar.zzn(this.zzb);
            zztVar.zzo("application/dvbsubs");
            zztVar.zzr(Collections.singletonList(zzarsVar.zzb));
            zztVar.zze(zzarsVar.zza);
            zzahtVarZzs.zzA(zztVar.zzQ());
            zzahtVarArr[i10] = zzahtVarZzs;
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzc(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.zzd = true;
        this.zzg = j10;
        this.zzf = 0;
        this.zze = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzd(zzeu zzeuVar) {
        if (this.zzd) {
            if (this.zze != 2 || zzg(zzeuVar, 32)) {
                if (this.zze != 1 || zzg(zzeuVar, 0)) {
                    int iZzg = zzeuVar.zzg();
                    int iZzd = zzeuVar.zzd();
                    for (zzaht zzahtVar : this.zzc) {
                        zzeuVar.zzh(iZzg);
                        zzahtVar.zzc(zzeuVar, iZzd);
                    }
                    this.zzf += iZzd;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzf() {
        if (this.zzd) {
            zzguk.zzi(this.zzg != -9223372036854775807L);
            for (zzaht zzahtVar : this.zzc) {
                zzahtVar.zze(this.zzg, 1, this.zzf, 0, null);
            }
            this.zzd = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public /* synthetic */ void zzn() {
        G.b(this);
    }
}
