package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
final class zzghb {
    private final zzinq zza;
    private final zzinq zzb;
    private final zzinq zzc;
    private final ExecutorService zzd;
    private final zzgrh zze;
    private final int zzf;

    public zzghb(zzinq zzinqVar, zzinq zzinqVar2, zzinq zzinqVar3, zzgei zzgeiVar, ExecutorService executorService, zzgrh zzgrhVar) {
        this.zza = zzinqVar;
        this.zzb = zzinqVar2;
        this.zzc = zzinqVar3;
        this.zzd = executorService;
        this.zze = zzgrhVar;
        this.zzf = zzgeiVar.zzL();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final ListenableFuture zzd(final int i10) {
        return (zzhcq) zzhcy.zzj(zzhcq.zzw(zzhcy.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzggx
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(i10);
            }
        }, this.zzd)), zzggy.zza, zzhdp.zza());
    }

    public final /* synthetic */ zzgrh zza() {
        return this.zze;
    }

    public final ListenableFuture zzb(int i10, boolean z10) {
        ListenableFuture listenableFutureZzd = zzd(i10);
        return (!z10 || i10 == this.zzf) ? listenableFutureZzd : (zzhcq) zzhcy.zzj((zzhcq) zzhcy.zzg(zzhcq.zzw(listenableFutureZzd), Throwable.class, zzgha.zza, zzhdp.zza()), new zzggw(this), zzhdp.zza());
    }

    public final /* synthetic */ zzggu zzc(int i10) {
        int i11 = i10 - 1;
        if (i11 == 1) {
            return (zzggu) this.zza.zzb();
        }
        if (i11 == 2) {
            return (zzggu) this.zzb.zzb();
        }
        if (i11 == 3) {
            return (zzggu) this.zzc.zzb();
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ int zze() {
        return this.zzf;
    }
}
