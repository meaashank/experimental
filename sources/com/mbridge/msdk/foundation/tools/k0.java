package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.HashMap;
import java.util.Map;
import kotlin.io.encoding.Base64;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes5.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<Character, Character> f156772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<Character, Character> f156773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static byte[] f156774c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, okio.h0.f225962a, 52, 53, 54, 55, 56, 57, 58, 59, 60, Base64.f217719k, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, Ascii.SO, Ascii.SI, 16, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -1, -1, -1, -1, -1, -1, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, t1.b.f239025q6, 43, 44, 45, 46, t1.b.f238921d6, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f156775d = {androidx.compose.ui.graphics.vector.f.f101688t, 'B', androidx.compose.ui.graphics.vector.f.f101680l, 'D', 'E', 'F', 'G', androidx.compose.ui.graphics.vector.f.f101676h, 'I', 'J', 'K', androidx.compose.ui.graphics.vector.f.f101674f, androidx.compose.ui.graphics.vector.f.f101672d, 'N', 'O', 'P', androidx.compose.ui.graphics.vector.f.f101684p, 'R', androidx.compose.ui.graphics.vector.f.f101682n, androidx.compose.ui.graphics.vector.f.f101686r, 'U', androidx.compose.ui.graphics.vector.f.f101678j, 'W', 'X', 'Y', androidx.compose.ui.graphics.vector.f.f101670b, androidx.compose.ui.graphics.vector.f.f101687s, 'b', androidx.compose.ui.graphics.vector.f.f101679k, 'd', 'e', 'f', 'g', androidx.compose.ui.graphics.vector.f.f101675g, 'i', 'j', 'k', androidx.compose.ui.graphics.vector.f.f101673e, androidx.compose.ui.graphics.vector.f.f101671c, 'n', 'o', 'p', androidx.compose.ui.graphics.vector.f.f101683o, 'r', androidx.compose.ui.graphics.vector.f.f101681m, androidx.compose.ui.graphics.vector.f.f101685q, 'u', androidx.compose.ui.graphics.vector.f.f101677i, 'w', 'x', 'y', androidx.compose.ui.graphics.vector.f.f101669a, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', SignatureVisitor.EXTENDS, '/'};

    static {
        HashMap map = new HashMap();
        f156772a = map;
        Character chValueOf = Character.valueOf(androidx.compose.ui.graphics.vector.f.f101677i);
        Character chValueOf2 = Character.valueOf(androidx.compose.ui.graphics.vector.f.f101688t);
        map.put(chValueOf, chValueOf2);
        Map<Character, Character> map2 = f156772a;
        Character chValueOf3 = Character.valueOf(androidx.compose.ui.graphics.vector.f.f101682n);
        map2.put(chValueOf3, 'B');
        Map<Character, Character> map3 = f156772a;
        Character chValueOf4 = Character.valueOf(androidx.compose.ui.graphics.vector.f.f101680l);
        map3.put('o', chValueOf4);
        Map<Character, Character> map4 = f156772a;
        Character chValueOf5 = Character.valueOf(androidx.compose.ui.graphics.vector.f.f101687s);
        map4.put(chValueOf5, 'D');
        f156772a.put('j', 'E');
        Map<Character, Character> map5 = f156772a;
        Character chValueOf6 = Character.valueOf(androidx.compose.ui.graphics.vector.f.f101679k);
        map5.put(chValueOf6, 'F');
        f156772a.put('7', 'G');
        f156772a.put('d', Character.valueOf(androidx.compose.ui.graphics.vector.f.f101676h));
        f156772a.put('R', 'I');
        f156772a.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101669a), 'J');
        f156772a.put('p', 'K');
        f156772a.put('W', Character.valueOf(androidx.compose.ui.graphics.vector.f.f101674f));
        f156772a.put('i', Character.valueOf(androidx.compose.ui.graphics.vector.f.f101672d));
        f156772a.put('f', 'N');
        f156772a.put('G', 'O');
        f156772a.put('y', 'P');
        f156772a.put('N', Character.valueOf(androidx.compose.ui.graphics.vector.f.f101684p));
        f156772a.put('x', 'R');
        f156772a.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101670b), chValueOf3);
        f156772a.put('n', Character.valueOf(androidx.compose.ui.graphics.vector.f.f101686r));
        f156772a.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101678j), 'U');
        f156772a.put('5', Character.valueOf(androidx.compose.ui.graphics.vector.f.f101678j));
        f156772a.put('k', 'W');
        f156772a.put(Character.valueOf(SignatureVisitor.EXTENDS), 'X');
        f156772a.put('D', 'Y');
        f156772a.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101676h), Character.valueOf(androidx.compose.ui.graphics.vector.f.f101670b));
        f156772a.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101674f), chValueOf5);
        f156772a.put('Y', 'b');
        f156772a.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101675g), chValueOf6);
        f156772a.put('J', 'd');
        f156772a.put('4', 'e');
        f156772a.put('6', 'f');
        f156772a.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101673e), 'g');
        f156772a.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101685q), Character.valueOf(androidx.compose.ui.graphics.vector.f.f101675g));
        f156772a.put('0', 'i');
        f156772a.put('U', 'j');
        f156772a.put('3', 'k');
        f156772a.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101684p), Character.valueOf(androidx.compose.ui.graphics.vector.f.f101673e));
        f156772a.put('r', Character.valueOf(androidx.compose.ui.graphics.vector.f.f101671c));
        f156772a.put('g', 'n');
        f156772a.put('E', 'o');
        f156772a.put('u', 'p');
        f156772a.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101683o), Character.valueOf(androidx.compose.ui.graphics.vector.f.f101683o));
        f156772a.put('8', 'r');
        f156772a.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101681m), Character.valueOf(androidx.compose.ui.graphics.vector.f.f101681m));
        f156772a.put('w', Character.valueOf(androidx.compose.ui.graphics.vector.f.f101685q));
        f156772a.put('/', 'u');
        f156772a.put('X', chValueOf);
        f156772a.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101672d), 'w');
        f156772a.put('e', 'x');
        f156772a.put('B', 'y');
        f156772a.put(chValueOf2, Character.valueOf(androidx.compose.ui.graphics.vector.f.f101669a));
        f156772a.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101686r), '0');
        f156772a.put('2', '1');
        f156772a.put('F', '2');
        f156772a.put('b', '3');
        f156772a.put('9', '4');
        f156772a.put('P', '5');
        f156772a.put('1', '6');
        f156772a.put('O', '7');
        f156772a.put('I', '8');
        f156772a.put('K', '9');
        f156772a.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101671c), Character.valueOf(SignatureVisitor.EXTENDS));
        f156772a.put(chValueOf4, '/');
        HashMap map6 = new HashMap();
        f156773b = map6;
        map6.put(chValueOf2, chValueOf);
        f156773b.put('B', chValueOf3);
        f156773b.put(chValueOf4, 'o');
        f156773b.put('D', chValueOf5);
        f156773b.put('E', 'j');
        f156773b.put('F', chValueOf6);
        f156773b.put('G', '7');
        f156773b.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101676h), 'd');
        f156773b.put('I', 'R');
        f156773b.put('J', Character.valueOf(androidx.compose.ui.graphics.vector.f.f101669a));
        f156773b.put('K', 'p');
        f156773b.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101674f), 'W');
        f156773b.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101672d), 'i');
        f156773b.put('N', 'f');
        f156773b.put('O', 'G');
        f156773b.put('P', 'y');
        f156773b.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101684p), 'N');
        f156773b.put('R', 'x');
        f156773b.put(chValueOf3, Character.valueOf(androidx.compose.ui.graphics.vector.f.f101670b));
        f156773b.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101686r), 'n');
        f156773b.put('U', Character.valueOf(androidx.compose.ui.graphics.vector.f.f101678j));
        f156773b.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101678j), '5');
        f156773b.put('W', 'k');
        f156773b.put('X', Character.valueOf(SignatureVisitor.EXTENDS));
        f156773b.put('Y', 'D');
        f156773b.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101670b), Character.valueOf(androidx.compose.ui.graphics.vector.f.f101676h));
        f156773b.put(chValueOf5, Character.valueOf(androidx.compose.ui.graphics.vector.f.f101674f));
        f156773b.put('b', 'Y');
        f156773b.put(chValueOf6, Character.valueOf(androidx.compose.ui.graphics.vector.f.f101675g));
        f156773b.put('d', 'J');
        f156773b.put('e', '4');
        f156773b.put('f', '6');
        f156773b.put('g', Character.valueOf(androidx.compose.ui.graphics.vector.f.f101673e));
        f156773b.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101675g), Character.valueOf(androidx.compose.ui.graphics.vector.f.f101685q));
        f156773b.put('i', '0');
        f156773b.put('j', 'U');
        f156773b.put('k', '3');
        f156773b.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101673e), Character.valueOf(androidx.compose.ui.graphics.vector.f.f101684p));
        f156773b.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101671c), 'r');
        f156773b.put('n', 'g');
        f156773b.put('o', 'E');
        f156773b.put('p', 'u');
        f156773b.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101683o), Character.valueOf(androidx.compose.ui.graphics.vector.f.f101683o));
        f156773b.put('r', '8');
        f156773b.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101681m), Character.valueOf(androidx.compose.ui.graphics.vector.f.f101681m));
        f156773b.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101685q), 'w');
        f156773b.put('u', '/');
        f156773b.put(chValueOf, 'X');
        f156773b.put('w', Character.valueOf(androidx.compose.ui.graphics.vector.f.f101672d));
        f156773b.put('x', 'e');
        f156773b.put('y', 'B');
        f156773b.put(Character.valueOf(androidx.compose.ui.graphics.vector.f.f101669a), chValueOf2);
        f156773b.put('0', Character.valueOf(androidx.compose.ui.graphics.vector.f.f101686r));
        f156773b.put('1', '2');
        f156773b.put('2', 'F');
        f156773b.put('3', 'b');
        f156773b.put('4', '9');
        f156773b.put('5', 'P');
        f156773b.put('6', '1');
        f156773b.put('7', 'O');
        f156773b.put('8', 'I');
        f156773b.put('9', 'K');
        f156773b.put(Character.valueOf(SignatureVisitor.EXTENDS), Character.valueOf(androidx.compose.ui.graphics.vector.f.f101671c));
        f156773b.put('/', chValueOf4);
    }

    public static String a(String str) {
        return r0.b(str);
    }

    public static String b(String str) {
        return TextUtils.isEmpty(str) ? "" : r0.c(str);
    }
}
