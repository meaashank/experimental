package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbgj implements Comparator {
    public zzbgj(zzbgl zzbglVar) {
        Objects.requireNonNull(zzbglVar);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbgo zzbgoVar = (zzbgo) obj;
        zzbgo zzbgoVar2 = (zzbgo) obj2;
        int i10 = zzbgoVar.zzc - zzbgoVar2.zzc;
        return i10 != 0 ? i10 : Long.compare(zzbgoVar.zza, zzbgoVar2.zza);
    }
}
