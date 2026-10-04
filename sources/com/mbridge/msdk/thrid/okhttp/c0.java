package com.mbridge.msdk.thrid.okhttp;

import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final a f159124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Proxy f159125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final InetSocketAddress f159126c;

    public c0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f159124a = aVar;
        this.f159125b = proxy;
        this.f159126c = inetSocketAddress;
    }

    public a a() {
        return this.f159124a;
    }

    public Proxy b() {
        return this.f159125b;
    }

    public boolean c() {
        return this.f159124a.f159069i != null && this.f159125b.type() == Proxy.Type.HTTP;
    }

    public InetSocketAddress d() {
        return this.f159126c;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return c0Var.f159124a.equals(this.f159124a) && c0Var.f159125b.equals(this.f159125b) && c0Var.f159126c.equals(this.f159126c);
    }

    public int hashCode() {
        return this.f159126c.hashCode() + ((this.f159125b.hashCode() + ((this.f159124a.hashCode() + 527) * 31)) * 31);
    }

    public String toString() {
        return "Route{" + this.f159126c + "}";
    }
}
