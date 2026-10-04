package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbsc implements zzhcg {
    final /* synthetic */ zzbru zza;

    public zzbsc(zzbsg zzbsgVar, zzbru zzbruVar) {
        this.zza = zzbruVar;
        Objects.requireNonNull(zzbsgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        zzcgo zzcgoVar = new zzcgo();
        ((zzbsa) obj).zze(this.zza, new zzbsb(this, zzcgoVar));
        return zzcgoVar;
    }
}
