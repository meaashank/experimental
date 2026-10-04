package com.prism.gaia.server.accounts;

import android.os.Bundle;
import android.os.Parcel;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.gaia.helper.utils.v;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f166464c = "Account";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f166465d = "cipher";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f166466e = "mac";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f166467f = "AES";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f166468g = "iv";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f166469h = "AES/CBC/PKCS5Padding";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f166470i = "HMACSHA256";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f166471j = 16;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static e f166472k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKey f166473a = KeyGenerator.getInstance("AES").generateKey();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SecretKey f166474b = KeyGenerator.getInstance(f166470i).generateKey();

    public static boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return bArr == bArr2;
        }
        if (bArr.length != bArr2.length) {
            return false;
        }
        boolean z10 = true;
        for (int i10 = 0; i10 < bArr2.length; i10++) {
            z10 &= bArr[i10] == bArr2[i10];
        }
        return z10;
    }

    public static synchronized e e() throws NoSuchAlgorithmException {
        try {
            if (f166472k == null) {
                f166472k = new e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f166472k;
    }

    @NonNull
    public final byte[] b(@NonNull byte[] bArr, @NonNull byte[] bArr2) throws GeneralSecurityException {
        Mac mac = Mac.getInstance(f166470i);
        mac.init(this.f166474b);
        mac.update(bArr);
        mac.update(bArr2);
        return mac.doFinal();
    }

    @Nullable
    public Bundle c(@NonNull Bundle bundle) throws GeneralSecurityException {
        v.s(bundle, "Cannot decrypt null bundle.");
        byte[] byteArray = bundle.getByteArray(f166468g);
        byte[] byteArray2 = bundle.getByteArray(f166465d);
        if (!f(byteArray2, byteArray, bundle.getByteArray(f166466e))) {
            return null;
        }
        IvParameterSpec ivParameterSpec = new IvParameterSpec(byteArray);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, this.f166473a, ivParameterSpec);
        byte[] bArrDoFinal = cipher.doFinal(byteArray2);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArrDoFinal, 0, bArrDoFinal.length);
        parcelObtain.setDataPosition(0);
        Bundle bundle2 = new Bundle();
        bundle2.readFromParcel(parcelObtain);
        parcelObtain.recycle();
        return bundle2;
    }

    @NonNull
    public Bundle d(@NonNull Bundle bundle) throws GeneralSecurityException {
        v.s(bundle, "Cannot encrypt null bundle.");
        Parcel parcelObtain = Parcel.obtain();
        bundle.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, this.f166473a);
        byte[] bArrDoFinal = cipher.doFinal(bArrMarshall);
        byte[] iv = cipher.getIV();
        byte[] bArrB = b(bArrDoFinal, iv);
        Bundle bundle2 = new Bundle();
        bundle2.putByteArray(f166465d, bArrDoFinal);
        bundle2.putByteArray(f166466e, bArrB);
        bundle2.putByteArray(f166468g, iv);
        return bundle2;
    }

    public final boolean f(@Nullable byte[] bArr, @Nullable byte[] bArr2, @Nullable byte[] bArr3) throws GeneralSecurityException {
        if (bArr == null || bArr.length == 0 || bArr3 == null || bArr3.length == 0) {
            return false;
        }
        return a(bArr3, b(bArr, bArr2));
    }
}
