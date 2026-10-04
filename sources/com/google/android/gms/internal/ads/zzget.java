package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzget implements zziof {
    final /* synthetic */ zzgeu zza;

    public zzget(zzgeu zzgeuVar) {
        Objects.requireNonNull(zzgeuVar);
        this.zza = zzgeuVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgeu zzgeuVar = this.zza;
        return new zzgex(zzgeuVar.zzb(), zzgeuVar.zzc(), null);
    }
}
