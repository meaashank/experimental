package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgps implements zzinw {
    private final zziof zza;

    private zzgps(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzgps zza(zziof zziofVar) {
        return new zzgps(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.zza.zzb(), "ocs"), "pmtd");
    }
}
