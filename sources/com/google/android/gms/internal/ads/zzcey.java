package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcey implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzcey(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzcey zza(zziof zziofVar, zziof zziofVar2) {
        return new zzcey(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcex((Context) this.zza.zzb(), ((zzcel) this.zzb).zzb());
    }
}
