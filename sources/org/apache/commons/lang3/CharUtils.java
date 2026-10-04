package org.apache.commons.lang3;

import p0.C5377a;

/* JADX INFO: loaded from: classes6.dex */
public class CharUtils {
    private static final String CHAR_STRING = "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007f";
    public static final char CR = '\r';
    public static final char LF = '\n';
    private static final String[] CHAR_STRING_ARRAY = new String[128];
    private static final Character[] CHAR_ARRAY = new Character[128];

    static {
        for (int i10 = 127; i10 >= 0; i10--) {
            CHAR_STRING_ARRAY[i10] = CHAR_STRING.substring(i10, i10 + 1);
            CHAR_ARRAY[i10] = new Character((char) i10);
        }
    }

    public static boolean isAscii(char c10) {
        return c10 < 128;
    }

    public static boolean isAsciiAlpha(char c10) {
        if (c10 < 'A' || c10 > 'Z') {
            return c10 >= 'a' && c10 <= 'z';
        }
        return true;
    }

    public static boolean isAsciiAlphaLower(char c10) {
        return c10 >= 'a' && c10 <= 'z';
    }

    public static boolean isAsciiAlphaUpper(char c10) {
        return c10 >= 'A' && c10 <= 'Z';
    }

    public static boolean isAsciiAlphanumeric(char c10) {
        if (c10 >= 'A' && c10 <= 'Z') {
            return true;
        }
        if (c10 < 'a' || c10 > 'z') {
            return c10 >= '0' && c10 <= '9';
        }
        return true;
    }

    public static boolean isAsciiControl(char c10) {
        return c10 < ' ' || c10 == 127;
    }

    public static boolean isAsciiNumeric(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    public static boolean isAsciiPrintable(char c10) {
        return c10 >= ' ' && c10 < 127;
    }

    public static char toChar(Character ch) {
        if (ch != null) {
            return ch.charValue();
        }
        throw new IllegalArgumentException("The Character must not be null");
    }

    public static Character toCharacterObject(char c10) {
        Character[] chArr = CHAR_ARRAY;
        return c10 < chArr.length ? chArr[c10] : new Character(c10);
    }

    public static int toIntValue(char c10) {
        if (isAsciiNumeric(c10)) {
            return c10 - '0';
        }
        throw new IllegalArgumentException("The character " + c10 + " is not in the range '0' - '9'");
    }

    public static String toString(char c10) {
        return c10 < 128 ? CHAR_STRING_ARRAY[c10] : new String(new char[]{c10});
    }

    public static String unicodeEscaped(char c10) {
        return c10 < 16 ? C5377a.a(c10, new StringBuilder("\\u000")) : c10 < 256 ? C5377a.a(c10, new StringBuilder("\\u00")) : c10 < 4096 ? C5377a.a(c10, new StringBuilder("\\u0")) : C5377a.a(c10, new StringBuilder("\\u"));
    }

    public static char toChar(Character ch, char c10) {
        return ch == null ? c10 : ch.charValue();
    }

    public static int toIntValue(char c10, int i10) {
        return !isAsciiNumeric(c10) ? i10 : c10 - '0';
    }

    public static String toString(Character ch) {
        if (ch == null) {
            return null;
        }
        return toString(ch.charValue());
    }

    public static char toChar(String str) {
        if (!StringUtils.isEmpty(str)) {
            return str.charAt(0);
        }
        throw new IllegalArgumentException("The String must not be empty");
    }

    public static Character toCharacterObject(String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        return toCharacterObject(str.charAt(0));
    }

    public static int toIntValue(Character ch) {
        if (ch != null) {
            return toIntValue(ch.charValue());
        }
        throw new IllegalArgumentException("The character must not be null");
    }

    public static int toIntValue(Character ch, int i10) {
        return ch == null ? i10 : toIntValue(ch.charValue(), i10);
    }

    public static char toChar(String str, char c10) {
        return StringUtils.isEmpty(str) ? c10 : str.charAt(0);
    }

    public static String unicodeEscaped(Character ch) {
        if (ch == null) {
            return null;
        }
        return unicodeEscaped(ch.charValue());
    }
}
