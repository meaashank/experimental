package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhkm {
    public static final /* synthetic */ int zza = 0;
    private static final zzich zzb;
    private static final zzhod zzc;
    private static final zzhoa zzd;
    private static final zzhna zze;
    private static final zzhmx zzf;

    static {
        zzich zzichVarZza = zzhpd.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zzichVarZza;
        zzc = zzhod.zzd(zzhkl.zza, zzhhm.class, zzhot.class);
        zzd = zzhoa.zzd(zzhki.zza, zzichVarZza, zzhot.class);
        zze = zzhna.zzd(zzhkj.zza, zzhhf.class, zzhos.class);
        zzf = zzhmx.zzd(zzhkk.zza, zzichVarZza, zzhos.class);
    }

    public static void zza(zzhnw zzhnwVar) throws GeneralSecurityException {
        zzhnwVar.zzd(zzc);
        zzhnwVar.zze(zzd);
        zzhnwVar.zzb(zze);
        zzhnwVar.zzc(zzf);
    }

    public static /* synthetic */ zzhot zzb(zzhhm zzhhmVar) throws GeneralSecurityException {
        zzhfm zzhfmVarZzf = zzf(zzhhmVar.zzd());
        zzhsp zzhspVarZzd = zzhsq.zzd();
        zzhspVarZzd.zza(zzhhmVar.zzc());
        return zzhot.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", zzhfmVarZzf, ((zzhsq) zzhspVarZzd.zzbu()).zzaM());
    }

    public static /* synthetic */ zzhhm zzc(zzhot zzhotVar) throws GeneralSecurityException {
        if (!zzhotVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(zzhotVar.zzc().zza())));
        }
        try {
            zzhsq zzhsqVarZzc = zzhsq.zzc(zzhotVar.zzc().zzb(), zziew.zzb());
            if (zzhsqVarZzc.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzhhk zzhhkVarZzb = zzhhm.zzb();
            zzhhkVarZzb.zza(zzhsqVarZzc.zza());
            zzhhkVarZzb.zzb(zzg(zzhotVar.zzd()));
            return zzhhkVarZzb.zzc();
        } catch (zzige e10) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e10);
        }
    }

    public static /* synthetic */ zzhos zzd(zzhhf zzhhfVar, zzhfr zzhfrVar) {
        zzhsn zzhsnVarZzd = zzhso.zzd();
        byte[] bArrZzc = zzhhfVar.zze().zzc(zzhfrVar);
        zzhsnVarZzd.zza(zziei.zzt(bArrZzc, 0, bArrZzc.length));
        return zzhos.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzhso) zzhsnVarZzd.zzbu()).zzaM(), zzhfl.zzb, zzf(zzhhfVar.zzf().zzd()), zzhhfVar.zzb());
    }

    public static /* synthetic */ zzhhf zze(zzhos zzhosVar, zzhfr zzhfrVar) throws GeneralSecurityException {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            zzhso zzhsoVarZzc = zzhso.zzc(zzhosVar.zzb(), zziew.zzb());
            if (zzhsoVarZzc.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhhk zzhhkVarZzb = zzhhm.zzb();
            zzhhkVarZzb.zza(zzhsoVarZzc.zzb().zzb());
            zzhhkVarZzb.zzb(zzg(zzhosVar.zzd()));
            zzhhm zzhhmVarZzc = zzhhkVarZzb.zzc();
            zzhhe zzhheVarZzd = zzhhf.zzd();
            zzhheVarZzd.zza(zzhhmVarZzc);
            zzhheVarZzd.zzb(zzicj.zza(zzhsoVarZzc.zzb().zzA(), zzhfrVar));
            zzhheVarZzd.zzc(zzhosVar.zze());
            return zzhheVarZzd.zzd();
        } catch (zzige unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    private static zzhfm zzf(zzhhl zzhhlVar) throws GeneralSecurityException {
        if (zzhhlVar.equals(zzhhl.zza)) {
            return zzhfm.zzb;
        }
        if (zzhhlVar.equals(zzhhl.zzb)) {
            return zzhfm.zze;
        }
        if (zzhhlVar.equals(zzhhl.zzc)) {
            return zzhfm.zzd;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhhlVar)));
    }

    private static zzhhl zzg(zzhfm zzhfmVar) throws GeneralSecurityException {
        if (zzhfmVar == zzhfm.zzb) {
            return zzhhl.zza;
        }
        if (zzhfmVar == zzhfm.zze || zzhfmVar == zzhfm.zzc) {
            return zzhhl.zzb;
        }
        if (zzhfmVar == zzhfm.zzd) {
            return zzhhl.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.toString()));
    }
}
