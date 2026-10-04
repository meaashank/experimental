package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgyi extends zzgzz {
    final /* synthetic */ zzgyj zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgyi(zzgyj zzgyjVar, ListIterator listIterator) {
        super(listIterator);
        Objects.requireNonNull(zzgyjVar);
        this.zza = zzgyjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzy
    public final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}
