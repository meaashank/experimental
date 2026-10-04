package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhqy {
    public static final /* synthetic */ int zza = 0;
    private static final zzich zzb;
    private static final zzhmo zzc;
    private static final zzhod zzd;
    private static final zzhoa zze;
    private static final zzhna zzf;
    private static final zzhmx zzg;

    static {
        zzich zzichVarZza = zzhpd.zza("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zzichVarZza;
        zzhmn zzhmnVarZza = zzhmo.zza();
        zzhmnVarZza.zza(zzhtl.SHA1, zzhpx.zza);
        zzhmnVarZza.zza(zzhtl.SHA224, zzhpx.zzb);
        zzhmnVarZza.zza(zzhtl.SHA256, zzhpx.zzc);
        zzhmnVarZza.zza(zzhtl.SHA384, zzhpx.zzd);
        zzhmnVarZza.zza(zzhtl.SHA512, zzhpx.zze);
        zzc = zzhmnVarZza.zzb();
        zzd = zzhod.zzd(zzhqx.zza, zzhpz.class, zzhot.class);
        zze = zzhoa.zzd(zzhqu.zza, zzichVarZza, zzhot.class);
        zzf = zzhna.zzd(zzhqv.zza, zzhpq.class, zzhos.class);
        zzg = zzhmx.zzd(zzhqw.zza, zzichVarZza, zzhos.class);
    }

    public static void zza(zzhnw zzhnwVar) throws GeneralSecurityException {
        zzhnwVar.zzd(zzd);
        zzhnwVar.zze(zze);
        zzhnwVar.zzb(zzf);
        zzhnwVar.zzc(zzg);
    }

    public static /* synthetic */ zzhot zzb(zzhpz zzhpzVar) throws GeneralSecurityException {
        zzhfm zzhfmVarZzf = zzf(zzhpzVar.zzf());
        zzhto zzhtoVarZze = zzhtp.zze();
        zzhtoVarZze.zza(zzh(zzhpzVar));
        zzhtoVarZze.zzb(zzhpzVar.zzc());
        return zzhot.zza("type.googleapis.com/google.crypto.tink.HmacKey", zzhfmVarZzf, ((zzhtp) zzhtoVarZze.zzbu()).zzaM());
    }

    public static /* synthetic */ zzhpz zzc(zzhot zzhotVar) throws GeneralSecurityException {
        if (!zzhotVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzhotVar.zzc().zza())));
        }
        try {
            zzhtp zzhtpVarZzd = zzhtp.zzd(zzhotVar.zzc().zzb(), zziew.zzb());
            if (zzhtpVarZzd.zzc() != 0) {
                int iZzc = zzhtpVarZzd.zzc();
                throw new GeneralSecurityException(androidx.multidex.d.a(new StringBuilder(String.valueOf(iZzc).length() + 47), "Parsing HmacParameters failed: unknown Version ", iZzc));
            }
            zzhpw zzhpwVarZzb = zzhpz.zzb();
            zzhpwVarZzb.zza(zzhtpVarZzd.zzb());
            zzhpwVarZzb.zzb(zzhtpVarZzd.zza().zzb());
            zzhpwVarZzb.zzd((zzhpx) zzc.zzc(zzhtpVarZzd.zza().zza()));
            zzhpwVarZzb.zzc(zzg(zzhotVar.zzd()));
            return zzhpwVarZzb.zze();
        } catch (zzige e10) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e10);
        }
    }

    public static /* synthetic */ zzhos zzd(zzhpq zzhpqVar, zzhfr zzhfrVar) {
        zzhtm zzhtmVarZze = zzhtn.zze();
        zzhtmVarZze.zza(zzh(zzhpqVar.zzf()));
        byte[] bArrZzc = zzhpqVar.zzd().zzc(zzhfrVar);
        zzhtmVarZze.zzb(zziei.zzt(bArrZzc, 0, bArrZzc.length));
        return zzhos.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzhtn) zzhtmVarZze.zzbu()).zzaM(), zzhfl.zzb, zzf(zzhpqVar.zzf().zzf()), zzhpqVar.zzb());
    }

    public static /* synthetic */ zzhpq zze(zzhos zzhosVar, zzhfr zzhfrVar) throws GeneralSecurityException {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            zzhtn zzhtnVarZzd = zzhtn.zzd(zzhosVar.zzb(), zziew.zzb());
            if (zzhtnVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhpw zzhpwVarZzb = zzhpz.zzb();
            zzhpwVarZzb.zza(zzhtnVarZzd.zzc().zzb());
            zzhpwVarZzb.zzb(zzhtnVarZzd.zzb().zzb());
            zzhpwVarZzb.zzd((zzhpx) zzc.zzc(zzhtnVarZzd.zzb().zza()));
            zzhpwVarZzb.zzc(zzg(zzhosVar.zzd()));
            zzhpz zzhpzVarZze = zzhpwVarZzb.zze();
            zzhpp zzhppVarZzc = zzhpq.zzc();
            zzhppVarZzc.zza(zzhpzVarZze);
            zzhppVarZzc.zzb(zzicj.zza(zzhtnVarZzd.zzc().zzA(), zzhfrVar));
            zzhppVarZzc.zzc(zzhosVar.zze());
            return zzhppVarZzc.zzd();
        } catch (zzige | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    private static zzhfm zzf(zzhpy zzhpyVar) throws GeneralSecurityException {
        if (zzhpyVar == zzhpy.zzd) {
            return zzhfm.zzd;
        }
        if (zzhpyVar == zzhpy.zza) {
            return zzhfm.zzb;
        }
        if (zzhpyVar == zzhpy.zzc) {
            return zzhfm.zzc;
        }
        if (zzhpyVar == zzhpy.zzb) {
            return zzhfm.zze;
        }
        throw new GeneralSecurityException("unknown variant: ".concat(String.valueOf(zzhpyVar)));
    }

    private static zzhpy zzg(zzhfm zzhfmVar) throws GeneralSecurityException {
        if (zzhfmVar == zzhfm.zzd) {
            return zzhpy.zzd;
        }
        if (zzhfmVar == zzhfm.zzb) {
            return zzhpy.zza;
        }
        if (zzhfmVar == zzhfm.zzc) {
            return zzhpy.zzc;
        }
        if (zzhfmVar == zzhfm.zze) {
            return zzhpy.zzb;
        }
        throw new GeneralSecurityException("unknown OutputPrefixType: ".concat(zzhfmVar.toString()));
    }

    private static zzhtr zzh(zzhpz zzhpzVar) throws GeneralSecurityException {
        zzhtq zzhtqVarZzc = zzhtr.zzc();
        zzhtqVarZzc.zzb(zzhpzVar.zzd());
        zzhtqVarZzc.zza((zzhtl) zzc.zzb(zzhpzVar.zzg()));
        return (zzhtr) zzhtqVarZzc.zzbu();
    }
}
