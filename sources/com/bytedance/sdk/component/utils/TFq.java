package com.bytedance.sdk.component.utils;

import androidx.compose.ui.graphics.vector.f;
import com.google.common.base.Ascii;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public class TFq {
    private static final char[] ZRu = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', f.f101687s, 'b', f.f101679k, 'd', 'e', 'f'};

    public static String ZRu(byte[] bArr) {
        if (bArr != null) {
            return ZRu(bArr, 0, bArr.length);
        }
        throw new NullPointerException("bytes is null");
    }

    public static String ZRu(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if (i10 >= 0 && i10 + i11 <= bArr.length) {
                int i12 = i11 * 2;
                char[] cArr = new char[i12];
                int i13 = 0;
                for (int i14 = 0; i14 < i11; i14++) {
                    byte b10 = bArr[i14 + i10];
                    int i15 = i13 + 1;
                    char[] cArr2 = ZRu;
                    cArr[i13] = cArr2[(b10 & 255) >> 4];
                    i13 += 2;
                    cArr[i15] = cArr2[b10 & Ascii.SI];
                }
                return new String(cArr, 0, i12);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("bytes is null");
    }

    public static String ZRu(File file) {
        FileInputStream fileInputStream;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            if (messageDigest == null) {
                return null;
            }
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i10 = fileInputStream.read(bArr, 0, 8192);
                    if (i10 <= 0) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i10);
                }
                String strZRu = ZRu(messageDigest.digest());
                try {
                    fileInputStream.close();
                } catch (Exception unused) {
                }
                return strZRu;
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
            fileInputStream = null;
        }
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (Exception unused4) {
            }
        }
        return null;
    }

    public static String ZRu(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(str.getBytes("UTF-8"));
                    return ZRu(messageDigest.digest());
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
