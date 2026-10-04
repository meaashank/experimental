package okhttp3;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.prism.gaia.download.j;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.G;
import okhttp3.Headers;
import okio.C5360j;
import okio.InterfaceC5362l;
import okio.Z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class Response implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Request f225292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Protocol f225293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f225294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f225295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Handshake f225296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Headers f225297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final u f225298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final Response f225299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final Response f225300i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final Response f225301j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f225302k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f225303l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final okhttp3.internal.connection.c f225304m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public CacheControl f225305n;

    public Response(@NotNull Request request, @NotNull Protocol protocol, @NotNull String message, int i10, @Nullable Handshake handshake, @NotNull Headers headers, @Nullable u uVar, @Nullable Response response, @Nullable Response response2, @Nullable Response response3, long j10, long j11, @Nullable okhttp3.internal.connection.c cVar) {
        G.p(request, "request");
        G.p(protocol, "protocol");
        G.p(message, "message");
        G.p(headers, "headers");
        this.f225292a = request;
        this.f225293b = protocol;
        this.f225294c = message;
        this.f225295d = i10;
        this.f225296e = handshake;
        this.f225297f = headers;
        this.f225298g = uVar;
        this.f225299h = response;
        this.f225300i = response2;
        this.f225301j = response3;
        this.f225302k = j10;
        this.f225303l = j11;
        this.f225304m = cVar;
    }

    public static /* synthetic */ String f1(Response response, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return response.X0(str, str2);
    }

    @dd.j(name = j.b.a.f164786e)
    @NotNull
    public final Headers B1() {
        return this.f225297f;
    }

    @dd.j(name = "cacheResponse")
    @Nullable
    public final Response C0() {
        return this.f225300i;
    }

    public final boolean C1() {
        int i10 = this.f225295d;
        if (i10 == 307 || i10 == 308) {
            return true;
        }
        switch (i10) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    public final boolean G1() {
        int i10 = this.f225295d;
        return 200 <= i10 && i10 < 300;
    }

    @NotNull
    public final List<f> L0() {
        String str;
        Headers headers = this.f225297f;
        int i10 = this.f225295d;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                return EmptyList.f217510a;
            }
            str = "Proxy-Authenticate";
        }
        return Fd.e.b(headers, str);
    }

    @dd.j(name = PglCryptUtils.KEY_MESSAGE)
    @NotNull
    public final String M1() {
        return this.f225294c;
    }

    @dd.j(name = Z3.f.f79422s)
    public final int N0() {
        return this.f225295d;
    }

    @dd.j(name = "networkResponse")
    @Nullable
    public final Response N1() {
        return this.f225299h;
    }

    @dd.j(name = "exchange")
    @Nullable
    public final okhttp3.internal.connection.c O0() {
        return this.f225304m;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "sentRequestAtMillis", imports = {}))
    @dd.j(name = "-deprecated_sentRequestAtMillis")
    public final long P() {
        return this.f225302k;
    }

    @dd.j(name = "handshake")
    @Nullable
    public final Handshake Q0() {
        return this.f225296e;
    }

    @dd.k
    @Nullable
    public final String T0(@NotNull String name) {
        G.p(name, "name");
        return X0(name, null);
    }

    @dd.j(name = "body")
    @Nullable
    public final u U() {
        return this.f225298g;
    }

    @NotNull
    public final Builder V1() {
        return new Builder(this);
    }

    @dd.k
    @Nullable
    public final String X0(@NotNull String name, @Nullable String str) {
        G.p(name, "name");
        String str2 = this.f225297f.get(name);
        return str2 == null ? str : str2;
    }

    @NotNull
    public final u Y1(long j10) throws IOException {
        u uVar = this.f225298g;
        G.m(uVar);
        InterfaceC5362l interfaceC5362lPeek = uVar.L0().peek();
        C5360j c5360j = new C5360j();
        Z z10 = (Z) interfaceC5362lPeek;
        z10.request(j10);
        c5360j.J3(interfaceC5362lPeek, Math.min(j10, z10.f225908b.f226051b));
        return u.f225848b.f(c5360j, this.f225298g.q(), c5360j.f226051b);
    }

    @dd.j(name = "priorResponse")
    @Nullable
    public final Response c2() {
        return this.f225301j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        u uVar = this.f225298g;
        if (uVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        uVar.close();
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "body", imports = {}))
    @dd.j(name = "-deprecated_body")
    @Nullable
    public final u d() {
        return this.f225298g;
    }

    @NotNull
    public final List<String> h1(@NotNull String name) {
        G.p(name, "name");
        return this.f225297f.z(name);
    }

    @dd.j(name = "protocol")
    @NotNull
    public final Protocol h2() {
        return this.f225293b;
    }

    @dd.j(name = "receivedResponseAtMillis")
    public final long j2() {
        return this.f225303l;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "cacheControl", imports = {}))
    @dd.j(name = "-deprecated_cacheControl")
    @NotNull
    public final CacheControl k() {
        return r0();
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "cacheResponse", imports = {}))
    @dd.j(name = "-deprecated_cacheResponse")
    @Nullable
    public final Response l() {
        return this.f225300i;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = Z3.f.f79422s, imports = {}))
    @dd.j(name = "-deprecated_code")
    public final int m() {
        return this.f225295d;
    }

    @dd.j(name = "request")
    @NotNull
    public final Request m2() {
        return this.f225292a;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "handshake", imports = {}))
    @dd.j(name = "-deprecated_handshake")
    @Nullable
    public final Handshake n() {
        return this.f225296e;
    }

    @dd.j(name = "sentRequestAtMillis")
    public final long n2() {
        return this.f225302k;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = j.b.a.f164786e, imports = {}))
    @dd.j(name = "-deprecated_headers")
    @NotNull
    public final Headers o() {
        return this.f225297f;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = PglCryptUtils.KEY_MESSAGE, imports = {}))
    @dd.j(name = "-deprecated_message")
    @NotNull
    public final String p() {
        return this.f225294c;
    }

    @NotNull
    public final Headers p2() throws IOException {
        okhttp3.internal.connection.c cVar = this.f225304m;
        if (cVar != null) {
            return cVar.f225614d.i();
        }
        throw new IllegalStateException("trailers not available");
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "networkResponse", imports = {}))
    @dd.j(name = "-deprecated_networkResponse")
    @Nullable
    public final Response q() {
        return this.f225299h;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "priorResponse", imports = {}))
    @dd.j(name = "-deprecated_priorResponse")
    @Nullable
    public final Response r() {
        return this.f225301j;
    }

    @dd.j(name = "cacheControl")
    @NotNull
    public final CacheControl r0() {
        CacheControl cacheControl = this.f225305n;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl cacheControlC = CacheControl.f225146n.c(this.f225297f);
        this.f225305n = cacheControlC;
        return cacheControlC;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "protocol", imports = {}))
    @dd.j(name = "-deprecated_protocol")
    @NotNull
    public final Protocol s() {
        return this.f225293b;
    }

    @NotNull
    public String toString() {
        return "Response{protocol=" + this.f225293b + ", code=" + this.f225295d + ", message=" + this.f225294c + ", url=" + this.f225292a.f225286a + '}';
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "receivedResponseAtMillis", imports = {}))
    @dd.j(name = "-deprecated_receivedResponseAtMillis")
    public final long u() {
        return this.f225303l;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "request", imports = {}))
    @dd.j(name = "-deprecated_request")
    @NotNull
    public final Request y() {
        return this.f225292a;
    }

    public static class Builder {

        @Nullable
        private u body;

        @Nullable
        private Response cacheResponse;
        private int code;

        @Nullable
        private okhttp3.internal.connection.c exchange;

        @Nullable
        private Handshake handshake;

        @NotNull
        private Headers.Builder headers;

        @Nullable
        private String message;

        @Nullable
        private Response networkResponse;

        @Nullable
        private Response priorResponse;

        @Nullable
        private Protocol protocol;
        private long receivedResponseAtMillis;

        @Nullable
        private Request request;
        private long sentRequestAtMillis;

        public Builder() {
            this.code = -1;
            this.headers = new Headers.Builder();
        }

        private final void checkPriorResponse(Response response) {
            if (response != null && response.f225298g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private final void checkSupportResponse(String str, Response response) {
            if (response == null) {
                return;
            }
            if (response.f225298g != null) {
                throw new IllegalArgumentException(G.C(str, ".body != null").toString());
            }
            if (response.f225299h != null) {
                throw new IllegalArgumentException(G.C(str, ".networkResponse != null").toString());
            }
            if (response.f225300i != null) {
                throw new IllegalArgumentException(G.C(str, ".cacheResponse != null").toString());
            }
            if (response.f225301j != null) {
                throw new IllegalArgumentException(G.C(str, ".priorResponse != null").toString());
            }
        }

        @NotNull
        public Builder addHeader(@NotNull String name, @NotNull String value) {
            G.p(name, "name");
            G.p(value, "value");
            getHeaders$okhttp().add(name, value);
            return this;
        }

        @NotNull
        public Builder body(@Nullable u uVar) {
            setBody$okhttp(uVar);
            return this;
        }

        @NotNull
        public Response build() {
            int i10 = this.code;
            if (i10 < 0) {
                throw new IllegalStateException(G.C("code < 0: ", Integer.valueOf(getCode$okhttp())).toString());
            }
            Request request = this.request;
            if (request == null) {
                throw new IllegalStateException("request == null");
            }
            Protocol protocol = this.protocol;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.message;
            if (str != null) {
                return new Response(request, protocol, str, i10, this.handshake, this.headers.build(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange);
            }
            throw new IllegalStateException("message == null");
        }

        @NotNull
        public Builder cacheResponse(@Nullable Response response) {
            checkSupportResponse("cacheResponse", response);
            setCacheResponse$okhttp(response);
            return this;
        }

        @NotNull
        public Builder code(int i10) {
            setCode$okhttp(i10);
            return this;
        }

        @Nullable
        public final u getBody$okhttp() {
            return this.body;
        }

        @Nullable
        public final Response getCacheResponse$okhttp() {
            return this.cacheResponse;
        }

        public final int getCode$okhttp() {
            return this.code;
        }

        @Nullable
        public final okhttp3.internal.connection.c getExchange$okhttp() {
            return this.exchange;
        }

        @Nullable
        public final Handshake getHandshake$okhttp() {
            return this.handshake;
        }

        @NotNull
        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        @Nullable
        public final String getMessage$okhttp() {
            return this.message;
        }

        @Nullable
        public final Response getNetworkResponse$okhttp() {
            return this.networkResponse;
        }

        @Nullable
        public final Response getPriorResponse$okhttp() {
            return this.priorResponse;
        }

        @Nullable
        public final Protocol getProtocol$okhttp() {
            return this.protocol;
        }

        public final long getReceivedResponseAtMillis$okhttp() {
            return this.receivedResponseAtMillis;
        }

        @Nullable
        public final Request getRequest$okhttp() {
            return this.request;
        }

        public final long getSentRequestAtMillis$okhttp() {
            return this.sentRequestAtMillis;
        }

        @NotNull
        public Builder handshake(@Nullable Handshake handshake) {
            setHandshake$okhttp(handshake);
            return this;
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

        public final void initExchange$okhttp(@NotNull okhttp3.internal.connection.c deferredTrailers) {
            G.p(deferredTrailers, "deferredTrailers");
            this.exchange = deferredTrailers;
        }

        @NotNull
        public Builder message(@NotNull String message) {
            G.p(message, "message");
            setMessage$okhttp(message);
            return this;
        }

        @NotNull
        public Builder networkResponse(@Nullable Response response) {
            checkSupportResponse("networkResponse", response);
            setNetworkResponse$okhttp(response);
            return this;
        }

        @NotNull
        public Builder priorResponse(@Nullable Response response) {
            checkPriorResponse(response);
            setPriorResponse$okhttp(response);
            return this;
        }

        @NotNull
        public Builder protocol(@NotNull Protocol protocol) {
            G.p(protocol, "protocol");
            setProtocol$okhttp(protocol);
            return this;
        }

        @NotNull
        public Builder receivedResponseAtMillis(long j10) {
            setReceivedResponseAtMillis$okhttp(j10);
            return this;
        }

        @NotNull
        public Builder removeHeader(@NotNull String name) {
            G.p(name, "name");
            getHeaders$okhttp().removeAll(name);
            return this;
        }

        @NotNull
        public Builder request(@NotNull Request request) {
            G.p(request, "request");
            setRequest$okhttp(request);
            return this;
        }

        @NotNull
        public Builder sentRequestAtMillis(long j10) {
            setSentRequestAtMillis$okhttp(j10);
            return this;
        }

        public final void setBody$okhttp(@Nullable u uVar) {
            this.body = uVar;
        }

        public final void setCacheResponse$okhttp(@Nullable Response response) {
            this.cacheResponse = response;
        }

        public final void setCode$okhttp(int i10) {
            this.code = i10;
        }

        public final void setExchange$okhttp(@Nullable okhttp3.internal.connection.c cVar) {
            this.exchange = cVar;
        }

        public final void setHandshake$okhttp(@Nullable Handshake handshake) {
            this.handshake = handshake;
        }

        public final void setHeaders$okhttp(@NotNull Headers.Builder builder) {
            G.p(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMessage$okhttp(@Nullable String str) {
            this.message = str;
        }

        public final void setNetworkResponse$okhttp(@Nullable Response response) {
            this.networkResponse = response;
        }

        public final void setPriorResponse$okhttp(@Nullable Response response) {
            this.priorResponse = response;
        }

        public final void setProtocol$okhttp(@Nullable Protocol protocol) {
            this.protocol = protocol;
        }

        public final void setReceivedResponseAtMillis$okhttp(long j10) {
            this.receivedResponseAtMillis = j10;
        }

        public final void setRequest$okhttp(@Nullable Request request) {
            this.request = request;
        }

        public final void setSentRequestAtMillis$okhttp(long j10) {
            this.sentRequestAtMillis = j10;
        }

        public Builder(@NotNull Response response) {
            G.p(response, "response");
            this.request = response.f225292a;
            this.protocol = response.f225293b;
            this.code = response.f225295d;
            this.message = response.f225294c;
            this.handshake = response.f225296e;
            this.headers = response.f225297f.q();
            this.body = response.f225298g;
            this.networkResponse = response.f225299h;
            this.cacheResponse = response.f225300i;
            this.priorResponse = response.f225301j;
            this.sentRequestAtMillis = response.f225302k;
            this.receivedResponseAtMillis = response.f225303l;
            this.exchange = response.f225304m;
        }
    }
}
