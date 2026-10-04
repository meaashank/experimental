package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzewp implements zzfdi {
    private final Executor zza;
    private final zzcfv zzb;

    public zzewp(Executor executor, zzcfv zzcfvVar) {
        this.zza = executor;
        this.zzb = zzcfvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdV)).booleanValue()) {
            return zzhcy.zza(new zzewq(null));
        }
        zzcfv zzcfvVar = this.zzb;
        return zzhcy.zzk(zzcfvVar.zzr(), zzewo.zza, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 10;
    }
}
