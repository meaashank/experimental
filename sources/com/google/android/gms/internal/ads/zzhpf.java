package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhpf extends zzhqb {
    private final zzhpm zza;
    private final zzicj zzb;
    private final zzich zzc;

    @Nullable
    private final Integer zzd;

    public /* synthetic */ zzhpf(zzhpm zzhpmVar, zzicj zzicjVar, zzich zzichVar, Integer num, byte[] bArr) {
        this.zza = zzhpmVar;
        this.zzb = zzicjVar;
        this.zzc = zzichVar;
        this.zzd = num;
    }

    public static zzhpe zzc() {
        return new zzhpe(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhqb, com.google.android.gms.internal.ads.zzhes
    public final /* synthetic */ zzhfj zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhes
    @Nullable
    public final Integer zzb() {
        return this.zzd;
    }

    public final zzicj zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhqb
    public final zzich zze() {
        return this.zzc;
    }

    public final zzhpm zzf() {
        return this.zza;
    }
}
