package Kd;

import Kd.j;
import Kd.k;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import okhttp3.Protocol;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f58586a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final j.a f58587b = new a();

    public static final class a implements j.a {
        @Override // Kd.j.a
        public boolean a(@NotNull SSLSocket sslSocket) {
            G.p(sslSocket, "sslSocket");
            Jd.d.f58256g.getClass();
            boolean unused = Jd.d.f58257h;
            return false;
        }

        @Override // Kd.j.a
        @NotNull
        public k b(@NotNull SSLSocket sslSocket) {
            G.p(sslSocket, "sslSocket");
            return new g();
        }
    }

    public static final class b {
        public b() {
        }

        @NotNull
        public final j.a a() {
            return g.f58587b;
        }

        public b(C4969v c4969v) {
        }
    }

    @Override // Kd.k
    public boolean a(@NotNull SSLSocket sslSocket) {
        G.p(sslSocket, "sslSocket");
        return false;
    }

    @Override // Kd.k
    @Nullable
    public String b(@NotNull SSLSocket sslSocket) {
        G.p(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // Kd.k
    public void c(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends Protocol> protocols) {
        G.p(sslSocket, "sslSocket");
        G.p(protocols, "protocols");
        if (a(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            Object[] array = Jd.i.f58277a.b(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // Kd.k
    @Nullable
    public X509TrustManager d(@NotNull SSLSocketFactory sSLSocketFactory) {
        k.a.b(this, sSLSocketFactory);
        return null;
    }

    @Override // Kd.k
    public boolean e(@NotNull SSLSocketFactory sSLSocketFactory) {
        k.a.a(this, sSLSocketFactory);
        return false;
    }

    @Override // Kd.k
    public boolean isSupported() {
        Jd.d.f58256g.getClass();
        return Jd.d.f58257h;
    }
}
