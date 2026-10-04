package com.prism.commons.utils;

import com.google.common.base.Ascii;
import com.mbridge.msdk.MBridgeConstans;
import com.prism.commons.exception.BadStrEncodeException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.prism.commons.utils.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3843g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f162100d = "US-ASCII";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f162101e = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f162098b = "utf-8";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f162097a = Charset.forName(f162098b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f162099c = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final char[] f162102f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', androidx.compose.ui.graphics.vector.f.f101687s, 'b', androidx.compose.ui.graphics.vector.f.f101679k, 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = f162102f;
            cArr[i11 + 1] = cArr2[b10 & Ascii.SI];
            cArr[i11] = cArr2[((byte) (b10 >>> 4)) & Ascii.SI];
        }
        return new String(cArr);
    }

    public static int b(byte[] bArr, int i10, boolean z10) {
        int i11;
        int i12;
        if (z10) {
            i11 = ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8);
            i12 = bArr[i10 + 3] & 255;
        } else {
            i11 = (bArr[i10] & 255) + ((bArr[i10 + 1] & 255) << 8) + ((bArr[i10 + 2] & 255) << 16);
            i12 = (bArr[i10 + 3] & 255) << 24;
        }
        return i11 + i12;
    }

    public static String c(byte[] bArr) throws BadStrEncodeException {
        try {
            return new String(bArr, f162097a);
        } catch (RuntimeException e10) {
            throw new BadStrEncodeException("ByteTools.bytesToStr() fail: " + e10.getMessage(), e10);
        }
    }

    public static String d(byte[] bArr, Charset charset) throws BadStrEncodeException {
        try {
            return new String(bArr, charset);
        } catch (RuntimeException e10) {
            throw new BadStrEncodeException("ByteTools.bytesToStr() fail: " + e10.getMessage(), e10);
        }
    }

    public static byte[] e(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return bArr2;
    }

    public static byte f(char c10) {
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

    public static byte[] g(String str) {
        if (str == null || str.equals("")) {
            return new byte[0];
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            char cCharAt = str.charAt(i11);
            char cCharAt2 = str.charAt(i11 + 1);
            bArr[i10] = (byte) (f(cCharAt2) + (f(cCharAt) * 16));
        }
        return bArr;
    }

    public static byte[] h(InputStream inputStream, int i10, int i11) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[i10];
        int i12 = 0;
        while (true) {
            try {
                int i13 = inputStream.read(bArr);
                if (i13 == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i13);
                i12 += i13;
                if (i11 >= 0 && i12 > i11) {
                    return null;
                }
            } catch (IOException unused) {
                return null;
            } finally {
                C3858w.f(byteArrayOutputStream);
            }
        }
    }

    public static List<Integer> i(byte[] bArr, byte[] bArr2) {
        LinkedList linkedList = new LinkedList();
        for (int i10 = 0; i10 < (bArr.length - bArr2.length) + 1; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= bArr2.length) {
                    linkedList.add(Integer.valueOf(i10));
                    break;
                }
                if (bArr[i10 + i11] != bArr2[i11]) {
                    break;
                }
                i11++;
            }
        }
        return linkedList;
    }

    public static byte[] j(String str) throws BadStrEncodeException {
        try {
            return str.getBytes(f162097a);
        } catch (RuntimeException e10) {
            throw new BadStrEncodeException("ByteTools.strToBytes() fail: " + e10.getMessage(), e10);
        }
    }

    public static byte[] k(String str, Charset charset) throws BadStrEncodeException {
        try {
            return str.getBytes(charset);
        } catch (RuntimeException e10) {
            throw new BadStrEncodeException("ByteTools.strToBytes() fail: " + e10.getMessage(), e10);
        }
    }

    public static byte[] l(long j10, boolean z10) {
        byte[] bArr = new byte[4];
        if (z10) {
            bArr[0] = (byte) ((j10 >> 24) & 255);
            bArr[1] = (byte) ((j10 >> 16) & 255);
            bArr[2] = (byte) ((j10 >> 8) & 255);
            bArr[3] = (byte) (j10 & 255);
            return bArr;
        }
        bArr[0] = (byte) (j10 & 255);
        bArr[1] = (byte) ((j10 >> 8) & 255);
        bArr[2] = (byte) ((j10 >> 16) & 255);
        bArr[3] = (byte) ((j10 >> 24) & 255);
        return bArr;
    }

    public static String m(int i10, boolean z10) {
        String hexString = Integer.toHexString(i10 & 255);
        if (z10) {
            hexString = hexString.toUpperCase();
        }
        return hexString.length() == 1 ? MBridgeConstans.ENDCARD_URL_TYPE_PL.concat(hexString) : hexString;
    }

    public static String n(String str) {
        return str == null ? str : str.replaceAll("[^0123456789abcdefABCDEF]", "").toLowerCase();
    }
}
