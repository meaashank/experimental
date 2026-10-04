package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdnz implements zzinw {
    private final zzdnb zza;

    private zzdnz(zzdnb zzdnbVar) {
        this.zza = zzdnbVar;
    }

    public static zzdnz zzc(zzdnb zzdnbVar) {
        return new zzdnz(zzdnbVar);
    }

    @Nullable
    public final zzclm zza() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zzb();
    }
}
