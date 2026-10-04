package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzezg implements zzinw {
    private final zziof zza;

    private zzezg(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar2;
    }

    public static zzezg zza(zziof zziofVar, zziof zziofVar2) {
        return new zzezg(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgxw zzgxwVarZzh;
        zzexy zzexyVarZzc = zzeya.zzc();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zza.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfg)).booleanValue()) {
            zzgxwVarZzh = zzgxw.zzi(new zzfbu(zzexyVarZzc, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfh)).intValue(), scheduledExecutorService));
        } else {
            zzgxwVarZzh = zzgxw.zzh();
        }
        zzioe.zzb(zzgxwVarZzh);
        return zzgxwVarZzh;
    }
}
