package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
final class zzhih {
    public static final /* synthetic */ int zza = 0;
    private static final zzich zzb;
    private static final zzhod zzc;
    private static final zzhoa zzd;
    private static final zzhna zze;
    private static final zzhmx zzf;

    static {
        zzich zzichVarZza = zzhpd.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzb = zzichVarZza;
        zzc = zzhod.zzd(zzhig.zza, zzhic.class, zzhot.class);
        zzd = zzhoa.zzd(zzhid.zza, zzichVarZza, zzhot.class);
        zze = zzhna.zzd(zzhie.zza, zzhia.class, zzhos.class);
        zzf = zzhmx.zzd(zzhif.zza, zzichVarZza, zzhos.class);
    }

    public static void zza(zzhnw zzhnwVar) throws GeneralSecurityException {
        zzhnwVar.zzd(zzc);
        zzhnwVar.zze(zzd);
        zzhnwVar.zzb(zze);
        zzhnwVar.zzc(zzf);
    }

    public static /* synthetic */ zzhot zzb(zzhic zzhicVar) throws GeneralSecurityException {
        zzhfm zzhfmVarZzf = zzf(zzhicVar.zzd());
        zzhuj zzhujVarZzc = zzhuk.zzc();
        zzhujVarZzc.zza(zzhicVar.zzc());
        return zzhot.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzhfmVarZzf, ((zzhuk) zzhujVarZzc.zzbu()).zzaM());
    }

    public static /* synthetic */ zzhic zzc(zzhot zzhotVar) throws GeneralSecurityException {
        if (!zzhotVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzhotVar.zzc().zza())));
        }
        try {
            return zzhic.zzb(zzhuk.zzb(zzhotVar.zzc().zzb(), zziew.zzb()).zza(), zzg(zzhotVar.zzd()));
        } catch (zzige e10) {
            throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e10);
        }
    }

    public static /* synthetic */ zzhos zzd(zzhia zzhiaVar, zzhfr zzhfrVar) {
        zzhuh zzhuhVarZzd = zzhui.zzd();
        zzhuj zzhujVarZzc = zzhuk.zzc();
        zzhujVarZzc.zza(zzhiaVar.zze().zzc());
        zzhuhVarZzd.zza((zzhuk) zzhujVarZzc.zzbu());
        return zzhos.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzhui) zzhuhVarZzd.zzbu()).zzaM(), zzhfl.zze, zzf(zzhiaVar.zze().zzd()), zzhiaVar.zzb());
    }

    public static /* synthetic */ zzhia zze(zzhos zzhosVar, zzhfr zzhfrVar) throws GeneralSecurityException {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            zzhui zzhuiVarZzc = zzhui.zzc(zzhosVar.zzb(), zziew.zzb());
            if (zzhuiVarZzc.zza() == 0) {
                return zzhia.zzd(zzhic.zzb(zzhuiVarZzc.zzb().zza(), zzg(zzhosVar.zzd())), zzhosVar.zze());
            }
            String strValueOf = String.valueOf(zzhuiVarZzc);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
            sb2.append("KmsAeadKey are only accepted with version 0, got ");
            sb2.append(strValueOf);
            throw new GeneralSecurityException(sb2.toString());
        } catch (zzige e10) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e10);
        }
    }

    private static zzhfm zzf(zzhib zzhibVar) throws GeneralSecurityException {
        if (zzhibVar.equals(zzhib.zza)) {
            return zzhfm.zzb;
        }
        if (zzhibVar.equals(zzhib.zzb)) {
            return zzhfm.zzd;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhibVar.toString()));
    }

    private static zzhib zzg(zzhfm zzhfmVar) throws GeneralSecurityException {
        if (zzhfmVar == zzhfm.zzb) {
            return zzhib.zza;
        }
        if (zzhfmVar == zzhfm.zzd) {
            return zzhib.zzb;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.toString()));
    }
}
