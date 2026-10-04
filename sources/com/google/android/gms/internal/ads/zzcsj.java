package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcsj {
    private final Map zza;
    private final Map zzb;

    public zzcsj(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzflo zzfloVar) throws Exception {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        for (zzflm zzflmVar : zzfloVar.zzb.zzc) {
            Map map = this.zza;
            String str = zzflmVar.zza;
            if (!map.containsKey(str) || (jSONObject2 = zzflmVar.zzb) == null) {
                Map map2 = this.zzb;
                if (map2.containsKey(str) && (jSONObject = zzflmVar.zzb) != null) {
                    zzcsl zzcslVar = (zzcsl) map2.get(str);
                    HashMap map3 = new HashMap();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String strOptString = jSONObject.optString(next);
                        if (strOptString != null) {
                            map3.put(next, strOptString);
                        }
                    }
                    zzcslVar.zza(map3);
                }
            } else {
                ((zzcsm) map.get(str)).zza(jSONObject2);
            }
        }
    }
}
