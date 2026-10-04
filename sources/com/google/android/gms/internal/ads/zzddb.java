package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzddb implements zzinw {
    private final zzdcz zza;
    private final zziof zzb;

    private zzddb(zzdcz zzdczVar, zziof zziofVar) {
        this.zza = zzdczVar;
        this.zzb = zziofVar;
    }

    public static zzddb zza(zzdcz zzdczVar, zziof zziofVar) {
        return new zzddb(zzdczVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZzf = this.zza.zzf(((zzcok) this.zzb).zza());
        zzioe.zzb(contextZzf);
        return contextZzf;
    }
}
