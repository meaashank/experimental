package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfbx implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;

    private zzfbx(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
    }

    public static zzfbx zzc(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzfbx(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfbv zzb() {
        return new zzfbv((ApplicationInfo) this.zza.zzb(), (PackageInfo) this.zzb.zzb(), ((zzcok) this.zzc).zza());
    }
}
