package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgov implements zzinw {
    private final zziof zza;

    private zzgov(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzgov zza(zziof zziofVar) {
        return new zzgov(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.zza.zzb(), "drgd"), "pmtd");
    }
}
