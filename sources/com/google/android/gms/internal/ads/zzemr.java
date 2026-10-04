package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzemr implements zzemq {

    @e.f0
    public final zzemq zza;
    private final zzgub zzb;

    public zzemr(zzemq zzemqVar, zzgub zzgubVar) {
        this.zza = zzemqVar;
        this.zzb = zzgubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final boolean zza(zzflo zzfloVar, zzfld zzfldVar) {
        return this.zza.zza(zzfloVar, zzfldVar);
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final ListenableFuture zzb(zzflo zzfloVar, zzfld zzfldVar) {
        return zzhcy.zzk(this.zza.zzb(zzfloVar, zzfldVar), this.zzb, zzcgj.zza);
    }
}
