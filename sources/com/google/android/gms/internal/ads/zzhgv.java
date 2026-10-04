package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhgv {

    @Nullable
    private zzhhd zza = null;

    @Nullable
    private zzicj zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzhgv() {
    }

    public final zzhgv zza(zzhhd zzhhdVar) {
        this.zza = zzhhdVar;
        return this;
    }

    public final zzhgv zzb(zzicj zzicjVar) {
        this.zzb = zzicjVar;
        return this;
    }

    public final zzhgv zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhgw zzd() throws GeneralSecurityException {
        zzicj zzicjVar;
        zzich zzichVarZzb;
        zzhhd zzhhdVar = this.zza;
        if (zzhhdVar == null || (zzicjVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhhdVar.zzc() != zzicjVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhhdVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzhhc.zzc) {
            zzichVarZzb = zzhnx.zza;
        } else if (this.zza.zzd() == zzhhc.zzb) {
            zzichVarZzb = zzhnx.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != zzhhc.zza) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
            }
            zzichVarZzb = zzhnx.zzb(this.zzc.intValue());
        }
        return new zzhgw(this.zza, this.zzb, zzichVarZzb, this.zzc, null);
    }

    public /* synthetic */ zzhgv(byte[] bArr) {
    }
}
