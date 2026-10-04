package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbhv extends zzcgo {
    final /* synthetic */ zzbib zza;

    public zzbhv(zzbib zzbibVar) {
        Objects.requireNonNull(zzbibVar);
        this.zza = zzbibVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgo, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        this.zza.zzb();
        return super.cancel(z10);
    }
}
