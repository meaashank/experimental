package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
@Deprecated
public final class zzbjt {
    private final Map zza = new HashMap();
    private final zzbjv zzb;

    public zzbjt(zzbjv zzbjvVar) {
        this.zzb = zzbjvVar;
    }

    public final void zza(String str, @Nullable zzbjs zzbjsVar) {
        this.zza.put(str, zzbjsVar);
    }

    public final void zzb(String str, String str2, long j10) {
        Map map = this.zza;
        zzbjs zzbjsVar = (zzbjs) map.get(str2);
        String[] strArr = {str};
        if (zzbjsVar != null) {
            this.zzb.zzb(zzbjsVar, j10, strArr);
        }
        map.put(str, new zzbjs(j10, null, null));
    }

    public final zzbjv zzc() {
        return this.zzb;
    }
}
