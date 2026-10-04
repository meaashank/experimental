package tb;

import com.google.common.base.Ascii;
import com.prism.commons.utils.C3860y;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes7.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f239272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f239273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Calendar f239274c;

    static {
        Calendar calendar = Calendar.getInstance();
        f239274c = calendar;
        calendar.set(2010, 0, 1);
        f239272a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', androidx.compose.ui.graphics.vector.f.f101687s, 'b', androidx.compose.ui.graphics.vector.f.f101679k, 'd', 'e', 'f'};
        f239273b = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', androidx.compose.ui.graphics.vector.f.f101688t, 'B', androidx.compose.ui.graphics.vector.f.f101680l, 'D', 'E', 'F'};
    }

    public static byte[] a(String str) {
        return b(str.toCharArray());
    }

    public static byte[] b(char[] cArr) {
        int length = cArr.length;
        if ((length & 1) != 0) {
            throw new IllegalArgumentException("Odd number of characters.");
        }
        byte[] bArr = new byte[length >> 1];
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i10 + 1;
            int iL = (l(cArr[i10], i10) << 4) | l(cArr[i12], i12);
            i10 += 2;
            bArr[i11] = (byte) (iL & 255);
            i11++;
        }
        return bArr;
    }

    public static char[] c(byte[] bArr) {
        return d(bArr, true);
    }

    public static char[] d(byte[] bArr, boolean z10) {
        return e(bArr, z10 ? f239272a : f239273b);
    }

    public static char[] e(byte[] bArr, char[] cArr) {
        char[] cArr2 = new char[bArr.length << 1];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            cArr2[i10] = cArr[(b10 & 240) >>> 4];
            i10 += 2;
            cArr2[i11] = cArr[b10 & Ascii.SI];
        }
        return cArr2;
    }

    public static String f(byte[] bArr) {
        return new String(d(bArr, true));
    }

    public static String g(byte[] bArr, boolean z10) {
        return new String(d(bArr, z10));
    }

    public static long h(long j10) {
        return j10 > f239274c.getTime().getTime() ? j10 / 1000 : j10;
    }

    public static byte[] i(String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(yb.e.b(str2), "HmacSHA1");
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(secretKeySpec);
            return mac.doFinal(yb.e.b(str));
        } catch (InvalidKeyException e10) {
            e10.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public static long[] j(String str) {
        String[] strArrSplit = str.split(";");
        return new long[]{Long.parseLong(strArrSplit[0]), Long.parseLong(strArrSplit[1])};
    }

    public static byte[] k(String str) {
        try {
            return MessageDigest.getInstance(C3860y.f162169b).digest(yb.e.b(str));
        } catch (NoSuchAlgorithmException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int l(char c10, int i10) {
        int iDigit = Character.digit(c10, 16);
        if (iDigit != -1) {
            return iDigit;
        }
        throw new IllegalArgumentException("Illegal hexadecimal character " + c10 + " at index " + i10);
    }
}
