package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaqr implements zzaqh {
    private zzaht zzc;
    private boolean zzd;
    private int zzf;
    private int zzg;
    private final String zza = "video/mp2t";
    private final zzeu zzb = new zzeu(10);
    private long zze = -9223372036854775807L;

    public zzaqr(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza() {
        this.zzd = false;
        this.zze = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzb(zzagk zzagkVar, zzarv zzarvVar) {
        zzarvVar.zza();
        zzaht zzahtVarZzs = zzagkVar.zzs(zzarvVar.zzb(), 5);
        this.zzc = zzahtVarZzs;
        zzt zztVar = new zzt();
        zztVar.zza(zzarvVar.zzc());
        zztVar.zzn(this.zza);
        zztVar.zzo("application/id3");
        zzahtVarZzs.zzA(zztVar.zzQ());
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzc(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.zzd = true;
        this.zze = j10;
        this.zzf = 0;
        this.zzg = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzd(zzeu zzeuVar) {
        this.zzc.getClass();
        if (this.zzd) {
            int iZzd = zzeuVar.zzd();
            int i10 = this.zzg;
            if (i10 < 10) {
                int iMin = Math.min(iZzd, 10 - i10);
                byte[] bArrZzi = zzeuVar.zzi();
                int iZzg = zzeuVar.zzg();
                zzeu zzeuVar2 = this.zzb;
                System.arraycopy(bArrZzi, iZzg, zzeuVar2.zzi(), this.zzg, iMin);
                if (this.zzg + iMin == 10) {
                    zzeuVar2.zzh(0);
                    if (zzeuVar2.zzs() != 73 || zzeuVar2.zzs() != 68 || zzeuVar2.zzs() != 51) {
                        zzeh.zzc("Id3Reader", "Discarding invalid ID3 tag");
                        this.zzd = false;
                        return;
                    } else {
                        zzeuVar2.zzk(3);
                        this.zzf = zzeuVar2.zzG() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iZzd, this.zzf - this.zzg);
            this.zzc.zzc(zzeuVar, iMin2);
            this.zzg += iMin2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzf() {
        int i10;
        this.zzc.getClass();
        if (this.zzd && (i10 = this.zzf) != 0 && this.zzg == i10) {
            zzguk.zzi(this.zze != -9223372036854775807L);
            this.zzc.zze(this.zze, 1, this.zzf, 0, null);
            this.zzd = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public /* synthetic */ void zzn() {
        G.b(this);
    }
}
