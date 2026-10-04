package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbfv extends com.google.android.gms.ads.internal.client.zzck {
    private final AppEventListener zza;

    public zzbfv(AppEventListener appEventListener) {
        this.zza = appEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final void zza(String str, String str2) {
        this.zza.onAppEvent(str, str2);
    }

    public final AppEventListener zzb() {
        return this.zza;
    }
}
