package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzari implements zzarw {
    private final zzarh zza;
    private final zzeu zzb = new zzeu(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzari(zzarh zzarhVar) {
        this.zza = zzarhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final void zza(zzfj zzfjVar, zzagk zzagkVar, zzarv zzarvVar) {
        this.zza.zza(zzfjVar, zzagkVar, zzarvVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final void zzb() {
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final void zzc(zzeu zzeuVar, int i10) {
        int i11 = i10 & 1;
        int iZzg = i11 != 0 ? zzeuVar.zzg() + zzeuVar.zzs() : -1;
        if (this.zzf) {
            if (i11 == 0) {
                return;
            }
            this.zzf = false;
            zzeuVar.zzh(iZzg);
            this.zzd = 0;
        }
        while (zzeuVar.zzd() > 0) {
            int i12 = this.zzd;
            if (i12 < 3) {
                if (i12 == 0) {
                    int iZzs = zzeuVar.zzs();
                    zzeuVar.zzh(zzeuVar.zzg() - 1);
                    if (iZzs == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int iMin = Math.min(zzeuVar.zzd(), 3 - this.zzd);
                zzeu zzeuVar2 = this.zzb;
                zzeuVar.zzm(zzeuVar2.zzi(), this.zzd, iMin);
                int i13 = this.zzd + iMin;
                this.zzd = i13;
                if (i13 == 3) {
                    zzeuVar2.zzh(0);
                    zzeuVar2.zzf(3);
                    zzeuVar2.zzk(1);
                    int iZzs2 = zzeuVar2.zzs();
                    boolean z10 = (iZzs2 & 128) != 0;
                    int iZzs3 = zzeuVar2.zzs();
                    this.zze = z10;
                    this.zzc = (((iZzs2 & 15) << 8) | iZzs3) + 3;
                    int iZzj = zzeuVar2.zzj();
                    int i14 = this.zzc;
                    if (iZzj < i14) {
                        int iZzj2 = zzeuVar2.zzj();
                        zzeuVar2.zzc(Math.min(androidx.core.view.G.f111534l, Math.max(i14, iZzj2 + iZzj2)));
                    }
                }
            } else {
                int iMin2 = Math.min(zzeuVar.zzd(), this.zzc - this.zzd);
                zzeu zzeuVar3 = this.zzb;
                zzeuVar.zzm(zzeuVar3.zzi(), this.zzd, iMin2);
                int i15 = this.zzd + iMin2;
                this.zzd = i15;
                int i16 = this.zzc;
                if (i15 != i16) {
                    continue;
                } else {
                    if (!this.zze) {
                        zzeuVar3.zzf(i16);
                    } else {
                        if (zzfm.zzL(zzeuVar3.zzi(), 0, i16, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        zzeuVar3.zzf(this.zzc - 4);
                    }
                    zzeuVar3.zzh(0);
                    this.zza.zzb(zzeuVar3);
                    this.zzd = 0;
                }
            }
        }
    }
}
