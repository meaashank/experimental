package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhjt {
    public static final /* synthetic */ int zza = 0;
    private static final zzich zzb;
    private static final zzhod zzc;
    private static final zzhoa zzd;
    private static final zzhna zze;
    private static final zzhmx zzf;

    static {
        zzich zzichVarZza = zzhpd.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zzichVarZza;
        zzc = zzhod.zzd(zzhjs.zza, zzhgm.class, zzhot.class);
        zzd = zzhoa.zzd(zzhjp.zza, zzichVarZza, zzhot.class);
        zze = zzhna.zzd(zzhjq.zza, zzhge.class, zzhos.class);
        zzf = zzhmx.zzd(zzhjr.zza, zzichVarZza, zzhos.class);
    }

    public static void zza(zzhnw zzhnwVar) throws GeneralSecurityException {
        zzhnwVar.zzd(zzc);
        zzhnwVar.zze(zzd);
        zzhnwVar.zzb(zze);
        zzhnwVar.zzc(zzf);
    }

    public static /* synthetic */ zzhot zzb(zzhgm zzhgmVar) throws GeneralSecurityException {
        zzhfm zzhfmVarZzf = zzf(zzhgmVar.zzg());
        zzhrv zzhrvVarZzd = zzhrw.zzd();
        zzhrz zzhrzVarZzc = zzhsa.zzc();
        zzhsb zzhsbVarZzb = zzhsc.zzb();
        zzhsbVarZzb.zza(zzhgmVar.zzf());
        zzhrzVarZzc.zza((zzhsc) zzhsbVarZzb.zzbu());
        zzhrzVarZzc.zzb(zzhgmVar.zzc());
        zzhrvVarZzd.zza((zzhsa) zzhrzVarZzc.zzbu());
        zzhto zzhtoVarZze = zzhtp.zze();
        zzhtoVarZze.zza(zzi(zzhgmVar));
        zzhtoVarZze.zzb(zzhgmVar.zzd());
        zzhrvVarZzd.zzb((zzhtp) zzhtoVarZze.zzbu());
        return zzhot.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", zzhfmVarZzf, ((zzhrw) zzhrvVarZzd.zzbu()).zzaM());
    }

    public static /* synthetic */ zzhgm zzc(zzhot zzhotVar) throws GeneralSecurityException {
        if (!zzhotVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzhotVar.zzc().zza())));
        }
        try {
            zzhrw zzhrwVarZzc = zzhrw.zzc(zzhotVar.zzc().zzb(), zziew.zzb());
            if (zzhrwVarZzc.zzb().zzc() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhgj zzhgjVarZzb = zzhgm.zzb();
            zzhgjVarZzb.zza(zzhrwVarZzc.zza().zzb());
            zzhgjVarZzb.zzb(zzhrwVarZzc.zzb().zzb());
            zzhgjVarZzb.zzc(zzhrwVarZzc.zza().zza().zza());
            zzhgjVarZzb.zzd(zzhrwVarZzc.zzb().zza().zzb());
            zzhgjVarZzb.zzf(zzh(zzhrwVarZzc.zzb().zza().zza()));
            zzhgjVarZzb.zze(zzg(zzhotVar.zzd()));
            return zzhgjVarZzb.zzg();
        } catch (zzige e10) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e10);
        }
    }

    public static /* synthetic */ zzhos zzd(zzhge zzhgeVar, zzhfr zzhfrVar) {
        zzhrt zzhrtVarZze = zzhru.zze();
        zzhrx zzhrxVarZzd = zzhry.zzd();
        zzhsb zzhsbVarZzb = zzhsc.zzb();
        zzhsbVarZzb.zza(zzhgeVar.zzg().zzf());
        zzhrxVarZzd.zza((zzhsc) zzhsbVarZzb.zzbu());
        byte[] bArrZzc = zzhgeVar.zze().zzc(zzhfrVar);
        zzhrxVarZzd.zzb(zziei.zzt(bArrZzc, 0, bArrZzc.length));
        zzhrtVarZze.zza((zzhry) zzhrxVarZzd.zzbu());
        zzhtm zzhtmVarZze = zzhtn.zze();
        zzhtmVarZze.zza(zzi(zzhgeVar.zzg()));
        byte[] bArrZzc2 = zzhgeVar.zzf().zzc(zzhfrVar);
        zzhtmVarZze.zzb(zziei.zzt(bArrZzc2, 0, bArrZzc2.length));
        zzhrtVarZze.zzb((zzhtn) zzhtmVarZze.zzbu());
        return zzhos.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzhru) zzhrtVarZze.zzbu()).zzaM(), zzhfl.zzb, zzf(zzhgeVar.zzg().zzg()), zzhgeVar.zzb());
    }

    public static /* synthetic */ zzhge zze(zzhos zzhosVar, zzhfr zzhfrVar) throws GeneralSecurityException {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            zzhru zzhruVarZzd = zzhru.zzd(zzhosVar.zzb(), zziew.zzb());
            if (zzhruVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzhruVarZzd.zzb().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zzhruVarZzd.zzc().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            zzhgj zzhgjVarZzb = zzhgm.zzb();
            zzhgjVarZzb.zza(zzhruVarZzd.zzb().zzc().zzb());
            zzhgjVarZzb.zzb(zzhruVarZzd.zzc().zzc().zzb());
            zzhgjVarZzb.zzc(zzhruVarZzd.zzb().zzb().zza());
            zzhgjVarZzb.zzd(zzhruVarZzd.zzc().zzb().zzb());
            zzhgjVarZzb.zzf(zzh(zzhruVarZzd.zzc().zzb().zza()));
            zzhgjVarZzb.zze(zzg(zzhosVar.zzd()));
            zzhgm zzhgmVarZzg = zzhgjVarZzb.zzg();
            zzhgd zzhgdVarZzd = zzhge.zzd();
            zzhgdVarZzd.zza(zzhgmVarZzg);
            zzhgdVarZzd.zzb(zzicj.zza(zzhruVarZzd.zzb().zzc().zzA(), zzhfrVar));
            zzhgdVarZzd.zzc(zzicj.zza(zzhruVarZzd.zzc().zzc().zzA(), zzhfrVar));
            zzhgdVarZzd.zzd(zzhosVar.zze());
            return zzhgdVarZzd.zze();
        } catch (zzige unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    private static zzhfm zzf(zzhgl zzhglVar) throws GeneralSecurityException {
        if (zzhglVar.equals(zzhgl.zza)) {
            return zzhfm.zzb;
        }
        if (zzhglVar.equals(zzhgl.zzb)) {
            return zzhfm.zze;
        }
        if (zzhglVar.equals(zzhgl.zzc)) {
            return zzhfm.zzd;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhglVar)));
    }

    private static zzhgl zzg(zzhfm zzhfmVar) throws GeneralSecurityException {
        if (zzhfmVar == zzhfm.zzb) {
            return zzhgl.zza;
        }
        if (zzhfmVar == zzhfm.zze || zzhfmVar == zzhfm.zzc) {
            return zzhgl.zzb;
        }
        if (zzhfmVar == zzhfm.zzd) {
            return zzhgl.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.toString()));
    }

    private static zzhgk zzh(zzhtl zzhtlVar) throws GeneralSecurityException {
        int iOrdinal = zzhtlVar.ordinal();
        if (iOrdinal == 1) {
            return zzhgk.zza;
        }
        if (iOrdinal == 2) {
            return zzhgk.zzd;
        }
        if (iOrdinal == 3) {
            return zzhgk.zzc;
        }
        if (iOrdinal == 4) {
            return zzhgk.zze;
        }
        if (iOrdinal == 5) {
            return zzhgk.zzb;
        }
        int iZza = zzhtlVar.zza();
        throw new GeneralSecurityException(androidx.multidex.d.a(new StringBuilder(String.valueOf(iZza).length() + 26), "Unable to parse HashType: ", iZza));
    }

    private static zzhtr zzi(zzhgm zzhgmVar) throws GeneralSecurityException {
        zzhtl zzhtlVar;
        zzhtq zzhtqVarZzc = zzhtr.zzc();
        zzhtqVarZzc.zzb(zzhgmVar.zze());
        zzhgk zzhgkVarZzh = zzhgmVar.zzh();
        if (zzhgkVarZzh.equals(zzhgk.zza)) {
            zzhtlVar = zzhtl.SHA1;
        } else if (zzhgkVarZzh.equals(zzhgk.zzb)) {
            zzhtlVar = zzhtl.SHA224;
        } else if (zzhgkVarZzh.equals(zzhgk.zzc)) {
            zzhtlVar = zzhtl.SHA256;
        } else if (zzhgkVarZzh.equals(zzhgk.zzd)) {
            zzhtlVar = zzhtl.SHA384;
        } else {
            if (!zzhgkVarZzh.equals(zzhgk.zze)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zzhgkVarZzh)));
            }
            zzhtlVar = zzhtl.SHA512;
        }
        zzhtqVarZzc.zza(zzhtlVar);
        return (zzhtr) zzhtqVarZzc.zzbu();
    }
}
