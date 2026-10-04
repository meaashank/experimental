package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhpk {

    @Nullable
    private Integer zza = null;

    @Nullable
    private Integer zzb = null;
    private zzhpl zzc = zzhpl.zzd;

    private zzhpk() {
    }

    public final zzhpk zza(int i10) throws GeneralSecurityException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
        }
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzhpk zzb(int i10) throws GeneralSecurityException {
        if (i10 < 10 || i10 > 16) {
            throw new GeneralSecurityException(androidx.multidex.d.a(new StringBuilder(String.valueOf(i10).length() + 40), "Invalid tag size for AesCmacParameters: ", i10));
        }
        this.zzb = Integer.valueOf(i10);
        return this;
    }

    public final zzhpk zzc(zzhpl zzhplVar) {
        this.zzc = zzhplVar;
        return this;
    }

    public final zzhpm zzd() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.zzc != null) {
            return new zzhpm(num.intValue(), this.zzb.intValue(), this.zzc, null);
        }
        throw new GeneralSecurityException("variant not set");
    }

    public /* synthetic */ zzhpk(byte[] bArr) {
    }
}
