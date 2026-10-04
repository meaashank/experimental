package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgut implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzguz zzb;

    public zzgut(zzguz zzguzVar, CharSequence charSequence) {
        this.zza = charSequence;
        Objects.requireNonNull(zzguzVar);
        this.zzb = zzguzVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zzb.zzh(this.zza);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        zzgue.zzb(sb2, this, U6.j.f68738d);
        sb2.append(']');
        return sb2.toString();
    }
}
