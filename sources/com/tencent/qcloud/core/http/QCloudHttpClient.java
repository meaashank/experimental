package com.tencent.qcloud.core.http;

import androidx.annotation.NonNull;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import okhttp3.OkHttpClient;
import okhttp3.n;
import vb.C5724e;
import wb.AbstractCallableC5772a;
import wb.C5773b;

/* JADX INFO: loaded from: classes7.dex */
public final class QCloudHttpClient {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f194181k = "QCloudHttp";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f194182l = "QCloudQuic";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static Map<Integer, p> f194183m = new ConcurrentHashMap(2);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile QCloudHttpClient f194184n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f194185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wb.e f194186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f194187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<String> f194188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, List<InetAddress>> f194189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4280b f194190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f194191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HostnameVerifier f194192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public okhttp3.m f194193i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n.c f194194j;

    public static final class Builder {
        OkHttpClient.Builder mBuilder;
        p networkClient;
        v qCloudHttpRetryHandler;
        C5773b retryStrategy;
        int connectionTimeout = 15000;
        int socketTimeout = 30000;
        boolean enableDebugLog = false;
        List<String> prefetchHost = new LinkedList();
        boolean dnsCache = false;

        public Builder addPrefetchHost(String str) {
            this.prefetchHost.add(str);
            return this;
        }

        public QCloudHttpClient build() {
            if (this.retryStrategy == null) {
                this.retryStrategy = C5773b.f240216i;
            }
            v vVar = this.qCloudHttpRetryHandler;
            if (vVar != null) {
                this.retryStrategy.d(vVar);
            }
            if (this.mBuilder == null) {
                this.mBuilder = new OkHttpClient.Builder();
            }
            return new QCloudHttpClient(this);
        }

        public Builder dnsCache(boolean z10) {
            this.dnsCache = z10;
            return this;
        }

        public Builder enableDebugLog(boolean z10) {
            this.enableDebugLog = z10;
            return this;
        }

        public Builder setConnectionTimeout(int i10) {
            if (i10 < 3000) {
                throw new IllegalArgumentException("connection timeout must be larger than 3 seconds.");
            }
            this.connectionTimeout = i10;
            return this;
        }

        public Builder setInheritBuilder(OkHttpClient.Builder builder) {
            this.mBuilder = builder;
            return this;
        }

        public Builder setNetworkClient(p pVar) {
            this.networkClient = pVar;
            return this;
        }

        public Builder setQCloudHttpRetryHandler(v vVar) {
            this.qCloudHttpRetryHandler = vVar;
            return this;
        }

        public Builder setRetryStrategy(C5773b c5773b) {
            this.retryStrategy = c5773b;
            return this;
        }

        public Builder setSocketTimeout(int i10) {
            if (i10 < 3000) {
                throw new IllegalArgumentException("socket timeout must be larger than 3 seconds.");
            }
            this.socketTimeout = i10;
            return this;
        }
    }

