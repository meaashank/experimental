package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPublicKeySpec;
import java.util.Arrays;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhzb implements zzhfo {
    static final zzhmo zza;
    static final zzhmo zzb;
    static final zzhmo zzc;
    public static final /* synthetic */ int zzd = 0;
    private static final byte[] zze = new byte[0];
    private static final byte[] zzf = {0};
    private final ECPublicKey zzg;
    private final String zzh;
    private final zziba zzi;
    private final byte[] zzj;
    private final byte[] zzk;

    @Nullable
    private final Provider zzl;

    static {
        zzhmn zzhmnVarZza = zzhmo.zza();
        zzhmnVarZza.zza(zzibq.SHA256, zzhvu.zza);
        zzhmnVarZza.zza(zzibq.SHA384, zzhvu.zzb);
        zzhmnVarZza.zza(zzibq.SHA512, zzhvu.zzc);
        zza = zzhmnVarZza.zzb();
        zzhmn zzhmnVarZza2 = zzhmo.zza();
        zzhmnVarZza2.zza(zziba.IEEE_P1363, zzhvv.zza);
        zzhmnVarZza2.zza(zziba.DER, zzhvv.zzb);
        zzb = zzhmnVarZza2.zzb();
        zzhmn zzhmnVarZza3 = zzhmo.zza();
        zzhmnVarZza3.zza(zziaz.NIST_P256, zzhvt.zza);
        zzhmnVarZza3.zza(zziaz.NIST_P384, zzhvt.zzb);
        zzhmnVarZza3.zza(zziaz.NIST_P521, zzhvt.zzc);
        zzc = zzhmnVarZza3.zzb();
    }

    private zzhzb(ECPublicKey eCPublicKey, zzibq zzibqVar, zziba zzibaVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhlx.zza(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        this.zzh = zzice.zza(zzibqVar);
        this.zzg = eCPublicKey;
        this.zzi = zzibaVar;
        this.zzj = bArr;
        this.zzk = bArr2;
        this.zzl = provider;
    }

    public static zzhfo zzb(zzhwb zzhwbVar, @Nullable Provider provider) throws GeneralSecurityException {
        return new zzhzb((ECPublicKey) (provider != null ? KeyFactory.getInstance("EC", provider) : (KeyFactory) zzibh.zzf.zzb("EC")).generatePublic(new ECPublicKeySpec(zzhwbVar.zzd(), zzibb.zzb((zziaz) zzc.zzb(zzhwbVar.zzf().zzd())))), (zzibq) zza.zzb(zzhwbVar.zzf().zze()), (zziba) zzb.zzb(zzhwbVar.zzf().zzc()), zzhwbVar.zze().zzc(), zzhwbVar.zzf().zzf().equals(zzhvw.zzc) ? zzf : zze, provider);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzc(byte[] r12, byte[] r13) throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhzb.zzc(byte[], byte[]):void");
    }

    @Override // com.google.android.gms.internal.ads.zzhfo
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzj;
        int length = bArr3.length;
        if (length == 0) {
            zzc(bArr, bArr2);
        } else {
            if (!zzhpd.zze(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            zzc(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
