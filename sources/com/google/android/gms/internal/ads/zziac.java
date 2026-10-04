package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zziac {
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
        zzich zzichVarZza = zzhpd.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        zzb = zzichVarZza;
        zzich zzichVarZza2 = zzhpd.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        zzc = zzichVarZza2;
        zzd = zzhod.zzd(zziab.zza, zzhyc.class, zzhot.class);
        zze = zzhoa.zzd(zzhzw.zza, zzichVarZza, zzhot.class);
        zzf = zzhna.zzd(zzhzx.zza, zzhyg.class, zzhos.class);
        zzg = zzhmx.zzd(zzhzy.zza, zzichVarZza2, zzhos.class);
        zzh = zzhna.zzd(zzhzz.zza, zzhye.class, zzhos.class);
        zzi = zzhmx.zzd(zziaa.zza, zzichVarZza, zzhos.class);
        zzhmn zzhmnVarZza = zzhmo.zza();
        zzhmnVarZza.zza(zzhtl.SHA256, zzhya.zza);
        zzhmnVarZza.zza(zzhtl.SHA384, zzhya.zzb);
        zzhmnVarZza.zza(zzhtl.SHA512, zzhya.zzc);
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

    public static /* synthetic */ zzhot zzb(zzhyc zzhycVar) throws GeneralSecurityException {
        zzhfm zzhfmVarZzh = zzh(zzhycVar.zze());
        zzhva zzhvaVarZze = zzhvb.zze();
        zzhvaVarZze.zza(zzj(zzhycVar));
        zzhvaVarZze.zzb(zzhycVar.zzc());
        byte[] bArrZza = zzhma.zza(zzhycVar.zzd());
        zziei zzieiVar = zziei.zza;
        zzhvaVarZze.zzc(zziei.zzt(bArrZza, 0, bArrZza.length));
        return zzhot.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", zzhfmVarZzh, ((zzhvb) zzhvaVarZze.zzbu()).zzaM());
    }

    public static /* synthetic */ zzhyc zzc(zzhot zzhotVar) throws GeneralSecurityException {
        if (!zzhotVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ".concat(String.valueOf(zzhotVar.zzc().zza())));
        }
        try {
            zzhvb zzhvbVarZzd = zzhvb.zzd(zzhotVar.zzc().zzb(), zziew.zzb());
            zzhxz zzhxzVarZzb = zzhyc.zzb();
            zzhmo zzhmoVar = zzj;
            zzhxzVarZzb.zzd((zzhya) zzhmoVar.zzc(zzhvbVarZzd.zza().zza()));
            zzhxzVarZzb.zze((zzhya) zzhmoVar.zzc(zzhvbVarZzd.zza().zzb()));
            zzhxzVarZzb.zzb(new BigInteger(1, zzhvbVarZzd.zzc().zzA()));
            zzhxzVarZzb.zza(zzhvbVarZzd.zzb());
            zzhxzVarZzb.zzf(zzhvbVarZzd.zza().zzc());
            zzhxzVarZzb.zzc(zzi(zzhotVar.zzd()));
            return zzhxzVarZzb.zzg();
        } catch (zzige e10) {
            throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e10);
        }
    }

    public static /* synthetic */ zzhyg zze(zzhos zzhosVar, zzhfr zzhfrVar) throws GeneralSecurityException {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzhosVar.zzg())));
        }
        try {
            zzhvh zzhvhVarZze = zzhvh.zze(zzhosVar.zzb(), zziew.zzb());
            if (zzhvhVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zzhvhVarZze.zzc().zzA());
            int iBitLength = bigInteger.bitLength();
            zzhxz zzhxzVarZzb = zzhyc.zzb();
            zzhmo zzhmoVar = zzj;
            zzhxzVarZzb.zzd((zzhya) zzhmoVar.zzc(zzhvhVarZze.zzb().zza()));
            zzhxzVarZzb.zze((zzhya) zzhmoVar.zzc(zzhvhVarZze.zzb().zzb()));
            zzhxzVarZzb.zzb(new BigInteger(1, zzhvhVarZze.zzd().zzA()));
            zzhxzVarZzb.zza(iBitLength);
            zzhxzVarZzb.zzf(zzhvhVarZze.zzb().zzc());
            zzhxzVarZzb.zzc(zzi(zzhosVar.zzd()));
            zzhyc zzhycVarZzg = zzhxzVarZzb.zzg();
            zzhyf zzhyfVarZzc = zzhyg.zzc();
            zzhyfVarZzc.zza(zzhycVarZzg);
            zzhyfVarZzc.zzb(bigInteger);
            zzhyfVarZzc.zzc(zzhosVar.zze());
            return zzhyfVarZzc.zzd();
        } catch (zzige | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
        }
    }

    public static /* synthetic */ zzhos zzf(zzhye zzhyeVar, zzhfr zzhfrVar) {
        zzhve zzhveVarZzk = zzhvf.zzk();
        zzhveVarZzk.zza(0);
        zzhveVarZzk.zzb(zzk(zzhyeVar.zze()));
        byte[] bArrZza = zzhma.zza(zzhyeVar.zzi().zzb(zzhfrVar));
        zziei zzieiVar = zziei.zza;
        zzhveVarZzk.zzc(zziei.zzt(bArrZza, 0, bArrZza.length));
        byte[] bArrZza2 = zzhma.zza(zzhyeVar.zzf().zzb(zzhfrVar));
        zzhveVarZzk.zzd(zziei.zzt(bArrZza2, 0, bArrZza2.length));
        byte[] bArrZza3 = zzhma.zza(zzhyeVar.zzh().zzb(zzhfrVar));
        zzhveVarZzk.zze(zziei.zzt(bArrZza3, 0, bArrZza3.length));
        byte[] bArrZza4 = zzhma.zza(zzhyeVar.zzj().zzb(zzhfrVar));
        zzhveVarZzk.zzf(zziei.zzt(bArrZza4, 0, bArrZza4.length));
        byte[] bArrZza5 = zzhma.zza(zzhyeVar.zzk().zzb(zzhfrVar));
        zzhveVarZzk.zzg(zziei.zzt(bArrZza5, 0, bArrZza5.length));
        byte[] bArrZza6 = zzhma.zza(zzhyeVar.zzl().zzb(zzhfrVar));
        zzhveVarZzk.zzh(zziei.zzt(bArrZza6, 0, bArrZza6.length));
        return zzhos.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", ((zzhvf) zzhveVarZzk.zzbu()).zzaM(), zzhfl.zzc, zzh(zzhyeVar.zzd().zze()), zzhyeVar.zze().zzb());
    }

    public static /* synthetic */ zzhye zzg(zzhos zzhosVar, zzhfr zzhfrVar) throws GeneralSecurityException {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzhosVar.zzg())));
        }
        try {
            zzhvf zzhvfVarZzj = zzhvf.zzj(zzhosVar.zzb(), zziew.zzb());
            if (zzhvfVarZzj.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhvh zzhvhVarZzb = zzhvfVarZzj.zzb();
            if (zzhvhVarZzb.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zzhvhVarZzb.zzc().zzA());
            int iBitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = new BigInteger(1, zzhvhVarZzb.zzd().zzA());
            zzhxz zzhxzVarZzb = zzhyc.zzb();
            zzhmo zzhmoVar = zzj;
            zzhxzVarZzb.zzd((zzhya) zzhmoVar.zzc(zzhvhVarZzb.zzb().zza()));
            zzhxzVarZzb.zze((zzhya) zzhmoVar.zzc(zzhvhVarZzb.zzb().zzb()));
            zzhxzVarZzb.zzb(bigInteger2);
            zzhxzVarZzb.zza(iBitLength);
            zzhxzVarZzb.zzf(zzhvhVarZzb.zzb().zzc());
            zzhxzVarZzb.zzc(zzi(zzhosVar.zzd()));
            zzhyc zzhycVarZzg = zzhxzVarZzb.zzg();
            zzhyf zzhyfVarZzc = zzhyg.zzc();
            zzhyfVarZzc.zza(zzhycVarZzg);
            zzhyfVarZzc.zzb(bigInteger);
            zzhyfVarZzc.zzc(zzhosVar.zze());
            zzhyg zzhygVarZzd = zzhyfVarZzc.zzd();
            zzhyd zzhydVarZzc = zzhye.zzc();
            zzhydVarZzc.zza(zzhygVarZzd);
            zzhydVarZzc.zzb(zzl(zzhvfVarZzj.zzd(), zzhfrVar), zzl(zzhvfVarZzj.zze(), zzhfrVar));
            zzhydVarZzc.zzc(zzl(zzhvfVarZzj.zzc(), zzhfrVar));
            zzhydVarZzc.zzd(zzl(zzhvfVarZzj.zzg(), zzhfrVar), zzl(zzhvfVarZzj.zzh(), zzhfrVar));
            zzhydVarZzc.zze(zzl(zzhvfVarZzj.zzi(), zzhfrVar));
            return zzhydVarZzc.zzf();
        } catch (zzige | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
        }
    }

    private static zzhfm zzh(zzhyb zzhybVar) throws GeneralSecurityException {
        if (zzhybVar.equals(zzhyb.zzd)) {
            return zzhfm.zzd;
        }
        if (zzhybVar.equals(zzhyb.zza)) {
            return zzhfm.zzb;
        }
        if (zzhybVar.equals(zzhyb.zzb)) {
            return zzhfm.zze;
        }
        if (zzhybVar.equals(zzhyb.zzc)) {
            return zzhfm.zzc;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhybVar)));
    }

    private static zzhyb zzi(zzhfm zzhfmVar) throws GeneralSecurityException {
        if (zzhfmVar == zzhfm.zzd) {
            return zzhyb.zzd;
        }
        if (zzhfmVar == zzhfm.zzb) {
            return zzhyb.zza;
        }
        if (zzhfmVar == zzhfm.zze) {
            return zzhyb.zzb;
        }
        if (zzhfmVar == zzhfm.zzc) {
            return zzhyb.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.toString()));
    }

    private static zzhvd zzj(zzhyc zzhycVar) throws GeneralSecurityException {
        zzhvc zzhvcVarZzd = zzhvd.zzd();
        zzhmo zzhmoVar = zzj;
        zzhvcVarZzd.zza((zzhtl) zzhmoVar.zzb(zzhycVar.zzf()));
        zzhvcVarZzd.zzb((zzhtl) zzhmoVar.zzb(zzhycVar.zzg()));
        zzhvcVarZzd.zzc(zzhycVar.zzh());
        return (zzhvd) zzhvcVarZzd.zzbu();
    }

    private static zzhvh zzk(zzhyg zzhygVar) throws GeneralSecurityException {
        zzhvg zzhvgVarZzg = zzhvh.zzg();
        zzhvgVarZzg.zzb(zzj(zzhygVar.zzf()));
        byte[] bArrZza = zzhma.zza(zzhygVar.zzd());
        zziei zzieiVar = zziei.zza;
        zzhvgVarZzg.zzc(zziei.zzt(bArrZza, 0, bArrZza.length));
        byte[] bArrZza2 = zzhma.zza(zzhygVar.zzf().zzd());
        zzhvgVarZzg.zzd(zziei.zzt(bArrZza2, 0, bArrZza2.length));
        zzhvgVarZzg.zza(0);
        return (zzhvh) zzhvgVarZzg.zzbu();
    }

    private static zzici zzl(zziei zzieiVar, zzhfr zzhfrVar) {
        return zzici.zza(new BigInteger(1, zzieiVar.zzA()), zzhfrVar);
    }
}
