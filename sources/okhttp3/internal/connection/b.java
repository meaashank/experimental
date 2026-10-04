package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.G;
import okhttp3.ConnectionSpec;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<ConnectionSpec> f225607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f225608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f225609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f225610d;

    public b(@NotNull List<ConnectionSpec> connectionSpecs) {
        G.p(connectionSpecs, "connectionSpecs");
        this.f225607a = connectionSpecs;
    }

    @NotNull
    public final ConnectionSpec a(@NotNull SSLSocket sslSocket) throws IOException {
        ConnectionSpec connectionSpec;
        G.p(sslSocket, "sslSocket");
        int i10 = this.f225608b;
        int size = this.f225607a.size();
        while (true) {
            if (i10 >= size) {
                connectionSpec = null;
                break;
            }
            int i11 = i10 + 1;
            connectionSpec = this.f225607a.get(i10);
            if (connectionSpec.h(sslSocket)) {
                this.f225608b = i11;
                break;
            }
            i10 = i11;
        }
        if (connectionSpec != null) {
            this.f225609c = c(sslSocket);
            connectionSpec.f(sslSocket, this.f225610d);
            return connectionSpec;
        }
        StringBuilder sb2 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f225610d);
        sb2.append(", modes=");
        sb2.append(this.f225607a);
        sb2.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        G.m(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        G.o(string, "toString(this)");
        sb2.append(string);
        throw new UnknownServiceException(sb2.toString());
    }

    public final boolean b(@NotNull IOException e10) {
        G.p(e10, "e");
        this.f225610d = true;
        if (!this.f225609c || (e10 instanceof ProtocolException) || (e10 instanceof InterruptedIOException)) {
            return false;
        }
        return (((e10 instanceof SSLHandshakeException) && (e10.getCause() instanceof CertificateException)) || (e10 instanceof SSLPeerUnverifiedException) || !(e10 instanceof SSLException)) ? false : true;
    }

    public final boolean c(SSLSocket sSLSocket) {
        int i10 = this.f225608b;
        int size = this.f225607a.size();
        while (i10 < size) {
            int i11 = i10 + 1;
            if (this.f225607a.get(i10).h(sSLSocket)) {
                return true;
            }
            i10 = i11;
        }
        return false;
    }
}
