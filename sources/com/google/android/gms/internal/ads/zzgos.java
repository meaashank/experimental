package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgos implements zzinw {
    private final zziof zza;

    private zzgos(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzgos zza(zziof zziofVar) {
        return new zzgos(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.zza.zzb(), "drgd"), "pcam.jar.d");
    }
}
