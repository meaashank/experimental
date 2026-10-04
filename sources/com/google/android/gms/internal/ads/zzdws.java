package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbil;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdws implements zzinw {
    private final zziof zza;

    private zzdws(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdws zza(zziof zziofVar) {
        return new zzdws(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbil.zza.EnumC0488zza enumC0488zza = ((zzddg) this.zza).zza().zzp.zza == 3 ? zzbil.zza.EnumC0488zza.REWARDED_INTERSTITIAL : zzbil.zza.EnumC0488zza.REWARD_BASED_VIDEO_AD;
        zzioe.zzb(enumC0488zza);
        return enumC0488zza;
    }
}
