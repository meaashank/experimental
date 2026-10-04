package com.prism.gaia.helper.utils.apk;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
class VerbatimX509CertificateG extends WrappedX509CertificateG {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f165073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f165074c;

    public VerbatimX509CertificateG(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f165074c = -1;
        this.f165073b = bArr;
    }

    @Override // java.security.cert.Certificate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerbatimX509CertificateG)) {
            return false;
        }
        try {
            return Arrays.equals(getEncoded(), ((VerbatimX509CertificateG) obj).getEncoded());
        } catch (CertificateEncodingException unused) {
            return false;
        }
    }

    @Override // com.prism.gaia.helper.utils.apk.WrappedX509CertificateG, java.security.cert.Certificate
    public byte[] getEncoded() throws CertificateEncodingException {
        return this.f165073b;
    }

    @Override // java.security.cert.Certificate
    public int hashCode() {
        if (this.f165074c == -1) {
            try {
                this.f165074c = Arrays.hashCode(getEncoded());
            } catch (CertificateEncodingException unused) {
                this.f165074c = 0;
            }
        }
        return this.f165074c;
    }
}
