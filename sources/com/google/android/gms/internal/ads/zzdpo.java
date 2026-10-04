package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdpo implements zzinw {
    private final zziof zza;

    private zzdpo(zzdpn zzdpnVar, zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdpo zza(zzdpn zzdpnVar, zziof zziofVar) {
        return new zzdpo(zzdpnVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzdpq) this.zza).zzb().zza();
    }
}
