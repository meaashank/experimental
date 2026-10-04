package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdng implements zzinw {
    private final zzdnb zza;

    private zzdng(zzdnb zzdnbVar) {
        this.zza = zzdnbVar;
    }

    public static zzdng zzc(zzdnb zzdnbVar) {
        return new zzdng(zzdnbVar);
    }

    @Nullable
    public final View zza() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zzd();
    }
}
