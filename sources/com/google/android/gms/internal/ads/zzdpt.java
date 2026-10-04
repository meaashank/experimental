package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdpt implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzdpt(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzdpt zza(zziof zziofVar, zziof zziofVar2) {
        return new zzdpt(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdlq((Context) this.zza.zzb(), new HashSet(), ((zzczc) this.zzb).zza());
    }
}
