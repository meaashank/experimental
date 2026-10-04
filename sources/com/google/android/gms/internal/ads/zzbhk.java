package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbhk implements zzbga {
    final /* synthetic */ zzbhn zza;

    public zzbhk(zzbhn zzbhnVar) {
        Objects.requireNonNull(zzbhnVar);
        this.zza = zzbhnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zza(boolean z10) {
        if (z10) {
            this.zza.zzf();
        } else {
            this.zza.zzg();
        }
    }
}
