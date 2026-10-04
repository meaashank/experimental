package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhof {
    private final Map zza = new HashMap();

    public final zzhof zza(zzich zzichVar, Object obj) throws GeneralSecurityException {
        List list;
        if (zzichVar.zzd() != 0 && zzichVar.zzd() != 5) {
            throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
        }
        Map map = this.zza;
        if (map.containsKey(zzichVar)) {
            list = (List) map.get(zzichVar);
        } else {
            ArrayList arrayList = new ArrayList();
            map.put(zzichVar, arrayList);
            list = arrayList;
        }
        list.add(obj);
        return this;
    }

    public final zzhoh zzb() {
        return new zzhoh(this.zza, null);
    }
}
