package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
final class zzgpm implements zzgpi {
    private final zzgfw zza;
    private final zzgfw zzb;
    private final zzinq zzc;
    private final zzgrh zzd;
    private final ExecutorService zze;

    public zzgpm(zzgfw zzgfwVar, zzgfw zzgfwVar2, zzinq zzinqVar, ExecutorService executorService, zzgrh zzgrhVar) {
        this.zza = zzgfwVar;
        this.zzb = zzgfwVar2;
        this.zzc = zzinqVar;
        this.zzd = zzgrhVar;
        this.zze = executorService;
    }

    private final ListenableFuture zzi(zzggt zzggtVar) {
        ListenableFuture listenableFutureZzc = this.zza.zzc(zzggtVar);
        this.zzd.zze(20303, listenableFutureZzc);
        return listenableFutureZzc;
    }

    private final ListenableFuture zzj(byte[] bArr) {
        ListenableFuture listenableFutureZzc = this.zzb.zzc(bArr);
        this.zzd.zze(20305, listenableFutureZzc);
        return listenableFutureZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ListenableFuture zza() {
        return zzhcy.zza(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ListenableFuture zzb() {
        ListenableFuture listenableFutureZzb = this.zza.zzb();
        this.zzd.zze(20302, listenableFutureZzb);
        return listenableFutureZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ListenableFuture zzc(final zzggt zzggtVar, byte[] bArr, byte[] bArr2) {
        ListenableFuture listenableFutureZzc = ((zzgfw) this.zzc.zzb()).zzc(bArr);
        this.zzd.zze(20307, listenableFutureZzc);
        return (zzhcq) zzhcy.zzj(zzhcq.zzw(zzhcy.zzl(listenableFutureZzc, zzj(bArr2))), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzgpk
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzh(zzggtVar, (List) obj);
            }
        }, zzhdp.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ListenableFuture zzd(final zzggt zzggtVar, byte[] bArr) {
        return (zzhcq) zzhcy.zzj(zzhcq.zzw(zzj(bArr)), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzgpj
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzg(zzggtVar, (Void) obj);
            }
        }, zzhdp.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgpi
    public final ListenableFuture zze() {
        ListenableFuture listenableFutureZzb = this.zzb.zzb();
        this.zzd.zze(20304, listenableFutureZzb);
        return listenableFutureZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgpi
    public final ListenableFuture zzf() {
        ListenableFuture listenableFutureZzd = zzhcy.zzd(zzgpl.zza, this.zze);
        this.zzd.zze(20312, listenableFutureZzd);
        return listenableFutureZzd;
    }

    public final /* synthetic */ ListenableFuture zzg(zzggt zzggtVar, Void r22) {
        return zzi(zzggtVar);
    }

    public final /* synthetic */ ListenableFuture zzh(zzggt zzggtVar, List list) {
        return zzi(zzggtVar);
    }
}
