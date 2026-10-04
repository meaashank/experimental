package com.tencent.cos.xml.crypto;

import com.tencent.cos.xml.exception.CosXmlClientException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.NullCipher;
import javax.crypto.SecretKey;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes7.dex */
public class CipherLite {
    static final CipherLite Null = new CipherLite() { // from class: com.tencent.cos.xml.crypto.CipherLite.1
        @Override // com.tencent.cos.xml.crypto.CipherLite
        public CipherLite createAuxiliary(long j10) {
            return this;
        }

        @Override // com.tencent.cos.xml.crypto.CipherLite
        public CipherLite createInverse() {
            return this;
        }
    };
    private final Cipher cipher;
    private final int cipherMode;
    private final ContentCryptoScheme scheme;
    private final SecretKey secreteKey;

    public CipherLite createAuxiliary(long j10) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
        return this.scheme.createAuxillaryCipher(this.secreteKey, this.cipher.getIV(), this.cipherMode, this.cipher.getProvider(), j10);
    }

    public CipherLite createInverse() throws CosXmlClientException {
        int i10 = this.cipherMode;
        int i11 = 1;
        if (i10 != 2) {
            if (i10 != 1) {
                throw new UnsupportedOperationException();
            }
            i11 = 2;
        }
        return this.scheme.createCipherLite(this.secreteKey, this.cipher.getIV(), i11, this.cipher.getProvider());
    }

    public CipherLite createUsingIV(byte[] bArr) throws CosXmlClientException {
        return this.scheme.createCipherLite(this.secreteKey, bArr, this.cipherMode, this.cipher.getProvider());
    }

    public byte[] doFinal() throws BadPaddingException, IllegalBlockSizeException {
        return this.cipher.doFinal();
    }

    public final int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    public final Cipher getCipher() {
        return this.cipher;
    }

    public final String getCipherAlgorithm() {
        return this.cipher.getAlgorithm();
    }

    public final int getCipherMode() {
        return this.cipherMode;
    }

    public final Provider getCipherProvider() {
        return this.cipher.getProvider();
    }

    public final ContentCryptoScheme getContentCryptoScheme() {
        return this.scheme;
    }

    public final byte[] getIV() {
        return this.cipher.getIV();
    }

    public int getOutputSize(int i10) {
        return this.cipher.getOutputSize(i10);
    }

    public final String getSecretKeyAlgorithm() {
        return this.secreteKey.getAlgorithm();
    }

    public long mark() {
        return -1L;
    }

    public boolean markSupported() {
        return false;
    }

    public CipherLite recreate() throws CosXmlClientException {
        return this.scheme.createCipherLite(this.secreteKey, this.cipher.getIV(), this.cipherMode, this.cipher.getProvider());
    }

    public void reset() {
        throw new IllegalStateException("mark/reset not supported");
    }

    public byte[] update(byte[] bArr, int i10, int i11) {
        return this.cipher.update(bArr, i10, i11);
    }

    private CipherLite() {
        this.cipher = new NullCipher();
        this.scheme = null;
        this.secreteKey = null;
        this.cipherMode = -1;
    }

    public byte[] doFinal(byte[] bArr) throws BadPaddingException, IllegalBlockSizeException {
        return this.cipher.doFinal(bArr);
    }

    public byte[] doFinal(byte[] bArr, int i10, int i11) throws BadPaddingException, IllegalBlockSizeException {
        return this.cipher.doFinal(bArr, i10, i11);
    }

    public CipherLite(Cipher cipher, ContentCryptoScheme contentCryptoScheme, SecretKey secretKey, int i10) {
        this.cipher = cipher;
        this.scheme = contentCryptoScheme;
        this.secreteKey = secretKey;
        this.cipherMode = i10;
    }
}
