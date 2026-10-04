package com.google.android.gms.internal.ads;

import androidx.fragment.app.C2564b;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zziak {
    public static zzhfo zza(zzhfe zzhfeVar, zzhop zzhopVar) throws GeneralSecurityException {
        zzich zzichVarZzd;
        zzhof zzhofVar = new zzhof();
        for (int i10 = 0; i10 < zzhfeVar.zzd(); i10++) {
            zzhfb zzhfbVarZze = ((zzhfd) zzhfeVar).zze(i10);
            if (zzhfbVarZze.zzb().equals(zzheu.zza)) {
                zzhfo zzhfoVar = (zzhfo) zzhopVar.zza(zzhfbVarZze);
                zzhes zzhesVarZza = zzhfbVarZze.zza();
                if (zzhesVarZza instanceof zzhyo) {
                    zzichVarZzd = ((zzhyo) zzhesVarZza).zze();
                } else {
                    if (!(zzhesVarZza instanceof zzhne)) {
                        String name = zzhesVarZza.getClass().getName();
                        String strValueOf = String.valueOf(zzhesVarZza.zza());
                        throw new GeneralSecurityException(C2564b.a(new StringBuilder(name.length() + 59 + strValueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", strValueOf));
                    }
                    zzichVarZzd = ((zzhne) zzhesVarZza).zzd();
                }
                zzhofVar.zza(zzichVarZzd, new zziaj(zzhfoVar, zzhfbVarZze.zzc()));
            }
        }
        zzhnh zzhnhVar = (zzhnh) zzhfeVar.zzf(zzhnh.class);
        return new zziai(zzhofVar.zzb(), (zzhnhVar == null || zzhnhVar.zza()) ? zzhnl.zza : zzhnr.zza().zzb().zza(zzhfeVar, zzhnhVar, "public_key_verify", "verify"));
    }
}
