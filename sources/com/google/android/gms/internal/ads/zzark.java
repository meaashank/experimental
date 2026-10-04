package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzark {
    private final List zza;
    private final zzaht[] zzc;
    private final String zzb = "video/mp2t";
    private final zzhc zzd = new zzhc(new zzhb() { // from class: com.google.android.gms.internal.ads.zzarj
        @Override // com.google.android.gms.internal.ads.zzhb
        public final /* synthetic */ void zza(long j10, zzeu zzeuVar) {
            this.zza.zzf(j10, zzeuVar);
        }
    });

    public zzark(List list, String str) {
        this.zza = list;
        this.zzc = new zzaht[list.size()];
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
            String strZzc = zzvVar.zza;
            if (strZzc == null) {
                strZzc = zzarvVar.zzc();
            }
            zzt zztVar = new zzt();
            zztVar.zza(strZzc);
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

    public final void zzb(int i10) {
        this.zzd.zza(i10);
    }

    public final void zzc(long j10, zzeu zzeuVar) {
        this.zzd.zzc(j10, zzeuVar);
    }

    public final void zzd() {
        this.zzd.zze();
    }

    public final void zze() {
        this.zzd.zze();
    }

    public final /* synthetic */ void zzf(long j10, zzeu zzeuVar) {
        zzafu.zza(j10, zzeuVar, this.zzc);
    }
}
