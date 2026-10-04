package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfik implements zzfiu {

    @Nullable
    private zzdcx zza;

    @Override // com.google.android.gms.internal.ads.zzfiu
    @Nullable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdcx zzd() {
        return this.zza;
    }

    public final synchronized ListenableFuture zzb(zzfiv zzfivVar, zzfit zzfitVar, @Nullable zzdcx zzdcxVar) {
        zzczp zzczpVarZza;
        try {
            if (zzdcxVar != null) {
                this.zza = zzdcxVar;
            } else {
                this.zza = (zzdcx) zzfitVar.zza(zzfivVar.zzb).zzh();
            }
            zzczpVarZza = this.zza.zza();
        } catch (Throwable th) {
            throw th;
        }
        return zzczpVarZza.zzc(zzczpVarZza.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzfiu
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfiv zzfivVar, zzfit zzfitVar, @Nullable Object obj) {
        return zzb(zzfivVar, zzfitVar, null);
    }
}
