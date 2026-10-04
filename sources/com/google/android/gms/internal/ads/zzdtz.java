package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzdtz implements zzgub {
    static final /* synthetic */ zzdtz zza = new zzdtz();

    private /* synthetic */ zzdtz() {
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final /* synthetic */ Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (zzbmg zzbmgVar : (List) obj) {
            if (zzbmgVar != null) {
                arrayList.add(zzbmgVar);
            }
        }
        return arrayList;
    }
}
