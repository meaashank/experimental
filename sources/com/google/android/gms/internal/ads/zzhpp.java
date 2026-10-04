package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhpp {

    @Nullable
    private zzhpz zza = null;

    @Nullable
    private zzicj zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzhpp() {
    }

    public final zzhpp zza(zzhpz zzhpzVar) {
        this.zza = zzhpzVar;
        return this;
    }

    public final zzhpp zzb(zzicj zzicjVar) {
        this.zzb = zzicjVar;
        return this;
    }

    public final zzhpp zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhpq zzd() throws GeneralSecurityException {
        zzicj zzicjVar;
        zzich zzichVarZza;
        zzhpz zzhpzVar = this.zza;
        if (zzhpzVar == null || (zzicjVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhpzVar.zzc() != zzicjVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhpzVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzhpy.zzd) {
            zzichVarZza = zzhnx.zza;
        } else if (this.zza.zzf() == zzhpy.zzc || this.zza.zzf() == zzhpy.zzb) {
            zzichVarZza = zzhnx.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzhpy.zza) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
            }
            zzichVarZza = zzhnx.zzb(this.zzc.intValue());
        }
        return new zzhpq(this.zza, this.zzb, zzichVarZza, this.zzc, null);
    }

    public /* synthetic */ zzhpp(byte[] bArr) {
    }
}
