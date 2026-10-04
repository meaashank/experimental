package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzhfw implements zzhop {
    static final /* synthetic */ zzhfw zza = new zzhfw();

    private /* synthetic */ zzhfw() {
    }

    @Override // com.google.android.gms.internal.ads.zzhop
    public final /* synthetic */ Object zza(zzhfb zzhfbVar) throws GeneralSecurityException {
        zzhes zzhesVarZza = zzhfbVar.zza();
        if (zzhesVarZza instanceof zzhge) {
            return zzibc.zzb((zzhge) zzhesVarZza);
        }
        if (zzhesVarZza instanceof zzhgw) {
            return zziap.zzb((zzhgw) zzhesVarZza);
        }
        if (zzhesVarZza instanceof zzhhf) {
            return zzhlt.zzb((zzhhf) zzhesVarZza);
        }
        if (zzhesVarZza instanceof zzhgo) {
            return zziao.zzb((zzhgo) zzhesVarZza);
        }
        if (zzhesVarZza instanceof zzhhn) {
            zzhhn zzhhnVar = (zzhhn) zzhesVarZza;
            return zzhkn.zzd() ? zzhkn.zzb(zzhhnVar) : zziau.zzb(zzhhnVar);
        }
        if (zzhesVarZza instanceof zzhji) {
            zzhji zzhjiVar = (zzhji) zzhesVarZza;
            return zzhkn.zzd() ? zzhll.zzb(zzhjiVar) : zzicg.zzb(zzhjiVar);
        }
        if (zzhesVarZza instanceof zzhjc) {
            return zzhlf.zzb((zzhjc) zzhesVarZza);
        }
        throw new GeneralSecurityException("Unknown key class: ".concat(String.valueOf(zzhesVarZza.getClass())));
    }
}
