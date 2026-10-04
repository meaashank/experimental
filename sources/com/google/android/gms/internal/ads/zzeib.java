package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeib {
    private final zzhdi zza;
    private final zzehg zzb;
    private final zzinq zzc;

    public zzeib(zzhdi zzhdiVar, zzehg zzehgVar, zzinq zzinqVar) {
        this.zza = zzhdiVar;
        this.zzb = zzehgVar;
        this.zzc = zzinqVar;
    }

    private final ListenableFuture zzg(final zzcbv zzcbvVar, zzehr zzehrVar, final zzehr zzehrVar2, final zzhcg zzhcgVar) {
        ListenableFuture listenableFutureZzh;
        String str = zzcbvVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzF(str)) {
            listenableFutureZzh = zzhcy.zzc(new zzehp(1));
        } else {
            listenableFutureZzh = zzhcy.zzh(zzehrVar.zza(zzcbvVar), ExecutionException.class, zzeia.zza, this.zza);
        }
        zzhdi zzhdiVar = this.zza;
        return (zzhcq) zzhcy.zzh((zzhcq) zzhcy.zzj((zzhcq) zzhcy.zzj(zzhcq.zzw(listenableFutureZzh), zzeht.zza, zzhdiVar), zzhcgVar, zzhdiVar), zzehp.class, new zzhcg() { // from class: com.google.android.gms.internal.ads.zzehu
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzehrVar2, zzcbvVar, zzhcgVar, (zzehp) obj);
            }
        }, zzhdiVar);
    }

    public final ListenableFuture zza(final zzcbv zzcbvVar) {
        zzhcg zzhcgVar = new zzhcg() { // from class: com.google.android.gms.internal.ads.zzehv
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                String str = new String(zzham.zza((InputStream) obj), StandardCharsets.UTF_8);
                zzcbv zzcbvVar2 = zzcbvVar;
                zzcbvVar2.zzj = str;
                return zzhcy.zza(zzcbvVar2);
            }
        };
        final zzehg zzehgVar = this.zzb;
        Objects.requireNonNull(zzehgVar);
        return zzg(zzcbvVar, new zzehr() { // from class: com.google.android.gms.internal.ads.zzehs
            @Override // com.google.android.gms.internal.ads.zzehr
            public final /* synthetic */ ListenableFuture zza(zzcbv zzcbvVar2) {
                return zzehgVar.zza(zzcbvVar2);
            }
        }, new zzehr() { // from class: com.google.android.gms.internal.ads.zzehw
            @Override // com.google.android.gms.internal.ads.zzehr
            public final /* synthetic */ ListenableFuture zza(zzcbv zzcbvVar2) {
                return this.zza.zzd(zzcbvVar2);
            }
        }, zzhcgVar);
    }

    public final ListenableFuture zzb(zzcbv zzcbvVar) {
        return zzg(zzcbvVar, new zzehr() { // from class: com.google.android.gms.internal.ads.zzehy
            @Override // com.google.android.gms.internal.ads.zzehr
            public final /* synthetic */ ListenableFuture zza(zzcbv zzcbvVar2) {
                return this.zza.zze(zzcbvVar2);
            }
        }, new zzehr() { // from class: com.google.android.gms.internal.ads.zzehz
            @Override // com.google.android.gms.internal.ads.zzehr
            public final /* synthetic */ ListenableFuture zza(zzcbv zzcbvVar2) {
                return this.zza.zzf(zzcbvVar2);
            }
        }, zzehx.zza);
    }

    public final /* synthetic */ ListenableFuture zzc(zzehr zzehrVar, zzcbv zzcbvVar, zzhcg zzhcgVar, zzehp zzehpVar) {
        return zzhcy.zzj(zzehrVar.zza(zzcbvVar), zzhcgVar, this.zza);
    }

    public final /* synthetic */ ListenableFuture zzd(zzcbv zzcbvVar) {
        return ((zzejg) this.zzc.zzb()).zzb(zzcbvVar, Binder.getCallingUid());
    }

    public final /* synthetic */ ListenableFuture zze(zzcbv zzcbvVar) {
        return this.zzb.zzd(zzcbvVar.zzh);
    }

    public final /* synthetic */ ListenableFuture zzf(zzcbv zzcbvVar) {
        return ((zzejg) this.zzc.zzb()).zzc(zzcbvVar.zzh);
    }
}
