package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfbn implements zzfdg {

    @Nullable
    private final String zza;

    public zzfbn(@Nullable String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzfml.zze((Bundle) obj, "omid_v", this.zza);
    }
}
