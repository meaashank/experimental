package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzcok;
import com.google.android.gms.internal.ads.zzinw;
import com.google.android.gms.internal.ads.zziof;

/* JADX INFO: loaded from: classes3.dex */
public final class zzca implements zzinw {
    private final zziof zza;

    private zzca(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzca zza(zziof zziofVar) {
        return new zzca(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzbz(((zzcok) this.zza).zza());
    }
}
