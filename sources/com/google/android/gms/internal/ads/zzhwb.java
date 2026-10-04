package com.google.android.gms.internal.ads;

import java.security.spec.ECPoint;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhwb extends zzhyo {
    private final zzhvx zza;
    private final ECPoint zzb;
    private final zzich zzc;

    @Nullable
    private final Integer zzd;

    public /* synthetic */ zzhwb(zzhvx zzhvxVar, ECPoint eCPoint, zzich zzichVar, Integer num, byte[] bArr) {
        this.zza = zzhvxVar;
        this.zzb = eCPoint;
        this.zzc = zzichVar;
        this.zzd = num;
    }

    public static zzhwa zzc() {
        return new zzhwa(null);
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

    public final ECPoint zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhyo
    public final zzich zze() {
        return this.zzc;
    }

    public final zzhvx zzf() {
        return this.zza;
    }
}
