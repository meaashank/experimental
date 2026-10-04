package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
final class zzauw implements zzaun {
    final /* synthetic */ Context zza;
    private File zzb = null;

    public zzauw(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final File zza() {
        if (this.zzb == null) {
            this.zzb = new File(this.zza.getCacheDir(), "volley");
        }
        return this.zzb;
    }
}
