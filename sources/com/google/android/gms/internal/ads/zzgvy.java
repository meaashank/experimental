package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
class zzgvy implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzgvz zzc;

    public zzgvy(zzgvz zzgvzVar) {
        Objects.requireNonNull(zzgvzVar);
        this.zzc = zzgvzVar;
        Collection collection = zzgvzVar.zzb;
        this.zzb = collection;
        this.zza = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
        zzgvz zzgvzVar = this.zzc;
        zzgvzVar.zze.zzq(r1.zzp() - 1);
        zzgvzVar.zzb();
    }

    public final void zza() {
        zzgvz zzgvzVar = this.zzc;
        zzgvzVar.zza();
        if (zzgvzVar.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    public zzgvy(zzgvz zzgvzVar, Iterator it) {
        Objects.requireNonNull(zzgvzVar);
        this.zzc = zzgvzVar;
        this.zzb = zzgvzVar.zzb;
        this.zza = it;
    }
}
