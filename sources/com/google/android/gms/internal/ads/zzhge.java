package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhge extends zzhfz {
    private final zzhgm zza;
    private final zzicj zzb;
    private final zzicj zzc;
    private final zzich zzd;

    @Nullable
    private final Integer zze;

    public /* synthetic */ zzhge(zzhgm zzhgmVar, zzicj zzicjVar, zzicj zzicjVar2, zzich zzichVar, Integer num, byte[] bArr) {
        this.zza = zzhgmVar;
        this.zzb = zzicjVar;
        this.zzc = zzicjVar2;
        this.zzd = zzichVar;
        this.zze = num;
    }

    public static zzhgd zzd() {
        return new zzhgd(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhfz, com.google.android.gms.internal.ads.zzhes
    public final /* synthetic */ zzhfj zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhes
    @Nullable
    public final Integer zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhfz
    public final zzich zzc() {
        return this.zzd;
    }

    public final zzicj zze() {
        return this.zzb;
    }

    public final zzicj zzf() {
        return this.zzc;
    }

    public final zzhgm zzg() {
        return this.zza;
    }
}
