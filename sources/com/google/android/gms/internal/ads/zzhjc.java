package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhjc extends zzhfz {
    private final zzhjh zza;
    private final zzicj zzb;
    private final zzich zzc;

    @Nullable
    private final Integer zzd;

    private zzhjc(zzhjh zzhjhVar, zzicj zzicjVar, zzich zzichVar, @Nullable Integer num) {
        this.zza = zzhjhVar;
        this.zzb = zzicjVar;
        this.zzc = zzichVar;
        this.zzd = num;
    }

    public static zzhjc zzd(zzhjh zzhjhVar, zzicj zzicjVar, @Nullable Integer num) throws GeneralSecurityException {
        zzich zzichVarZzb;
        zzhjg zzhjgVarZzc = zzhjhVar.zzc();
        zzhjg zzhjgVar = zzhjg.zzb;
        if (zzhjgVarZzc != zzhjgVar && num == null) {
            String string = zzhjhVar.zzc().toString();
            throw new GeneralSecurityException(androidx.compose.animation.core.E0.a(new StringBuilder(string.length() + 62), "For given Variant ", string, " the value of idRequirement must be non-null"));
        }
        if (zzhjhVar.zzc() == zzhjgVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzicjVar.zzd() != 32) {
            int iZzd = zzicjVar.zzd();
            throw new GeneralSecurityException(androidx.multidex.d.a(new StringBuilder(String.valueOf(iZzd).length() + 68), "XAesGcmKey key must be constructed with key of length 32 bytes, not ", iZzd));
        }
        if (zzhjhVar.zzc() == zzhjgVar) {
            zzichVarZzb = zzhnx.zza;
        } else {
            if (zzhjhVar.zzc() != zzhjg.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhjhVar.zzc().toString()));
            }
            zzichVarZzb = zzhnx.zzb(num.intValue());
        }
        return new zzhjc(zzhjhVar, zzicjVar, zzichVarZzb, num);
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

    public final zzhjh zzf() {
        return this.zza;
    }
}
