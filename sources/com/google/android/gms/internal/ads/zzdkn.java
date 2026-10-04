package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdkn implements zzinw {
    private final zzdjp zza;

    private zzdkn(zzdjp zzdjpVar) {
        this.zza = zzdjpVar;
    }

    public static zzdkn zzc(zzdjp zzdjpVar) {
        return new zzdkn(zzdjpVar);
    }

    @Nullable
    public final zzfir zza() {
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zzo();
    }
}
