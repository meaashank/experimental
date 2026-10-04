package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhzt {
    public static final /* synthetic */ int zza = 0;
    private static final zzich zzb;
    private static final zzich zzc;
    private static final zzhod zzd;
    private static final zzhoa zze;
    private static final zzhna zzf;
    private static final zzhmx zzg;
    private static final zzhna zzh;
    private static final zzhmx zzi;
    private static final zzhmo zzj;

    static {
        zzich zzichVarZza = zzhpd.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        zzb = zzichVarZza;
        zzich zzichVarZza2 = zzhpd.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        zzc = zzichVarZza2;
        zzd = zzhod.zzd(zzhzs.zza, zzhxq.class, zzhot.class);
        zze = zzhoa.zzd(zzhzn.zza, zzichVarZza, zzhot.class);
        zzf = zzhna.zzd(zzhzo.zza, zzhxu.class, zzhos.class);
        zzg = zzhmx.zzd(zzhzp.zza, zzichVarZza2, zzhos.class);
        zzh = zzhna.zzd(zzhzq.zza, zzhxs.class, zzhos.class);
        zzi = zzhmx.zzd(zzhzr.zza, zzichVarZza, zzhos.class);
        zzhmn zzhmnVarZza = zzhmo.zza();
        zzhmnVarZza.zza(zzhtl.SHA256, zzhxo.zza);
        zzhmnVarZza.zza(zzhtl.SHA384, zzhxo.zzb);
        zzhmnVarZza.zza(zzhtl.SHA512, zzhxo.zzc);
        zzj = zzhmnVarZza.zzb();
    }

    public static void zza(zzhnw zzhnwVar) throws GeneralSecurityException {
        zzhnwVar.zzd(zzd);
        zzhnwVar.zze(zze);
        zzhnwVar.zzb(zzf);
        zzhnwVar.zzc(zzg);
        zzhnwVar.zzb(zzh);
        zzhnwVar.zzc(zzi);
    }

    public static /* synthetic */ zzhot zzb(zzhxq zzhxqVar) throws GeneralSecurityException {
        zzhfm zzhfmVarZzh = zzh(zzhxqVar.zze());
        zzhus zzhusVarZze = zzhut.zze();
        zzhusVarZze.zza(zzj(zzhxqVar));
        zzhusVarZze.zzb(zzhxqVar.zzc());
        byte[] bArrZza = zzhma.zza(zzhxqVar.zzd());
        zziei zzieiVar = zziei.zza;
        zzhusVarZze.zzc(zziei.zzt(bArrZza, 0, bArrZza.length));
        return zzhot.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", zzhfmVarZzh, ((zzhut) zzhusVarZze.zzbu()).zzaM());
    }

    public static /* synthetic */ zzhxq zzc(zzhot zzhotVar) throws GeneralSecurityException {
        if (!zzhotVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ".concat(String.valueOf(zzhotVar.zzc().zza())));
        }
        try {
            zzhut zzhutVarZzd = zzhut.zzd(zzhotVar.zzc().zzb(), zziew.zzb());
            zzhxn zzhxnVarZzb = zzhxq.zzb();
            zzhxnVarZzb.zzd((zzhxo) zzj.zzc(zzhutVarZzd.zza().zza()));
            zzhxnVarZzb.zzb(new BigInteger(1, zzhutVarZzd.zzc().zzA()));
            zzhxnVarZzb.zza(zzhutVarZzd.zzb());
            zzhxnVarZzb.zzc(zzi(zzhotVar.zzd()));
            return zzhxnVarZzb.zze();
        } catch (zzige e10) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e10);
        }
    }

    public static /* synthetic */ zzhxu zze(zzhos zzhosVar, zzhfr zzhfrVar) throws GeneralSecurityException {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzhosVar.zzg())));
        }
        try {
            zzhuz zzhuzVarZze = zzhuz.zze(zzhosVar.zzb(), zziew.zzb());
            if (zzhuzVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zzhuzVarZze.zzc().zzA());
            int iBitLength = bigInteger.bitLength();
            zzhxn zzhxnVarZzb = zzhxq.zzb();
            zzhxnVarZzb.zzd((zzhxo) zzj.zzc(zzhuzVarZze.zzb().zza()));
            zzhxnVarZzb.zzb(new BigInteger(1, zzhuzVarZze.zzd().zzA()));
            zzhxnVarZzb.zza(iBitLength);
            zzhxnVarZzb.zzc(zzi(zzhosVar.zzd()));
            zzhxq zzhxqVarZze = zzhxnVarZzb.zze();
            zzhxt zzhxtVarZzc = zzhxu.zzc();
            zzhxtVarZzc.zza(zzhxqVarZze);
            zzhxtVarZzc.zzb(bigInteger);
            zzhxtVarZzc.zzc(zzhosVar.zze());
            return zzhxtVarZzc.zzd();
        } catch (zzige | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
        }
    }

    public static /* synthetic */ zzhos zzf(zzhxs zzhxsVar, zzhfr zzhfrVar) {
        zzhuw zzhuwVarZzk = zzhux.zzk();
        zzhuwVarZzk.zza(0);
        zzhuwVarZzk.zzb(zzk(zzhxsVar.zze()));
        byte[] bArrZza = zzhma.zza(zzhxsVar.zzi().zzb(zzhfrVar));
        zziei zzieiVar = zziei.zza;
        zzhuwVarZzk.zzc(zziei.zzt(bArrZza, 0, bArrZza.length));
        byte[] bArrZza2 = zzhma.zza(zzhxsVar.zzf().zzb(zzhfrVar));
        zzhuwVarZzk.zzd(zziei.zzt(bArrZza2, 0, bArrZza2.length));
        byte[] bArrZza3 = zzhma.zza(zzhxsVar.zzh().zzb(zzhfrVar));
        zzhuwVarZzk.zze(zziei.zzt(bArrZza3, 0, bArrZza3.length));
        byte[] bArrZza4 = zzhma.zza(zzhxsVar.zzj().zzb(zzhfrVar));
        zzhuwVarZzk.zzf(zziei.zzt(bArrZza4, 0, bArrZza4.length));
        byte[] bArrZza5 = zzhma.zza(zzhxsVar.zzk().zzb(zzhfrVar));
        zzhuwVarZzk.zzg(zziei.zzt(bArrZza5, 0, bArrZza5.length));
        byte[] bArrZza6 = zzhma.zza(zzhxsVar.zzl().zzb(zzhfrVar));
        zzhuwVarZzk.zzh(zziei.zzt(bArrZza6, 0, bArrZza6.length));
        return zzhos.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", ((zzhux) zzhuwVarZzk.zzbu()).zzaM(), zzhfl.zzc, zzh(zzhxsVar.zzd().zze()), zzhxsVar.zze().zzb());
    }

    public static /* synthetic */ zzhxs zzg(zzhos zzhosVar, zzhfr zzhfrVar) throws GeneralSecurityException {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzhosVar.zzg())));
        }
        try {
            zzhux zzhuxVarZzj = zzhux.zzj(zzhosVar.zzb(), zziew.zzb());
            if (zzhuxVarZzj.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhuz zzhuzVarZzb = zzhuxVarZzj.zzb();
            if (zzhuzVarZzb.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zzhuzVarZzb.zzc().zzA());
            int iBitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = new BigInteger(1, zzhuzVarZzb.zzd().zzA());
            zzhxn zzhxnVarZzb = zzhxq.zzb();
            zzhxnVarZzb.zzd((zzhxo) zzj.zzc(zzhuzVarZzb.zzb().zza()));
            zzhxnVarZzb.zzb(bigInteger2);
            zzhxnVarZzb.zza(iBitLength);
            zzhxnVarZzb.zzc(zzi(zzhosVar.zzd()));
            zzhxq zzhxqVarZze = zzhxnVarZzb.zze();
            zzhxt zzhxtVarZzc = zzhxu.zzc();
            zzhxtVarZzc.zza(zzhxqVarZze);
            zzhxtVarZzc.zzb(bigInteger);
            zzhxtVarZzc.zzc(zzhosVar.zze());
            zzhxu zzhxuVarZzd = zzhxtVarZzc.zzd();
            zzhxr zzhxrVarZzc = zzhxs.zzc();
            zzhxrVarZzc.zza(zzhxuVarZzd);
            zzhxrVarZzc.zzb(zzl(zzhuxVarZzj.zzd(), zzhfrVar), zzl(zzhuxVarZzj.zze(), zzhfrVar));
            zzhxrVarZzc.zzc(zzl(zzhuxVarZzj.zzc(), zzhfrVar));
            zzhxrVarZzc.zzd(zzl(zzhuxVarZzj.zzg(), zzhfrVar), zzl(zzhuxVarZzj.zzh(), zzhfrVar));
            zzhxrVarZzc.zze(zzl(zzhuxVarZzj.zzi(), zzhfrVar));
            return zzhxrVarZzc.zzf();
        } catch (zzige | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
        }
    }

    private static zzhfm zzh(zzhxp zzhxpVar) throws GeneralSecurityException {
        if (zzhxpVar.equals(zzhxp.zzd)) {
            return zzhfm.zzd;
        }
        if (zzhxpVar.equals(zzhxp.zza)) {
            return zzhfm.zzb;
        }
        if (zzhxpVar.equals(zzhxp.zzb)) {
            return zzhfm.zze;
        }
        if (zzhxpVar.equals(zzhxp.zzc)) {
            return zzhfm.zzc;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhxpVar)));
    }

    private static zzhxp zzi(zzhfm zzhfmVar) throws GeneralSecurityException {
        if (zzhfmVar == zzhfm.zzd) {
            return zzhxp.zzd;
        }
        if (zzhfmVar == zzhfm.zzb) {
            return zzhxp.zza;
        }
        if (zzhfmVar == zzhfm.zze) {
            return zzhxp.zzb;
        }
        if (zzhfmVar == zzhfm.zzc) {
            return zzhxp.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.toString()));
    }

    private static zzhuv zzj(zzhxq zzhxqVar) throws GeneralSecurityException {
        zzhuu zzhuuVarZzb = zzhuv.zzb();
        zzhuuVarZzb.zza((zzhtl) zzj.zzb(zzhxqVar.zzf()));
        return (zzhuv) zzhuuVarZzb.zzbu();
    }

    private static zzhuz zzk(zzhxu zzhxuVar) throws GeneralSecurityException {
        zzhuy zzhuyVarZzg = zzhuz.zzg();
        zzhuyVarZzg.zza(zzj(zzhxuVar.zzf()));
        byte[] bArrZza = zzhma.zza(zzhxuVar.zzd());
        zziei zzieiVar = zziei.zza;
        zzhuyVarZzg.zzb(zziei.zzt(bArrZza, 0, bArrZza.length));
        byte[] bArrZza2 = zzhma.zza(zzhxuVar.zzf().zzd());
        zzhuyVarZzg.zzc(zziei.zzt(bArrZza2, 0, bArrZza2.length));
        return (zzhuz) zzhuyVarZzg.zzbu();
    }

    private static zzici zzl(zziei zzieiVar, zzhfr zzhfrVar) {
        return zzici.zza(new BigInteger(1, zzieiVar.zzA()), zzhfrVar);
    }
}
