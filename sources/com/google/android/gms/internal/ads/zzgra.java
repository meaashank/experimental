package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgra implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzgra(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzgra zza(zziof zziofVar, zziof zziofVar2) {
        return new zzgra(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgqz((Context) this.zza.zzb(), (ExecutorService) this.zzb.zzb());
    }
}
