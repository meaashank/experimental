package Jd;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.openjsse.net.ssl.OpenJSSE;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f58274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f58275h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Provider f58276f;

    public static final class a {
        public a() {
        }

        @Nullable
        public final h a() {
            if (h.f58275h) {
                return new h();
            }
            return null;
        }

        public final boolean b() {
            return h.f58275h;
        }

        public a(C4969v c4969v) {
        }
    }

    static {
        a aVar = new a();
        f58274g = aVar;
        boolean z10 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, aVar.getClass().getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f58275h = z10;
    }

    public /* synthetic */ h(C4969v c4969v) {
        this();
    }

    @Override // Jd.i
    public void f(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<Protocol> protocols) {
        G.p(sslSocket, "sslSocket");
        G.p(protocols, "protocols");
        super.f(sslSocket, str, protocols);
    }

    @Override // Jd.i
    @Nullable
    public String j(@NotNull SSLSocket sslSocket) {
        G.p(sslSocket, "sslSocket");
        return null;
    }

    @Override // Jd.i
    @NotNull
    public SSLContext p() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f58276f);
        G.o(sSLContext, "getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // Jd.i
    @NotNull
    public X509TrustManager r() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f58276f);
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        G.m(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                if (trustManager != null) {
                    return (X509TrustManager) trustManager;
                }
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            }
        }
        String string = Arrays.toString(trustManagers);
        G.o(string, "toString(this)");
        throw new IllegalStateException(G.C("Unexpected default trust managers: ", string).toString());
    }

    @Override // Jd.i
    @Nullable
    public X509TrustManager s(@NotNull SSLSocketFactory sslSocketFactory) {
        G.p(sslSocketFactory, "sslSocketFactory");
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported with OpenJSSE");
    }

    public h() {
        this.f58276f = new OpenJSSE();
    }
}
