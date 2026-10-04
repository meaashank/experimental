package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhmn {
    final Map zza = new HashMap();
    final Map zzb = new HashMap();

    private zzhmn() {
    }

    public final zzhmn zza(Enum r22, Object obj) {
        this.zza.put(r22, obj);
        this.zzb.put(obj, r22);
        return this;
    }

    public final zzhmo zzb() {
        return new zzhmo(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb), null);
    }

    public /* synthetic */ zzhmn(byte[] bArr) {
    }
}
