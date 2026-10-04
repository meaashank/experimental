package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class zzgxt extends zzgxi {
    private final transient zzgxu zza;

    public zzgxt(zzgxu zzgxuVar) {
        this.zza = zzgxuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.zzr(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgxi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgxr(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    /* JADX INFO: renamed from: zza */
    public final zzhaa iterator() {
        return new zzgxr(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    public final boolean zzf() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgxi
    public final int zzg(Object[] objArr, int i10) {
        zzhab zzhabVarListIterator = ((zzgxm) this.zza.map.values()).listIterator(0);
        while (zzhabVarListIterator.hasNext()) {
            i10 = ((zzgxi) zzhabVarListIterator.next()).zzg(objArr, i10);
        }
        return i10;
    }
}
