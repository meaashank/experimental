package Jd;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import okhttp3.Protocol;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f58259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f58260h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Provider f58261f;

    public static final class a {
        public a() {
        }

        public static /* synthetic */ boolean b(a aVar, int i10, int i11, int i12, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                i11 = 0;
            }
            if ((i13 & 4) != 0) {
                i12 = 0;
            }
            return aVar.a(i10, i11, i12);
        }

        public final boolean a(int i10, int i11, int i12) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i10 ? version.major() > i10 : version.minor() != i11 ? version.minor() > i11 : version.patch() >= i12;
        }

        @Nullable
        public final e c() {
            if (e.f58260h) {
                return new e();
            }
            return null;
        }

        public final boolean d() {
            return e.f58260h;
        }

        public a(C4969v c4969v) {
        }
    }

    public static final class b implements ConscryptHostnameVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f58262a = new b();

        public final boolean a(@Nullable String str, @Nullable SSLSession sSLSession) {
            return true;
        }

        public boolean b(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable SSLSession sSLSession) {
            return true;
        }
    }

    static {
        a aVar = new a();
        f58259g = aVar;
        boolean z10 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (aVar.a(2, 1, 0)) {
                    z10 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f58260h = z10;
    }

    public /* synthetic */ e(C4969v c4969v) {
        this();
    }

    @Override // Jd.i
    public void f(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<Protocol> protocols) {
        G.p(sslSocket, "sslSocket");
        G.p(protocols, "protocols");
        if (!Conscrypt.isConscrypt(sslSocket)) {
            super.f(sslSocket, str, protocols);
            return;
        }
        Conscrypt.setUseSessionTickets(sslSocket, true);
        Object[] array = ((ArrayList) i.f58277a.b(protocols)).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
    }

    @Override // Jd.i
    @Nullable
    public String j(@NotNull SSLSocket sslSocket) {
        G.p(sslSocket, "sslSocket");
        if (Conscrypt.isConscrypt(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // Jd.i
    @NotNull
    public SSLContext p() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f58261f);
        G.o(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // Jd.i
    @NotNull
    public SSLSocketFactory q(@NotNull X509TrustManager trustManager) throws NoSuchAlgorithmException, KeyManagementException {
        G.p(trustManager, "trustManager");
        SSLContext sSLContextP = p();
        sSLContextP.init(null, new TrustManager[]{trustManager}, null);
        SSLSocketFactory socketFactory = sSLContextP.getSocketFactory();
        G.o(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // Jd.i
    @NotNull
    public X509TrustManager r() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        G.m(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                if (trustManager == null) {
                    throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                }
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, b.f58262a);
                return x509TrustManager;
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
        return null;
    }

    public e() {
        Provider providerNewProvider = Conscrypt.newProvider();
        G.o(providerNewProvider, "newProvider()");
        this.f58261f = providerNewProvider;
    }
}
