package Kd;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.G;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface k {

    public static final class a {
        public static boolean a(@NotNull k kVar, @NotNull SSLSocketFactory sslSocketFactory) {
            G.p(kVar, "this");
            G.p(sslSocketFactory, "sslSocketFactory");
            return false;
        }

        @Nullable
        public static X509TrustManager b(@NotNull k kVar, @NotNull SSLSocketFactory sslSocketFactory) {
            G.p(kVar, "this");
            G.p(sslSocketFactory, "sslSocketFactory");
            return null;
        }
    }

    boolean a(@NotNull SSLSocket sSLSocket);

    @Nullable
    String b(@NotNull SSLSocket sSLSocket);

    void c(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<? extends Protocol> list);

    @Nullable
    X509TrustManager d(@NotNull SSLSocketFactory sSLSocketFactory);

    boolean e(@NotNull SSLSocketFactory sSLSocketFactory);

    boolean isSupported();
}
