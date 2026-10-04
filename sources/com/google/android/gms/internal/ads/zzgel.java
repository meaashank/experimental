package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgel implements zziof {
    final /* synthetic */ zzgeo zza;

    public zzgel(zzgeo zzgeoVar) {
        Objects.requireNonNull(zzgeoVar);
        this.zza = zzgeoVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzges(this.zza.zza(), null);
    }
}
