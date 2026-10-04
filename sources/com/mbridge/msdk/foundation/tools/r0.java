package com.mbridge.msdk.foundation.tools;

import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes5.dex */
public class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f156825a = {androidx.compose.ui.graphics.vector.f.f101688t, 'B', androidx.compose.ui.graphics.vector.f.f101680l, 'D', 'E', 'F', 'G', androidx.compose.ui.graphics.vector.f.f101676h, 'I', 'J', 'K', androidx.compose.ui.graphics.vector.f.f101674f, androidx.compose.ui.graphics.vector.f.f101672d, 'N', 'O', 'P', androidx.compose.ui.graphics.vector.f.f101684p, 'R', androidx.compose.ui.graphics.vector.f.f101682n, androidx.compose.ui.graphics.vector.f.f101686r, 'U', androidx.compose.ui.graphics.vector.f.f101678j, 'W', 'X', 'Y', androidx.compose.ui.graphics.vector.f.f101670b, androidx.compose.ui.graphics.vector.f.f101687s, 'b', androidx.compose.ui.graphics.vector.f.f101679k, 'd', 'e', 'f', 'g', androidx.compose.ui.graphics.vector.f.f101675g, 'i', 'j', 'k', androidx.compose.ui.graphics.vector.f.f101673e, androidx.compose.ui.graphics.vector.f.f101671c, 'n', 'o', 'p', androidx.compose.ui.graphics.vector.f.f101683o, 'r', androidx.compose.ui.graphics.vector.f.f101681m, androidx.compose.ui.graphics.vector.f.f101685q, 'u', androidx.compose.ui.graphics.vector.f.f101677i, 'w', 'x', 'y', androidx.compose.ui.graphics.vector.f.f101669a, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', SignatureVisitor.EXTENDS, '/'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f156826b = new byte[128];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<Character, Character> f156827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f156828d;

