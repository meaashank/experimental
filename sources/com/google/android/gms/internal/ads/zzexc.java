package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzexc implements zzfdi {
    private final zzhdi zza;
    private final VersionInfoParcel zzb;

    public zzexc(VersionInfoParcel versionInfoParcel, zzhdi zzhdiVar) {
        this.zzb = versionInfoParcel;
        this.zza = zzhdiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzexb
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 54;
    }

    public final /* synthetic */ zzexd zzc() {
        return zzexd.zzb(this.zzb);
    }
}
