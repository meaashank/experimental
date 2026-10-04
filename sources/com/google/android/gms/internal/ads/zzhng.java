package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhng {
    private HashMap zza = new HashMap();

    public final zzhnh zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzhnh zzhnhVar = new zzhnh(Collections.unmodifiableMap(this.zza), null);
        this.zza = null;
        return zzhnhVar;
    }
}
