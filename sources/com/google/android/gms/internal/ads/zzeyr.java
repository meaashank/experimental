package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeyr implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzeyr(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        this.zza = zziofVar2;
        this.zzb = zziofVar4;
    }

    public static zzeyr zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        return new zzeyr(zziofVar, zziofVar2, zziofVar3, zziofVar4);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzexw(zzfbd.zzc(), ((Long) zzbkw.zzf.zze()).longValue(), (Clock) this.zza.zzb(), zzfoy.zzc(), (zzeaj) this.zzb.zzb());
    }
}
