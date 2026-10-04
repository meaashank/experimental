package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
final class zzaas extends zzaau implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;

    public zzaas(int i10, zzbg zzbgVar, int i11, zzaaq zzaaqVar, int i12, @Nullable String str, @Nullable String str2) {
        int iZzj;
        super(i10, zzbgVar, i11);
        int i13 = 0;
        this.zzf = C3355u1.c(i12, false);
        int i14 = this.zzd.zze;
        int i15 = zzaaqVar.zzC;
        this.zzg = 1 == (i14 & 1);
        this.zzh = (i14 & 2) != 0;
        zzgxm zzgxmVarZzj = str2 != null ? zzgxm.zzj(str2) : zzaaqVar.zzy.isEmpty() ? zzgxm.zzj("") : zzaaqVar.zzy;
        int i16 = 0;
        while (true) {
            if (i16 >= zzgxmVarZzj.size()) {
                iZzj = 0;
                i16 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj = zzabc.zzj(this.zzd, (String) zzgxmVarZzj.get(i16), false);
                if (iZzj > 0) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        this.zzi = i16;
        this.zzj = iZzj;
        int iZzm = zzabc.zzm(this.zzd.zzf, str2 != null ? 1088 : 0);
        this.zzk = iZzm;
        zzv zzvVar = this.zzd;
        this.zzn = (1088 & zzvVar.zzf) != 0;
        int iZzn = zzabc.zzn(zzvVar, zzaaqVar.zzz);
        this.zzl = iZzn;
        int iZzj2 = zzabc.zzj(this.zzd, str, zzabc.zzi(str) == null);
        this.zzm = iZzj2;
        boolean z10 = iZzj > 0 || (zzaaqVar.zzy.isEmpty() && iZzm > 0) || ((zzaaqVar.zzy.isEmpty() && iZzn != Integer.MAX_VALUE) || this.zzg || (this.zzh && iZzj2 > 0));
        if (C3355u1.c(i12, zzaaqVar.zzV) && z10) {
            i13 = 1;
        }
        this.zze = i13;
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzaas zzaasVar) {
        zzgwz zzgwzVarZza = zzgwz.zzg().zzd(this.zzf, zzaasVar.zzf).zza(Integer.valueOf(this.zzi), Integer.valueOf(zzaasVar.zzi), zzgzg.zzb().zza());
        int i10 = this.zzj;
        zzgwz zzgwzVarZzb = zzgwzVarZza.zzb(i10, zzaasVar.zzj);
        int i11 = this.zzk;
        zzgwz zzgwzVarZzb2 = zzgwzVarZzb.zzb(i11, zzaasVar.zzk).zza(Integer.valueOf(this.zzl), Integer.valueOf(zzaasVar.zzl), zzgzg.zzb().zza()).zzd(this.zzg, zzaasVar.zzg).zza(Boolean.valueOf(this.zzh), Boolean.valueOf(zzaasVar.zzh), i10 == 0 ? zzgzg.zzb() : zzgzg.zzb().zza()).zzb(this.zzm, zzaasVar.zzm);
        if (i11 == 0) {
            zzgwzVarZzb2 = zzgwzVarZzb2.zzc(this.zzn, zzaasVar.zzn);
        }
        return zzgwzVarZzb2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final /* bridge */ /* synthetic */ boolean zzc(zzaau zzaauVar) {
        return false;
    }
}
