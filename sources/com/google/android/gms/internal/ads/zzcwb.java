package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcwb implements zzinw {
    private final zzcwa zza;

    private zzcwb(zzcwa zzcwaVar) {
        this.zza = zzcwaVar;
    }

    public static zzcwb zzc(zzcwa zzcwaVar) {
        return new zzcwb(zzcwaVar);
    }

    @Nullable
    public final ViewGroup zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zza();
    }
}
