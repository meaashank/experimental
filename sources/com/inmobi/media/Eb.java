package com.inmobi.media;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: loaded from: classes5.dex */
public final class Eb extends ConnectivityManager.NetworkCallback {
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        kotlin.jvm.internal.G.p(network, "network");
        super.onAvailable(network);
        C3657nb.f().b(new P1(10, 4, "available"));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        kotlin.jvm.internal.G.p(network, "network");
        super.onLost(network);
        C3657nb.f().b(new P1(10, 4, "lost"));
    }
}
