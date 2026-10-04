package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhvy {
    private zzhwb zza = null;
    private zzici zzb = null;

    private zzhvy() {
    }

    public final zzhvy zza(zzhwb zzhwbVar) {
        this.zza = zzhwbVar;
        return this;
    }

    public final zzhvy zzb(zzici zziciVar) {
        this.zzb = zziciVar;
        return this;
    }

    public final zzhvz zzc() throws GeneralSecurityException {
        zzhwb zzhwbVar = this.zza;
        if (zzhwbVar == null) {
            throw new GeneralSecurityException("Cannot build without a ecdsa public key");
        }
        zzici zziciVar = this.zzb;
        if (zziciVar == null) {
            throw new GeneralSecurityException("Cannot build without a private value");
        }
        BigInteger bigIntegerZzb = zziciVar.zzb(zzheq.zza());
        ECPoint eCPointZzd = zzhwbVar.zzd();
        zzhvt zzhvtVarZzd = zzhwbVar.zzf().zzd();
        BigInteger order = zzhvtVarZzd.zza().getOrder();
        if (bigIntegerZzb.signum() <= 0 || bigIntegerZzb.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        if (zzhmm.zzd(bigIntegerZzb, zzhvtVarZzd.zza()).equals(eCPointZzd)) {
            return new zzhvz(this.zza, this.zzb, null);
        }
        throw new GeneralSecurityException("Invalid private value");
    }

    public /* synthetic */ zzhvy(byte[] bArr) {
    }
}
