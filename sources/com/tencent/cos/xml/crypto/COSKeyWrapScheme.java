package com.tencent.cos.xml.crypto;

import java.security.Key;
import w.y;

/* JADX INFO: loaded from: classes7.dex */
class COSKeyWrapScheme {
    public static final String AESWrap = "AESWrap";
    public static final String RSA_ECB_OAEPWithSHA256AndMGF1Padding = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";

    public String getKeyWrapAlgorithm(Key key) {
        String algorithm = key.getAlgorithm();
        if ("AES".equals(algorithm)) {
            return AESWrap;
        }
        if ("RSA".equals(algorithm)) {
            return RSA_ECB_OAEPWithSHA256AndMGF1Padding;
        }
        throw new IllegalArgumentException(y.a("Unsupported key wrap algorithm ", algorithm));
    }

    public String toString() {
        return "COSKeyWrapScheme";
    }
}
