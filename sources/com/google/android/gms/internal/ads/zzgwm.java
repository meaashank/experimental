package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgwm extends zzgwp {
    final /* synthetic */ zzgwt zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgwm(zzgwt zzgwtVar) {
        super(zzgwtVar, null);
        Objects.requireNonNull(zzgwtVar);
        this.zza = zzgwtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final /* bridge */ /* synthetic */ Object zza(int i10) {
        return new zzgwr(this.zza, i10);
    }
}
