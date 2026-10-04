package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzeuk implements zzeup {
    final /* synthetic */ zzeul zza;

    public zzeuk(zzeul zzeulVar) {
        Objects.requireNonNull(zzeulVar);
        this.zza = zzeulVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcyl zzcylVar = (zzcyl) obj;
        zzeul zzeulVar = this.zza;
        synchronized (zzeulVar) {
            zzeulVar.zze(zzcylVar.zzn());
            zzcylVar.zzj();
        }
    }
}
