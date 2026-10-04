package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhir {
    public static final /* synthetic */ int zza = 0;
    private static final zzich zzb;
    private static final zzhod zzc;
    private static final zzhoa zzd;
    private static final zzhna zze;
    private static final zzhmx zzf;

    static {
        zzich zzichVarZza = zzhpd.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzb = zzichVarZza;
        zzc = zzhod.zzd(zzhiq.zza, zzhim.class, zzhot.class);
        zzd = zzhoa.zzd(zzhin.zza, zzichVarZza, zzhot.class);
        zze = zzhna.zzd(zzhio.zza, zzhii.class, zzhos.class);
        zzf = zzhmx.zzd(zzhip.zza, zzichVarZza, zzhos.class);
    }

    public static void zza(zzhnw zzhnwVar) throws GeneralSecurityException {
        zzhnwVar.zzd(zzc);
        zzhnwVar.zze(zzd);
        zzhnwVar.zzb(zze);
        zzhnwVar.zzc(zzf);
    }

    public static /* synthetic */ zzhim zzc(zzhot zzhotVar) throws GeneralSecurityException {
        if (!zzhotVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzhotVar.zzc().zza())));
        }
        try {
            return zzh(zzhuo.zzc(zzhotVar.zzc().zzb(), zziew.zzb()), zzhotVar.zzd());
        } catch (zzige e10) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
        }
    }

    public static /* synthetic */ zzhos zzd(zzhii zzhiiVar, zzhfr zzhfrVar) {
        zzhul zzhulVarZzd = zzhum.zzd();
        zzhulVarZzd.zza(zzg(zzhiiVar.zze()));
        return zzhos.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzhum) zzhulVarZzd.zzbu()).zzaM(), zzhfl.zze, zzf(zzhiiVar.zze().zzc()), zzhiiVar.zzb());
    }

    public static /* synthetic */ zzhii zze(zzhos zzhosVar, zzhfr zzhfrVar) throws GeneralSecurityException {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            zzhum zzhumVarZzc = zzhum.zzc(zzhosVar.zzb(), zziew.zzb());
            if (zzhumVarZzc.zza() != 0) {
                String strValueOf = String.valueOf(zzhumVarZzc);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 58);
                sb2.append("KmsEnvelopeAeadKeys are only accepted with version 0, got ");
                sb2.append(strValueOf);
                throw new GeneralSecurityException(sb2.toString());
            }
            zzhuo zzhuoVarZzb = zzhumVarZzc.zzb();
            zzhfm zzhfmVarZzd = zzhosVar.zzd();
            zzhfm zzhfmVar = zzhfm.zzb;
            if (zzhfmVarZzd != zzhfmVar && zzhfmVarZzd != (zzhfmVar = zzhfm.zzd)) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVarZzd.toString()));
            }
            return zzhii.zzd(zzh(zzhuoVarZzb, zzhfmVar), zzhosVar.zze());
        } catch (zzige e10) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e10);
        }
    }

    private static zzhfm zzf(zzhil zzhilVar) throws GeneralSecurityException {
        if (zzhil.zza.equals(zzhilVar)) {
            return zzhfm.zzb;
        }
        if (zzhil.zzb.equals(zzhilVar)) {
            return zzhfm.zzd;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhilVar)));
    }

    private static zzhuo zzg(zzhim zzhimVar) throws GeneralSecurityException {
        try {
            zzhtw zzhtwVarZzc = zzhtw.zzc(zzhft.zza(zzhimVar.zzd()), zziew.zzb());
            zzhun zzhunVarZzd = zzhuo.zzd();
            zzhunVarZzd.zza(zzhimVar.zzb());
            zzhunVarZzd.zzb(zzhtwVarZzc);
            return (zzhuo) zzhunVarZzd.zzbu();
        } catch (zzige e10) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
        }
    }

    private static zzhim zzh(zzhuo zzhuoVar, zzhfm zzhfmVar) throws GeneralSecurityException {
        zzhik zzhikVar;
        zzhil zzhilVar;
        zzhtv zzhtvVarZzd = zzhtw.zzd();
        zzhtvVarZzd.zza(zzhuoVar.zzb().zza());
        zzhtvVarZzd.zzb(zzhuoVar.zzb().zzb());
        zzhtvVarZzd.zzc(5);
        zzhfj zzhfjVarZzb = zzhft.zzb(((zzhtw) zzhtvVarZzd.zzbu()).zzaN());
        if (zzhfjVarZzb instanceof zzhhd) {
            zzhikVar = zzhik.zza;
        } else if (zzhfjVarZzb instanceof zzhhs) {
            zzhikVar = zzhik.zzc;
        } else if (zzhfjVarZzb instanceof zzhjo) {
            zzhikVar = zzhik.zzb;
        } else if (zzhfjVarZzb instanceof zzhgm) {
            zzhikVar = zzhik.zzd;
        } else if (zzhfjVarZzb instanceof zzhgu) {
            zzhikVar = zzhik.zze;
        } else {
            if (!(zzhfjVarZzb instanceof zzhhm)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(zzhfjVarZzb.toString()));
            }
            zzhikVar = zzhik.zzf;
        }
        zzhij zzhijVar = new zzhij(null);
        if (zzhfmVar.equals(zzhfm.zzb)) {
            zzhilVar = zzhil.zza;
        } else {
            if (!zzhfmVar.equals(zzhfm.zzd)) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.toString()));
            }
            zzhilVar = zzhil.zzb;
        }
        zzhijVar.zza(zzhilVar);
        zzhijVar.zzb(zzhuoVar.zza());
        zzhijVar.zzd((zzhga) zzhfjVarZzb);
        zzhijVar.zzc(zzhikVar);
        return zzhijVar.zze();
    }
}
