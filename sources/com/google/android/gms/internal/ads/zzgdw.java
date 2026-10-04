package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgdw implements zzinw {
    private final zziof zza;

    private zzgdw(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzgdw zza(zziof zziofVar) {
        return new zzgdw(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        File dir = ((Context) this.zza.zzb()).getDir("yqzdkcache", 0);
        zzioe.zzb(dir);
        return dir;
    }
}
