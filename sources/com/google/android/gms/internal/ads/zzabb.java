package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzabb extends zzaau {
    private final boolean zze;
    private final zzaaq zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final int zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final boolean zzv;
    private final int zzw;
    private final boolean zzx;

    @Nullable
    private final String zzy;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzabb(int r5, com.google.android.gms.internal.ads.zzbg r6, int r7, com.google.android.gms.internal.ads.zzaaq r8, int r9, @androidx.annotation.Nullable java.lang.String r10, int r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabb.<init>(int, com.google.android.gms.internal.ads.zzbg, int, com.google.android.gms.internal.ads.zzaaq, int, java.lang.String, int, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzi(zzabb zzabbVar, zzabb zzabbVar2) {
        return zzgwz.zzg().zzd(zzabbVar.zzh, zzabbVar2.zzh).zza(Integer.valueOf(zzabbVar.zzm), Integer.valueOf(zzabbVar2.zzm), zzgzg.zzb().zza()).zzb(zzabbVar.zzn, zzabbVar2.zzn).zzb(zzabbVar.zzo, zzabbVar2.zzo).zza(Integer.valueOf(zzabbVar.zzp), Integer.valueOf(zzabbVar2.zzp), zzgzg.zzb().zza()).zzd(zzabbVar.zzq, zzabbVar2.zzq).zzb(zzabbVar.zzr, zzabbVar2.zzr).zzd(zzabbVar.zzi, zzabbVar2.zzi).zzd(zzabbVar.zze, zzabbVar2.zze).zzd(zzabbVar.zzg, zzabbVar2.zzg).zza(Integer.valueOf(zzabbVar.zzl), Integer.valueOf(zzabbVar2.zzl), zzgzg.zzb().zza()).zzd(zzabbVar.zzt, zzabbVar2.zzt).zzd(zzabbVar.zzv, zzabbVar2.zzv).zze();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzj(zzabb zzabbVar, zzabb zzabbVar2) {
        zzgzg zzgzgVarZza = (zzabbVar.zze && zzabbVar.zzh) ? zzabc.zzc : zzabc.zzc.zza();
        zzgwz zzgwzVarZzg = zzgwz.zzg();
        boolean z10 = zzabbVar.zzf.zzF;
        zzgwz zzgwzVarZza = zzgwzVarZzg.zzd(zzabbVar.zzx, zzabbVar2.zzx).zza(Integer.valueOf(zzabbVar.zzk), Integer.valueOf(zzabbVar2.zzk), zzgzgVarZza);
        if (zzabbVar.zzt && zzabbVar.zzv) {
            zzgwzVarZza = zzgwzVarZza.zzb(zzabbVar.zzw, zzabbVar2.zzw);
        }
        return zzgwzVarZza.zzd(zzabbVar.zzu, zzabbVar2.zzu).zza(Integer.valueOf(zzabbVar.zzj), Integer.valueOf(zzabbVar2.zzj), zzgzgVarZza).zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final int zza() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final /* bridge */ /* synthetic */ boolean zzc(zzaau zzaauVar) {
        zzabb zzabbVar = (zzabb) zzaauVar;
        if (!Objects.equals(this.zzy, zzabbVar.zzy)) {
            return false;
        }
        boolean z10 = this.zzf.zzN;
        return this.zzt == zzabbVar.zzt && this.zzv == zzabbVar.zzv;
    }
}
