package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzinm implements Iterator {
    int zza = 0;
    final /* synthetic */ zzinn zzb;

    public zzinm(zzinn zzinnVar) {
        this.zzb = zzinnVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.zza;
        zzinn zzinnVar = this.zzb;
        return i10 < zzinnVar.zza.size() || zzinnVar.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.zza;
        zzinn zzinnVar = this.zzb;
        List list = zzinnVar.zza;
        if (i10 >= list.size()) {
            list.add(zzinnVar.zzb.next());
            return next();
        }
        int i11 = this.zza;
        this.zza = i11 + 1;
        return list.get(i11);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
