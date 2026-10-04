package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfih implements zzfiu {
    private final zzfnl zza;
    private final Executor zzb;
    private final zzhcv zzc = new zzfie(this);

    public zzfih(zzfnl zzfnlVar, Executor executor) {
        this.zza = zzfnlVar;
        this.zzb = executor;
    }

    public final ListenableFuture zza(zzfiv zzfivVar, zzfit zzfitVar, final zzdcx zzdcxVar) {
        zzfnl zzfnlVar = this.zza;
        Executor executor = this.zzb;
        return (zzhcq) zzhcy.zzg((zzhcq) zzhcy.zzj(zzhcq.zzw(new zzfiq(zzfnlVar, zzdcxVar, executor).zza()), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzfif
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzb(zzdcxVar, (zzfio) obj);
            }
        }, executor), Exception.class, new zzfid(this), executor);
    }

    public final /* synthetic */ ListenableFuture zzb(zzdcx zzdcxVar, zzfio zzfioVar) {
        zzfnl zzfnlVar = this.zza;
        zzfnv zzfnvVar = zzfioVar.zzb;
        zzcbv zzcbvVar = zzfioVar.zza;
        zzfnu zzfnuVarZza = zzfnlVar.zza(zzfnvVar);
        if (zzfnuVarZza != null && zzcbvVar != null) {
            zzhcy.zzr(zzdcxVar.zza().zzf(zzcbvVar), this.zzc, this.zzb);
        }
        return zzhcy.zza(new zzfig(zzfnvVar, zzcbvVar, zzfnuVarZza));
    }

    @Override // com.google.android.gms.internal.ads.zzfiu
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfiv zzfivVar, zzfit zzfitVar, Object obj) {
        return zza(zzfivVar, zzfitVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfiu
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
