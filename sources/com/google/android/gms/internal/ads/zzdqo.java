package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdqo {

    @Nullable
    private zzbms zza;

    public zzdqo(zzdpz zzdpzVar) {
        this.zza = zzdpzVar;
    }

    @Nullable
    public final synchronized zzbms zza() {
        return this.zza;
    }

    public final synchronized void zzb(@Nullable zzbms zzbmsVar) {
        this.zza = zzbmsVar;
    }
}
