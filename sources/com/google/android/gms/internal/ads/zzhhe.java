package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhhe {

    @Nullable
    private zzhhm zza = null;

    @Nullable
    private zzicj zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzhhe() {
    }

    public final zzhhe zza(zzhhm zzhhmVar) {
        this.zza = zzhhmVar;
        return this;
    }

    public final zzhhe zzb(zzicj zzicjVar) {
        this.zzb = zzicjVar;
        return this;
    }

    public final zzhhe zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhhf zzd() throws GeneralSecurityException {
        zzicj zzicjVar;
        zzich zzichVarZzb;
        zzhhm zzhhmVar = this.zza;
        if (zzhhmVar == null || (zzicjVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhhmVar.zzc() != zzicjVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhhmVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzhhl.zzc) {
            zzichVarZzb = zzhnx.zza;
        } else if (this.zza.zzd() == zzhhl.zzb) {
            zzichVarZzb = zzhnx.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != zzhhl.zza) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
            }
            zzichVarZzb = zzhnx.zzb(this.zzc.intValue());
        }
        return new zzhhf(this.zza, this.zzb, zzichVarZzb, this.zzc, null);
    }

    public /* synthetic */ zzhhe(byte[] bArr) {
    }
}
