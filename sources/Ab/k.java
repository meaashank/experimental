package Ab;

import Jb.p;
import com.tonyodev.fetch2core.Downloader;
import java.io.InputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.y0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nHttpUrlConnectionDownloader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpUrlConnectionDownloader.kt\ncom/tonyodev/fetch2/HttpUrlConnectionDownloader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,219:1\n1863#2,2:220\n1863#2,2:222\n*S KotlinDebug\n*F\n+ 1 HttpUrlConnectionDownloader.kt\ncom/tonyodev/fetch2/HttpUrlConnectionDownloader\n*L\n43#1:220,2\n149#1:222,2\n*E\n"})
public class k implements Downloader<HttpURLConnection, Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Downloader.FileDownloaderType f12232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f12233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<Downloader.a, HttpURLConnection> f12234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CookieManager f12235d;

    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f12238c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f12239d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12236a = 20000;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f12237b = 15000;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f12240e = true;

        public final int a() {
            return this.f12237b;
        }

        public final boolean b() {
            return this.f12240e;
        }

        public final int c() {
            return this.f12236a;
        }

        public final boolean d() {
            return this.f12238c;
        }

        public final boolean e() {
            return this.f12239d;
        }

        public final void f(int i10) {
            this.f12237b = i10;
        }

        public final void g(boolean z10) {
            this.f12240e = z10;
        }

        public final void h(int i10) {
            this.f12236a = i10;
        }

        public final void i(boolean z10) {
            this.f12238c = z10;
        }

        public final void j(boolean z10) {
            this.f12239d = z10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dd.k
    public k() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.tonyodev.fetch2core.Downloader
    public void A1(@NotNull Downloader.b request, @NotNull Downloader.a response) {
        G.p(request, "request");
        G.p(response, "response");
    }

    @Override // com.tonyodev.fetch2core.Downloader
    @NotNull
    public Downloader.FileDownloaderType B3(@NotNull Downloader.b request, @NotNull Set<? extends Downloader.FileDownloaderType> supportedFileDownloaderTypes) {
        G.p(request, "request");
        G.p(supportedFileDownloaderTypes, "supportedFileDownloaderTypes");
        return this.f12232a;
    }

    @Override // com.tonyodev.fetch2core.Downloader
    public boolean E0(@NotNull Downloader.b request, @NotNull String hash) {
        String strN;
        G.p(request, "request");
        G.p(hash, "hash");
        if (hash.length() == 0 || (strN = com.tonyodev.fetch2core.b.n(request.f194454d)) == null) {
            return true;
        }
        return strN.contentEquals(hash);
    }

    @Override // com.tonyodev.fetch2core.Downloader
    public void R0(@NotNull Downloader.a response) {
        G.p(response, "response");
        if (this.f12234c.containsKey(response)) {
            HttpURLConnection httpURLConnection = this.f12234c.get(response);
            this.f12234c.remove(response);
            a(httpURLConnection);
        }
    }

    @Override // com.tonyodev.fetch2core.Downloader
    @Nullable
    public Downloader.a U1(@NotNull Downloader.b request, @NotNull p interruptMonitor) throws Throwable {
        boolean z10;
        InputStream inputStream;
        String strZ1;
        long j10;
        String strE;
        G.p(request, "request");
        G.p(interruptMonitor, "interruptMonitor");
        CookieHandler.setDefault(this.f12235d);
        URLConnection uRLConnectionOpenConnection = new URL(request.f194452b).openConnection();
        G.n(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        d(httpURLConnection, request);
        if (httpURLConnection.getRequestProperty("Referer") == null) {
            httpURLConnection.addRequestProperty("Referer", com.tonyodev.fetch2core.b.x(request.f194452b));
        }
        httpURLConnection.connect();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        G.o(headerFields, "getHeaderFields(...)");
        Map<String, List<String>> mapB = b(headerFields);
        int responseCode = httpURLConnection.getResponseCode();
        if ((responseCode == 302 || responseCode == 301 || responseCode == 303) && com.tonyodev.fetch2core.b.r(mapB, "Location") != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception unused) {
            }
            String strR = com.tonyodev.fetch2core.b.r(mapB, "Location");
            if (strR == null) {
                strR = "";
            }
            URLConnection uRLConnectionOpenConnection2 = new URL(strR).openConnection();
            G.n(uRLConnectionOpenConnection2, "null cannot be cast to non-null type java.net.HttpURLConnection");
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection2;
            d(httpURLConnection, request);
            if (httpURLConnection.getRequestProperty("Referer") == null) {
                httpURLConnection.addRequestProperty("Referer", com.tonyodev.fetch2core.b.x(request.f194452b));
            }
            httpURLConnection.connect();
            Map<String, List<String>> headerFields2 = httpURLConnection.getHeaderFields();
            G.o(headerFields2, "getHeaderFields(...)");
            mapB = b(headerFields2);
            responseCode = httpURLConnection.getResponseCode();
        }
        HttpURLConnection httpURLConnection2 = httpURLConnection;
        Map<String, List<String>> map = mapB;
        int i10 = responseCode;
        if (c(i10)) {
            long jI = com.tonyodev.fetch2core.b.i(map, -1L);
            z10 = true;
            inputStream = httpURLConnection2.getInputStream();
            strZ1 = z1(map);
            j10 = jI;
            strE = null;
        } else {
            z10 = false;
            inputStream = null;
            strZ1 = "";
            j10 = -1;
            strE = com.tonyodev.fetch2core.b.e(httpURLConnection2.getErrorStream(), false);
        }
        boolean z11 = z10;
        boolean zA = com.tonyodev.fetch2core.b.a(i10, map);
        long j11 = j10;
        Map<String, List<String>> headerFields3 = httpURLConnection2.getHeaderFields();
        G.o(headerFields3, "getHeaderFields(...)");
        A1(request, new Downloader.a(i10, z11, j11, null, request, strZ1, headerFields3, zA, strE));
        Downloader.a aVar = new Downloader.a(i10, z11, j11, inputStream, request, strZ1, map, zA, strE);
        this.f12234c.put(aVar, httpURLConnection2);
        return aVar;
    }

    @Override // com.tonyodev.fetch2core.Downloader
    public long Z1(@NotNull Downloader.b request) {
        G.p(request, "request");
        return com.tonyodev.fetch2core.b.y(request, this);
    }

    public final void a(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.tonyodev.fetch2core.Downloader
    public boolean a1(@NotNull Downloader.b request) {
        G.p(request, "request");
        return false;
    }

    public final Map<String, List<String>> b(Map<String, List<String>> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                List<String> value = entry.getValue();
                if (value == null) {
                    value = EmptyList.f217510a;
                }
                linkedHashMap.put(key, value);
            }
        }
        return linkedHashMap;
    }

    public final boolean c(int i10) {
        return 200 <= i10 && i10 < 300;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Iterator<T> it = this.f12234c.entrySet().iterator();
        while (it.hasNext()) {
            a((HttpURLConnection) ((Map.Entry) it.next()).getValue());
        }
        this.f12234c.clear();
    }

    @Nullable
    public Void d(@NotNull HttpURLConnection client, @NotNull Downloader.b request) throws ProtocolException {
        G.p(client, "client");
        G.p(request, "request");
        client.setRequestMethod(request.f194458h);
        client.setReadTimeout(this.f12233b.f12236a);
        client.setConnectTimeout(this.f12233b.f12237b);
        client.setUseCaches(this.f12233b.f12238c);
        client.setDefaultUseCaches(this.f12233b.f12239d);
        client.setInstanceFollowRedirects(this.f12233b.f12240e);
        client.setDoInput(true);
        Iterator<T> it = request.f194453c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            client.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        return null;
    }

    @Override // com.tonyodev.fetch2core.Downloader
    @NotNull
    public Set<Downloader.FileDownloaderType> d2(@NotNull Downloader.b request) {
        G.p(request, "request");
        Downloader.FileDownloaderType fileDownloaderType = this.f12232a;
        if (fileDownloaderType == Downloader.FileDownloaderType.SEQUENTIAL) {
            return y0.q(fileDownloaderType);
        }
        try {
            return com.tonyodev.fetch2core.b.z(request, this);
        } catch (Exception unused) {
            return y0.q(this.f12232a);
        }
    }

    @Override // com.tonyodev.fetch2core.Downloader
    public /* bridge */ /* synthetic */ Void o1(HttpURLConnection httpURLConnection, Downloader.b bVar) throws ProtocolException {
        d(httpURLConnection, bVar);
        return null;
    }

    @Override // com.tonyodev.fetch2core.Downloader
    public int r1(@NotNull Downloader.b request) {
        G.p(request, "request");
        return 8192;
    }

    @Override // com.tonyodev.fetch2core.Downloader
    @Nullable
    public Integer x1(@NotNull Downloader.b request, long j10) {
        G.p(request, "request");
        return null;
    }

    @Override // com.tonyodev.fetch2core.Downloader
    @NotNull
    public String z1(@NotNull Map<String, List<String>> responseHeaders) {
        G.p(responseHeaders, "responseHeaders");
        String strR = com.tonyodev.fetch2core.b.r(responseHeaders, "Content-MD5");
        return strR == null ? "" : strR;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dd.k
    public k(@Nullable a aVar) {
        this(aVar, null, 2, 0 == true ? 1 : 0);
    }

    @dd.k
    public k(@Nullable a aVar, @NotNull Downloader.FileDownloaderType fileDownloaderType) {
        G.p(fileDownloaderType, "fileDownloaderType");
        this.f12232a = fileDownloaderType;
        this.f12233b = aVar == null ? new a() : aVar;
        Map<Downloader.a, HttpURLConnection> mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        G.o(mapSynchronizedMap, "synchronizedMap(...)");
        this.f12234c = mapSynchronizedMap;
        this.f12235d = com.tonyodev.fetch2core.b.j();
    }

    public /* synthetic */ k(a aVar, Downloader.FileDownloaderType fileDownloaderType, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? null : aVar, (i10 & 2) != 0 ? Downloader.FileDownloaderType.SEQUENTIAL : fileDownloaderType);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(@NotNull Downloader.FileDownloaderType fileDownloaderType) {
        this(null, fileDownloaderType);
        G.p(fileDownloaderType, "fileDownloaderType");
    }
}
