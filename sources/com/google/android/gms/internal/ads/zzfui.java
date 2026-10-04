package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfui extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzfuj zza;

    public zzfui(zzfuj zzfujVar) {
        Objects.requireNonNull(zzfujVar);
        this.zza = zzfujVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.zza.zzi(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.zza.zzi(false);
    }
}
