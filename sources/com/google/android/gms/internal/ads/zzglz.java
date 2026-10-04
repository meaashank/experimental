package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class zzglz implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;

    private zzglz(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
    }

    public static zzglz zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzglz(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgme((File) this.zza.zzb(), (zzfyd) this.zzb.zzb(), (zzgrh) this.zzc.zzb());
    }
}
