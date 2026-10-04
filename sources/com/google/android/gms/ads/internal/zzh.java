package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfzg;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzh implements zzfzg {
    final /* synthetic */ zzk zza;

    public zzh(zzk zzkVar) {
        Objects.requireNonNull(zzkVar);
        this.zza = zzkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzg
    public final void zza(int i10, long j10) {
        this.zza.zzo().zzb(i10, System.currentTimeMillis() - j10);
    }

    @Override // com.google.android.gms.internal.ads.zzfzg
    public final void zzb(int i10, long j10, String str) {
        this.zza.zzo().zzf(i10, System.currentTimeMillis() - j10, str);
    }
}
