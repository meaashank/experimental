package okhttp3;

import androidx.collection.C1526d;
import com.prism.gaia.download.j;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.Pair;
import kotlin.collections.I;
import kotlin.collections.n0;
import kotlin.jvm.internal.G;
import kotlin.text.F;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final HttpUrl f225286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f225287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Headers f225288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final t f225289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Map<Class<?>, Object> f225290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public CacheControl f225291f;

    public static class Builder {

        @Nullable
        private t body;

        @NotNull
        private Headers.Builder headers;

        @NotNull
        private String method;

        @NotNull
        private Map<Class<?>, Object> tags;

        @Nullable
        private HttpUrl url;

        public Builder() {
            this.tags = new LinkedHashMap();
            this.method = "GET";
            this.headers = new Headers.Builder();
        }

        public static /* synthetic */ Builder delete$default(Builder builder, t tVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i10 & 1) != 0) {
                tVar = Bd.f.f17494d;
            }
            return builder.delete(tVar);
        }

        @NotNull
        public Builder addHeader(@NotNull String name, @NotNull String value) {
            G.p(name, "name");
            G.p(value, "value");
            getHeaders$okhttp().add(name, value);
            return this;
        }

        @NotNull
        public Request build() {
            HttpUrl httpUrl = this.url;
            if (httpUrl != null) {
                return new Request(httpUrl, this.method, this.headers.build(), this.body, Bd.f.i0(this.tags));
            }
            throw new IllegalStateException("url == null");
        }

        @NotNull
        public Builder cacheControl(@NotNull CacheControl cacheControl) {
            G.p(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            return string.length() == 0 ? removeHeader("Cache-Control") : header("Cache-Control", string);
        }

        @dd.k
        @NotNull
        public final Builder delete() {
            return delete$default(this, null, 1, null);
        }

        @NotNull
        public Builder get() {
            return method("GET", null);
        }

        @Nullable
        public final t getBody$okhttp() {
            return this.body;
        }

        @NotNull
        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        @NotNull
        public final String getMethod$okhttp() {
            return this.method;
        }

        @NotNull
        public final Map<Class<?>, Object> getTags$okhttp() {
            return this.tags;
        }

        @Nullable
        public final HttpUrl getUrl$okhttp() {
            return this.url;
        }

        @NotNull
        public Builder head() {
            return method("HEAD", null);
        }

        @NotNull
        public Builder header(@NotNull String name, @NotNull String value) {
            G.p(name, "name");
            G.p(value, "value");
            getHeaders$okhttp().set(name, value);
            return this;
        }

        @NotNull
        public Builder headers(@NotNull Headers headers) {
            G.p(headers, "headers");
            setHeaders$okhttp(headers.q());
            return this;
        }

        @NotNull
        public Builder method(@NotNull String method, @Nullable t tVar) {
            G.p(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (tVar == null) {
                if (Fd.f.e(method)) {
                    throw new IllegalArgumentException(android.support.v4.media.i.a("method ", method, " must have a request body.").toString());
                }
            } else if (!Fd.f.b(method)) {
                throw new IllegalArgumentException(android.support.v4.media.i.a("method ", method, " must not have a request body.").toString());
            }
            setMethod$okhttp(method);
            setBody$okhttp(tVar);
            return this;
        }

        @NotNull
        public Builder patch(@NotNull t body) {
            G.p(body, "body");
            return method("PATCH", body);
        }

        @NotNull
        public Builder post(@NotNull t body) {
            G.p(body, "body");
            return method("POST", body);
        }

        @NotNull
        public Builder put(@NotNull t body) {
            G.p(body, "body");
            return method("PUT", body);
        }

        @NotNull
        public Builder removeHeader(@NotNull String name) {
            G.p(name, "name");
            getHeaders$okhttp().removeAll(name);
            return this;
        }

        public final void setBody$okhttp(@Nullable t tVar) {
            this.body = tVar;
        }

        public final void setHeaders$okhttp(@NotNull Headers.Builder builder) {
            G.p(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMethod$okhttp(@NotNull String str) {
            G.p(str, "<set-?>");
            this.method = str;
        }

        public final void setTags$okhttp(@NotNull Map<Class<?>, Object> map) {
            G.p(map, "<set-?>");
            this.tags = map;
        }

        public final void setUrl$okhttp(@Nullable HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        @NotNull
        public Builder tag(@Nullable Object obj) {
            return tag(Object.class, obj);
        }

        @NotNull
        public Builder url(@NotNull HttpUrl url) {
            G.p(url, "url");
            setUrl$okhttp(url);
            return this;
        }

        @dd.k
        @NotNull
        public Builder delete(@Nullable t tVar) {
            return method("DELETE", tVar);
        }

        @NotNull
        public <T> Builder tag(@NotNull Class<? super T> type, @Nullable T t10) {
            G.p(type, "type");
            if (t10 == null) {
                getTags$okhttp().remove(type);
                return this;
            }
            if (getTags$okhttp().isEmpty()) {
                setTags$okhttp(new LinkedHashMap());
            }
            Map<Class<?>, Object> tags$okhttp = getTags$okhttp();
            T tCast = type.cast(t10);
            G.m(tCast);
            tags$okhttp.put(type, tCast);
            return this;
        }

        @NotNull
        public Builder url(@NotNull String url) {
            G.p(url, "url");
            if (F.J2(url, "ws:", true)) {
                String strSubstring = url.substring(3);
                G.o(strSubstring, "this as java.lang.String).substring(startIndex)");
                url = G.C("http:", strSubstring);
            } else if (F.J2(url, "wss:", true)) {
                String strSubstring2 = url.substring(4);
                G.o(strSubstring2, "this as java.lang.String).substring(startIndex)");
                url = G.C("https:", strSubstring2);
            }
            return url(HttpUrl.f225211k.h(url));
        }

        public Builder(@NotNull Request request) {
            Map<Class<?>, Object> mapJ0;
            G.p(request, "request");
            this.tags = new LinkedHashMap();
            this.url = request.f225286a;
            this.method = request.f225287b;
            this.body = request.f225289d;
            if (request.f225290e.isEmpty()) {
                mapJ0 = new LinkedHashMap<>();
            } else {
                mapJ0 = n0.J0(request.f225290e);
            }
            this.tags = mapJ0;
            this.headers = request.f225288c.q();
        }

        @NotNull
        public Builder url(@NotNull URL url) {
            G.p(url, "url");
            HttpUrl.a aVar = HttpUrl.f225211k;
            String string = url.toString();
            G.o(string, "url.toString()");
            return url(aVar.h(string));
        }
    }

    public Request(@NotNull HttpUrl url, @NotNull String method, @NotNull Headers headers, @Nullable t tVar, @NotNull Map<Class<?>, ? extends Object> tags) {
        G.p(url, "url");
        G.p(method, "method");
        G.p(headers, "headers");
        G.p(tags, "tags");
        this.f225286a = url;
        this.f225287b = method;
        this.f225288c = headers;
        this.f225289d = tVar;
        this.f225290e = tags;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "body", imports = {}))
    @dd.j(name = "-deprecated_body")
    @Nullable
    public final t a() {
        return this.f225289d;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "cacheControl", imports = {}))
    @dd.j(name = "-deprecated_cacheControl")
    @NotNull
    public final CacheControl b() {
        return g();
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = j.b.a.f164786e, imports = {}))
    @dd.j(name = "-deprecated_headers")
    @NotNull
    public final Headers c() {
        return this.f225288c;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "method", imports = {}))
    @dd.j(name = "-deprecated_method")
    @NotNull
    public final String d() {
        return this.f225287b;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "url", imports = {}))
    @dd.j(name = "-deprecated_url")
    @NotNull
    public final HttpUrl e() {
        return this.f225286a;
    }

    @dd.j(name = "body")
    @Nullable
    public final t f() {
        return this.f225289d;
    }

    @dd.j(name = "cacheControl")
    @NotNull
    public final CacheControl g() {
        CacheControl cacheControl = this.f225291f;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl cacheControlC = CacheControl.f225146n.c(this.f225288c);
        this.f225291f = cacheControlC;
        return cacheControlC;
    }

    @NotNull
    public final Map<Class<?>, Object> h() {
        return this.f225290e;
    }

    @Nullable
    public final String i(@NotNull String name) {
        G.p(name, "name");
        return this.f225288c.get(name);
    }

    @NotNull
    public final List<String> j(@NotNull String name) {
        G.p(name, "name");
        return this.f225288c.z(name);
    }

    @dd.j(name = j.b.a.f164786e)
    @NotNull
    public final Headers k() {
        return this.f225288c;
    }

    public final boolean l() {
        return this.f225286a.f225233j;
    }

    @dd.j(name = "method")
    @NotNull
    public final String m() {
        return this.f225287b;
    }

    @NotNull
    public final Builder n() {
        return new Builder(this);
    }

    @Nullable
    public final Object o() {
        return p(Object.class);
    }

    @Nullable
    public final <T> T p(@NotNull Class<? extends T> type) {
        G.p(type, "type");
        return type.cast(this.f225290e.get(type));
    }

    @dd.j(name = "url")
    @NotNull
    public final HttpUrl q() {
        return this.f225286a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Request{method=");
        sb2.append(this.f225287b);
        sb2.append(", url=");
        sb2.append(this.f225286a);
        if (this.f225288c.size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (Pair<? extends String, ? extends String> pair : this.f225288c) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    I.b0();
                    throw null;
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String str = (String) pair2.f217467a;
                String str2 = (String) pair2.f217468b;
                if (i10 > 0) {
                    sb2.append(U6.j.f68738d);
                }
                sb2.append(str);
                sb2.append(':');
                sb2.append(str2);
                i10 = i11;
            }
            sb2.append(']');
        }
        if (!this.f225290e.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(this.f225290e);
        }
        return C1526d.a(sb2, '}', "StringBuilder().apply(builderAction).toString()");
    }
}
