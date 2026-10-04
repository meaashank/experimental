package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzka {
    private final Map zza;
    private zzjc zzb;

    public /* synthetic */ zzka(zzlk zzlkVar, int i10, byte[] bArr) {
        Objects.requireNonNull(zzlkVar);
        this.zza = new HashMap();
        this.zzb = zzjc.zza;
    }

    private static final zzjc zzb(zzjc zzjcVar, List list) {
        zzjb zzjbVar = new zzjb(zzjcVar, null);
        HashSet hashSet = new HashSet(list);
        for (String str : zzjcVar.zza()) {
            if (!hashSet.contains(str)) {
                zzjbVar.zzf(str);
            }
        }
        return zzjbVar.zzg();
    }

    public final /* synthetic */ void zza(zzjc zzjcVar) {
        for (Map.Entry entry : new HashMap(this.zza).entrySet()) {
            zzjd zzjdVar = (zzjd) entry.getKey();
            List list = (List) entry.getValue();
            if (!zzb(zzjcVar, list).equals(zzb(this.zzb, list))) {
                zzjdVar.zza();
            }
        }
        this.zzb = zzjcVar;
    }
}
