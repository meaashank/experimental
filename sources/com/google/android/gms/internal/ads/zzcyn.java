package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcyn implements zzcyo {
    private final Map zza;

    public zzcyn(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    @Nullable
    public final zzemq zza(int i10, String str) {
        return (zzemq) this.zza.get(str);
    }
}
