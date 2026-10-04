package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzggw implements zzhcg {
    final /* synthetic */ zzghb zza;

    public zzggw(zzghb zzghbVar) {
        Objects.requireNonNull(zzghbVar);
        this.zza = zzghbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        zzggu zzgguVar = (zzggu) obj;
        if (zzgguVar != null) {
            return zzhcy.zza(zzgguVar);
        }
        zzghb zzghbVar = this.zza;
        zzghbVar.zza().zzb(51);
        return zzghbVar.zzd(zzghbVar.zze());
    }
}
