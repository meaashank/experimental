package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbti implements zzbqh {
    final /* synthetic */ zzbtp zza;
    private final zzbqh zzb;

    public zzbti(zzbtp zzbtpVar, zzbqh zzbqhVar) {
        Objects.requireNonNull(zzbtpVar);
        this.zza = zzbtpVar;
        this.zzb = zzbqhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        this.zzb.zza(this.zza, map);
    }

    public final /* synthetic */ zzbqh zzb() {
        return this.zzb;
    }
}
