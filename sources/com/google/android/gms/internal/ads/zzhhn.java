package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhhn extends zzhfz {
    private final zzhhs zza;
    private final zzicj zzb;
    private final zzich zzc;

    @Nullable
    private final Integer zzd;

    private zzhhn(zzhhs zzhhsVar, zzicj zzicjVar, zzich zzichVar, @Nullable Integer num) {
        this.zza = zzhhsVar;
        this.zzb = zzicjVar;
        this.zzc = zzichVar;
        this.zzd = num;
    }

    public static zzhhn zzd(zzhhr zzhhrVar, zzicj zzicjVar, @Nullable Integer num) throws GeneralSecurityException {
        zzich zzichVarZzb;
        zzhhr zzhhrVar2 = zzhhr.zzc;
        if (zzhhrVar != zzhhrVar2 && num == null) {
            String string = zzhhrVar.toString();
            throw new GeneralSecurityException(androidx.compose.animation.core.E0.a(new StringBuilder(string.length() + 62), "For given Variant ", string, " the value of idRequirement must be non-null"));
        }
        if (zzhhrVar == zzhhrVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzicjVar.zzd() != 32) {
            int iZzd = zzicjVar.zzd();
            throw new GeneralSecurityException(androidx.multidex.d.a(new StringBuilder(String.valueOf(iZzd).length() + 74), "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", iZzd));
        }
        zzhhs zzhhsVarZzb = zzhhs.zzb(zzhhrVar);
        if (zzhhsVarZzb.zzc() == zzhhrVar2) {
            zzichVarZzb = zzhnx.zza;
        } else if (zzhhsVarZzb.zzc() == zzhhr.zzb) {
            zzichVarZzb = zzhnx.zza(num.intValue());
        } else {
            if (zzhhsVarZzb.zzc() != zzhhr.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhhsVarZzb.zzc().toString()));
            }
            zzichVarZzb = zzhnx.zzb(num.intValue());
        }
        return new zzhhn(zzhhsVarZzb, zzicjVar, zzichVarZzb, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhfz, com.google.android.gms.internal.ads.zzhes
    public final /* synthetic */ zzhfj zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhes
    @Nullable
    public final Integer zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhfz
    public final zzich zzc() {
        return this.zzc;
    }

    public final zzicj zze() {
        return this.zzb;
    }

    public final zzhhs zzf() {
        return this.zza;
    }
}
