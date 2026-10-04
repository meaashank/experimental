package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzewu implements zzgub {
    static final /* synthetic */ zzewu zza = new zzewu();

    private /* synthetic */ zzewu() {
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final /* synthetic */ Object apply(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return new zzeww(appSetIdInfo.getId(), appSetIdInfo.getScope());
    }
}
