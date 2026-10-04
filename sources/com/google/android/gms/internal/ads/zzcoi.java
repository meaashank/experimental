package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcoi implements zzinw {
    private final zzcod zza;

    private zzcoi(zzcod zzcodVar) {
        this.zza = zzcodVar;
    }

    public static zzcoi zzc(zzcod zzcodVar) {
        return new zzcoi(zzcodVar);
    }

    public static Context zzd(zzcod zzcodVar) {
        Context contextZzb = zzcodVar.zzb();
        zzioe.zzb(contextZzb);
        return contextZzb;
    }

    public final Context zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
