package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.s;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final s f159061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final n f159062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final SocketFactory f159063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final b f159064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final List<w> f159065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final List<j> f159066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final ProxySelector f159067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    final Proxy f159068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    final SSLSocketFactory f159069i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    final HostnameVerifier f159070j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    final f f159071k;

    public a(String str, int i10, n nVar, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable f fVar, b bVar, @Nullable Proxy proxy, List<w> list, List<j> list2, ProxySelector proxySelector) {
        this.f159061a = new s.a().f(sSLSocketFactory != null ? "https" : "http").b(str).a(i10).a();
        if (nVar == null) {
            throw new NullPointerException("dns == null");
        }
        this.f159062b = nVar;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f159063c = socketFactory;
        if (bVar == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f159064d = bVar;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f159065e = com.mbridge.msdk.thrid.okhttp.internal.c.a(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f159066f = com.mbridge.msdk.thrid.okhttp.internal.c.a(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f159067g = proxySelector;
        this.f159068h = proxy;
        this.f159069i = sSLSocketFactory;
        this.f159070j = hostnameVerifier;
        this.f159071k = fVar;
    }

    @Nullable
    public f a() {
        return this.f159071k;
    }

    public List<j> b() {
        return this.f159066f;
    }

    public n c() {
        return this.f159062b;
    }

    @Nullable
    public HostnameVerifier d() {
        return this.f159070j;
    }

    public List<w> e() {
        return this.f159065e;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f159061a.equals(aVar.f159061a) && a(aVar);
    }

    @Nullable
    public Proxy f() {
        return this.f159068h;
    }

    public b g() {
        return this.f159064d;
    }

    public ProxySelector h() {
        return this.f159067g;
    }

    public int hashCode() {
        int iHashCode = (this.f159067g.hashCode() + ((this.f159066f.hashCode() + ((this.f159065e.hashCode() + ((this.f159064d.hashCode() + ((this.f159062b.hashCode() + ((this.f159061a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Proxy proxy = this.f159068h;
        int iHashCode2 = (iHashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f159069i;
        int iHashCode3 = (iHashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f159070j;
        int iHashCode4 = (iHashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        f fVar = this.f159071k;
        return iHashCode4 + (fVar != null ? fVar.hashCode() : 0);
    }

    public SocketFactory i() {
        return this.f159063c;
    }

    @Nullable
    public SSLSocketFactory j() {
        return this.f159069i;
    }

    public s k() {
        return this.f159061a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Address{");
        sb2.append(this.f159061a.g());
        sb2.append(com.prism.gaia.server.accounts.b.f166434b0);
        sb2.append(this.f159061a.j());
        if (this.f159068h != null) {
            sb2.append(", proxy=");
            sb2.append(this.f159068h);
        } else {
            sb2.append(", proxySelector=");
            sb2.append(this.f159067g);
        }
        sb2.append("}");
        return sb2.toString();
    }

    public boolean a(a aVar) {
        return this.f159062b.equals(aVar.f159062b) && this.f159064d.equals(aVar.f159064d) && this.f159065e.equals(aVar.f159065e) && this.f159066f.equals(aVar.f159066f) && this.f159067g.equals(aVar.f159067g) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f159068h, aVar.f159068h) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f159069i, aVar.f159069i) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f159070j, aVar.f159070j) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f159071k, aVar.f159071k) && k().j() == aVar.k().j();
    }
}
