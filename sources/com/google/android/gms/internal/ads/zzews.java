package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzews implements zzhcg {
    static final /* synthetic */ zzews zza = new zzews();

    private /* synthetic */ zzews() {
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return appSetIdInfo == null ? zzhcy.zza(new zzeww(null, -1)) : zzhcy.zza(new zzeww(appSetIdInfo.getId(), appSetIdInfo.getScope()));
    }
}
