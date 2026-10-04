package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
final class zzgwx extends zzgwz {
    public zzgwx() {
        super(null);
    }

    public static final zzgwz zzf(int i10) {
        return i10 < 0 ? zzgwz.zzb : i10 > 0 ? zzgwz.zzc : zzgwz.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgwz
    public final zzgwz zza(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzgwz
    public final zzgwz zzb(int i10, int i11) {
        return zzf(Integer.compare(i10, i11));
    }

    @Override // com.google.android.gms.internal.ads.zzgwz
    public final zzgwz zzc(boolean z10, boolean z11) {
        return zzf(Boolean.compare(z11, z10));
    }

    @Override // com.google.android.gms.internal.ads.zzgwz
    public final zzgwz zzd(boolean z10, boolean z11) {
        return zzf(Boolean.compare(z10, z11));
    }

    @Override // com.google.android.gms.internal.ads.zzgwz
    public final int zze() {
        return 0;
    }
}
