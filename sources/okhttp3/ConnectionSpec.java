package okhttp3;

import androidx.compose.animation.C1636p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.collections.U;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class ConnectionSpec {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f225172e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final g[] f225173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final g[] f225174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final ConnectionSpec f225175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final ConnectionSpec f225176i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final ConnectionSpec f225177j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final ConnectionSpec f225178k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f225179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f225180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String[] f225181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String[] f225182d;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    static {
        g gVar = g.f225459o1;
        g gVar2 = g.f225462p1;
        g gVar3 = g.f225465q1;
        g gVar4 = g.f225417a1;
        g gVar5 = g.f225429e1;
        g gVar6 = g.f225420b1;
        g gVar7 = g.f225432f1;
        g gVar8 = g.f225450l1;
        g gVar9 = g.f225447k1;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9};
        f225173f = gVarArr;
        g[] gVarArr2 = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, g.f225387L0, g.f225389M0, g.f225443j0, g.f225446k0, g.f225378H, g.f225386L, g.f225448l};
        f225174g = gVarArr2;
        Builder builderCipherSuites = new Builder(true).cipherSuites((g[]) Arrays.copyOf(gVarArr, gVarArr.length));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        f225175h = builderCipherSuites.tlsVersions(tlsVersion, tlsVersion2).supportsTlsExtensions(true).build();
        f225176i = new Builder(true).cipherSuites((g[]) Arrays.copyOf(gVarArr2, gVarArr2.length)).tlsVersions(tlsVersion, tlsVersion2).supportsTlsExtensions(true).build();
        f225177j = new Builder(true).cipherSuites((g[]) Arrays.copyOf(gVarArr2, gVarArr2.length)).tlsVersions(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).supportsTlsExtensions(true).build();
        f225178k = new Builder(false).build();
    }

    public ConnectionSpec(boolean z10, boolean z11, @Nullable String[] strArr, @Nullable String[] strArr2) {
        this.f225179a = z10;
        this.f225180b = z11;
        this.f225181c = strArr;
        this.f225182d = strArr2;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "cipherSuites", imports = {}))
    @dd.j(name = "-deprecated_cipherSuites")
    @Nullable
    public final List<g> a() {
        return g();
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "supportsTlsExtensions", imports = {}))
    @dd.j(name = "-deprecated_supportsTlsExtensions")
    public final boolean b() {
        return this.f225180b;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "tlsVersions", imports = {}))
    @dd.j(name = "-deprecated_tlsVersions")
    @Nullable
    public final List<TlsVersion> c() {
        return l();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z10 = this.f225179a;
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        if (z10 != connectionSpec.f225179a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f225181c, connectionSpec.f225181c) && Arrays.equals(this.f225182d, connectionSpec.f225182d) && this.f225180b == connectionSpec.f225180b);
    }

    public final void f(@NotNull SSLSocket sslSocket, boolean z10) {
        G.p(sslSocket, "sslSocket");
        ConnectionSpec connectionSpecJ = j(sslSocket, z10);
        if (connectionSpecJ.l() != null) {
            sslSocket.setEnabledProtocols(connectionSpecJ.f225182d);
        }
        if (connectionSpecJ.g() != null) {
            sslSocket.setEnabledCipherSuites(connectionSpecJ.f225181c);
        }
    }

    @dd.j(name = "cipherSuites")
    @Nullable
    public final List<g> g() {
        String[] strArr = this.f225181c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(g.f225418b.b(str));
        }
        return U.a6(arrayList);
    }

    public final boolean h(@NotNull SSLSocket socket) {
        G.p(socket, "socket");
        if (!this.f225179a) {
            return false;
        }
        String[] strArr = this.f225182d;
        if (strArr != null && !Bd.f.z(strArr, socket.getEnabledProtocols(), Oc.g.q())) {
            return false;
        }
        String[] strArr2 = this.f225181c;
        if (strArr2 == null) {
            return true;
        }
        String[] enabledCipherSuites = socket.getEnabledCipherSuites();
        g.f225418b.getClass();
        return Bd.f.z(strArr2, enabledCipherSuites, g.f225421c);
    }

    public int hashCode() {
        if (!this.f225179a) {
            return 17;
        }
        String[] strArr = this.f225181c;
        int iHashCode = (527 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        String[] strArr2 = this.f225182d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f225180b ? 1 : 0);
    }

    @dd.j(name = "isTls")
    public final boolean i() {
        return this.f225179a;
    }

    public final ConnectionSpec j(SSLSocket sSLSocket, boolean z10) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        if (this.f225181c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            G.o(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            String[] strArr = this.f225181c;
            g.f225418b.getClass();
            cipherSuitesIntersection = Bd.f.L(enabledCipherSuites, strArr, g.f225421c);
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f225182d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            G.o(enabledProtocols, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = Bd.f.L(enabledProtocols, this.f225182d, Oc.g.q());
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        G.o(supportedCipherSuites, "supportedCipherSuites");
        g.f225418b.getClass();
        int iD = Bd.f.D(supportedCipherSuites, "TLS_FALLBACK_SCSV", g.f225421c);
        if (z10 && iD != -1) {
            G.o(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[iD];
            G.o(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = Bd.f.r(cipherSuitesIntersection, str);
        }
        Builder builder = new Builder(this);
        G.o(cipherSuitesIntersection, "cipherSuitesIntersection");
        Builder builderCipherSuites = builder.cipherSuites((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        G.o(tlsVersionsIntersection, "tlsVersionsIntersection");
        return builderCipherSuites.tlsVersions((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).build();
    }

    @dd.j(name = "supportsTlsExtensions")
    public final boolean k() {
        return this.f225180b;
    }

    @dd.j(name = "tlsVersions")
    @Nullable
    public final List<TlsVersion> l() {
        String[] strArr = this.f225182d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(TlsVersion.Companion.a(str));
        }
        return U.a6(arrayList);
    }

    @NotNull
    public String toString() {
        if (!this.f225179a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb2 = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb2.append((Object) Objects.toString(g(), "[all enabled]"));
        sb2.append(", tlsVersions=");
        sb2.append((Object) Objects.toString(l(), "[all enabled]"));
        sb2.append(", supportsTlsExtensions=");
        return C1636p.a(sb2, this.f225180b, ')');
    }

    public static final class Builder {

        @Nullable
        private String[] cipherSuites;
        private boolean supportsTlsExtensions;
        private boolean tls;

        @Nullable
        private String[] tlsVersions;

        public Builder(boolean z10) {
            this.tls = z10;
        }

        @NotNull
        public final Builder allEnabledCipherSuites() {
            if (!getTls$okhttp()) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            setCipherSuites$okhttp(null);
            return this;
        }

        @NotNull
        public final Builder allEnabledTlsVersions() {
            if (!getTls$okhttp()) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            setTlsVersions$okhttp(null);
            return this;
        }

        @NotNull
        public final ConnectionSpec build() {
            return new ConnectionSpec(this.tls, this.supportsTlsExtensions, this.cipherSuites, this.tlsVersions);
        }

        @NotNull
        public final Builder cipherSuites(@NotNull g... cipherSuites) {
            G.p(cipherSuites, "cipherSuites");
            if (!getTls$okhttp()) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (g gVar : cipherSuites) {
                arrayList.add(gVar.f225486a);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr = (String[]) array;
            return cipherSuites((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @Nullable
        public final String[] getCipherSuites$okhttp() {
            return this.cipherSuites;
        }

        public final boolean getSupportsTlsExtensions$okhttp() {
            return this.supportsTlsExtensions;
        }

        public final boolean getTls$okhttp() {
            return this.tls;
        }

        @Nullable
        public final String[] getTlsVersions$okhttp() {
            return this.tlsVersions;
        }

        public final void setCipherSuites$okhttp(@Nullable String[] strArr) {
            this.cipherSuites = strArr;
        }

        public final void setSupportsTlsExtensions$okhttp(boolean z10) {
            this.supportsTlsExtensions = z10;
        }

        public final void setTls$okhttp(boolean z10) {
            this.tls = z10;
        }

        public final void setTlsVersions$okhttp(@Nullable String[] strArr) {
            this.tlsVersions = strArr;
        }

        @InterfaceC4982o(message = "since OkHttp 3.13 all TLS-connections are expected to support TLS extensions.\nIn a future release setting this to true will be unnecessary and setting it to false\nwill have no effect.")
        @NotNull
        public final Builder supportsTlsExtensions(boolean z10) {
            if (!getTls$okhttp()) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            setSupportsTlsExtensions$okhttp(z10);
            return this;
        }

        @NotNull
        public final Builder tlsVersions(@NotNull TlsVersion... tlsVersions) {
            G.p(tlsVersions, "tlsVersions");
            if (!getTls$okhttp()) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (TlsVersion tlsVersion : tlsVersions) {
                arrayList.add(tlsVersion.javaName());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr = (String[]) array;
            return tlsVersions((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public Builder(@NotNull ConnectionSpec connectionSpec) {
            G.p(connectionSpec, "connectionSpec");
            this.tls = connectionSpec.f225179a;
            this.cipherSuites = connectionSpec.f225181c;
            this.tlsVersions = connectionSpec.f225182d;
            this.supportsTlsExtensions = connectionSpec.f225180b;
        }

        @NotNull
        public final Builder tlsVersions(@NotNull String... tlsVersions) {
            G.p(tlsVersions, "tlsVersions");
            if (getTls$okhttp()) {
                if (!(tlsVersions.length == 0)) {
                    setTlsVersions$okhttp((String[]) tlsVersions.clone());
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }

        @NotNull
        public final Builder cipherSuites(@NotNull String... cipherSuites) {
            G.p(cipherSuites, "cipherSuites");
            if (getTls$okhttp()) {
                if (!(cipherSuites.length == 0)) {
                    setCipherSuites$okhttp((String[]) cipherSuites.clone());
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
    }
}
