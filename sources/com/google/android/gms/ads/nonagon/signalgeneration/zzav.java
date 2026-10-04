package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzinw;
import com.google.android.gms.internal.ads.zzioe;

/* JADX INFO: loaded from: classes3.dex */
public final class zzav implements zzinw {
    private final zzat zza;

    private zzav(zzat zzatVar) {
        this.zza = zzatVar;
    }

    public static zzav zza(zzat zzatVar) {
        return new zzav(zzatVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        String strZzb = this.zza.zzb();
        zzioe.zzb(strZzb);
        return strZzb;
    }
}
