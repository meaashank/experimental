package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhji extends zzhfz {
    private final zzhjo zza;
    private final zzicj zzb;
    private final zzich zzc;

    @Nullable
    private final Integer zzd;

    private zzhji(zzhjo zzhjoVar, zzicj zzicjVar, zzich zzichVar, @Nullable Integer num) {
        this.zza = zzhjoVar;
        this.zzb = zzicjVar;
        this.zzc = zzichVar;
        this.zzd = num;
    }

    public static zzhji zzd(zzhjn zzhjnVar, zzicj zzicjVar, @Nullable Integer num) throws GeneralSecurityException {
        zzich zzichVarZzb;
        zzhjn zzhjnVar2 = zzhjn.zzc;
        if (zzhjnVar != zzhjnVar2 && num == null) {
            String string = zzhjnVar.toString();
            throw new GeneralSecurityException(androidx.compose.animation.core.E0.a(new StringBuilder(string.length() + 62), "For given Variant ", string, " the value of idRequirement must be non-null"));
        }
        if (zzhjnVar == zzhjnVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzicjVar.zzd() != 32) {
            int iZzd = zzicjVar.zzd();
            throw new GeneralSecurityException(androidx.multidex.d.a(new StringBuilder(String.valueOf(iZzd).length() + 75), "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", iZzd));
        }
        zzhjo zzhjoVarZzb = zzhjo.zzb(zzhjnVar);
        if (zzhjoVarZzb.zzc() == zzhjnVar2) {
            zzichVarZzb = zzhnx.zza;
        } else if (zzhjoVarZzb.zzc() == zzhjn.zzb) {
            zzichVarZzb = zzhnx.zza(num.intValue());
        } else {
            if (zzhjoVarZzb.zzc() != zzhjn.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhjoVarZzb.zzc().toString()));
            }
            zzichVarZzb = zzhnx.zzb(num.intValue());
        }
        return new zzhji(zzhjoVarZzb, zzicjVar, zzichVarZzb, num);
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

    public final zzhjo zzf() {
        return this.zza;
    }
}
