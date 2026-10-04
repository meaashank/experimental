package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhhf extends zzhfz {
    private final zzhhm zza;
    private final zzicj zzb;
    private final zzich zzc;

    @Nullable
    private final Integer zzd;

    public /* synthetic */ zzhhf(zzhhm zzhhmVar, zzicj zzicjVar, zzich zzichVar, Integer num, byte[] bArr) {
        this.zza = zzhhmVar;
        this.zzb = zzicjVar;
        this.zzc = zzichVar;
        this.zzd = num;
    }

    public static zzhhe zzd() {
        return new zzhhe(null);
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

    public final zzhhm zzf() {
        return this.zza;
    }
}
