package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzfd implements Runnable {
    final /* synthetic */ zzfe zza;

    public zzfd(zzfe zzfeVar) {
        Objects.requireNonNull(zzfeVar);
        this.zza = zzfeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzff zzffVar = this.zza.zza;
        if (zzffVar.zzb() != null) {
            try {
                zzffVar.zzb().zzb(1);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not notify onAdFailedToLoad event.", e10);
            }
        }
    }
}
