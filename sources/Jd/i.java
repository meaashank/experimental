package Jd;

import dd.o;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.J;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okio.C5360j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static volatile i f58278b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f58279c = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f58280d = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f58281e;

    public static final class a {
        public a() {
        }

        public static /* synthetic */ void m(a aVar, i iVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                iVar = aVar.f();
            }
            aVar.l(iVar);
        }

        @NotNull
        public final List<String> b(@NotNull List<? extends Protocol> protocols) {
            G.p(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(J.d0(arrayList, 10));
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                arrayList2.add(((Protocol) obj2).toString());
            }
            return arrayList2;
        }

        @NotNull
        public final byte[] c(@NotNull List<? extends Protocol> protocols) {
            G.p(protocols, "protocols");
            C5360j c5360j = new C5360j();
            ArrayList arrayList = (ArrayList) b(protocols);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                String str = (String) obj;
                c5360j.Y3(str.length());
                c5360j.m4(str);
            }
            return c5360j.W2(c5360j.f226051b);
        }

        public final i d() {
            Kd.c.f58573a.b();
            i iVarA = b.f58247g.a();
            if (iVarA != null) {
                return iVarA;
            }
            i iVarA2 = c.f58250h.a();
            G.m(iVarA2);
            return iVarA2;
        }

        public final i e() {
            h hVarA;
            d dVarA;
            e eVarC;
            if (j() && (eVarC = e.f58259g.c()) != null) {
                return eVarC;
            }
            if (i() && (dVarA = d.f58256g.a()) != null) {
                return dVarA;
            }
            if (k() && (hVarA = h.f58274g.a()) != null) {
                return hVarA;
            }
            g gVarA = g.f58272f.a();
            if (gVarA != null) {
                return gVarA;
            }
            i iVarA = f.f58263k.a();
            return iVarA != null ? iVarA : new i();
        }

        public final i f() {
            return h() ? d() : e();
        }

        @o
        @NotNull
        public final i g() {
            return i.f58278b;
        }

        public final boolean h() {
            return "Dalvik".equals(System.getProperty("java.vm.name"));
        }

        public final boolean i() {
            return "BC".equals(Security.getProviders()[0].getName());
        }

        public final boolean j() {
            return "Conscrypt".equals(Security.getProviders()[0].getName());
        }

        public final boolean k() {
            return "OpenJSSE".equals(Security.getProviders()[0].getName());
        }

        public final void l(@NotNull i platform) {
            G.p(platform, "platform");
            i.f58278b = platform;
        }

        public a(C4969v c4969v) {
        }
    }

    static {
        a aVar = new a();
        f58277a = aVar;
        f58278b = aVar.f();
        f58281e = Logger.getLogger(OkHttpClient.class.getName());
    }

    @o
    @NotNull
    public static final i h() {
        f58277a.getClass();
        return f58278b;
    }

    public static /* synthetic */ void n(i iVar, String str, int i10, Throwable th, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i11 & 2) != 0) {
            i10 = 4;
        }
        if ((i11 & 4) != 0) {
            th = null;
        }
        iVar.m(str, i10, th);
    }

    public void c(@NotNull SSLSocket sslSocket) {
        G.p(sslSocket, "sslSocket");
    }

    @NotNull
    public Md.c d(@NotNull X509TrustManager trustManager) {
        G.p(trustManager, "trustManager");
        return new Md.a(e(trustManager));
    }

    @NotNull
    public Md.e e(@NotNull X509TrustManager trustManager) {
        G.p(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        G.o(acceptedIssuers, "trustManager.acceptedIssuers");
        return new Md.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void f(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<Protocol> protocols) {
        G.p(sslSocket, "sslSocket");
        G.p(protocols, "protocols");
    }

    public void g(@NotNull Socket socket, @NotNull InetSocketAddress address, int i10) throws IOException {
        G.p(socket, "socket");
        G.p(address, "address");
        socket.connect(address, i10);
    }

    @NotNull
    public final String i() {
        return "OkHttp";
    }

    @Nullable
    public String j(@NotNull SSLSocket sslSocket) {
        G.p(sslSocket, "sslSocket");
        return null;
    }

    @Nullable
    public Object k(@NotNull String closer) {
        G.p(closer, "closer");
        if (f58281e.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    public boolean l(@NotNull String hostname) {
        G.p(hostname, "hostname");
        return true;
    }

    public void m(@NotNull String message, int i10, @Nullable Throwable th) {
        G.p(message, "message");
        f58281e.log(i10 == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    public void o(@NotNull String message, @Nullable Object obj) {
        G.p(message, "message");
        if (obj == null) {
            message = G.C(message, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        m(message, 5, (Throwable) obj);
    }

    @NotNull
    public SSLContext p() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        G.o(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    @NotNull
    public SSLSocketFactory q(@NotNull X509TrustManager trustManager) {
        G.p(trustManager, "trustManager");
        try {
            SSLContext sSLContextP = p();
            sSLContextP.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextP.getSocketFactory();
            G.o(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError(G.C("No System TLS: ", e10), e10);
        }
    }

    @NotNull
    public X509TrustManager r() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    @Nullable
    public X509TrustManager s(@NotNull SSLSocketFactory sslSocketFactory) {
        G.p(sslSocketFactory, "sslSocketFactory");
        try {
            Object objU = Bd.f.U(sslSocketFactory, Class.forName("sun.security.ssl.SSLContextImpl"), "context");
            if (objU == null) {
                return null;
            }
            return (X509TrustManager) Bd.f.U(objU, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (RuntimeException e10) {
            if (!e10.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
                throw e10;
            }
            return null;
        }
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName();
    }
}
