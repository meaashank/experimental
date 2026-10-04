package com.google.android.gms.internal.ads;

import java.util.AbstractList;

/* JADX INFO: loaded from: classes4.dex */
public final class zzifw extends AbstractList {
    private final zzifu zza;
    private final zzifv zzb;

    public zzifw(zzifu zzifuVar, zzifv zzifvVar) {
        this.zza = zzifuVar;
        this.zzb = zzifvVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return this.zzb.zzb(this.zza.zzf(i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
