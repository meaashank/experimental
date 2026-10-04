package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzhcj extends zzhca {
    private List zza;

    public zzhcj(zzgxi zzgxiVar, boolean z10) {
        super(zzgxiVar, z10, true);
        List listZzb = zzgxiVar.isEmpty() ? Collections.EMPTY_LIST : zzgym.zzb(zzgxiVar.size());
        for (int i10 = 0; i10 < zzgxiVar.size(); i10++) {
            listZzb.add(null);
        }
        this.zza = listZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzA(int i10) {
        super.zzA(i10);
        this.zza = null;
    }

    public abstract Object zzD(List list);

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzw(int i10, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i10, new zzhci(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzx() {
        List list = this.zza;
        if (list != null) {
            zza(zzD(list));
        }
    }
}
