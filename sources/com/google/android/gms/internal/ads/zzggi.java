package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzggi {
    private final zzinq zza;
    private final zzinq zzb;
    private final ExecutorService zzc;
    private final zzinq zzd;
    private ListenableFuture zze = null;

    public zzggi(zzinq zzinqVar, zzinq zzinqVar2, ExecutorService executorService, zzinq zzinqVar3) {
        this.zza = zzinqVar;
        this.zzb = zzinqVar2;
        this.zzc = executorService;
        this.zzd = zzinqVar3;
    }

    public final synchronized ListenableFuture zza() {
        try {
            ListenableFuture listenableFuture = this.zze;
            if (listenableFuture != null) {
                return listenableFuture;
            }
            Set set = (Set) this.zzb.zzb();
            ArrayList arrayList = new ArrayList(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((zzggg) it.next()).zza());
            }
            zzgrh zzgrhVar = (zzgrh) this.zzd.zzb();
            ListenableFuture listenableFutureZzk = zzhcy.zzk(zzhcy.zzm(arrayList), zzggh.zza, this.zzc);
            zzgrhVar.zze(2, listenableFutureZzk);
            this.zze = listenableFutureZzk;
            Iterator it2 = ((Set) this.zza.zzb()).iterator();
            while (it2.hasNext()) {
                ((zzggg) it2.next()).zza();
            }
            ListenableFuture listenableFuture2 = this.zze;
            if (listenableFuture2 != null) {
                return listenableFuture2;
            }
            throw null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ListenableFuture zzb() {
        ListenableFuture listenableFuture;
        listenableFuture = this.zze;
        if (listenableFuture == null) {
            throw null;
        }
        return listenableFuture;
    }
}
