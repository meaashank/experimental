package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcyf implements zzinw {
    private final zzcyd zza;

    private zzcyf(zzcyd zzcydVar) {
        this.zza = zzcydVar;
    }

    public static zzcyf zza(zzcyd zzcydVar) {
        return new zzcyf(zzcydVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zzc();
    }
}
