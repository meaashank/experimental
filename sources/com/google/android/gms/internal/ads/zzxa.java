package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzxa {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private zzhr zzc;

    public zzxa(zzagn zzagnVar, zzanx zzanxVar) {
    }

    public final void zza(zzhr zzhrVar) {
        if (zzhrVar != this.zzc) {
            this.zzc = zzhrVar;
            this.zza.clear();
            this.zzb.clear();
        }
    }
}
