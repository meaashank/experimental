package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfen implements zzfdi {
    private final Executor zza;
    private final String zzb;

    public zzfen(zzcfn zzcfnVar, Executor executor, String str, @Nullable PackageInfo packageInfo, int i10) {
        this.zza = executor;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        ListenableFuture listenableFutureZza = zzhcy.zza(this.zzb);
        zzfem zzfemVar = zzfem.zza;
        Executor executor = this.zza;
        return zzhcy.zzh(zzhcy.zzk(listenableFutureZza, zzfemVar, executor), Throwable.class, new zzhcg() { // from class: com.google.android.gms.internal.ads.zzfel
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc((Throwable) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 41;
    }

    public final /* synthetic */ ListenableFuture zzc(Throwable th) {
        return zzhcy.zza(new zzfeo(this.zzb));
    }
}
