package com.prism.hider.vault.commons;

import android.annotation.TargetApi;
import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import androidx.annotation.NonNull;
import com.prism.commons.utils.l0;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* JADX INFO: renamed from: com.prism.hider.vault.commons.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C4269e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f168646a = l0.b(C4269e.class.getSimpleName());

    @TargetApi(23)
    public static Cipher a(Context context, @NonNull String str) {
        try {
            SecretKey secretKey = (SecretKey) b(context, str).getKey(str, null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKey);
            return cipher;
        } catch (Throwable th) {
            com.prism.commons.utils.I.h(f168646a, "initCipher failed: " + th.getMessage(), th);
            return null;
        }
    }

    @TargetApi(23)
    public static KeyStore b(Context context, String str) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        KeyGenParameterSpec.Builder encryptionPaddings = new KeyGenParameterSpec.Builder(str, 3).setBlockModes("CBC").setUserAuthenticationRequired(true).setKeySize(128).setEncryptionPaddings("PKCS7Padding");
        if (Build.VERSION.SDK_INT >= 24) {
            encryptionPaddings.setInvalidatedByBiometricEnrollment(true);
        }
        keyGenerator.init(encryptionPaddings.build());
        keyGenerator.generateKey();
        return keyStore;
    }

    public static boolean c(Context context) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        FingerprintManager fingerprintManager = (FingerprintManager) context.getSystemService(C7.a.f17596e);
        return fingerprintManager != null && keyguardManager != null && fingerprintManager.isHardwareDetected() && keyguardManager.isKeyguardSecure() && fingerprintManager.hasEnrolledFingerprints();
    }
}
