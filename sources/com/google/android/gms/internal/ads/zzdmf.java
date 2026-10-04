package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdmf extends zzdjn implements zzbra {
    public zzdmf(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbra
    public final synchronized void zza() {
        zzs(zzdme.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbra
    public final void zzb(@Nullable final zzcct zzcctVar) {
        zzs(new zzdjm() { // from class: com.google.android.gms.internal.ads.zzdmc
            @Override // com.google.android.gms.internal.ads.zzdjm
            public final /* synthetic */ void zza(Object obj) {
                ((zzbra) obj).zzb(zzcctVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbra
    public final void zzc() {
        zzs(zzdmd.zza);
    }
}
