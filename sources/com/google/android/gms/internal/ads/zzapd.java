package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzapd implements zzanu {
    private final zzaow zza;
    private final long[] zzb;
    private final Map zzc;
    private final Map zzd;
    private final Map zze;

    public zzapd(zzaow zzaowVar, Map map, Map map2, Map map3) {
        this.zza = zzaowVar;
        this.zzd = map2;
        this.zze = map3;
        this.zzc = Collections.unmodifiableMap(map);
        this.zzb = zzaowVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzanu
    public final int zza() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzanu
    public final long zzb(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzanu
    public final List zzc(long j10) {
        return this.zza.zzh(j10, this.zzc, this.zzd, this.zze);
    }
}
