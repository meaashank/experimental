package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaqz implements zzarh {
    private zzv zza;
    private zzfj zzb;
    private zzaht zzc;

    public zzaqz(String str, String str2) {
        zzt zztVar = new zzt();
        zztVar.zzn("video/mp2t");
        zztVar.zzo(str);
        this.zza = zztVar.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzarh
    public final void zza(zzfj zzfjVar, zzagk zzagkVar, zzarv zzarvVar) {
        this.zzb = zzfjVar;
        zzarvVar.zza();
        zzaht zzahtVarZzs = zzagkVar.zzs(zzarvVar.zzb(), 5);
        this.zzc = zzahtVarZzs;
        zzahtVarZzs.zzA(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzarh
    public final void zzb(zzeu zzeuVar) {
        this.zzb.getClass();
        String str = zzfm.zza;
        long jZzb = this.zzb.zzb();
        long jZzc = this.zzb.zzc();
        if (jZzb == -9223372036854775807L || jZzc == -9223372036854775807L) {
            return;
        }
        zzv zzvVar = this.zza;
        if (jZzc != zzvVar.zzu) {
            zzt zztVarZza = zzvVar.zza();
            zztVarZza.zzt(jZzc);
            zzv zzvVarZzQ = zztVarZza.zzQ();
            this.zza = zzvVarZzQ;
            this.zzc.zzA(zzvVarZzQ);
        }
        int iZzd = zzeuVar.zzd();
        this.zzc.zzc(zzeuVar, iZzd);
        this.zzc.zze(jZzb, 1, iZzd, 0, null);
    }
}
