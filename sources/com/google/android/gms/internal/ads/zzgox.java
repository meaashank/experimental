package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgox implements zzinw {
    private final zziof zza;

    private zzgox(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzgox zza(zziof zziofVar) {
        return new zzgox(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.zza.zzb(), "drgd"), "pcbc");
    }
}
