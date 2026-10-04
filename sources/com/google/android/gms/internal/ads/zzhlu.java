package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
final class zzhlu implements zzhlw {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    public zzhlu(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzhlw
    public final boolean zza() {
        return this.zza.get();
    }
}
