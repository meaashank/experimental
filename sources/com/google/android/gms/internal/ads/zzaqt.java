package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaqt implements zzaqh {
    private final zzeu zza;
    private final zzahe zzb;

    @Nullable
    private final String zzc;
    private final int zzd;
    private final String zze;
    private zzaht zzf;
    private String zzg;
    private int zzh = 0;
    private int zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzaqt(@Nullable String str, int i10, String str2) {
        zzeu zzeuVar = new zzeu(4);
        this.zza = zzeuVar;
        zzeuVar.zzi()[0] = -1;
        this.zzb = new zzahe();
        this.zzn = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i10;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzk = false;
        this.zzn = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzb(zzagk zzagkVar, zzarv zzarvVar) {
        zzarvVar.zza();
        this.zzg = zzarvVar.zzc();
        this.zzf = zzagkVar.zzs(zzarvVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzc(long j10, int i10) {
        this.zzn = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzd(zzeu zzeuVar) {
        this.zzf.getClass();
        while (zzeuVar.zzd() > 0) {
            int i10 = this.zzh;
            if (i10 == 0) {
                byte[] bArrZzi = zzeuVar.zzi();
                int iZzg = zzeuVar.zzg();
                int iZze = zzeuVar.zze();
                while (true) {
                    if (iZzg >= iZze) {
                        zzeuVar.zzh(iZze);
                        break;
                    }
                    int i11 = iZzg + 1;
                    byte b10 = bArrZzi[iZzg];
                    boolean z10 = (b10 & 255) == 255;
                    boolean z11 = this.zzk && (b10 & 224) == 224;
                    this.zzk = z10;
                    if (z11) {
                        zzeuVar.zzh(i11);
                        this.zzk = false;
                        this.zza.zzi()[1] = bArrZzi[iZzg];
                        this.zzi = 2;
                        this.zzh = 1;
                        break;
                    }
                    iZzg = i11;
                }
            } else if (i10 != 1) {
                int iMin = Math.min(zzeuVar.zzd(), this.zzm - this.zzi);
                this.zzf.zzc(zzeuVar, iMin);
                int i12 = this.zzi + iMin;
                this.zzi = i12;
                if (i12 >= this.zzm) {
                    zzguk.zzi(this.zzn != -9223372036854775807L);
                    this.zzf.zze(this.zzn, 1, this.zzm, 0, null);
                    this.zzn += this.zzl;
                    this.zzi = 0;
                    this.zzh = 0;
                }
            } else {
                int iMin2 = Math.min(zzeuVar.zzd(), 4 - this.zzi);
                zzeu zzeuVar2 = this.zza;
                zzeuVar.zzm(zzeuVar2.zzi(), this.zzi, iMin2);
                int i13 = this.zzi + iMin2;
                this.zzi = i13;
                if (i13 >= 4) {
                    zzeuVar2.zzh(0);
                    zzahe zzaheVar = this.zzb;
                    if (zzaheVar.zza(zzeuVar2.zzB())) {
                        this.zzm = zzaheVar.zzc;
                        if (!this.zzj) {
                            this.zzl = (((long) zzaheVar.zzg) * 1000000) / ((long) zzaheVar.zzd);
                            zzt zztVar = new zzt();
                            zztVar.zza(this.zzg);
                            zztVar.zzn(this.zze);
                            zztVar.zzo(zzaheVar.zzb);
                            zztVar.zzp(4096);
                            zztVar.zzH(zzaheVar.zze);
                            zztVar.zzJ(zzaheVar.zzd);
                            zztVar.zze(this.zzc);
                            zztVar.zzg(this.zzd);
                            this.zzf.zzA(zztVar.zzQ());
                            this.zzj = true;
                        }
                        zzeuVar2.zzh(0);
                        this.zzf.zzc(zzeuVar2, 4);
                        this.zzh = 2;
                    } else {
                        this.zzi = 0;
                        this.zzh = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public /* synthetic */ void zzf() {
        G.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public /* synthetic */ void zzn() {
        G.b(this);
    }
}
