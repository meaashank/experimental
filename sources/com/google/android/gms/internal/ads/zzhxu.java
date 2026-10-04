package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhxu extends zzhyo {
    private final zzhxq zza;
    private final BigInteger zzb;
    private final zzich zzc;

    @Nullable
    private final Integer zzd;

    public /* synthetic */ zzhxu(zzhxq zzhxqVar, BigInteger bigInteger, zzich zzichVar, Integer num, byte[] bArr) {
        this.zza = zzhxqVar;
        this.zzb = bigInteger;
        this.zzc = zzichVar;
        this.zzd = num;
    }

    public static zzhxt zzc() {
        return new zzhxt(null);
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

    public final BigInteger zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhyo
    public final zzich zze() {
        return this.zzc;
    }

    public final zzhxq zzf() {
        return this.zza;
    }
}
