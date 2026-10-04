package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzepk implements zzhcv {
    final /* synthetic */ zzfld zza;
    final /* synthetic */ zzepl zzb;

    public zzepk(zzepl zzeplVar, zzfld zzfldVar) {
        this.zza = zzfldVar;
        Objects.requireNonNull(zzeplVar);
        this.zzb = zzeplVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        zzepl zzeplVar = this.zzb;
        synchronized (zzeplVar) {
            try {
                zzepm zzepmVarZzc = zzeplVar.zzc();
                zzfld zzfldVar = this.zza;
                zzepmVarZzc.zzc(th, zzfldVar);
                zzfld zzfldVarZza = zzeplVar.zzc().zza();
                if (zzfldVar.zzav) {
                    while (zzfldVarZza != null) {
                        zzeplVar.zzb(zzfldVarZza);
                        zzfldVarZza = zzeplVar.zzc().zza();
                    }
                } else if (zzfldVarZza != null) {
                    zzeplVar.zzb(zzfldVarZza);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzepl zzeplVar = this.zzb;
        zzeqc zzeqcVar = (zzeqc) obj;
        synchronized (zzeplVar) {
            try {
                zzeplVar.zzc().zzb(zzeqcVar, this.zza);
                zzfld zzfldVarZza = zzeplVar.zzc().zza();
                if (zzfldVarZza != null) {
                    zzeplVar.zzb(zzfldVarZza);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
