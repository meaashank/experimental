package ia;

import androidx.compose.ui.graphics.vector.f;
import com.google.common.base.Ascii;

/* JADX INFO: renamed from: ia.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C4599a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f202916a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', f.f101687s, 'b', f.f101679k, 'd', 'e', 'f'};

    public static byte[] a(String str) {
        if (str == null || str.equals("")) {
            return new byte[0];
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            char cCharAt = str.charAt(i11);
            char cCharAt2 = str.charAt(i11 + 1);
            bArr[i10] = (byte) (c(cCharAt2) + (c(cCharAt) * 16));
        }
        return bArr;
    }

    public static String b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = f202916a;
            cArr[i11 + 1] = cArr2[b10 & Ascii.SI];
            cArr[i11] = cArr2[((byte) (b10 >>> 4)) & Ascii.SI];
        }
        return new String(cArr);
    }

    public static byte c(char c10) {
        int i10;
        if (c10 >= '0' && c10 <= '9') {
            i10 = c10 - '0';
        } else if (c10 >= 'a' && c10 <= 'f') {
            i10 = c10 - 'W';
        } else {
            if (c10 < 'A' || c10 > 'F') {
                return (byte) 0;
            }
            i10 = c10 - '7';
        }
        return (byte) i10;
    }

    public static byte[] d(String str, String str2) {
        try {
            return str.getBytes(str2);
        } catch (Exception unused) {
            return new byte[0];
        }
    }
}
