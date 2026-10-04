package com.mbridge.msdk.thrid.okhttp;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f159134c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<b> f159135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final com.mbridge.msdk.thrid.okhttp.internal.tls.c f159136b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<b> f159137a = new ArrayList();

        public f a() {
            return new f(new LinkedHashSet(this.f159137a), null);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f159138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f159139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f159140c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final com.mbridge.msdk.thrid.okio.f f159141d;

        public boolean a(String str) {
            if (!this.f159138a.startsWith("*.")) {
                return str.equals(this.f159139b);
            }
            int iIndexOf = str.indexOf(46);
            if ((str.length() - iIndexOf) - 1 != this.f159139b.length()) {
                return false;
            }
            String str2 = this.f159139b;
            return str.regionMatches(false, iIndexOf + 1, str2, 0, str2.length());
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f159138a.equals(bVar.f159138a) && this.f159140c.equals(bVar.f159140c) && this.f159141d.equals(bVar.f159141d);
        }

        public int hashCode() {
            return this.f159141d.hashCode() + androidx.compose.foundation.text.modifiers.l.a(this.f159140c, androidx.compose.foundation.text.modifiers.l.a(this.f159138a, 527, 31), 31);
        }

        public String toString() {
            return this.f159140c + this.f159141d.d();
        }
    }

    public f(Set<b> set, @Nullable com.mbridge.msdk.thrid.okhttp.internal.tls.c cVar) {
        this.f159135a = set;
        this.f159136b = cVar;
    }

    public static com.mbridge.msdk.thrid.okio.f b(X509Certificate x509Certificate) {
        return com.mbridge.msdk.thrid.okio.f.a(x509Certificate.getPublicKey().getEncoded()).i();
    }

    public void a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List<b> listA = a(str);
        if (listA.isEmpty()) {
            return;
        }
        com.mbridge.msdk.thrid.okhttp.internal.tls.c cVar = this.f159136b;
        if (cVar != null) {
            list = cVar.a(list, str);
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i10);
            int size2 = listA.size();
            com.mbridge.msdk.thrid.okio.f fVarB = null;
            com.mbridge.msdk.thrid.okio.f fVarA = null;
            for (int i11 = 0; i11 < size2; i11++) {
                b bVar = listA.get(i11);
                if (bVar.f159140c.equals("sha256/")) {
                    if (fVarB == null) {
                        fVarB = b(x509Certificate);
                    }
                    if (bVar.f159141d.equals(fVarB)) {
                        return;
                    }
                } else {
                    if (!bVar.f159140c.equals("sha1/")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + bVar.f159140c);
                    }
                    if (fVarA == null) {
                        fVarA = a(x509Certificate);
                    }
                    if (bVar.f159141d.equals(fVarA)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb2 = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        int size3 = list.size();
        for (int i12 = 0; i12 < size3; i12++) {
            X509Certificate x509Certificate2 = (X509Certificate) list.get(i12);
            sb2.append("\n    ");
            sb2.append(a((Certificate) x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(str);
        sb2.append(com.prism.gaia.server.accounts.b.f166434b0);
        int size4 = listA.size();
        for (int i13 = 0; i13 < size4; i13++) {
            b bVar2 = listA.get(i13);
            sb2.append("\n    ");
            sb2.append(bVar2);
        }
        throw new SSLPeerUnverifiedException(sb2.toString());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f159136b, fVar.f159136b) && this.f159135a.equals(fVar.f159135a);
    }

    public int hashCode() {
        com.mbridge.msdk.thrid.okhttp.internal.tls.c cVar = this.f159136b;
        return this.f159135a.hashCode() + ((cVar != null ? cVar.hashCode() : 0) * 31);
    }

    public List<b> a(String str) {
        List<b> arrayList = Collections.EMPTY_LIST;
        for (b bVar : this.f159135a) {
            if (bVar.a(str)) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public f a(@Nullable com.mbridge.msdk.thrid.okhttp.internal.tls.c cVar) {
        return com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f159136b, cVar) ? this : new f(this.f159135a, cVar);
    }

    public static String a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + b((X509Certificate) certificate).d();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    public static com.mbridge.msdk.thrid.okio.f a(X509Certificate x509Certificate) {
        return com.mbridge.msdk.thrid.okio.f.a(x509Certificate.getPublicKey().getEncoded()).h();
    }
}
