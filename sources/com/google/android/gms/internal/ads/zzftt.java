package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzftt implements zzbga {
    final /* synthetic */ zzftu zza;

    public zzftt(zzftu zzftuVar) {
        Objects.requireNonNull(zzftuVar);
        this.zza = zzftuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zza(boolean z10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzD)).booleanValue()) {
            this.zza.zzl(z10);
        }
    }
}
