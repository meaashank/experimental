package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhwa {

    @Nullable
    private zzhvx zza = null;

    @Nullable
    private ECPoint zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzhwa() {
    }

    public final zzhwa zza(zzhvx zzhvxVar) {
        this.zza = zzhvxVar;
        return this;
    }

    public final zzhwa zzb(ECPoint eCPoint) {
        this.zzb = eCPoint;
        return this;
    }

    public final zzhwa zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhwb zzd() throws GeneralSecurityException {
        zzich zzichVarZza;
        zzhvx zzhvxVar = this.zza;
        if (zzhvxVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        ECPoint eCPoint = this.zzb;
        if (eCPoint == null) {
            throw new GeneralSecurityException("Cannot build without public point");
        }
        zzhmm.zza(eCPoint, zzhvxVar.zzd().zza().getCurve());
        if (this.zza.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzhvw.zzd) {
            zzichVarZza = zzhnx.zza;
        } else if (this.zza.zzf() == zzhvw.zzc || this.zza.zzf() == zzhvw.zzb) {
            zzichVarZza = zzhnx.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzhvw.zza) {
                throw new IllegalStateException("Unknown EcdsaParameters.Variant: ".concat(this.zza.zzf().toString()));
            }
            zzichVarZza = zzhnx.zzb(this.zzc.intValue());
        }
        return new zzhwb(this.zza, this.zzb, zzichVarZza, this.zzc, null);
    }

    public /* synthetic */ zzhwa(byte[] bArr) {
    }
}
