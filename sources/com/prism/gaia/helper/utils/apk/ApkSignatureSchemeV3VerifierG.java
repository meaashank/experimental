package com.prism.gaia.helper.utils.apk;

import android.os.Build;
import android.support.v4.media.i;
import android.util.Pair;
import androidx.collection.C1545m0;
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
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class ApkSignatureSchemeV3VerifierG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f165065a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f165066b = -262969152;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f165067c = 1000370060;

    public static class PlatformNotSupportedException extends Exception {
        public PlatformNotSupportedException(String str) {
            super(str);
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<X509Certificate> f165068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<Integer> f165069b;

        public a(List<X509Certificate> list, List<Integer> list2) {
            this.f165068a = list;
            this.f165069b = list2;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final X509Certificate[] f165070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f165071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f165072c;

        public b(X509Certificate[] x509CertificateArr, a aVar) {
            this.f165070a = x509CertificateArr;
            this.f165071b = aVar;
        }
    }

    public static g a(RandomAccessFile randomAccessFile) throws SignatureNotFoundExceptionG, IOException {
        return com.prism.gaia.helper.utils.apk.b.f(randomAccessFile, f165066b);
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
            com.prism.gaia.helper.utils.apk.b.f(randomAccessFile, f165066b);
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
            case com.prism.gaia.helper.utils.apk.b.f165083c /* 258 */:
            case com.prism.gaia.helper.utils.apk.b.f165084d /* 259 */:
            case com.prism.gaia.helper.utils.apk.b.f165085e /* 260 */:
                return true;
            default:
                return false;
        }
    }

    public static b d(String str) throws SignatureNotFoundExceptionG, SecurityException, IOException {
        return h(str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static b e(RandomAccessFile randomAccessFile, g gVar, boolean z10) throws SignatureNotFoundExceptionG, SecurityException, IOException {
        B8.a aVar = new B8.a();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferM = com.prism.gaia.helper.utils.apk.b.m(gVar.f165100a);
                int i10 = 0;
                b bVarK = null;
                while (byteBufferM.hasRemaining()) {
                    try {
                        bVarK = k(com.prism.gaia.helper.utils.apk.b.m(byteBufferM), aVar, certificateFactory);
                        i10++;
                    } catch (PlatformNotSupportedException unused) {
                    } catch (IOException e10) {
                        e = e10;
                        throw new SecurityException(N0.a("Failed to parse/verify signer #", i10, " block"), e);
                    } catch (SecurityException e11) {
                        e = e11;
                        throw new SecurityException(N0.a("Failed to parse/verify signer #", i10, " block"), e);
                    } catch (BufferUnderflowException e12) {
                        e = e12;
                        throw new SecurityException(N0.a("Failed to parse/verify signer #", i10, " block"), e);
                    }
                }
                if (i10 < 1 || bVarK == null) {
                    throw new SignatureNotFoundExceptionG("No signers found");
                }
                if (i10 != 1) {
                    throw new SecurityException("APK Signature Scheme V3 only supports one signer: multiple signers found.");
                }
                if (aVar.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                if (aVar.containsKey(3)) {
                    bVarK.f165072c = com.prism.gaia.helper.utils.apk.b.q((byte[]) aVar.get(3), randomAccessFile.length(), gVar);
                }
                return bVarK;
            } catch (IOException e13) {
                throw new SecurityException("Failed to read list of signers", e13);
            }
        } catch (CertificateException e14) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e14);
        }
    }

    public static b f(RandomAccessFile randomAccessFile, boolean z10) throws SignatureNotFoundExceptionG, SecurityException, IOException {
        return e(randomAccessFile, com.prism.gaia.helper.utils.apk.b.f(randomAccessFile, f165066b), z10);
    }

    public static b g(String str) throws SignatureNotFoundExceptionG, SecurityException, IOException {
        return h(str, true);
    }

    public static b h(String str, boolean z10) throws Throwable {
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, CampaignEx.JSON_KEY_AD_R);
            try {
                b bVarE = e(randomAccessFile2, com.prism.gaia.helper.utils.apk.b.f(randomAccessFile2, f165066b), z10);
                randomAccessFile2.close();
                return bVarE;
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

    public static b i(ByteBuffer byteBuffer, List<X509Certificate> list, CertificateFactory certificateFactory) throws IOException {
        X509Certificate[] x509CertificateArr = (X509Certificate[]) list.toArray(new X509Certificate[list.size()]);
        a aVarJ = null;
        while (byteBuffer.hasRemaining()) {
            ByteBuffer byteBufferM = com.prism.gaia.helper.utils.apk.b.m(byteBuffer);
            if (byteBufferM.remaining() < 4) {
                throw new IOException("Remaining buffer too short to contain additional attribute ID. Remaining: " + byteBufferM.remaining());
            }
            if (byteBufferM.getInt() == 1000370060) {
                if (aVarJ != null) {
                    throw new SecurityException("Encountered multiple Proof-of-rotation records when verifying APK Signature Scheme v3 signature");
                }
                aVarJ = j(byteBufferM, certificateFactory);
                try {
                    if (aVarJ.f165068a.size() > 0) {
                        if (!Arrays.equals(aVarJ.f165068a.get(r1.size() - 1).getEncoded(), x509CertificateArr[0].getEncoded())) {
                            throw new SecurityException("Terminal certificate in Proof-of-rotation record does not match APK signing certificate");
                        }
                    } else {
                        continue;
                    }
                } catch (CertificateEncodingException e10) {
                    throw new SecurityException("Failed to encode certificate when comparing Proof-of-rotation record and signing certificate", e10);
                }
            }
        }
        return new b(x509CertificateArr, aVarJ);
    }

    public static a j(ByteBuffer byteBuffer, CertificateFactory certificateFactory) throws IOException, SecurityException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        try {
            byteBuffer.getInt();
            HashSet hashSet = new HashSet();
            int i11 = -1;
            VerbatimX509CertificateG verbatimX509CertificateG = null;
            while (byteBuffer.hasRemaining()) {
                i10++;
                ByteBuffer byteBufferM = com.prism.gaia.helper.utils.apk.b.m(byteBuffer);
                ByteBuffer byteBufferM2 = com.prism.gaia.helper.utils.apk.b.m(byteBufferM);
                int i12 = byteBufferM.getInt();
                int i13 = byteBufferM.getInt();
                byte[] bArrR = com.prism.gaia.helper.utils.apk.b.r(byteBufferM);
                if (verbatimX509CertificateG != null) {
                    Pair<String, ? extends AlgorithmParameterSpec> pairP = com.prism.gaia.helper.utils.apk.b.p(i11);
                    PublicKey publicKey = verbatimX509CertificateG.getPublicKey();
                    Signature signature = Signature.getInstance((String) pairP.first);
                    signature.initVerify(publicKey);
                    Object obj = pairP.second;
                    if (obj != null) {
                        signature.setParameter((AlgorithmParameterSpec) obj);
                    }
                    signature.update(byteBufferM2);
                    if (!signature.verify(bArrR)) {
                        throw new SecurityException("Unable to verify signature of certificate #" + i10 + " using " + ((String) pairP.first) + " when verifying Proof-of-rotation record");
                    }
                }
                byteBufferM2.rewind();
                byte[] bArrR2 = com.prism.gaia.helper.utils.apk.b.r(byteBufferM2);
                int i14 = byteBufferM2.getInt();
                if (verbatimX509CertificateG != null && i11 != i14) {
                    throw new SecurityException("Signing algorithm ID mismatch for certificate #" + i10 + " when verifying Proof-of-rotation record");
                }
                verbatimX509CertificateG = new VerbatimX509CertificateG((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrR2)), bArrR2);
                if (hashSet.contains(verbatimX509CertificateG)) {
                    throw new SecurityException("Encountered duplicate entries in Proof-of-rotation record at certificate #" + i10 + ".  All signing certificates should be unique");
                }
                hashSet.add(verbatimX509CertificateG);
                arrayList.add(verbatimX509CertificateG);
                arrayList2.add(Integer.valueOf(i12));
                i11 = i13;
            }
            return new a(arrayList, arrayList2);
        } catch (IOException | BufferUnderflowException e10) {
            throw new IOException("Failed to parse Proof-of-rotation record", e10);
        } catch (InvalidAlgorithmParameterException e11) {
            e = e11;
            throw new SecurityException(N0.a("Failed to verify signature over signed data for certificate #", 0, " when verifying Proof-of-rotation record"), e);
        } catch (InvalidKeyException e12) {
            e = e12;
            throw new SecurityException(N0.a("Failed to verify signature over signed data for certificate #", 0, " when verifying Proof-of-rotation record"), e);
        } catch (NoSuchAlgorithmException e13) {
            e = e13;
            throw new SecurityException(N0.a("Failed to verify signature over signed data for certificate #", 0, " when verifying Proof-of-rotation record"), e);
        } catch (SignatureException e14) {
            e = e14;
            throw new SecurityException(N0.a("Failed to verify signature over signed data for certificate #", 0, " when verifying Proof-of-rotation record"), e);
        } catch (CertificateException e15) {
            throw new SecurityException(N0.a("Failed to decode certificate #", 0, " when verifying Proof-of-rotation record"), e15);
        }
    }

    public static b k(ByteBuffer byteBuffer, Map<Integer, byte[]> map, CertificateFactory certificateFactory) throws PlatformNotSupportedException, IOException, SecurityException {
        ByteBuffer byteBufferM = com.prism.gaia.helper.utils.apk.b.m(byteBuffer);
        int i10 = byteBuffer.getInt();
        int i11 = byteBuffer.getInt();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < i10 || i12 > i11) {
            StringBuilder sbA = C1545m0.a("Signer not supported by this platform version. This platform: ", i12, ", signer minSdkVersion: ", i10, ", maxSdkVersion: ");
            sbA.append(i11);
            throw new PlatformNotSupportedException(sbA.toString());
        }
        ByteBuffer byteBufferM2 = com.prism.gaia.helper.utils.apk.b.m(byteBuffer);
        byte[] bArrR = com.prism.gaia.helper.utils.apk.b.r(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrR2 = null;
        byte[] bArrR3 = null;
        int i13 = -1;
        int i14 = 0;
        while (byteBufferM2.hasRemaining()) {
            i14++;
            try {
                ByteBuffer byteBufferM3 = com.prism.gaia.helper.utils.apk.b.m(byteBufferM2);
                if (byteBufferM3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i15 = byteBufferM3.getInt();
                arrayList.add(Integer.valueOf(i15));
                if (c(i15) && (i13 == -1 || com.prism.gaia.helper.utils.apk.b.c(i15, i13) > 0)) {
                    bArrR3 = com.prism.gaia.helper.utils.apk.b.r(byteBufferM3);
                    i13 = i15;
                }
            } catch (IOException e10) {
                e = e10;
                throw new SecurityException(android.support.v4.media.c.a("Failed to parse signature record #", i14), e);
            } catch (BufferUnderflowException e11) {
                e = e11;
                throw new SecurityException(android.support.v4.media.c.a("Failed to parse signature record #", i14), e);
            }
        }
        if (i13 == -1) {
            if (i14 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        String strO = com.prism.gaia.helper.utils.apk.b.o(i13);
        Pair<String, ? extends AlgorithmParameterSpec> pairP = com.prism.gaia.helper.utils.apk.b.p(i13);
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
            ByteBuffer byteBufferM4 = com.prism.gaia.helper.utils.apk.b.m(byteBufferM);
            ArrayList arrayList2 = new ArrayList();
            int i16 = 0;
            while (byteBufferM4.hasRemaining()) {
                i16++;
                try {
                    ByteBuffer byteBufferM5 = com.prism.gaia.helper.utils.apk.b.m(byteBufferM4);
                    if (byteBufferM5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i17 = byteBufferM5.getInt();
                    arrayList2.add(Integer.valueOf(i17));
                    if (i17 == i13) {
                        bArrR2 = com.prism.gaia.helper.utils.apk.b.r(byteBufferM5);
                    }
                } catch (IOException e12) {
                    e = e12;
                    throw new IOException(android.support.v4.media.c.a("Failed to parse digest record #", i16), e);
                } catch (BufferUnderflowException e13) {
                    e = e13;
                    throw new IOException(android.support.v4.media.c.a("Failed to parse digest record #", i16), e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iN = com.prism.gaia.helper.utils.apk.b.n(i13);
            byte[] bArrPut = map.put(Integer.valueOf(iN), bArrR2);
            if (bArrPut != null && !MessageDigest.isEqual(bArrPut, bArrR2)) {
                throw new SecurityException(com.prism.gaia.helper.utils.apk.b.j(iN).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferM6 = com.prism.gaia.helper.utils.apk.b.m(byteBufferM);
            ArrayList arrayList3 = new ArrayList();
            int i18 = 0;
            while (byteBufferM6.hasRemaining()) {
                i18++;
                byte[] bArrR4 = com.prism.gaia.helper.utils.apk.b.r(byteBufferM6);
                try {
                    arrayList3.add(new VerbatimX509CertificateG((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrR4)), bArrR4));
                } catch (CertificateException e14) {
                    throw new SecurityException(android.support.v4.media.c.a("Failed to decode certificate #", i18), e14);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (!Arrays.equals(bArrR, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                throw new SecurityException("Public key mismatch between certificate and signature record");
            }
            if (byteBufferM.getInt() != i10) {
                throw new SecurityException("minSdkVersion mismatch between signed and unsigned in v3 signer block.");
            }
            if (byteBufferM.getInt() == i11) {
                return i(com.prism.gaia.helper.utils.apk.b.m(byteBufferM), arrayList3, certificateFactory);
            }
            throw new SecurityException("maxSdkVersion mismatch between signed and unsigned in v3 signer block.");
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
