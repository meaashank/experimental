package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzapx implements zzaqh {
    private final zzet zza;
    private final zzeu zzb;

    @Nullable
    private final String zzc;
    private final int zzd;
    private final String zze;
    private String zzf;
    private zzaht zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private long zzk;
    private zzv zzl;
    private int zzm;
    private long zzn;

    public zzapx(@Nullable String str, int i10, String str2) {
        zzet zzetVar = new zzet(new byte[128], 128);
        this.zza = zzetVar;
        this.zzb = new zzeu(zzetVar.zza);
        this.zzh = 0;
        this.zzn = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i10;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzn = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzb(zzagk zzagkVar, zzarv zzarvVar) {
        zzarvVar.zza();
        this.zzf = zzarvVar.zzc();
        this.zzg = zzagkVar.zzs(zzarvVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzc(long j10, int i10) {
        this.zzn = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzd(zzeu zzeuVar) {
        this.zzg.getClass();
        while (zzeuVar.zzd() > 0) {
            int i10 = this.zzh;
            if (i10 == 0) {
                while (true) {
                    if (zzeuVar.zzd() <= 0) {
                        break;
                    }
                    if (this.zzj) {
                        int iZzs = zzeuVar.zzs();
                        if (iZzs == 119) {
                            this.zzj = false;
                            this.zzh = 1;
                            zzeu zzeuVar2 = this.zzb;
                            zzeuVar2.zzi()[0] = 11;
                            zzeuVar2.zzi()[1] = 119;
                            this.zzi = 2;
                            break;
                        }
                        this.zzj = iZzs == 11;
                    } else {
                        this.zzj = zzeuVar.zzs() == 11;
                    }
                }
            } else if (i10 != 1) {
                int iMin = Math.min(zzeuVar.zzd(), this.zzm - this.zzi);
                this.zzg.zzc(zzeuVar, iMin);
                int i11 = this.zzi + iMin;
                this.zzi = i11;
                if (i11 == this.zzm) {
                    zzguk.zzi(this.zzn != -9223372036854775807L);
                    this.zzg.zze(this.zzn, 1, this.zzm, 0, null);
                    this.zzn += this.zzk;
                    this.zzh = 0;
                }
            } else {
                zzeu zzeuVar3 = this.zzb;
                byte[] bArrZzi = zzeuVar3.zzi();
                int iMin2 = Math.min(zzeuVar.zzd(), 128 - this.zzi);
                zzeuVar.zzm(bArrZzi, this.zzi, iMin2);
                int i12 = this.zzi + iMin2;
                this.zzi = i12;
                if (i12 == 128) {
                    zzet zzetVar = this.zza;
                    zzetVar.zzf(0);
                    zzafg zzafgVarZzc = zzafh.zzc(zzetVar);
                    zzv zzvVar = this.zzl;
                    if (zzvVar == null || zzafgVarZzc.zzc != zzvVar.zzI || zzafgVarZzc.zzb != zzvVar.zzK || !Objects.equals(zzafgVarZzc.zza, zzvVar.zzp)) {
                        zzt zztVar = new zzt();
                        zztVar.zza(this.zzf);
                        zztVar.zzn(this.zze);
                        String str = zzafgVarZzc.zza;
                        zztVar.zzo(str);
                        zztVar.zzH(zzafgVarZzc.zzc);
                        zztVar.zzJ(zzafgVarZzc.zzb);
                        zztVar.zze(this.zzc);
                        zztVar.zzg(this.zzd);
                        int i13 = zzafgVarZzc.zzf;
                        zztVar.zzj(i13);
                        if ("audio/ac3".equals(str)) {
                            zztVar.zzi(i13);
                        }
                        zzv zzvVarZzQ = zztVar.zzQ();
                        this.zzl = zzvVarZzQ;
                        this.zzg.zzA(zzvVarZzQ);
                    }
                    this.zzm = zzafgVarZzc.zzd;
                    this.zzk = (((long) zzafgVarZzc.zze) * 1000000) / ((long) this.zzl.zzK);
                    zzeuVar3.zzh(0);
                    this.zzg.zzc(zzeuVar3, 128);
                    this.zzh = 2;
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
