package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhzi {
    public static final /* synthetic */ int zza = 0;
    private static final zzich zzb;
    private static final zzich zzc;
    private static final zzhod zzd;
    private static final zzhoa zze;
    private static final zzhna zzf;
    private static final zzhmx zzg;
    private static final zzhna zzh;
    private static final zzhmx zzi;

    static {
        zzich zzichVarZza = zzhpd.zza("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        zzb = zzichVarZza;
        zzich zzichVarZza2 = zzhpd.zza("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        zzc = zzichVarZza2;
        zzd = zzhod.zzd(zzhzh.zza, zzhwh.class, zzhot.class);
        zze = zzhoa.zzd(zzhzc.zza, zzichVarZza, zzhot.class);
        zzf = zzhna.zzd(zzhzd.zza, zzhwo.class, zzhos.class);
        zzg = zzhmx.zzd(zzhze.zza, zzichVarZza2, zzhos.class);
        zzh = zzhna.zzd(zzhzf.zza, zzhwi.class, zzhos.class);
        zzi = zzhmx.zzd(zzhzg.zza, zzichVarZza, zzhos.class);
    }

    public static void zza(zzhnw zzhnwVar) throws GeneralSecurityException {
        zzhnwVar.zzd(zzd);
        zzhnwVar.zze(zze);
        zzhnwVar.zzb(zzf);
        zzhnwVar.zzc(zzg);
        zzhnwVar.zzb(zzh);
        zzhnwVar.zzc(zzi);
    }

    public static /* synthetic */ zzhwh zzc(zzhot zzhotVar) throws GeneralSecurityException {
        if (!zzhotVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: ".concat(String.valueOf(zzhotVar.zzc().zza())));
        }
        try {
            if (zzhtf.zzb(zzhotVar.zzc().zzb(), zziew.zzb()).zza() == 0) {
                return zzhwh.zzb(zzi(zzhotVar.zzd()));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzige e10) {
            throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e10);
        }
    }

    public static /* synthetic */ zzhwo zze(zzhos zzhosVar, zzhfr zzhfrVar) throws GeneralSecurityException {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzhosVar.zzg())));
        }
        try {
            zzhtj zzhtjVarZzc = zzhtj.zzc(zzhosVar.zzb(), zziew.zzb());
            if (zzhtjVarZzc.zza() == 0) {
                return zzhwo.zzc(zzi(zzhosVar.zzd()), zzich.zza(zzhtjVarZzc.zzb().zzA()), zzhosVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzige unused) {
            throw new GeneralSecurityException("Parsing Ed25519PublicKey failed");
        }
    }

    public static /* synthetic */ zzhos zzf(zzhwi zzhwiVar, zzhfr zzhfrVar) {
        zzhtg zzhtgVarZze = zzhth.zze();
        zzhtgVarZze.zzb(zzj(zzhwiVar.zze()));
        byte[] bArrZzc = zzhwiVar.zzf().zzc(zzhfrVar);
        zzhtgVarZze.zza(zziei.zzt(bArrZzc, 0, bArrZzc.length));
        return zzhos.zza("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", ((zzhth) zzhtgVarZze.zzbu()).zzaM(), zzhfl.zzc, zzh(zzhwiVar.zzd().zzc()), zzhwiVar.zze().zzb());
    }

    public static /* synthetic */ zzhwi zzg(zzhos zzhosVar, zzhfr zzhfrVar) throws GeneralSecurityException {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzhosVar.zzg())));
        }
        try {
            zzhth zzhthVarZzd = zzhth.zzd(zzhosVar.zzb(), zziew.zzb());
            if (zzhthVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhtj zzhtjVarZzc = zzhthVarZzd.zzc();
            if (zzhtjVarZzc.zza() == 0) {
                return zzhwi.zzc(zzhwo.zzc(zzi(zzhosVar.zzd()), zzich.zza(zzhtjVarZzc.zzb().zzA()), zzhosVar.zze()), zzicj.zza(zzhthVarZzd.zzb().zzA(), zzhfrVar));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzige unused) {
            throw new GeneralSecurityException("Parsing Ed25519PrivateKey failed");
        }
    }

    private static zzhfm zzh(zzhwg zzhwgVar) throws GeneralSecurityException {
        if (zzhwgVar.equals(zzhwg.zzd)) {
            return zzhfm.zzd;
        }
        if (zzhwgVar.equals(zzhwg.zza)) {
            return zzhfm.zzb;
        }
        if (zzhwgVar.equals(zzhwg.zzb)) {
            return zzhfm.zze;
        }
        if (zzhwgVar.equals(zzhwg.zzc)) {
            return zzhfm.zzc;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhwgVar.toString()));
    }

    private static zzhwg zzi(zzhfm zzhfmVar) throws GeneralSecurityException {
        if (zzhfmVar == zzhfm.zzd) {
            return zzhwg.zzd;
        }
        if (zzhfmVar == zzhfm.zzb) {
            return zzhwg.zza;
        }
        if (zzhfmVar == zzhfm.zze) {
            return zzhwg.zzb;
        }
        if (zzhfmVar == zzhfm.zzc) {
            return zzhwg.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.toString()));
    }

    private static zzhtj zzj(zzhwo zzhwoVar) {
        zzhti zzhtiVarZzd = zzhtj.zzd();
        byte[] bArrZzc = zzhwoVar.zzd().zzc();
        zzhtiVarZzd.zza(zziei.zzt(bArrZzc, 0, bArrZzc.length));
        return (zzhtj) zzhtiVarZzd.zzbu();
    }
}
