package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
final class zzexq implements zzfdg {

    @Nullable
    private final String zza;

    public zzexq(@Nullable String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzfml.zze((Bundle) obj, "key_schema", this.zza);
    }
}
