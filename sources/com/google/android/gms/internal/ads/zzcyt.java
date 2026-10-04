package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcyt implements zzeqc {
    public final List zza;

    public zzcyt(List list) {
        this.zza = list;
    }

    public static zzemq zza(@NonNull zzeow zzeowVar) {
        return new zzemr(zzeowVar, zzcys.zza);
    }

    public static zzemq zzb(@NonNull zzemq zzemqVar) {
        return new zzemr(zzemqVar, zzcyr.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzeqc
    public final void zzm() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzhcy.zzr((ListenableFuture) it.next(), new zzcyq(this), zzhdp.zza());
        }
    }

    public zzcyt(zzcyl zzcylVar) {
        this.zza = Collections.singletonList(zzhcy.zza(zzcylVar));
    }
}
