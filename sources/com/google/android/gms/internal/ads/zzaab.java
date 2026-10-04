package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzaab extends zzaau implements Comparable {
    private final int zze;
    private final boolean zzf;

    @Nullable
    private final String zzg;
    private final zzaaq zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final int zzu;
    private final boolean zzv;
    private final boolean zzw;
    private final boolean zzx;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzaab(int r8, com.google.android.gms.internal.ads.zzbg r9, int r10, com.google.android.gms.internal.ads.zzaaq r11, int r12, boolean r13, com.google.android.gms.internal.ads.zzgul r14, int r15) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaab.<init>(int, com.google.android.gms.internal.ads.zzbg, int, com.google.android.gms.internal.ads.zzaaq, int, boolean, com.google.android.gms.internal.ads.zzgul, int):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzaab zzaabVar) {
        boolean z10 = this.zzf;
        zzgzg zzgzgVarZza = (z10 && this.zzi) ? zzabc.zzc : zzabc.zzc.zza();
        zzgwz zzgwzVarZza = zzgwz.zzg().zzd(this.zzi, zzaabVar.zzi).zza(Integer.valueOf(this.zzk), Integer.valueOf(zzaabVar.zzk), zzgzg.zzb().zza()).zzb(this.zzj, zzaabVar.zzj).zzb(this.zzl, zzaabVar.zzl).zza(Integer.valueOf(this.zzm), Integer.valueOf(zzaabVar.zzm), zzgzg.zzb().zza()).zzd(this.zzq, zzaabVar.zzq).zzd(this.zzn, zzaabVar.zzn).zza(Integer.valueOf(this.zzo), Integer.valueOf(zzaabVar.zzo), zzgzg.zzb().zza()).zzb(this.zzp, zzaabVar.zzp).zzd(z10, zzaabVar.zzf).zza(Integer.valueOf(this.zzu), Integer.valueOf(zzaabVar.zzu), zzgzg.zzb().zza());
        boolean z11 = this.zzh.zzF;
        zzgwz zzgwzVarZza2 = zzgwzVarZza.zzd(this.zzv, zzaabVar.zzv).zzd(this.zzw, zzaabVar.zzw).zzd(this.zzx, zzaabVar.zzx).zza(Integer.valueOf(this.zzr), Integer.valueOf(zzaabVar.zzr), zzgzgVarZza).zza(Integer.valueOf(this.zzs), Integer.valueOf(zzaabVar.zzs), zzgzgVarZza);
        if (Objects.equals(this.zzg, zzaabVar.zzg)) {
            zzgwzVarZza2 = zzgwzVarZza2.zza(Integer.valueOf(this.zzt), Integer.valueOf(zzaabVar.zzt), zzgzgVarZza);
        }
        return zzgwzVarZza2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final /* bridge */ /* synthetic */ boolean zzc(zzaau zzaauVar) {
        String str;
        int i10;
        zzaab zzaabVar = (zzaab) zzaauVar;
        boolean z10 = this.zzh.zzR;
        zzv zzvVar = this.zzd;
        int i11 = zzvVar.zzI;
        if (i11 == -1) {
            return false;
        }
        zzv zzvVar2 = zzaabVar.zzd;
        return i11 == zzvVar2.zzI && (str = zzvVar.zzp) != null && TextUtils.equals(str, zzvVar2.zzp) && (i10 = zzvVar.zzK) != -1 && i10 == zzvVar2.zzK && this.zzv == zzaabVar.zzv && this.zzw == zzaabVar.zzw;
    }
}
