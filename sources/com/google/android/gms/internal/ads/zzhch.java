package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzhch extends zzhcj {
    public zzhch(zzgxi zzgxiVar, boolean z10) {
        super(zzgxiVar, z10);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzhcj
    public final /* bridge */ /* synthetic */ Object zzD(List list) {
        ArrayList arrayListZzb = zzgym.zzb(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzhci zzhciVar = (zzhci) it.next();
            arrayListZzb.add(zzhciVar != null ? zzhciVar.zza : null);
        }
        return Collections.unmodifiableList(arrayListZzb);
    }
}
