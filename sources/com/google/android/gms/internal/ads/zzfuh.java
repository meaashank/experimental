package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfuh implements zzbga {
    final /* synthetic */ zzfuj zza;

    public zzfuh(zzfuj zzfujVar) {
        Objects.requireNonNull(zzfujVar);
        this.zza = zzfujVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zza(boolean z10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzD)).booleanValue()) {
            this.zza.zzj(z10);
        }
    }
}
