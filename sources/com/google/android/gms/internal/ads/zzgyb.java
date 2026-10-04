package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class zzgyb extends zzgvk {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzgul zzb;

    public zzgyb(Iterator it, zzgul zzgulVar) {
        this.zza = it;
        this.zzb = zzgulVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgvk
    public final Object zza() {
        zzgul zzgulVar;
        Object next;
        do {
            Iterator it = this.zza;
            if (!it.hasNext()) {
                zzb();
                return null;
            }
            zzgulVar = this.zzb;
            next = it.next();
        } while (!zzgulVar.zza(next));
        return next;
    }
}
