package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzddl implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;

    private zzddl(zzddk zzddkVar, zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
    }

    public static zzddl zza(zzddk zzddkVar, zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        return new zzddl(zzddkVar, zziofVar, zziofVar2, zziofVar3, zziofVar4);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzddk.zza((Context) this.zza.zzb(), ((zzcpa) this.zzb).zza(), ((zzczc) this.zzc).zza(), zzcrb.zzc());
    }
}
