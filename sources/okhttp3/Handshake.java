package okhttp3;

import ed.InterfaceC4376a;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.DeprecationLevel;
import kotlin.G;
import kotlin.I;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.collections.EmptyList;
import kotlin.collections.J;
import kotlin.collections.U;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class Handshake {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Companion f225201e = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TlsVersion f225202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final g f225203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<Certificate> f225204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final G f225205d;

    public static final class Companion {
        public Companion() {
        }

        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @InterfaceC4852c0(expression = "sslSession.handshake()", imports = {}))
        @dd.j(name = "-deprecated_get")
        @NotNull
        public final Handshake a(@NotNull SSLSession sslSession) throws IOException {
            kotlin.jvm.internal.G.p(sslSession, "sslSession");
            return b(sslSession);
        }

        @dd.o
        @dd.j(name = w7.i.f240158w)
        @NotNull
        public final Handshake b(@NotNull SSLSession sSLSession) throws IOException {
            final List<Certificate> listD;
            kotlin.jvm.internal.G.p(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException(kotlin.jvm.internal.G.C("cipherSuite == ", cipherSuite));
            }
            g gVarB = g.f225418b.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if ("NONE".equals(protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion tlsVersionA = TlsVersion.Companion.a(protocol);
            try {
                listD = d(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listD = EmptyList.f217510a;
            }
            return new Handshake(tlsVersionA, gVarB, d(sSLSession.getLocalCertificates()), new InterfaceC4376a<List<? extends Certificate>>() { // from class: okhttp3.Handshake$Companion$handshake$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @NotNull
                public final List<Certificate> g() {
                    return listD;
                }

                @Override // ed.InterfaceC4376a
                public List<? extends Certificate> invoke() {
                    return listD;
                }
            });
        }

        @dd.o
        @NotNull
        public final Handshake c(@NotNull TlsVersion tlsVersion, @NotNull g cipherSuite, @NotNull List<? extends Certificate> peerCertificates, @NotNull List<? extends Certificate> localCertificates) {
            kotlin.jvm.internal.G.p(tlsVersion, "tlsVersion");
            kotlin.jvm.internal.G.p(cipherSuite, "cipherSuite");
            kotlin.jvm.internal.G.p(peerCertificates, "peerCertificates");
            kotlin.jvm.internal.G.p(localCertificates, "localCertificates");
            final List listH0 = Bd.f.h0(peerCertificates);
            return new Handshake(tlsVersion, cipherSuite, Bd.f.h0(localCertificates), new InterfaceC4376a<List<? extends Certificate>>() { // from class: okhttp3.Handshake$Companion$get$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @NotNull
                public final List<Certificate> g() {
                    return listH0;
                }

                @Override // ed.InterfaceC4376a
                public List<? extends Certificate> invoke() {
                    return listH0;
                }
            });
        }

        public final List<Certificate> d(Certificate[] certificateArr) {
            return certificateArr != null ? Bd.f.C(Arrays.copyOf(certificateArr, certificateArr.length)) : EmptyList.f217510a;
        }

        public Companion(C4969v c4969v) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Handshake(@NotNull TlsVersion tlsVersion, @NotNull g cipherSuite, @NotNull List<? extends Certificate> localCertificates, @NotNull final InterfaceC4376a<? extends List<? extends Certificate>> peerCertificatesFn) {
        kotlin.jvm.internal.G.p(tlsVersion, "tlsVersion");
        kotlin.jvm.internal.G.p(cipherSuite, "cipherSuite");
        kotlin.jvm.internal.G.p(localCertificates, "localCertificates");
        kotlin.jvm.internal.G.p(peerCertificatesFn, "peerCertificatesFn");
        this.f225202a = tlsVersion;
        this.f225203b = cipherSuite;
        this.f225204c = localCertificates;
        this.f225205d = I.a(new InterfaceC4376a<List<? extends Certificate>>() { // from class: okhttp3.Handshake$peerCertificates$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            @NotNull
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final List<Certificate> invoke() {
                try {
                    return peerCertificatesFn.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return EmptyList.f217510a;
                }
            }
        });
    }

    @dd.o
    @dd.j(name = w7.i.f240158w)
    @NotNull
    public static final Handshake h(@NotNull SSLSession sSLSession) throws IOException {
        return f225201e.b(sSLSession);
    }

    @dd.o
    @NotNull
    public static final Handshake i(@NotNull TlsVersion tlsVersion, @NotNull g gVar, @NotNull List<? extends Certificate> list, @NotNull List<? extends Certificate> list2) {
        return f225201e.c(tlsVersion, gVar, list, list2);
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "cipherSuite", imports = {}))
    @dd.j(name = "-deprecated_cipherSuite")
    @NotNull
    public final g a() {
        return this.f225203b;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "localCertificates", imports = {}))
    @dd.j(name = "-deprecated_localCertificates")
    @NotNull
    public final List<Certificate> b() {
        return this.f225204c;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "localPrincipal", imports = {}))
    @dd.j(name = "-deprecated_localPrincipal")
    @Nullable
    public final Principal c() {
        return l();
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "peerCertificates", imports = {}))
    @dd.j(name = "-deprecated_peerCertificates")
    @NotNull
    public final List<Certificate> d() {
        return m();
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "peerPrincipal", imports = {}))
    @dd.j(name = "-deprecated_peerPrincipal")
    @Nullable
    public final Principal e() {
        return n();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Handshake)) {
            return false;
        }
        Handshake handshake = (Handshake) obj;
        return handshake.f225202a == this.f225202a && kotlin.jvm.internal.G.g(handshake.f225203b, this.f225203b) && kotlin.jvm.internal.G.g(handshake.m(), m()) && kotlin.jvm.internal.G.g(handshake.f225204c, this.f225204c);
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "tlsVersion", imports = {}))
    @dd.j(name = "-deprecated_tlsVersion")
    @NotNull
    public final TlsVersion f() {
        return this.f225202a;
    }

    @dd.j(name = "cipherSuite")
    @NotNull
    public final g g() {
        return this.f225203b;
    }

    public int hashCode() {
        return this.f225204c.hashCode() + ((m().hashCode() + ((this.f225203b.hashCode() + ((this.f225202a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String j(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        kotlin.jvm.internal.G.o(type, "type");
        return type;
    }

    @dd.j(name = "localCertificates")
    @NotNull
    public final List<Certificate> k() {
        return this.f225204c;
    }

    @dd.j(name = "localPrincipal")
    @Nullable
    public final Principal l() {
        Object objL2 = U.L2(this.f225204c);
        X509Certificate x509Certificate = objL2 instanceof X509Certificate ? (X509Certificate) objL2 : null;
        if (x509Certificate == null) {
            return null;
        }
        return x509Certificate.getSubjectX500Principal();
    }

    @dd.j(name = "peerCertificates")
    @NotNull
    public final List<Certificate> m() {
        return (List) this.f225205d.getValue();
    }

    @dd.j(name = "peerPrincipal")
    @Nullable
    public final Principal n() {
        Object objL2 = U.L2(m());
        X509Certificate x509Certificate = objL2 instanceof X509Certificate ? (X509Certificate) objL2 : null;
        if (x509Certificate == null) {
            return null;
        }
        return x509Certificate.getSubjectX500Principal();
    }

    @dd.j(name = "tlsVersion")
    @NotNull
    public final TlsVersion o() {
        return this.f225202a;
    }

    @NotNull
    public String toString() {
        List<Certificate> listM = m();
        ArrayList arrayList = new ArrayList(J.d0(listM, 10));
        Iterator<T> it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(j((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder("Handshake{tlsVersion=");
        sb2.append(this.f225202a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f225203b);
        sb2.append(" peerCertificates=");
        sb2.append(string);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f225204c;
        ArrayList arrayList2 = new ArrayList(J.d0(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(j((Certificate) it2.next()));
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
