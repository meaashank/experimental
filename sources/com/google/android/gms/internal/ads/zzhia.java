package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhia extends zzhfz {
    private final zzhic zza;
    private final zzich zzb;

    @Nullable
    private final Integer zzc;

    private zzhia(zzhic zzhicVar, zzich zzichVar, @Nullable Integer num) {
        this.zza = zzhicVar;
        this.zzb = zzichVar;
        this.zzc = num;
    }

    public static zzhia zzd(zzhic zzhicVar, @Nullable Integer num) throws GeneralSecurityException {
        zzich zzichVarZza;
        if (zzhicVar.zzd() == zzhib.zza) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzichVarZza = zzich.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (zzhicVar.zzd() != zzhib.zzb) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(zzhicVar.zzd().toString()));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzichVarZza = zzich.zza(new byte[0]);
        }
        return new zzhia(zzhicVar, zzichVarZza, num);
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

    public final zzhic zze() {
        return this.zza;
    }
}
