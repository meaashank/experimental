package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfnz {
    private final HashMap zza = new HashMap();

    public final zzfny zza(zzfnp zzfnpVar, Context context, zzfnh zzfnhVar, zzfoe zzfoeVar) {
        HashMap map = this.zza;
        zzfny zzfnyVar = (zzfny) map.get(zzfnpVar);
        if (zzfnyVar != null) {
            return zzfnyVar;
        }
        zzfnm zzfnmVar = new zzfnm(zzfns.zza(zzfnpVar, context));
        zzfny zzfnyVar2 = new zzfny(zzfnmVar, new zzfoh(zzfnmVar, zzfnhVar, zzfoeVar));
        map.put(zzfnpVar, zzfnyVar2);
        return zzfnyVar2;
    }
}
