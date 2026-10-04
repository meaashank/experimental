package com.prism.gaia.helper.utils.apk;

import android.support.v4.media.i;
import android.util.Pair;
import androidx.collection.N0;
import androidx.compose.runtime.changelist.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f165076a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f165077b = 1896449818;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f165078c = -1091571699;

    /* JADX INFO: renamed from: com.prism.gaia.helper.utils.apk.a$a, reason: collision with other inner class name */
    public static class C0671a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final X509Certificate[][] f165079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f165080b;

        public C0671a(X509Certificate[][] x509CertificateArr, byte[] bArr) {
            this.f165079a = x509CertificateArr;
            this.f165080b = bArr;
        }
    }

    public static g a(RandomAccessFile randomAccessFile) throws SignatureNotFoundExceptionG, IOException {
        return b.f(randomAccessFile, f165077b);
    }

    public static boolean b(String str) throws Throwable {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            randomAccessFile = new RandomAccessFile(str, CampaignEx.JSON_KEY_AD_R);
        } catch (SignatureNotFoundExceptionG unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            b.f(randomAccessFile, f165077b);
            randomAccessFile.close();
            return true;
        } catch (SignatureNotFoundExceptionG unused2) {
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 == null) {
                return false;
            }
            randomAccessFile2.close();
            return false;
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
            throw th;
        }
    }

    public static boolean c(int i10) {
        if (i10 == 513 || i10 == 514 || i10 == 769 || i10 == 1057 || i10 == 1059 || i10 == 1061) {
            return true;
        }
        switch (i10) {
            case 257:
            case b.f165083c /* 258 */:
            case b.f165084d /* 259 */:
            case b.f165085e /* 260 */:
                return true;
            default:
                return false;
        }
    }

    public static X509Certificate[][] d(String str) throws SignatureNotFoundExceptionG, SecurityException, IOException {
        return g(str, false).f165079a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0671a e(RandomAccessFile randomAccessFile, g gVar, boolean z10) throws SignatureNotFoundExceptionG, SecurityException, IOException {
        B8.a aVar = new B8.a();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferM = b.m(gVar.f165100a);
                int i10 = 0;
                while (byteBufferM.hasRemaining()) {
                    i10++;
                    try {
                        arrayList.add(j(b.m(byteBufferM), aVar, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e10) {
                        throw new SecurityException(N0.a("Failed to parse/verify signer #", i10, " block"), e10);
                    }
                }
                if (i10 < 1) {
                    throw new SignatureNotFoundExceptionG("No signers found");
                }
                if (aVar.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                return new C0671a((X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]), aVar.containsKey(3) ? b.q((byte[]) aVar.get(3), randomAccessFile.length(), gVar) : null);
            } catch (IOException e11) {
                throw new SecurityException("Failed to read list of signers", e11);
            }
        } catch (CertificateException e12) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e12);
        }
    }

    public static C0671a f(RandomAccessFile randomAccessFile, boolean z10) throws SignatureNotFoundExceptionG, SecurityException, IOException {
        return e(randomAccessFile, b.f(randomAccessFile, f165077b), z10);
    }

    public static C0671a g(String str, boolean z10) throws Throwable {
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, CampaignEx.JSON_KEY_AD_R);
            try {
                C0671a c0671aE = e(randomAccessFile2, b.f(randomAccessFile2, f165077b), z10);
                randomAccessFile2.close();
                return c0671aE;
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static X509Certificate[][] h(String str) throws SignatureNotFoundExceptionG, SecurityException, IOException {
        return g(str, true).f165079a;
    }

    public static void i(ByteBuffer byteBuffer) throws IOException, SecurityException {
        while (byteBuffer.hasRemaining()) {
            ByteBuffer byteBufferM = b.m(byteBuffer);
            if (byteBufferM.remaining() < 4) {
                throw new IOException("Remaining buffer too short to contain additional attribute ID. Remaining: " + byteBufferM.remaining());
            }
            if (byteBufferM.getInt() == -1091571699 && byteBufferM.remaining() < 4) {
                throw new IOException("V2 Signature Scheme Stripping Protection Attribute  value too small.  Expected 4 bytes, but found " + byteBufferM.remaining());
            }
        }
    }

    public static X509Certificate[] j(ByteBuffer byteBuffer, Map<Integer, byte[]> map, CertificateFactory certificateFactory) throws IOException, SecurityException {
        ByteBuffer byteBufferM = b.m(byteBuffer);
        ByteBuffer byteBufferM2 = b.m(byteBuffer);
        byte[] bArrR = b.r(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrR2 = null;
        int i10 = 0;
        int i11 = -1;
        byte[] bArrR3 = null;
        while (byteBufferM2.hasRemaining()) {
            i10++;
            try {
                ByteBuffer byteBufferM3 = b.m(byteBufferM2);
                if (byteBufferM3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i12 = byteBufferM3.getInt();
                arrayList.add(Integer.valueOf(i12));
                if (c(i12) && (i11 == -1 || b.c(i12, i11) > 0)) {
                    bArrR3 = b.r(byteBufferM3);
                    i11 = i12;
                }
            } catch (IOException e10) {
                e = e10;
                throw new SecurityException(android.support.v4.media.c.a("Failed to parse signature record #", i10), e);
            } catch (BufferUnderflowException e11) {
                e = e11;
                throw new SecurityException(android.support.v4.media.c.a("Failed to parse signature record #", i10), e);
            }
        }
        if (i11 == -1) {
            if (i10 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        String strO = b.o(i11);
        Pair<String, ? extends AlgorithmParameterSpec> pairP = b.p(i11);
        String str = (String) pairP.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairP.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(strO).generatePublic(new X509EncodedKeySpec(bArrR));
            Signature signature = Signature.getInstance(str);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferM);
            if (!signature.verify(bArrR3)) {
                throw new SecurityException(j.a(str, " signature did not verify"));
            }
            byteBufferM.clear();
            ByteBuffer byteBufferM4 = b.m(byteBufferM);
            ArrayList arrayList2 = new ArrayList();
            int i13 = 0;
            while (byteBufferM4.hasRemaining()) {
                i13++;
                try {
                    ByteBuffer byteBufferM5 = b.m(byteBufferM4);
                    if (byteBufferM5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i14 = byteBufferM5.getInt();
                    arrayList2.add(Integer.valueOf(i14));
                    if (i14 == i11) {
                        bArrR2 = b.r(byteBufferM5);
                    }
                } catch (IOException e12) {
                    e = e12;
                    throw new IOException(android.support.v4.media.c.a("Failed to parse digest record #", i13), e);
                } catch (BufferUnderflowException e13) {
                    e = e13;
                    throw new IOException(android.support.v4.media.c.a("Failed to parse digest record #", i13), e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iN = b.n(i11);
            byte[] bArrPut = map.put(Integer.valueOf(iN), bArrR2);
            if (bArrPut != null && !MessageDigest.isEqual(bArrPut, bArrR2)) {
                throw new SecurityException(b.j(iN).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferM6 = b.m(byteBufferM);
            ArrayList arrayList3 = new ArrayList();
            int i15 = 0;
            while (byteBufferM6.hasRemaining()) {
                i15++;
                byte[] bArrR4 = b.r(byteBufferM6);
                try {
                    arrayList3.add(new VerbatimX509CertificateG((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrR4)), bArrR4));
                } catch (CertificateException e14) {
                    throw new SecurityException(android.support.v4.media.c.a("Failed to decode certificate #", i15), e14);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (!Arrays.equals(bArrR, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                throw new SecurityException("Public key mismatch between certificate and signature record");
            }
            i(b.m(byteBufferM));
            return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
        } catch (InvalidAlgorithmParameterException e15) {
            e = e15;
            throw new SecurityException(i.a("Failed to verify ", str, " signature"), e);
        } catch (InvalidKeyException e16) {
            e = e16;
            throw new SecurityException(i.a("Failed to verify ", str, " signature"), e);
        } catch (NoSuchAlgorithmException e17) {
            e = e17;
            throw new SecurityException(i.a("Failed to verify ", str, " signature"), e);
        } catch (SignatureException e18) {
            e = e18;
            throw new SecurityException(i.a("Failed to verify ", str, " signature"), e);
        } catch (InvalidKeySpecException e19) {
            e = e19;
            throw new SecurityException(i.a("Failed to verify ", str, " signature"), e);
        }
    }
}
