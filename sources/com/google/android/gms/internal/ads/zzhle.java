package com.google.android.gms.internal.ads;

import androidx.fragment.app.C2564b;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhle {
    public static zzhek zza(zzhfe zzhfeVar, zzhop zzhopVar) throws GeneralSecurityException {
        zzhni zzhniVar;
        zzhni zzhniVarZza;
        zzich zzichVarZzd;
        zzhof zzhofVar = new zzhof();
        for (int i10 = 0; i10 < zzhfeVar.zzd(); i10++) {
            zzhfb zzhfbVarZze = ((zzhfd) zzhfeVar).zze(i10);
            if (zzhfbVarZze.zzb().equals(zzheu.zza)) {
                zzhes zzhesVarZza = zzhfbVarZze.zza();
                if (zzhesVarZza instanceof zzhfz) {
                    zzichVarZzd = ((zzhfz) zzhesVarZza).zzc();
                } else {
                    if (!(zzhesVarZza instanceof zzhne)) {
                        String name = zzhesVarZza.getClass().getName();
                        String strValueOf = String.valueOf(zzhesVarZza.zza());
                        throw new GeneralSecurityException(C2564b.a(new StringBuilder(name.length() + 59 + strValueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", strValueOf));
                    }
                    zzichVarZzd = ((zzhne) zzhesVarZza).zzd();
                }
                zzhofVar.zza(zzichVarZzd, new zzhlc((zzhek) zzhopVar.zza(zzhfbVarZze), zzhfbVarZze.zzc()));
            }
        }
        zzhnh zzhnhVar = (zzhnh) zzhfeVar.zzf(zzhnh.class);
        if (zzhnhVar == null || zzhnhVar.zza()) {
            zzhniVar = zzhnl.zza;
            zzhniVarZza = zzhniVar;
        } else {
            zzhnj zzhnjVarZzb = zzhnr.zza().zzb();
            zzhni zzhniVarZza2 = zzhnjVarZzb.zza(zzhfeVar, zzhnhVar, "aead", "encrypt");
            zzhniVarZza = zzhnjVarZzb.zza(zzhfeVar, zzhnhVar, "aead", "decrypt");
            zzhniVar = zzhniVarZza2;
        }
        zzhfd zzhfdVar = (zzhfd) zzhfeVar;
        return new zzhld(new zzhlc((zzhek) zzhopVar.zza(zzhfdVar.zzc()), zzhfdVar.zzc().zzc()), zzhofVar.zzb(), zzhniVar, zzhniVarZza, null);
    }
}
