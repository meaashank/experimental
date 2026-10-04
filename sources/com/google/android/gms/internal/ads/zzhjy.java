package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhjy {
    public static final /* synthetic */ int zza = 0;
    private static final zzich zzb;
    private static final zzhod zzc;
    private static final zzhoa zzd;
    private static final zzhna zze;
    private static final zzhmx zzf;

    static {
        zzich zzichVarZza = zzhpd.zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zzichVarZza;
        zzc = zzhod.zzd(zzhjx.zza, zzhgu.class, zzhot.class);
        zzd = zzhoa.zzd(zzhju.zza, zzichVarZza, zzhot.class);
        zze = zzhna.zzd(zzhjv.zza, zzhgo.class, zzhos.class);
        zzf = zzhmx.zzd(zzhjw.zza, zzichVarZza, zzhos.class);
    }

    public static void zza(zzhnw zzhnwVar) throws GeneralSecurityException {
        zzhnwVar.zzd(zzc);
        zzhnwVar.zze(zzd);
        zzhnwVar.zzb(zze);
        zzhnwVar.zzc(zzf);
    }

    public static /* synthetic */ zzhot zzb(zzhgu zzhguVar) throws GeneralSecurityException {
        zzhfm zzhfmVarZzf = zzf(zzhguVar.zze());
        zzhsf zzhsfVarZzd = zzhsg.zzd();
        zzhsfVarZzd.zza(zzh(zzhguVar));
        zzhsfVarZzd.zzb(zzhguVar.zzc());
        return zzhot.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", zzhfmVarZzf, ((zzhsg) zzhsfVarZzd.zzbu()).zzaM());
    }

    public static /* synthetic */ zzhgu zzc(zzhot zzhotVar) throws GeneralSecurityException {
        if (!zzhotVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(zzhotVar.zzc().zza())));
        }
        try {
            zzhsg zzhsgVarZzc = zzhsg.zzc(zzhotVar.zzc().zzb(), zziew.zzb());
            zzhgs zzhgsVarZzb = zzhgu.zzb();
            zzhgsVarZzb.zza(zzhsgVarZzc.zzb());
            zzhgsVarZzb.zzb(zzhsgVarZzc.zza().zza());
            zzhgsVarZzb.zzc(16);
            zzhgsVarZzb.zzd(zzg(zzhotVar.zzd()));
            return zzhgsVarZzb.zze();
        } catch (zzige e10) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e10);
        }
    }

    public static /* synthetic */ zzhos zzd(zzhgo zzhgoVar, zzhfr zzhfrVar) {
        zzhsd zzhsdVarZze = zzhse.zze();
        zzhsdVarZze.zza(zzh(zzhgoVar.zzf()));
        byte[] bArrZzc = zzhgoVar.zze().zzc(zzhfrVar);
        zzhsdVarZze.zzb(zziei.zzt(bArrZzc, 0, bArrZzc.length));
        return zzhos.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzhse) zzhsdVarZze.zzbu()).zzaM(), zzhfl.zzb, zzf(zzhgoVar.zzf().zze()), zzhgoVar.zzb());
    }

    public static /* synthetic */ zzhgo zze(zzhos zzhosVar, zzhfr zzhfrVar) throws GeneralSecurityException {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            zzhse zzhseVarZzd = zzhse.zzd(zzhosVar.zzb(), zziew.zzb());
            if (zzhseVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhgs zzhgsVarZzb = zzhgu.zzb();
            zzhgsVarZzb.zza(zzhseVarZzd.zzc().zzb());
            zzhgsVarZzb.zzb(zzhseVarZzd.zzb().zza());
            zzhgsVarZzb.zzc(16);
            zzhgsVarZzb.zzd(zzg(zzhosVar.zzd()));
            zzhgu zzhguVarZze = zzhgsVarZzb.zze();
            zzhgn zzhgnVarZzd = zzhgo.zzd();
            zzhgnVarZzd.zza(zzhguVarZze);
            zzhgnVarZzd.zzb(zzicj.zza(zzhseVarZzd.zzc().zzA(), zzhfrVar));
            zzhgnVarZzd.zzc(zzhosVar.zze());
            return zzhgnVarZzd.zzd();
        } catch (zzige unused) {
            throw new GeneralSecurityException("Parsing AesEaxKey failed");
        }
    }

    private static zzhfm zzf(zzhgt zzhgtVar) throws GeneralSecurityException {
        if (zzhgtVar.equals(zzhgt.zza)) {
            return zzhfm.zzb;
        }
        if (zzhgtVar.equals(zzhgt.zzb)) {
            return zzhfm.zze;
        }
        if (zzhgtVar.equals(zzhgt.zzc)) {
            return zzhfm.zzd;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhgtVar)));
    }

    private static zzhgt zzg(zzhfm zzhfmVar) throws GeneralSecurityException {
        if (zzhfmVar == zzhfm.zzb) {
            return zzhgt.zza;
        }
        if (zzhfmVar == zzhfm.zze || zzhfmVar == zzhfm.zzc) {
            return zzhgt.zzb;
        }
        if (zzhfmVar == zzhfm.zzd) {
            return zzhgt.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.toString()));
    }

    private static zzhsi zzh(zzhgu zzhguVar) throws GeneralSecurityException {
        zzhsh zzhshVarZzb = zzhsi.zzb();
        zzhshVarZzb.zza(zzhguVar.zzd());
        return (zzhsi) zzhshVarZzb.zzbu();
    }
}
