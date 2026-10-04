package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
final class zzfcz implements zzfdg {
    private final boolean zza;

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.zza) {
            bundle.putBoolean("sdk_prefetch", true);
        }
    }
}
