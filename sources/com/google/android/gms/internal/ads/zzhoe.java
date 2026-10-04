package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzhoe implements Iterable {
    final /* synthetic */ List zza;
    final /* synthetic */ List zzb;

    public zzhoe(zzhoh zzhohVar, List list, List list2) {
        this.zza = list;
        this.zzb = list2;
        Objects.requireNonNull(zzhohVar);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzhog(this.zza.iterator(), this.zzb.iterator(), null);
    }
}
