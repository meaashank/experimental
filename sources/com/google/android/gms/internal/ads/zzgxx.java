package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgxx extends zzgxs {
    public final zzgxx zzb(Object obj, Object... objArr) {
        List listAsList = Arrays.asList(objArr);
        if (obj == null) {
            Iterator it = listAsList.iterator();
            StringBuilder sb2 = new StringBuilder("[");
            boolean z10 = true;
            while (it.hasNext()) {
                if (!z10) {
                    sb2.append(U6.j.f68738d);
                }
                sb2.append(it.next());
                z10 = false;
            }
            sb2.append(']');
            throw new NullPointerException("null key in entry: null=".concat(sb2.toString()));
        }
        Iterator it2 = listAsList.iterator();
        if (it2.hasNext()) {
            zzgxh zzgxhVarZzt = (zzgxh) zza().get(obj);
            if (zzgxhVarZzt == null) {
                zzgxhVarZzt = zzgxw.zzt(listAsList instanceof Set ? Math.max(4, ((Set) listAsList).size()) : 4);
                zza().put(obj, zzgxhVarZzt);
            }
            while (it2.hasNext()) {
                Object next = it2.next();
                zzgwi.zza(obj, next);
                zzgxhVarZzt.zzd(next);
            }
        }
        return this;
    }

    public final zzgxz zzc() {
        Map map = this.zza;
        if (map == null) {
            return zzgxa.zza;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return zzgxa.zza;
        }
        zzgxo zzgxoVar = new zzgxo(setEntrySet.size());
        int size = 0;
        for (Map.Entry entry : setEntrySet) {
            Object key = entry.getKey();
            zzgxw zzgxwVarZzp = zzgxw.zzp(((zzgxv) entry.getValue()).zzh());
            if (!zzgxwVarZzp.isEmpty()) {
                zzgxoVar.zza(key, zzgxwVarZzp);
                size += zzgxwVarZzp.size();
            }
        }
        return new zzgxz(zzgxoVar.zzc(), size, null);
    }
}
