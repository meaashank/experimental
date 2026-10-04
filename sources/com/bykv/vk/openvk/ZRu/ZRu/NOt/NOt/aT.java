package com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class aT extends ProxySelector {
    private static final List<Proxy> ZRu = Collections.singletonList(Proxy.NO_PROXY);
    private final ProxySelector NOt = ProxySelector.getDefault();
    private final String mZ;
    private final int uR;

    private aT(String str, int i10) {
        this.mZ = str;
        this.uR = i10;
    }

    public static void ZRu(String str, int i10) {
        ProxySelector.setDefault(new aT(str, i10));
    }

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.NOt.connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public List<Proxy> select(URI uri) {
        if (uri != null) {
            return (this.mZ.equalsIgnoreCase(uri.getHost()) && this.uR == uri.getPort()) ? ZRu : this.NOt.select(uri);
        }
        throw new IllegalArgumentException("URI can't be null");
    }
}
