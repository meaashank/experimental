package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class zzfiq {
    private final zzfnl zza;
    private final zzdcx zzb;
    private final Executor zzc;
    private zzfio zzd;

    public zzfiq(zzfnl zzfnlVar, zzdcx zzdcxVar, Executor executor) {
        this.zza = zzfnlVar;
        this.zzb = zzdcxVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzfnv zzb() {
        zzflw zzflwVarZzb = this.zzb.zzb();
        return this.zza.zzd(zzflwVarZzb.zzd, zzflwVarZzb.zzg, zzflwVarZzb.zzk);
    }

    public final ListenableFuture zza() {
        ListenableFuture listenableFutureZza;
        zzfio zzfioVar = this.zzd;
        if (zzfioVar != null) {
            return zzhcy.zza(zzfioVar);
        }
        if (((Boolean) zzblo.zza.zze()).booleanValue()) {
            zzhcq zzhcqVarZzw = zzhcq.zzw(this.zzb.zza().zze(this.zza.zze()));
            zzfin zzfinVar = new zzfin(this);
            Executor executor = this.zzc;
            listenableFutureZza = (zzhcq) zzhcy.zzg((zzhcq) zzhcy.zzk(zzhcqVarZzw, zzfinVar, executor), zzehp.class, new zzfim(this), executor);
        } else {
            zzfio zzfioVar2 = new zzfio(null, zzb(), null);
            this.zzd = zzfioVar2;
            listenableFutureZza = zzhcy.zza(zzfioVar2);
        }
        return zzhcy.zzk(listenableFutureZza, zzfip.zza, this.zzc);
    }

    public final /* synthetic */ zzfio zzc() {
        return this.zzd;
    }

    public final /* synthetic */ void zzd(zzfio zzfioVar) {
        this.zzd = zzfioVar;
    }
}
