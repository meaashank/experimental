package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzauk implements zzaun {
    final /* synthetic */ File zza;

    public zzauk(zzauo zzauoVar, File file) {
        this.zza = file;
        Objects.requireNonNull(zzauoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final File zza() {
        return this.zza;
    }
}
