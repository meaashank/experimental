package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdau implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzdau(zzdat zzdatVar, zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzdau zza(zzdat zzdatVar, zziof zziofVar, zziof zziofVar2) {
        return new zzdau(zzdatVar, zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new com.google.android.gms.ads.internal.zzb((Context) this.zza.zzb(), (zzcef) this.zzb.zzb(), null);
    }
}
