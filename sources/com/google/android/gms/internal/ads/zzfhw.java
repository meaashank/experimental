package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfhw implements zzfiu {
    private zzdcx zza;
    private final Executor zzb = zzhdp.zza();

    public final zzdcx zza() {
        return this.zza;
    }

    public final ListenableFuture zzb(zzfiv zzfivVar, zzfit zzfitVar, @Nullable zzdcx zzdcxVar) {
        zzdcw zzdcwVarZza = zzfitVar.zza(zzfivVar.zzb);
        zzdcwVarZza.zzj(new zzfiy(true));
        zzdcx zzdcxVar2 = (zzdcx) zzdcwVarZza.zzh();
        this.zza = zzdcxVar2;
        final zzczp zzczpVarZza = zzdcxVar2.zza();
        final zzfnu zzfnuVar = new zzfnu();
        zzhcq zzhcqVarZzw = zzhcq.zzw(zzczpVarZza.zzb());
        zzhcg zzhcgVar = new zzhcg(this) { // from class: com.google.android.gms.internal.ads.zzfhv
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                zzflo zzfloVar = (zzflo) obj;
                zzfnuVar.zzb = zzfloVar;
                Iterator it = zzfloVar.zzb.zza.iterator();
                boolean z10 = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        Iterator it2 = ((zzfld) it.next()).zza.iterator();
                        while (it2.hasNext()) {
                            if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z10 = true;
                        }
                    } else if (z10) {
                        return zzczpVarZza.zzc(zzhcy.zza(zzfloVar));
                    }
                }
                return zzhcy.zza(null);
            }
        };
        Executor executor = this.zzb;
        return (zzhcq) zzhcy.zzk((zzhcq) zzhcy.zzj(zzhcqVarZzw, zzhcgVar, executor), new zzgub() { // from class: com.google.android.gms.internal.ads.zzfhu
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                zzfnu zzfnuVar2 = zzfnuVar;
                zzfnuVar2.zzc = (zzcyl) obj;
                return zzfnuVar2;
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfiu
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfiv zzfivVar, zzfit zzfitVar, @Nullable Object obj) {
        return zzb(zzfivVar, zzfitVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfiu
    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
