package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzdue implements zzgub {
    static final /* synthetic */ zzdue zza = new zzdue();

    private /* synthetic */ zzdue() {
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final /* synthetic */ Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (zzduc zzducVar : (List) obj) {
            if (zzducVar != null) {
                arrayList.add(zzducVar);
            }
        }
        return arrayList;
    }
}
