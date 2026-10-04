package com.google.android.gms.internal.ads;

import androidx.compose.foundation.layout.C1709v0;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhyf {

    @Nullable
    private zzhyc zza = null;

    @Nullable
    private BigInteger zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzhyf() {
    }

    public final zzhyf zza(zzhyc zzhycVar) {
        this.zza = zzhycVar;
        return this;
    }

    public final zzhyf zzb(BigInteger bigInteger) {
        this.zzb = bigInteger;
        return this;
    }

    public final zzhyf zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhyg zzd() throws GeneralSecurityException {
        zzich zzichVarZza;
        if (this.zza == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = this.zzb;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int iBitLength = bigInteger.bitLength();
        int iZzc = this.zza.zzc();
        if (iBitLength != iZzc) {
            throw new GeneralSecurityException(C1709v0.a(new StringBuilder(String.valueOf(iBitLength).length() + 56 + String.valueOf(iZzc).length()), "Got modulus size ", iBitLength, ", but parameters requires modulus size ", iZzc));
        }
        if (this.zza.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzhyb.zzd) {
            zzichVarZza = zzhnx.zza;
        } else if (this.zza.zze() == zzhyb.zzc || this.zza.zze() == zzhyb.zzb) {
            zzichVarZza = zzhnx.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzhyb.zza) {
                throw new IllegalStateException("Unknown RsaSsaPssParameters.Variant: ".concat(String.valueOf(this.zza.zze())));
            }
            zzichVarZza = zzhnx.zzb(this.zzc.intValue());
        }
        return new zzhyg(this.zza, this.zzb, zzichVarZza, this.zzc, null);
    }

    public /* synthetic */ zzhyf(byte[] bArr) {
    }
}
