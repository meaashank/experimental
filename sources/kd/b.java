package Kd;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends Md.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f58570d = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final X509TrustManager f58571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final X509TrustManagerExtensions f58572c;

    public static final class a {
        public a() {
        }

        @Bd.c
        @Nullable
        public final b a(@NotNull X509TrustManager trustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            G.p(trustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new b(trustManager, x509TrustManagerExtensions);
            }
            return null;
        }

        public a(C4969v c4969v) {
        }
    }

    public b(@NotNull X509TrustManager trustManager, @NotNull X509TrustManagerExtensions x509TrustManagerExtensions) {
        G.p(trustManager, "trustManager");
        G.p(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f58571b = trustManager;
        this.f58572c = x509TrustManagerExtensions;
    }

    @Override // Md.c
    @Bd.c
    @NotNull
    public List<Certificate> a(@NotNull List<? extends Certificate> chain, @NotNull String hostname) throws SSLPeerUnverifiedException {
        G.p(chain, "chain");
        G.p(hostname, "hostname");
        Object[] array = chain.toArray(new X509Certificate[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        try {
            List<X509Certificate> listCheckServerTrusted = this.f58572c.checkServerTrusted((X509Certificate[]) array, "RSA", hostname);
            G.o(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof b) && ((b) obj).f58571b == this.f58571b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f58571b);
    }
}
