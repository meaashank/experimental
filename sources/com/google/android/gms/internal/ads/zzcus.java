package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcus implements zzbqh {
    final /* synthetic */ zzcut zza;

    public zzcus(zzcut zzcutVar) {
        Objects.requireNonNull(zzcutVar);
        this.zza = zzcutVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void zza(Object obj, Map map) {
        zzcut zzcutVar = this.zza;
        if (zzcutVar.zze(map)) {
            zzcutVar.zzf().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcur
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zza.zzg().zzm();
                }
            });
        }
    }
}
