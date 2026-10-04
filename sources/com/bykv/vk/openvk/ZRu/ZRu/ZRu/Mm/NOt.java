package com.bykv.vk.openvk.ZRu.ZRu.ZRu.Mm;

import android.text.TextUtils;
import androidx.compose.ui.graphics.vector.f;
import com.google.common.base.Ascii;
import com.tonyodev.fetch2core.server.FileResponse;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
public class NOt {
    private static final MessageDigest ZRu = ZRu();
    private static final char[] NOt = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', f.f101688t, 'B', f.f101680l, 'D', 'E', 'F'};

    private NOt() {
    }

    private static MessageDigest ZRu() {
        try {
            return MessageDigest.getInstance(FileResponse.FIELD_MD5);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String ZRu(String str) {
        byte[] bArrDigest;
        MessageDigest messageDigest = ZRu;
        if (messageDigest == null || TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        synchronized (NOt.class) {
            bArrDigest = messageDigest.digest(bytes);
        }
        return ZRu(bArrDigest);
    }

    public static String ZRu(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[bArr.length << 1];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = NOt;
            cArr[i10] = cArr2[(b10 & 240) >> 4];
            i10 += 2;
            cArr[i11] = cArr2[b10 & Ascii.SI];
        }
        return new String(cArr);
    }
}
