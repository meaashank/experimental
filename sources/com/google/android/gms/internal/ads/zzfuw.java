package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfuw implements Runnable {
    final /* synthetic */ zzfvd zza;

    public zzfuw(zzfvd zzfvdVar) {
        Objects.requireNonNull(zzfvdVar);
        this.zza = zzfvdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfvd zzfvdVar = this.zza;
        if (zzfvdVar.zzN() != null) {
            long jCurrentTimeMillis = zzfvdVar.zzO().currentTimeMillis();
            int iZzs = zzfvdVar.zzs();
            String strZzM = zzfvdVar.zzM();
            zzfvdVar.zzN().zzj(jCurrentTimeMillis, zzfvdVar.zzP(), iZzs, strZzM);
        }
    }
}
