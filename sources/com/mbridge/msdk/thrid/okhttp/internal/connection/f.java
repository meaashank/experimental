package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.c0;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.s;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.a f159332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f159333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.d f159334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f159335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<Proxy> f159336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f159337f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<InetSocketAddress> f159338g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<c0> f159339h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<c0> f159340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f159341b = 0;

        public a(List<c0> list) {
            this.f159340a = list;
        }

        public List<c0> a() {
            return new ArrayList(this.f159340a);
        }

        public boolean b() {
            return this.f159341b < this.f159340a.size();
        }

        public c0 c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List<c0> list = this.f159340a;
            int i10 = this.f159341b;
            this.f159341b = i10 + 1;
            return list.get(i10);
        }
    }

    public f(com.mbridge.msdk.thrid.okhttp.a aVar, d dVar, com.mbridge.msdk.thrid.okhttp.d dVar2, o oVar) {
        List list = Collections.EMPTY_LIST;
        this.f159336e = list;
        this.f159338g = list;
        this.f159339h = new ArrayList();
        this.f159332a = aVar;
        this.f159333b = dVar;
        this.f159334c = dVar2;
        this.f159335d = oVar;
        a(aVar.k(), aVar.f());
    }

    private boolean b() {
        return this.f159337f < this.f159336e.size();
    }

    private Proxy d() throws IOException {
        if (!b()) {
            throw new SocketException("No route to " + this.f159332a.k().g() + "; exhausted proxy configurations: " + this.f159336e);
        }
        List<Proxy> list = this.f159336e;
        int i10 = this.f159337f;
        this.f159337f = i10 + 1;
        Proxy proxy = list.get(i10);
        a(proxy);
        return proxy;
    }

    public boolean a() {
        return b() || !this.f159339h.isEmpty();
    }

    public a c() throws IOException {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (b()) {
            Proxy proxyD = d();
            int size = this.f159338g.size();
            for (int i10 = 0; i10 < size; i10++) {
                c0 c0Var = new c0(this.f159332a, proxyD, this.f159338g.get(i10));
                if (this.f159333b.c(c0Var)) {
                    this.f159339h.add(c0Var);
                } else {
                    arrayList.add(c0Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.f159339h);
            this.f159339h.clear();
        }
        return new a(arrayList);
    }

    public void a(c0 c0Var, IOException iOException) {
        if (c0Var.b().type() != Proxy.Type.DIRECT && this.f159332a.h() != null) {
            this.f159332a.h().connectFailed(this.f159332a.k().n(), c0Var.b().address(), iOException);
        }
        this.f159333b.b(c0Var);
    }

    private void a(s sVar, Proxy proxy) {
        List<Proxy> listA;
        if (proxy != null) {
            this.f159336e = Collections.singletonList(proxy);
        } else {
            List<Proxy> listSelect = this.f159332a.h().select(sVar.n());
            if (listSelect != null && !listSelect.isEmpty()) {
                listA = com.mbridge.msdk.thrid.okhttp.internal.c.a(listSelect);
            } else {
                listA = com.mbridge.msdk.thrid.okhttp.internal.c.a(Proxy.NO_PROXY);
            }
            this.f159336e = listA;
        }
        this.f159337f = 0;
    }

    private void a(Proxy proxy) throws IOException {
        String strG;
        int iJ;
        this.f159338g = new ArrayList();
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress socketAddressAddress = proxy.address();
            if (socketAddressAddress instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                strG = a(inetSocketAddress);
                iJ = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass());
            }
        } else {
            strG = this.f159332a.k().g();
            iJ = this.f159332a.k().j();
        }
        if (iJ >= 1 && iJ <= 65535) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                this.f159338g.add(InetSocketAddress.createUnresolved(strG, iJ));
                return;
            }
            this.f159335d.dnsStart(this.f159334c, strG);
            List<InetAddress> listA = this.f159332a.c().a(strG);
            if (!listA.isEmpty()) {
                this.f159335d.dnsEnd(this.f159334c, strG, listA);
                int size = listA.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f159338g.add(new InetSocketAddress(listA.get(i10), iJ));
                }
                return;
            }
            throw new UnknownHostException(this.f159332a.c() + " returned no addresses for " + strG);
        }
        throw new SocketException("No route to " + strG + com.prism.gaia.server.accounts.b.f166434b0 + iJ + "; port is out of range");
    }

    public static String a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }
}
