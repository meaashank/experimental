package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
public final class zzccc {
    private final WeakHashMap zza = new WeakHashMap();

    public final Future zza(Context context) {
        return zzcgj.zza.zzc(new zzcca(this, context));
    }

    public final /* synthetic */ WeakHashMap zzb() {
        return this.zza;
    }
}
