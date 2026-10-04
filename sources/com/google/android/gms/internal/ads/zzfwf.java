package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
final class zzfwf implements Runnable {
    final /* synthetic */ zzfwg zza;

    public zzfwf(zzfwg zzfwgVar) {
        Objects.requireNonNull(zzfwgVar);
        this.zza = zzfwgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfwg zzfwgVar = this.zza;
        AtomicBoolean atomicBooleanZzf = zzfwgVar.zzf();
        float fZzc = zzfwgVar.zzc();
        atomicBooleanZzf.set(false);
        if (((Float) zzfwgVar.zze().getAndSet(Float.valueOf(fZzc))).floatValue() != fZzc) {
            zzfwgVar.zzd().post(new zzfwe(this, fZzc));
        }
    }
}
