package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzarz {
    private final List zza;
    private final String zzb = "video/mp2t";
    private final zzaht[] zzc;
    private final zzhc zzd;

    public zzarz(List list, String str) {
        this.zza = list;
        this.zzc = new zzaht[list.size()];
        zzhc zzhcVar = new zzhc(new zzhb() { // from class: com.google.android.gms.internal.ads.zzary
            @Override // com.google.android.gms.internal.ads.zzhb
            public final /* synthetic */ void zza(long j10, zzeu zzeuVar) {
                this.zza.zzc(j10, zzeuVar);
            }
        });
        this.zzd = zzhcVar;
        zzhcVar.zza(3);
    }

    public final void zza(zzagk zzagkVar, zzarv zzarvVar) {
        int i10 = 0;
        while (true) {
            zzaht[] zzahtVarArr = this.zzc;
            if (i10 >= zzahtVarArr.length) {
                return;
            }
            zzarvVar.zza();
            zzaht zzahtVarZzs = zzagkVar.zzs(zzarvVar.zzb(), 3);
            zzv zzvVar = (zzv) this.zza.get(i10);
            String str = zzvVar.zzp;
            boolean z10 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z10 = false;
            }
            zzguk.zzf(z10, "Invalid closed caption MIME type provided: %s", str);
            zzt zztVar = new zzt();
            zztVar.zza(zzarvVar.zzc());
            zztVar.zzn(this.zzb);
            zztVar.zzo(str);
            zztVar.zzf(zzvVar.zze);
            zztVar.zze(zzvVar.zzd);
            zztVar.zzN(zzvVar.zzO);
            zztVar.zzr(zzvVar.zzs);
            zzahtVarZzs.zzA(zztVar.zzQ());
            zzahtVarArr[i10] = zzahtVarZzs;
            i10++;
        }
    }

    public final void zzb(long j10, zzeu zzeuVar) {
        if (zzeuVar.zzd() < 9) {
            return;
        }
        int iZzB = zzeuVar.zzB();
        int iZzB2 = zzeuVar.zzB();
        int iZzs = zzeuVar.zzs();
        if (iZzB == 434 && iZzB2 == 1195456820 && iZzs == 3) {
            this.zzd.zzc(j10, zzeuVar);
        }
    }

    public final /* synthetic */ void zzc(long j10, zzeu zzeuVar) {
        zzafu.zzb(j10, zzeuVar, this.zzc);
    }
}
