package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgow implements zzinw {
    private final zziof zza;

    private zzgow(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzgow zza(zziof zziofVar) {
        return new zzgow(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File(new File((File) this.zza.zzb(), "drgd"), "v"), "pcopt");
    }
}
