package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgzg implements Comparator {
    public static zzgzg zzb() {
        return zzgze.zza;
    }

    public static zzgzg zzc(Comparator comparator) {
        return new zzgwv(comparator);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzgzg zza() {
        return new zzgzp(this);
    }

    public final zzgzg zzd(zzgub zzgubVar) {
        return new zzgwh(zzgubVar, this);
    }
}
