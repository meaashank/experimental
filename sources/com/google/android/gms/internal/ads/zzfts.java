package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfts extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzftu zza;

    public zzfts(zzftu zzftuVar) {
        Objects.requireNonNull(zzftuVar);
        this.zza = zzftuVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.zza.zzk(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.zza.zzk(false);
    }
}
