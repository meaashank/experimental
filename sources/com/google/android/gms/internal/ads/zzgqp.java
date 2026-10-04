package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgqp extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzgqr zza;

    public zzgqp(zzgqr zzgqrVar) {
        Objects.requireNonNull(zzgqrVar);
        this.zza = zzgqrVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        zzgqr zzgqrVar = this.zza;
        synchronized (zzgqrVar) {
            zzgqrVar.zzf(networkCapabilities);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        zzgqr zzgqrVar = this.zza;
        synchronized (zzgqrVar) {
            zzgqrVar.zzf(null);
        }
    }
}
