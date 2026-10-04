package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class zzgzc extends zzgvl {
    final transient zzgvc zza;

    public zzgzc(Map map, zzgvc zzgvcVar) {
        super(map);
        this.zza = zzgvcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgvl, com.google.android.gms.internal.ads.zzgwc
    public final /* bridge */ /* synthetic */ Collection zzc() {
        return (List) this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgwc, com.google.android.gms.internal.ads.zzgwf
    public final Set zzh() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgwc, com.google.android.gms.internal.ads.zzgwf
    public final Map zzl() {
        return zzm();
    }
}
