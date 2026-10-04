package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbbi extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzbbj zza;

    public zzbbi(zzbbj zzbbjVar) {
        Objects.requireNonNull(zzbbjVar);
        this.zza = zzbbjVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (zzbbj.class) {
            this.zza.zzd(networkCapabilities);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (zzbbj.class) {
            this.zza.zzd(null);
        }
    }
}
