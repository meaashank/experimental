package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzepi implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;

    private zzepi(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
    }

    public static zzepi zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzepi(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeph((Context) this.zza.zzb(), (zzdpa) this.zzb.zzb(), ((zzcpa) this.zzc).zza());
    }
}
