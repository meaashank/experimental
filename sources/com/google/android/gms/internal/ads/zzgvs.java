package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
class zzgvs extends zzgyq {
    final /* synthetic */ zzgwc zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgvs(zzgwc zzgwcVar, Map map) {
        super(map);
        Objects.requireNonNull(zzgwcVar);
        this.zza = zzgwcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyq, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        zzgyf.zzb(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.zzd.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.zzd.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zzd.keySet().hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzgyq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzgvr(this, this.zzd.entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.ads.zzgyq, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.zzd.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        zzgwc zzgwcVar = this.zza;
        zzgwcVar.zzq(zzgwcVar.zzp() - size);
        return size > 0;
    }
}
