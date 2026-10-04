package Kd;

import Kd.k;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.G;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f58594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public k f58595b;

    public interface a {
        boolean a(@NotNull SSLSocket sSLSocket);

        @NotNull
        k b(@NotNull SSLSocket sSLSocket);
    }

    public j(@NotNull a socketAdapterFactory) {
        G.p(socketAdapterFactory, "socketAdapterFactory");
        this.f58594a = socketAdapterFactory;
    }

    @Override // Kd.k
    public boolean a(@NotNull SSLSocket sslSocket) {
        G.p(sslSocket, "sslSocket");
        return this.f58594a.a(sslSocket);
    }

    @Override // Kd.k
    @Nullable
    public String b(@NotNull SSLSocket sslSocket) {
        G.p(sslSocket, "sslSocket");
        k kVarF = f(sslSocket);
        if (kVarF == null) {
            return null;
        }
        return kVarF.b(sslSocket);
    }

    @Override // Kd.k
    public void c(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends Protocol> protocols) {
        G.p(sslSocket, "sslSocket");
        G.p(protocols, "protocols");
        k kVarF = f(sslSocket);
        if (kVarF == null) {
            return;
        }
        kVarF.c(sslSocket, str, protocols);
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

    public final synchronized k f(SSLSocket sSLSocket) {
        try {
            if (this.f58595b == null && this.f58594a.a(sSLSocket)) {
                this.f58595b = this.f58594a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f58595b;
    }

    @Override // Kd.k
    public boolean isSupported() {
        return true;
    }
}
