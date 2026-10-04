package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzggy implements zzhcg {
    static final /* synthetic */ zzggy zza = new zzggy();

    private /* synthetic */ zzggy() {
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        final zzggu zzgguVar = (zzggu) obj;
        return zzhcy.zzk(zzgguVar.zzb(), new zzgub() { // from class: com.google.android.gms.internal.ads.zzggz
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj2) {
                return zzgguVar;
            }
        }, zzhdp.zza());
    }
}
