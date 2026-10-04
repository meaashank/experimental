package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhwo extends zzhyo {
    private final zzhwh zza;
    private final zzich zzb;
    private final zzich zzc;

    @Nullable
    private final Integer zzd;

    private zzhwo(zzhwh zzhwhVar, zzich zzichVar, zzich zzichVar2, @Nullable Integer num) {
        this.zza = zzhwhVar;
        this.zzb = zzichVar;
        this.zzc = zzichVar2;
        this.zzd = num;
    }

    public static zzhwo zzc(zzhwg zzhwgVar, zzich zzichVar, @Nullable Integer num) throws GeneralSecurityException {
        zzich zzichVarZza;
        zzhwh zzhwhVarZzb = zzhwh.zzb(zzhwgVar);
        zzhwg zzhwgVar2 = zzhwg.zzd;
        if (!zzhwgVar.equals(zzhwgVar2) && num == null) {
            String string = zzhwgVar.toString();
            throw new GeneralSecurityException(androidx.compose.animation.core.E0.a(new StringBuilder(string.length() + 62), "For given Variant ", string, " the value of idRequirement must be non-null"));
        }
        if (zzhwgVar.equals(zzhwgVar2) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzichVar.zzd() != 32) {
            int iZzd = zzichVar.zzd();
            throw new GeneralSecurityException(androidx.multidex.d.a(new StringBuilder(String.valueOf(iZzd).length() + 65), "Ed25519 key must be constructed with key of length 32 bytes, not ", iZzd));
        }
        if (zzhwhVarZzb.zzc() == zzhwgVar2) {
            zzichVarZza = zzhnx.zza;
        } else if (zzhwhVarZzb.zzc() == zzhwg.zzb || zzhwhVarZzb.zzc() == zzhwg.zzc) {
            zzichVarZza = zzhnx.zza(num.intValue());
        } else {
            if (zzhwhVarZzb.zzc() != zzhwg.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhwhVarZzb.zzc().toString()));
            }
            zzichVarZza = zzhnx.zzb(num.intValue());
        }
        return new zzhwo(zzhwhVarZzb, zzichVar, zzichVarZza, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhyo, com.google.android.gms.internal.ads.zzhes
    public final /* synthetic */ zzhfj zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhes
    @Nullable
    public final Integer zzb() {
        return this.zzd;
    }

    public final zzich zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhyo
    public final zzich zze() {
        return this.zzc;
    }

    public final zzhwh zzf() {
        return this.zza;
    }
}
