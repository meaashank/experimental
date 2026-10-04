package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhkf {
    public static final /* synthetic */ int zza = 0;
    private static final zzich zzb;
    private static final zzhod zzc;
    private static final zzhoa zzd;
    private static final zzhna zze;
    private static final zzhmx zzf;

    static {
        zzich zzichVarZza = zzhpd.zza("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zzichVarZza;
        zzc = zzhod.zzd(zzhke.zza, zzhhd.class, zzhot.class);
        zzd = zzhoa.zzd(zzhkb.zza, zzichVarZza, zzhot.class);
        zze = zzhna.zzd(zzhkc.zza, zzhgw.class, zzhos.class);
        zzf = zzhmx.zzd(zzhkd.zza, zzichVarZza, zzhos.class);
    }

    public static void zza(zzhnw zzhnwVar) throws GeneralSecurityException {
        zzhnwVar.zzd(zzc);
        zzhnwVar.zze(zzd);
        zzhnwVar.zzb(zze);
        zzhnwVar.zzc(zzf);
    }

    public static /* synthetic */ zzhot zzb(zzhhd zzhhdVar) throws GeneralSecurityException {
        zzhfm zzhfmVarZzf = zzf(zzhhdVar.zzd());
        zzhsl zzhslVarZzd = zzhsm.zzd();
        zzhslVarZzd.zza(zzhhdVar.zzc());
        return zzhot.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", zzhfmVarZzf, ((zzhsm) zzhslVarZzd.zzbu()).zzaM());
    }

    public static /* synthetic */ zzhhd zzc(zzhot zzhotVar) throws GeneralSecurityException {
        if (!zzhotVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzhotVar.zzc().zza())));
        }
        try {
            zzhsm zzhsmVarZzc = zzhsm.zzc(zzhotVar.zzc().zzb(), zziew.zzb());
            if (zzhsmVarZzc.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzhhb zzhhbVarZzb = zzhhd.zzb();
            zzhhbVarZzb.zza(zzhsmVarZzc.zza());
            zzhhbVarZzb.zzb(12);
            zzhhbVarZzb.zzc(16);
            zzhhbVarZzb.zzd(zzg(zzhotVar.zzd()));
            return zzhhbVarZzb.zze();
        } catch (zzige e10) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e10);
        }
    }

    public static /* synthetic */ zzhos zzd(zzhgw zzhgwVar, zzhfr zzhfrVar) {
        zzhsj zzhsjVarZzd = zzhsk.zzd();
        byte[] bArrZzc = zzhgwVar.zze().zzc(zzhfrVar);
        zzhsjVarZzd.zza(zziei.zzt(bArrZzc, 0, bArrZzc.length));
        return zzhos.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzhsk) zzhsjVarZzd.zzbu()).zzaM(), zzhfl.zzb, zzf(zzhgwVar.zzf().zzd()), zzhgwVar.zzb());
    }

    public static /* synthetic */ zzhgw zze(zzhos zzhosVar, zzhfr zzhfrVar) throws GeneralSecurityException {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            zzhsk zzhskVarZzc = zzhsk.zzc(zzhosVar.zzb(), zziew.zzb());
            if (zzhskVarZzc.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhhb zzhhbVarZzb = zzhhd.zzb();
            zzhhbVarZzb.zza(zzhskVarZzc.zzb().zzb());
            zzhhbVarZzb.zzb(12);
            zzhhbVarZzb.zzc(16);
            zzhhbVarZzb.zzd(zzg(zzhosVar.zzd()));
            zzhhd zzhhdVarZze = zzhhbVarZzb.zze();
            zzhgv zzhgvVarZzd = zzhgw.zzd();
            zzhgvVarZzd.zza(zzhhdVarZze);
            zzhgvVarZzd.zzb(zzicj.zza(zzhskVarZzc.zzb().zzA(), zzhfrVar));
            zzhgvVarZzd.zzc(zzhosVar.zze());
            return zzhgvVarZzd.zzd();
        } catch (zzige unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    private static zzhfm zzf(zzhhc zzhhcVar) throws GeneralSecurityException {
        if (zzhhcVar.equals(zzhhc.zza)) {
            return zzhfm.zzb;
        }
        if (zzhhcVar.equals(zzhhc.zzb)) {
            return zzhfm.zze;
        }
        if (zzhhcVar.equals(zzhhc.zzc)) {
            return zzhfm.zzd;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhhcVar)));
    }

    private static zzhhc zzg(zzhfm zzhfmVar) throws GeneralSecurityException {
        if (zzhfmVar == zzhfm.zzb) {
            return zzhhc.zza;
        }
        if (zzhfmVar == zzhfm.zze || zzhfmVar == zzhfm.zzc) {
            return zzhhc.zzb;
        }
        if (zzhfmVar == zzhfm.zzd) {
            return zzhhc.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.toString()));
    }
}
