package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzenv implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;

    private zzenv(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
    }

    public static zzenv zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzenv(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzenu((Context) this.zza.zzb(), (zzcxi) this.zzb.zzb(), (Executor) this.zzc.zzb());
    }
}
