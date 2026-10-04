package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdny implements zzinw {
    private final zzdnb zza;

    private zzdny(zzdnb zzdnbVar) {
        this.zza = zzdnbVar;
    }

    public static zzdny zza(zzdnb zzdnbVar) {
        return new zzdny(zzdnbVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zzc();
    }
}
