package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzacb implements zzdu {
    static final /* synthetic */ zzacb zza = new zzacb();

    private /* synthetic */ zzacb() {
    }

    @Override // com.google.android.gms.internal.ads.zzdu
    public final /* synthetic */ void zza(Object obj) {
        ((ExecutorService) obj).shutdown();
    }
}
