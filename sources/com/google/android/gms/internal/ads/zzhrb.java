package com.google.android.gms.internal.ads;

import androidx.fragment.app.C2564b;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhrb {
    public static zzhpn zza(zzhfe zzhfeVar, zzhop zzhopVar) throws GeneralSecurityException {
        zzich zzichVarZzd;
        zzhfb zzhfbVarZzc = ((zzhfd) zzhfeVar).zzc();
        zzhof zzhofVar = new zzhof();
        for (int i10 = 0; i10 < zzhfeVar.zzd(); i10++) {
            zzhfb zzhfbVarZze = ((zzhfd) zzhfeVar).zze(i10);
            if (zzhfbVarZze.zzb().equals(zzheu.zza)) {
                zzhpn zzhpnVar = (zzhpn) zzhopVar.zza(zzhfbVarZze);
                zzhes zzhesVarZza = zzhfbVarZze.zza();
                if (zzhesVarZza instanceof zzhqb) {
                    zzichVarZzd = ((zzhqb) zzhesVarZza).zze();
                } else {
                    if (!(zzhesVarZza instanceof zzhne)) {
                        String name = zzhesVarZza.getClass().getName();
                        String strValueOf = String.valueOf(zzhesVarZza.zza());
                        throw new GeneralSecurityException(C2564b.a(new StringBuilder(name.length() + 59 + strValueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", strValueOf));
                    }
                    zzichVarZzd = ((zzhne) zzhesVarZza).zzd();
                }
                zzhofVar.zza(zzichVarZzd, zzhpnVar);
            }
        }
        return new zzhra(zzhofVar.zzb(), (zzhpn) zzhopVar.zza(zzhfbVarZzc), null);
    }
}
