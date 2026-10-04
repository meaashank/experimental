package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgfx implements zzinw {
    private final zziof zza;

    private zzgfx(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzgfx zza(zziof zziofVar) {
        return new zzgfx(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzggf((ExecutorService) this.zza.zzb());
    }
}
