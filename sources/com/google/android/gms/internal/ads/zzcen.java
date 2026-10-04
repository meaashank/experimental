package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes4.dex */
final class zzcen extends zzces {
    final zziof zza;
    final zziof zzb;
    final zziof zzc;
    final zziof zzd;
    final zziof zze;
    final zziof zzf;
    final zziof zzg;
    final zziof zzh;
    private final Clock zzj;

    public zzcen(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzcer zzcerVar) {
        this.zzj = clock;
        zzinw zzinwVarZza = zzinx.zza(context);
        this.zza = zzinwVarZza;
        zzinw zzinwVarZza2 = zzinx.zza(zzgVar);
        this.zzb = zzinwVarZza2;
        this.zzc = zzinv.zza(zzceh.zza(zzinwVarZza, zzinwVarZza2));
        zzinw zzinwVarZza3 = zzinx.zza(clock);
        this.zzd = zzinwVarZza3;
        zzinw zzinwVarZza4 = zzinx.zza(zzcerVar);
        this.zze = zzinwVarZza4;
        zziof zziofVarZza = zzinv.zza(zzcej.zza(zzinwVarZza3, zzinwVarZza2, zzinwVarZza4));
        this.zzf = zziofVarZza;
        zzcel zzcelVarZzc = zzcel.zzc(zzinwVarZza3, zziofVarZza);
        this.zzg = zzcelVarZzc;
        this.zzh = zzinv.zza(zzcey.zza(zzinwVarZza, zzcelVarZzc));
    }

    @Override // com.google.android.gms.internal.ads.zzces
    public final zzcek zza() {
        return new zzcek(this.zzj, (zzcei) this.zzf.zzb());
    }
}
