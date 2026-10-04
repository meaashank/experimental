package Jd;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
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
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f58256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f58257h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Provider f58258f;

    public static final class a {
        public a() {
        }

        @Nullable
        public final d a() {
            if (d.f58257h) {
                return new d();
            }
            return null;
        }

        public final boolean b() {
            return d.f58257h;
        }

        public a(C4969v c4969v) {
        }
    }

    static {
        a aVar = new a();
        f58256g = aVar;
        boolean z10 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f58257h = z10;
    }

    public /* synthetic */ d(C4969v c4969v) {
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
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f58258f);
        G.o(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // Jd.i
    @NotNull
    public X509TrustManager r() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported with BouncyCastle");
    }

    public d() {
        this.f58258f = new BouncyCastleJsseProvider();
    }
}
