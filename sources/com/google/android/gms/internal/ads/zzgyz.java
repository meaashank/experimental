package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgyz extends zzgyy {
    final /* synthetic */ zzgza zza;

    public zzgyz(zzgza zzgzaVar, int i10) {
        Objects.requireNonNull(zzgzaVar);
        this.zza = zzgzaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyy
    public final zzgyh zza() {
        return new zzgzc(this.zza.zza(), new zzgyx(2));
    }
}