    public class a implements HostnameVerifier {
        public a() {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            if (QCloudHttpClient.this.f194188d.size() > 0) {
                Iterator<String> it = QCloudHttpClient.this.f194188d.iterator();
                while (it.hasNext()) {
                    if (HttpsURLConnection.getDefaultHostnameVerifier().verify(it.next(), sSLSession)) {
                        return true;
                    }
                }
            }
            return HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession);
        }
    }

    public class b implements okhttp3.m {
        public b() {
        }

        @Override // okhttp3.m
        public List<InetAddress> lookup(String str) throws UnknownHostException {
            List<InetAddress> listLookup = QCloudHttpClient.this.f194189e.containsKey(str) ? QCloudHttpClient.this.f194189e.get(str) : null;
            if (listLookup == null) {
                try {
                    listLookup = okhttp3.m.f225807b.lookup(str);
                } catch (UnknownHostException unused) {
                    C5724e.l(QCloudHttpClient.f194181k, "system dns failed, retry cache dns records.", new Object[0]);
                }
            }
            if (listLookup == null && !QCloudHttpClient.this.f194191g) {
                throw new UnknownHostException(w.y.a("can not resolve host name ", str));
            }
            if (listLookup == null) {
                try {
                    listLookup = QCloudHttpClient.this.f194190f.h(str);
                } catch (UnknownHostException unused2) {
                    C5724e.l(QCloudHttpClient.f194181k, "Not found dns in cache records.", new Object[0]);
                }
            }
            if (listLookup == null) {
                throw new UnknownHostException(str);
            }
            C4280b.i().l(str, listLookup);
            return listLookup;
        }
    }

    public class c implements n.c {
        public c() {
        }

        @Override // okhttp3.n.c
        public okhttp3.n a(okhttp3.d dVar) {
            return new C4279a();
        }
    }

    public /* synthetic */ QCloudHttpClient(Builder builder, a aVar) {
        this(builder);
    }

    public static QCloudHttpClient g() {
        if (f194184n == null) {
            synchronized (QCloudHttpClient.class) {
                try {
                    if (f194184n == null) {
                        f194184n = new Builder().build();
                    }
                } finally {
                }
            }
        }
        return f194184n;
    }

    public void e(@NonNull String str, @NonNull String[] strArr) throws UnknownHostException {
        if (strArr.length > 0) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str2 : strArr) {
                arrayList.add(InetAddress.getByName(str2));
            }
            this.f194189e.put(str, arrayList);
        }
    }

    public void f(String str) {
        if (str != null) {
            this.f194188d.add(str);
        }
    }

    public List<k> h(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            ArrayList arrayList2 = (ArrayList) this.f194186b.f();
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                AbstractCallableC5772a abstractCallableC5772a = (AbstractCallableC5772a) obj;
                if ((abstractCallableC5772a instanceof k) && str.equals(abstractCallableC5772a.f240186b)) {
                    arrayList.add((k) abstractCallableC5772a);
                }
            }
        }
        return arrayList;
    }

    public final <T> k<T> i(HttpRequest<T> httpRequest, tb.g gVar) {
        return new k<>(httpRequest, gVar, f194183m.get(Integer.valueOf(this.f194185a.hashCode())));
    }

    public final HostnameVerifier j() {
        return this.f194192h;
    }

    public <T> k<T> k(HttpRequest<T> httpRequest) {
        return i(httpRequest, null);
    }

    public <T> k<T> l(QCloudHttpRequest<T> qCloudHttpRequest, tb.g gVar) {
        return i(qCloudHttpRequest, gVar);
    }

    public void m(boolean z10) {
        this.f194187c.e(z10);
    }

    public void n(Builder builder) {
        p pVar = builder.networkClient;
        if (pVar != null) {
            String name = pVar.getClass().getName();
            int iHashCode = name.hashCode();
            if (!f194183m.containsKey(Integer.valueOf(iHashCode))) {
                pVar.b(builder, this.f194192h, this.f194193i, this.f194187c);
                f194183m.put(Integer.valueOf(iHashCode), pVar);
            }
            this.f194185a = name;
        }
    }

    public QCloudHttpClient(Builder builder) {
        this.f194185a = r.class.getName();
        this.f194191g = true;
        this.f194192h = new a();
        this.f194193i = new b();
        this.f194194j = new c();
        this.f194188d = new HashSet(5);
        this.f194189e = new ConcurrentHashMap(3);
        this.f194186b = wb.e.d();
        C4280b c4280bI = C4280b.i();
        this.f194190f = c4280bI;
        g gVar = new g(false);
        this.f194187c = gVar;
        m(false);
        p rVar = builder.networkClient;
        rVar = rVar == null ? new r() : rVar;
        String name = rVar.getClass().getName();
        this.f194185a = name;
        int iHashCode = name.hashCode();
        if (!f194183m.containsKey(Integer.valueOf(iHashCode))) {
            rVar.b(builder, this.f194192h, this.f194193i, gVar);
            f194183m.put(Integer.valueOf(iHashCode), rVar);
        }
        c4280bI.g(builder.prefetchHost);
        c4280bI.j();
    }
}
