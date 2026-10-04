package com.mbridge.msdk.thrid.okhttp;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes5.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f159678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f159679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Certificate> f159680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<Certificate> f159681d;

    private q(d0 d0Var, g gVar, List<Certificate> list, List<Certificate> list2) {
        this.f159678a = d0Var;
        this.f159679b = gVar;
        this.f159680c = list;
        this.f159681d = list2;
    }

    public static q a(SSLSession sSLSession) throws IOException {
        Certificate[] peerCertificates;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        g gVarA = g.a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        d0 d0VarA = d0.a(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            peerCertificates = null;
        }
        List listA = peerCertificates != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(peerCertificates) : Collections.EMPTY_LIST;
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new q(d0VarA, gVarA, listA, localCertificates != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(localCertificates) : Collections.EMPTY_LIST);
    }

    public List<Certificate> b() {
        return this.f159680c;
    }

    public d0 c() {
        return this.f159678a;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f159678a.equals(qVar.f159678a) && this.f159679b.equals(qVar.f159679b) && this.f159680c.equals(qVar.f159680c) && this.f159681d.equals(qVar.f159681d);
    }

    public int hashCode() {
        return this.f159681d.hashCode() + ((this.f159680c.hashCode() + ((this.f159679b.hashCode() + ((this.f159678a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public g a() {
        return this.f159679b;
    }
}
