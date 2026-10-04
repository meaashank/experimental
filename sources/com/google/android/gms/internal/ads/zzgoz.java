package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgoz implements zzinw {
    private final zziof zza;

    private zzgoz(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzgoz zza(zziof zziofVar) {
        return new zzgoz(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.zza.zzb(), "drgd"), "pcam.jar.tmp");
    }
}
