package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzaiw extends zzaiv {
    private final zzeu zzb;
    private final zzeu zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzaiw(zzaht zzahtVar) {
        super(zzahtVar);
        this.zzb = new zzeu(zzgr.zza);
        this.zzc = new zzeu(4);
    }

    @Override // com.google.android.gms.internal.ads.zzaiv
    public final boolean zza(zzeu zzeuVar) throws zzaiu {
        int iZzs = zzeuVar.zzs();
        int i10 = iZzs >> 4;
        int i11 = iZzs & 15;
        if (i11 != 7) {
            throw new zzaiu(androidx.multidex.d.a(new StringBuilder(String.valueOf(i11).length() + 28), "Video format not supported: ", i11));
        }
        this.zzg = i10;
        return i10 != 5;
    }

    @Override // com.google.android.gms.internal.ads.zzaiv
    public final boolean zzb(zzeu zzeuVar, long j10) throws zzat {
        int i10;
        int iZzs = zzeuVar.zzs();
        long jZzy = zzeuVar.zzy();
        if (iZzs == 0) {
            if (!this.zze) {
                zzeu zzeuVar2 = new zzeu(new byte[zzeuVar.zzd()]);
                zzeuVar.zzm(zzeuVar2.zzi(), 0, zzeuVar.zzd());
                zzafm zzafmVarZza = zzafm.zza(zzeuVar2);
                this.zzd = zzafmVarZza.zzb;
                zzt zztVar = new zzt();
                zztVar.zzn("video/x-flv");
                zztVar.zzo("video/avc");
                zztVar.zzk(zzafmVarZza.zzl);
                zztVar.zzv(zzafmVarZza.zzc);
                zztVar.zzw(zzafmVarZza.zzd);
                zztVar.zzC(zzafmVarZza.zzk);
                zztVar.zzr(zzafmVarZza.zza);
                this.zza.zzA(zztVar.zzQ());
                this.zze = true;
                return false;
            }
        } else if (iZzs == 1 && this.zze) {
            int i11 = this.zzg == 1 ? 1 : 0;
            if (this.zzf) {
                i10 = i11;
            } else if (i11 != 0) {
                i10 = 1;
            }
            zzeu zzeuVar3 = this.zzc;
            byte[] bArrZzi = zzeuVar3.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 0;
            bArrZzi[2] = 0;
            int i12 = 4 - this.zzd;
            int i13 = 0;
            while (zzeuVar.zzd() > 0) {
                zzeuVar.zzm(zzeuVar3.zzi(), i12, this.zzd);
                zzeuVar3.zzh(0);
                zzeu zzeuVar4 = this.zzb;
                int iZzH = zzeuVar3.zzH();
                zzeuVar4.zzh(0);
                zzaht zzahtVar = this.zza;
                zzahtVar.zzc(zzeuVar4, 4);
                zzahtVar.zzc(zzeuVar, iZzH);
                i13 = i13 + 4 + iZzH;
            }
            this.zza.zze((jZzy * 1000) + j10, i10, i13, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
