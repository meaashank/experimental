package com.google.android.gms.internal.ads;

import androidx.fragment.app.C2564b;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhre {
    public static zzhfi zza(zzhfe zzhfeVar, zzhop zzhopVar) throws GeneralSecurityException {
        zzhni zzhniVar;
        zzhni zzhniVarZza;
        zzich zzichVarZzd;
        zzhof zzhofVar = new zzhof();
        for (int i10 = 0; i10 < zzhfeVar.zzd(); i10++) {
            zzhfb zzhfbVarZze = ((zzhfd) zzhfeVar).zze(i10);
            if (zzhfbVarZze.zzb().equals(zzheu.zza)) {
                zzhfi zzhfiVar = (zzhfi) zzhopVar.zza(zzhfbVarZze);
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
                zzhofVar.zza(zzichVarZzd, new zzhrc(zzhfiVar, zzhfbVarZze.zzc()));
            }
        }
        zzhnh zzhnhVar = (zzhnh) zzhfeVar.zzf(zzhnh.class);
        if (zzhnhVar == null || zzhnhVar.zza()) {
            zzhniVar = zzhnl.zza;
            zzhniVarZza = zzhniVar;
        } else {
            zzhnj zzhnjVarZzb = zzhnr.zza().zzb();
            zzhni zzhniVarZza2 = zzhnjVarZzb.zza(zzhfeVar, zzhnhVar, com.prism.gaia.server.accounts.e.f166466e, "compute");
            zzhniVarZza = zzhnjVarZzb.zza(zzhfeVar, zzhnhVar, com.prism.gaia.server.accounts.e.f166466e, "verify");
            zzhniVar = zzhniVarZza2;
        }
        zzhfd zzhfdVar = (zzhfd) zzhfeVar;
        return new zzhrd(new zzhrc((zzhfi) zzhopVar.zza(zzhfdVar.zzc()), zzhfdVar.zzc().zzc()), zzhofVar.zzb(), zzhniVar, zzhniVarZza, null);
    }
}
