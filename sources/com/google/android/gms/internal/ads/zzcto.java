package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcto implements zzinw {
    private final zziof zza;

    private zzcto(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzcto zza(zziof zziofVar) {
        return new zzcto(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzctn((Context) this.zza.zzb());
    }
}
