package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgzi extends zzgxm {
    final /* synthetic */ zzgzj zza;

    public zzgzi(zzgzj zzgzjVar) {
        Objects.requireNonNull(zzgzjVar);
        this.zza = zzgzjVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        zzgzj zzgzjVar = this.zza;
        zzguk.zzm(i10, zzgzjVar.zzx(), FirebaseAnalytics.Param.INDEX);
        int i11 = i10 + i10;
        Object obj = zzgzjVar.zzw()[i11];
        Objects.requireNonNull(obj);
        Object obj2 = zzgzjVar.zzw()[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    public final boolean zzf() {
        return true;
    }
}
