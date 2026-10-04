package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
final class zzgpg implements zzgoa {
    private final zzgmd zza;
    private final ExecutorService zzb;
    private final zzgrh zzc;

    public zzgpg(zzgmd zzgmdVar, ExecutorService executorService, zzgrh zzgrhVar) {
        this.zza = zzgmdVar;
        this.zzb = executorService;
        this.zzc = zzgrhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ListenableFuture zza() {
        return zzhcy.zza(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ListenableFuture zzb() {
        ListenableFuture listenableFutureZzd = zzhcy.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgpf
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzf();
            }
        }, this.zzb);
        this.zzc.zze(15302, listenableFutureZzd);
        return listenableFutureZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ListenableFuture zzc(final zzggt zzggtVar, final byte[] bArr, final byte[] bArr2) {
        ListenableFuture listenableFutureZzd = zzhcy.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgpe
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.zza.zzi(zzggtVar, bArr, bArr2);
                return null;
            }
        }, this.zzb);
        this.zzc.zze(15321, listenableFutureZzd);
        return listenableFutureZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ListenableFuture zzd(final zzggt zzggtVar, final byte[] bArr) {
        ListenableFuture listenableFutureZzd = zzhcy.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgpd
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.zza.zzh(zzggtVar, bArr);
                return null;
            }
        }, this.zzb);
        this.zzc.zze(15305, listenableFutureZzd);
        return listenableFutureZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgoa
    public final ListenableFuture zze() {
        ListenableFuture listenableFutureZzd = zzhcy.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgpc
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzg();
            }
        }, this.zzb);
        this.zzc.zze(15314, listenableFutureZzd);
        return listenableFutureZzd;
    }

    public final /* synthetic */ zzggt zzf() {
        zzggt zzggtVarZzc = this.zza.zzc(1);
        return zzggtVarZzc == null ? zzggt.zzh() : zzggtVarZzc;
    }

    public final /* synthetic */ zzfzr zzg() {
        return this.zza.zzb(1);
    }

    public final /* synthetic */ Void zzh(zzggt zzggtVar, byte[] bArr) {
        this.zza.zza(zzggtVar, null, bArr);
        return null;
    }

    public final /* synthetic */ Void zzi(zzggt zzggtVar, byte[] bArr, byte[] bArr2) {
        this.zza.zza(zzggtVar, bArr, bArr2);
        return null;
    }
}
