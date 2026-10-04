package Kd;

import Kd.k;
import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Bd.c
@SuppressLint({"NewApi"})
public final class a implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C0070a f58569a = new C0070a();

    /* JADX INFO: renamed from: Kd.a$a, reason: collision with other inner class name */
    @Bd.c
    public static final class C0070a {
        public C0070a() {
        }

        @Nullable
        public final k a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return Jd.i.f58277a.h() && Build.VERSION.SDK_INT >= 29;
        }

        public C0070a(C4969v c4969v) {
        }
    }

    @Override // Kd.k
    public boolean a(@NotNull SSLSocket sslSocket) {
        G.p(sslSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sslSocket);
    }

    @Override // Kd.k
    @SuppressLint({"NewApi"})
    @Nullable
    public String b(@NotNull SSLSocket sslSocket) {
        G.p(sslSocket, "sslSocket");
        String applicationProtocol = sslSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // Kd.k
    @SuppressLint({"NewApi"})
    public void c(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends Protocol> protocols) throws IOException {
        G.p(sslSocket, "sslSocket");
        G.p(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            Object[] array = Jd.i.f58277a.b(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            sSLParameters.setApplicationProtocols((String[]) array);
            sslSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
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
        return f58569a.b();
    }
}
