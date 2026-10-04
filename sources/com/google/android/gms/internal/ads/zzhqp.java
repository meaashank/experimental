package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhqp {
    public static final /* synthetic */ int zza = 0;
    private static final zzich zzb;
    private static final zzhod zzc;
    private static final zzhoa zzd;
    private static final zzhna zze;
    private static final zzhmx zzf;

    static {
        zzich zzichVarZza = zzhpd.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zzichVarZza;
        zzc = zzhod.zzd(zzhqo.zza, zzhpm.class, zzhot.class);
        zzd = zzhoa.zzd(zzhql.zza, zzichVarZza, zzhot.class);
        zze = zzhna.zzd(zzhqm.zza, zzhpf.class, zzhos.class);
        zzf = zzhmx.zzd(zzhqn.zza, zzichVarZza, zzhos.class);
    }

    public static void zza(zzhnw zzhnwVar) throws GeneralSecurityException {
        zzhnwVar.zzd(zzc);
        zzhnwVar.zze(zzd);
        zzhnwVar.zzb(zze);
        zzhnwVar.zzc(zzf);
    }

    public static /* synthetic */ zzhot zzb(zzhpm zzhpmVar) throws GeneralSecurityException {
        zzhfm zzhfmVarZzf = zzf(zzhpmVar.zzf());
        zzhrp zzhrpVarZzd = zzhrq.zzd();
        zzhrpVarZzd.zzb(zzh(zzhpmVar));
        zzhrpVarZzd.zza(zzhpmVar.zzc());
        return zzhot.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", zzhfmVarZzf, ((zzhrq) zzhrpVarZzd.zzbu()).zzaM());
    }

    public static /* synthetic */ zzhpm zzc(zzhot zzhotVar) throws GeneralSecurityException {
        if (!zzhotVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzhotVar.zzc().zza())));
        }
        try {
            zzhrq zzhrqVarZzc = zzhrq.zzc(zzhotVar.zzc().zzb(), zziew.zzb());
            zzhpk zzhpkVarZzb = zzhpm.zzb();
            zzhpkVarZzb.zza(zzhrqVarZzc.zza());
            zzhpkVarZzb.zzb(zzhrqVarZzc.zzb().zza());
            zzhpkVarZzb.zzc(zzg(zzhotVar.zzd()));
            return zzhpkVarZzb.zzd();
        } catch (zzige e10) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e10);
        }
    }

    public static /* synthetic */ zzhos zzd(zzhpf zzhpfVar, zzhfr zzhfrVar) {
        zzhrn zzhrnVarZze = zzhro.zze();
        zzhrnVarZze.zzb(zzh(zzhpfVar.zzf()));
        byte[] bArrZzc = zzhpfVar.zzd().zzc(zzhfrVar);
        zzhrnVarZze.zza(zziei.zzt(bArrZzc, 0, bArrZzc.length));
        return zzhos.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzhro) zzhrnVarZze.zzbu()).zzaM(), zzhfl.zzb, zzf(zzhpfVar.zzf().zzf()), zzhpfVar.zzb());
    }

    public static /* synthetic */ zzhpf zze(zzhos zzhosVar, zzhfr zzhfrVar) throws GeneralSecurityException {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzhro zzhroVarZzd = zzhro.zzd(zzhosVar.zzb(), zziew.zzb());
            if (zzhroVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhpk zzhpkVarZzb = zzhpm.zzb();
            zzhpkVarZzb.zza(zzhroVarZzd.zzb().zzb());
            zzhpkVarZzb.zzb(zzhroVarZzd.zzc().zza());
            zzhpkVarZzb.zzc(zzg(zzhosVar.zzd()));
            zzhpm zzhpmVarZzd = zzhpkVarZzb.zzd();
            zzhpe zzhpeVarZzc = zzhpf.zzc();
            zzhpeVarZzc.zza(zzhpmVarZzd);
            zzhpeVarZzc.zzb(zzicj.zza(zzhroVarZzd.zzb().zzA(), zzhfrVar));
            zzhpeVarZzc.zzc(zzhosVar.zze());
            return zzhpeVarZzc.zzd();
        } catch (zzige | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    private static zzhfm zzf(zzhpl zzhplVar) throws GeneralSecurityException {
        if (zzhplVar.equals(zzhpl.zza)) {
            return zzhfm.zzb;
        }
        if (zzhplVar.equals(zzhpl.zzb)) {
            return zzhfm.zze;
        }
        if (zzhplVar.equals(zzhpl.zzd)) {
            return zzhfm.zzd;
        }
        if (zzhplVar.equals(zzhpl.zzc)) {
            return zzhfm.zzc;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhplVar)));
    }

    private static zzhpl zzg(zzhfm zzhfmVar) throws GeneralSecurityException {
        if (zzhfmVar == zzhfm.zzb) {
            return zzhpl.zza;
        }
        if (zzhfmVar == zzhfm.zze) {
            return zzhpl.zzb;
        }
        if (zzhfmVar == zzhfm.zzc) {
            return zzhpl.zzc;
        }
        if (zzhfmVar == zzhfm.zzd) {
            return zzhpl.zzd;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.toString()));
    }

    private static zzhrs zzh(zzhpm zzhpmVar) {
        zzhrr zzhrrVarZzb = zzhrs.zzb();
        zzhrrVarZzb.zza(zzhpmVar.zzd());
        return (zzhrs) zzhrrVarZzb.zzbu();
    }
}
