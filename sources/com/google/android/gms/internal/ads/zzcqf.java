package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class zzcqf implements zzecb {
    final zziof zza;
    final zziof zzb;
    final zziof zzc;
    final zziof zzd;
    private final Context zze;
    private final zzbri zzf;
    private final zzcpp zzg;
    private final zzcqf zzh = this;

    public zzcqf(zzcpp zzcppVar, Context context, zzbri zzbriVar) {
        this.zzg = zzcppVar;
        this.zze = context;
        this.zzf = zzbriVar;
        zzinw zzinwVarZza = zzinx.zza(this);
        this.zza = zzinwVarZza;
        zzinw zzinwVarZza2 = zzinx.zza(zzbriVar);
        this.zzb = zzinwVarZza2;
        zzebx zzebxVarZzc = zzebx.zzc(zzinwVarZza2);
        this.zzc = zzebxVarZzc;
        this.zzd = zzinv.zza(zzebz.zza(zzinwVarZza, zzebxVarZzc));
    }

    public final zzebw zza() {
        return zzebx.zzd(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzecb
    public final zzeby zzb() {
        return (zzeby) this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzecb
    public final zzebt zzc() {
        return new zzcqc(this.zzg, this.zzh, null);
    }

    public final /* synthetic */ Context zzd() {
        return this.zze;
    }
}
