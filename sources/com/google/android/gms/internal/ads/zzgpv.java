package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgpv implements zzinw {
    private final zziof zza;

    private zzgpv(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzgpv zza(zziof zziofVar) {
        return new zzgpv(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.zza.zzb(), "ocs"), "pcam.jar");
    }
}
