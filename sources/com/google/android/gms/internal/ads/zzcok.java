package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcok implements zzinw {
    private final zzcod zza;

    private zzcok(zzcod zzcodVar) {
        this.zza = zzcodVar;
    }

    public static zzcok zzc(zzcod zzcodVar) {
        return new zzcok(zzcodVar);
    }

    public static Context zzd(zzcod zzcodVar) {
        Context contextZza = zzcodVar.zza();
        zzioe.zzb(contextZza);
        return contextZza;
    }

    public final Context zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
