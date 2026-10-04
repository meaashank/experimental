package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcwm implements zzinw {
    private final zzcwk zza;

    private zzcwm(zzcwk zzcwkVar) {
        this.zza = zzcwkVar;
    }

    public static zzcwm zzc(zzcwk zzcwkVar) {
        return new zzcwm(zzcwkVar);
    }

    public static View zzd(zzcwk zzcwkVar) {
        View viewZzb = zzcwkVar.zzb();
        zzioe.zzb(viewZzb);
        return viewZzb;
    }

    public final View zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
