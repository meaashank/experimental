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
import org.conscrypt.Conscrypt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f58592a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final j.a f58593b = new a();

    public static final class a implements j.a {
        @Override // Kd.j.a
        public boolean a(@NotNull SSLSocket sslSocket) {
            G.p(sslSocket, "sslSocket");
            Jd.e.f58259g.getClass();
            return Jd.e.f58260h && Conscrypt.isConscrypt(sslSocket);
        }

        @Override // Kd.j.a
        @NotNull
        public k b(@NotNull SSLSocket sslSocket) {
            G.p(sslSocket, "sslSocket");
            return new i();
        }
    }

    public static final class b {
        public b() {
        }

        @NotNull
        public final j.a a() {
            return i.f58593b;
        }

        public b(C4969v c4969v) {
        }
    }

    @Override // Kd.k
    public boolean a(@NotNull SSLSocket sslSocket) {
        G.p(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // Kd.k
    @Nullable
    public String b(@NotNull SSLSocket sslSocket) {
        G.p(sslSocket, "sslSocket");
        if (a(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // Kd.k
    public void c(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends Protocol> protocols) {
        G.p(sslSocket, "sslSocket");
        G.p(protocols, "protocols");
        if (a(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Object[] array = Jd.i.f58277a.b(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
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
        Jd.e.f58259g.getClass();
        return Jd.e.f58260h;
    }
}
