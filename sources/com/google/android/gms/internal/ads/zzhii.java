package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhii extends zzhfz {
    private final zzhim zza;
    private final zzich zzb;

    @Nullable
    private final Integer zzc;

    private zzhii(zzhim zzhimVar, zzich zzichVar, @Nullable Integer num) {
        this.zza = zzhimVar;
        this.zzb = zzichVar;
        this.zzc = num;
    }

    public static zzhii zzd(zzhim zzhimVar, @Nullable Integer num) throws GeneralSecurityException {
        zzich zzichVarZzb;
        if (zzhimVar.zzc() == zzhil.zzb) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzichVarZzb = zzhnx.zza;
        } else {
            if (zzhimVar.zzc() != zzhil.zza) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(zzhimVar.zzc())));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzichVarZzb = zzhnx.zzb(num.intValue());
        }
        return new zzhii(zzhimVar, zzichVarZzb, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhfz, com.google.android.gms.internal.ads.zzhes
    public final /* synthetic */ zzhfj zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhes
    public final Integer zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhfz
    public final zzich zzc() {
        return this.zzb;
    }

    public final zzhim zze() {
        return this.zza;
    }
}
