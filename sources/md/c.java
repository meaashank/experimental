package Md;

import Jd.i;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58926a = new a();

    public static final class a {
        public a() {
        }

        @NotNull
        public final c a(@NotNull X509TrustManager trustManager) {
            G.p(trustManager, "trustManager");
            i.f58277a.getClass();
            return i.f58278b.d(trustManager);
        }

        @NotNull
        public final c b(@NotNull X509Certificate... caCerts) {
            G.p(caCerts, "caCerts");
            return new Md.a(new b((X509Certificate[]) Arrays.copyOf(caCerts, caCerts.length)));
        }

        public a(C4969v c4969v) {
        }
    }

    @NotNull
    public abstract List<Certificate> a(@NotNull List<? extends Certificate> list, @NotNull String str) throws SSLPeerUnverifiedException;
}
