package com.inmobi.media;

import android.util.Base64;
import android.util.Log;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.text.C5013e;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes5.dex */
public abstract class H3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f152012a = 0;

    public static byte[] a(String str) {
        int i10;
        if (str != null) {
            int length = str.length() % 4;
            i10 = length + ((((length ^ 4) & ((-length) | length)) >> 31) & 4);
        } else {
            i10 = 0;
        }
        String strValueOf = String.valueOf(str != null ? kotlin.text.U.f9(str).toString() : null);
        for (int i11 = 0; i11 < i10; i11++) {
            strValueOf = strValueOf + SignatureVisitor.INSTANCEOF;
        }
        byte[] bytes = strValueOf.getBytes(C5013e.f218326b);
        kotlin.jvm.internal.G.o(bytes, "this as java.lang.String).getBytes(charset)");
        return Base64.decode(bytes, 2);
    }

    public static String a(String data, byte[] bArr) {
        byte[] bArrDoFinal;
        kotlin.jvm.internal.G.p(data, "data");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
            kotlin.jvm.internal.G.o(cipher, "getInstance(...)");
            cipher.init(1, secretKeySpec);
            byte[] bytes = data.getBytes(C5013e.f218326b);
            kotlin.jvm.internal.G.o(bytes, "this as java.lang.String).getBytes(charset)");
            bArrDoFinal = cipher.doFinal(bytes);
        } catch (Throwable th) {
            Log.d(O3.d.f65148f, "SDK encountered unexpected error in getting encrypted AES bytes; " + th.getMessage());
            bArrDoFinal = null;
        }
        byte[] bArrEncode = Base64.encode(bArrDoFinal, 2);
        kotlin.jvm.internal.G.o(bArrEncode, "encode(...)");
        return new String(bArrEncode, C5013e.f218326b);
    }
}