    static {
        HashMap map = new HashMap();
        f156827c = map;
        Character chValueOf = Character.valueOf(androidx.compose.ui.graphics.vector.f.f101688t);
        Character chValueOf2 = Character.valueOf(androidx.compose.ui.graphics.vector.f.f101677i);
        map.put(chValueOf, chValueOf2);
        Map<Character, Character> map2 = f156827c;
        Character chValueOf3 = Character.valueOf(androidx.compose.ui.graphics.vector.f.f101682n);
        map2.put('B', chValueOf3);
        Map<Character, Character> map3 = f156827c;
        Character chValueOf4 = Character.valueOf(androidx.compose.ui.graphics.vector.f.f101680l);
        map3.put(chValueOf4, 'o');
        Map<Character, Character> map4 = f156827c;
        Character chValueOf5 = Character.valueOf(androidx.compose.ui.graphics.vector.f.f101687s);
        map4.put('D', chValueOf5);
        f156827c.put('E', 'j');
        Map<Character, Character> map5 = f156827c;
        Character chValueOf6 = Character.valueOf(androidx.compose.ui.graphics.vector.f.f101679k);
        map5.put('F', chValueOf6);
        f156827c.put('G', '7');
        Map<Character, Character> map6 = f156827c;
        Character chValueOf7 = Character.valueOf(androidx.compose.ui.graphics.vector.f.f101676h);
        map6.put(chValueOf7, 'd');
        f156827c.put('I', 'R');
        f156827c.put('J', Character.valueOf(androidx.compose.ui.graphics.vector.f.f101669a));
        f156827c.put('K', 'p');
        f156827c.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101674f), 'W');
        f156827c.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101672d), 'i');
        f156827c.put('N', 'f');
        f156827c.put('O', 'G');
        f156827c.put('P', 'y');
        f156827c.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101684p), 'N');
        f156827c.put('R', 'x');
        f156827c.put(chValueOf3, Character.valueOf(androidx.compose.ui.graphics.vector.f.f101670b));
        f156827c.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101686r), 'n');
        f156827c.put('U', Character.valueOf(androidx.compose.ui.graphics.vector.f.f101678j));
        f156827c.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101678j), '5');
        f156827c.put('W', 'k');
        f156827c.put('X', Character.valueOf(SignatureVisitor.EXTENDS));
        f156827c.put('Y', 'D');
        f156827c.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101670b), chValueOf7);
        f156827c.put(chValueOf5, Character.valueOf(androidx.compose.ui.graphics.vector.f.f101674f));
        f156827c.put('b', 'Y');
        f156827c.put(chValueOf6, Character.valueOf(androidx.compose.ui.graphics.vector.f.f101675g));
        f156827c.put('d', 'J');
        f156827c.put('e', '4');
        f156827c.put('f', '6');
        f156827c.put('g', Character.valueOf(androidx.compose.ui.graphics.vector.f.f101673e));
        f156827c.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101675g), Character.valueOf(androidx.compose.ui.graphics.vector.f.f101685q));
        f156827c.put('i', '0');
        f156827c.put('j', 'U');
        f156827c.put('k', '3');
        f156827c.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101673e), Character.valueOf(androidx.compose.ui.graphics.vector.f.f101684p));
        f156827c.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101671c), 'r');
        f156827c.put('n', 'g');
        f156827c.put('o', 'E');
        f156827c.put('p', 'u');
        f156827c.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101683o), Character.valueOf(androidx.compose.ui.graphics.vector.f.f101683o));
        f156827c.put('r', '8');
        f156827c.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101681m), Character.valueOf(androidx.compose.ui.graphics.vector.f.f101681m));
        f156827c.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101685q), 'w');
        f156827c.put('u', '/');
        f156827c.put(chValueOf2, 'X');
        f156827c.put('w', Character.valueOf(androidx.compose.ui.graphics.vector.f.f101672d));
        f156827c.put('x', 'e');
        f156827c.put('y', 'B');
        f156827c.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101669a), chValueOf);
        f156827c.put('0', Character.valueOf(androidx.compose.ui.graphics.vector.f.f101686r));
        f156827c.put('1', '2');
        f156827c.put('2', 'F');
        f156827c.put('3', 'b');
        f156827c.put('4', '9');
        f156827c.put('5', 'P');
        f156827c.put('6', '1');
        f156827c.put('7', 'O');
        f156827c.put('8', 'I');
        f156827c.put('9', 'K');
        f156827c.put(Character.valueOf(SignatureVisitor.EXTENDS), Character.valueOf(androidx.compose.ui.graphics.vector.f.f101671c));
        f156827c.put('/', chValueOf4);
        f156828d = new char[64];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            char[] cArr = f156825a;
            if (i11 >= cArr.length) {
                break;
            }
            f156828d[i11] = f156827c.get(Character.valueOf(cArr[i11])).charValue();
            i11++;
        }
        int i12 = 0;
        while (true) {
            byte[] bArr = f156826b;
            if (i12 >= bArr.length) {
                break;
            }
            bArr[i12] = 127;
            i12++;
        }
        while (true) {
            char[] cArr2 = f156828d;
            if (i10 >= cArr2.length) {
                return;
            }
            f156826b[cArr2[i10]] = (byte) i10;
            i10++;
        }
    }

    private static int a(char[] cArr, byte[] bArr, int i10) {
        try {
            char c10 = cArr[3];
            char c11 = c10 == '=' ? (char) 2 : (char) 3;
            char c12 = cArr[2];
            if (c12 == '=') {
                c11 = 1;
            }
            byte[] bArr2 = f156826b;
            byte b10 = bArr2[cArr[0]];
            byte b11 = bArr2[cArr[1]];
            byte b12 = bArr2[c12];
            byte b13 = bArr2[c10];
            if (c11 == 1) {
                bArr[i10] = (byte) (((b11 >> 4) & 3) | ((b10 << 2) & 252));
                return 1;
            }
            if (c11 == 2) {
                bArr[i10] = (byte) ((3 & (b11 >> 4)) | ((b10 << 2) & 252));
                bArr[i10 + 1] = (byte) (((b11 << 4) & 240) | ((b12 >> 2) & 15));
                return 2;
            }
            if (c11 != 3) {
                throw new RuntimeException("Internal Error");
            }
            bArr[i10] = (byte) (((b10 << 2) & 252) | ((b11 >> 4) & 3));
            bArr[i10 + 1] = (byte) (((b11 << 4) & 240) | ((b12 >> 2) & 15));
            bArr[i10 + 2] = (byte) (((b12 << 6) & 192) | (b13 & okio.h0.f225962a));
            return 3;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String b(String str) {
        byte[] bArrA = a(str);
        if (bArrA == null || bArrA.length <= 0) {
            return null;
        }
        return new String(bArrA);
    }

    public static String c(String str) {
        return a(str.getBytes());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:2:0x0000, B:5:0x0009, B:7:0x0019, B:9:0x001d, B:13:0x002c, B:15:0x0032, B:17:0x0037, B:23:0x004c, B:19:0x003d, B:21:0x0044, B:10:0x0023, B:27:0x0055), top: B:31:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] a(java.lang.String r13) {
        /*
            int r0 = r13.length()     // Catch: java.lang.Exception -> L5b
            r1 = 259(0x103, float:3.63E-43)
            if (r0 >= r1) goto L9
            r1 = r0
        L9:
            char[] r1 = new char[r1]     // Catch: java.lang.Exception -> L5b
            int r2 = r0 >> 2
            int r2 = r2 * 3
            int r2 = r2 + 3
            byte[] r3 = new byte[r2]     // Catch: java.lang.Exception -> L5b
            r4 = 0
            r5 = r4
            r6 = r5
            r7 = r6
        L17:
            if (r5 >= r0) goto L52
            int r8 = r5 + 256
            if (r8 > r0) goto L23
            r13.getChars(r5, r8, r1, r7)     // Catch: java.lang.Exception -> L5b
            int r5 = r7 + 256
            goto L29
        L23:
            r13.getChars(r5, r0, r1, r7)     // Catch: java.lang.Exception -> L5b
            int r5 = r0 - r5
            int r5 = r5 + r7
        L29:
            r9 = r7
        L2a:
            if (r7 >= r5) goto L4f
            char r10 = r1[r7]     // Catch: java.lang.Exception -> L5b
            r11 = 61
            if (r10 == r11) goto L3d
            byte[] r11 = com.mbridge.msdk.foundation.tools.r0.f156826b     // Catch: java.lang.Exception -> L5b
            int r12 = r11.length     // Catch: java.lang.Exception -> L5b
            if (r10 >= r12) goto L4c
            r11 = r11[r10]     // Catch: java.lang.Exception -> L5b
            r12 = 127(0x7f, float:1.78E-43)
            if (r11 == r12) goto L4c
        L3d:
            int r11 = r9 + 1
            r1[r9] = r10     // Catch: java.lang.Exception -> L5b
            r9 = 4
            if (r11 != r9) goto L4b
            int r9 = a(r1, r3, r6)     // Catch: java.lang.Exception -> L5b
            int r6 = r6 + r9
            r9 = r4
            goto L4c
        L4b:
            r9 = r11
        L4c:
            int r7 = r7 + 1
            goto L2a
        L4f:
            r5 = r8
            r7 = r9
            goto L17
        L52:
            if (r6 != r2) goto L55
            return r3
        L55:
            byte[] r13 = new byte[r6]     // Catch: java.lang.Exception -> L5b
            java.lang.System.arraycopy(r3, r4, r13, r4, r6)     // Catch: java.lang.Exception -> L5b
            return r13
        L5b:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.r0.a(java.lang.String):byte[]");
    }

    public static String a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static String a(byte[] bArr, int i10, int i11) {
        if (i11 <= 0) {
            return "";
        }
        try {
            char[] cArr = new char[((i11 / 3) << 2) + 4];
            int i12 = 0;
            while (i11 >= 3) {
                int i13 = ((bArr[i10] & 255) << 16) + ((bArr[i10 + 1] & 255) << 8) + (bArr[i10 + 2] & 255);
                char[] cArr2 = f156828d;
                cArr[i12] = cArr2[i13 >> 18];
                cArr[i12 + 1] = cArr2[(i13 >> 12) & 63];
                int i14 = i12 + 3;
                cArr[i12 + 2] = cArr2[(i13 >> 6) & 63];
                i12 += 4;
                cArr[i14] = cArr2[i13 & 63];
                i10 += 3;
                i11 -= 3;
            }
            if (i11 == 1) {
                int i15 = bArr[i10] & 255;
                char[] cArr3 = f156828d;
                cArr[i12] = cArr3[i15 >> 2];
                cArr[i12 + 1] = cArr3[(i15 << 4) & 63];
                int i16 = i12 + 3;
                cArr[i12 + 2] = SignatureVisitor.INSTANCEOF;
                i12 += 4;
                cArr[i16] = SignatureVisitor.INSTANCEOF;
            } else if (i11 == 2) {
                int i17 = ((bArr[i10] & 255) << 8) + (bArr[i10 + 1] & 255);
                char[] cArr4 = f156828d;
                cArr[i12] = cArr4[i17 >> 10];
                cArr[i12 + 1] = cArr4[(i17 >> 4) & 63];
                int i18 = i12 + 3;
                cArr[i12 + 2] = cArr4[(i17 << 2) & 63];
                i12 += 4;
                cArr[i18] = SignatureVisitor.INSTANCEOF;
            }
            return new String(cArr, 0, i12);
        } catch (Exception unused) {
            return null;
        }
    }
}
