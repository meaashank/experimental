package org.apache.commons.lang3;

import C4.q;
import androidx.compose.foundation.text.C1758e;
import com.bytedance.sdk.component.utils.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class StringUtils {
    public static final String EMPTY = "";
    public static final int INDEX_NOT_FOUND = -1;
    private static final int PAD_LIMIT = 8192;
    private static final Pattern WHITESPACE_BLOCK = Pattern.compile("\\s+");
    private static boolean java6Available;
    private static Method java6NormalizeMethod;
    private static Object java6NormalizerFormNFD;
    private static final Pattern java6Pattern;
    private static boolean sunAvailable;
    private static Method sunDecomposeMethod;
    private static final Pattern sunPattern;

    static {
        sunAvailable = false;
        sunDecomposeMethod = null;
        Pattern patternCompile = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        sunPattern = patternCompile;
        java6Available = false;
        java6NormalizeMethod = null;
        java6NormalizerFormNFD = null;
        java6Pattern = patternCompile;
        try {
            Class<?> clsLoadClass = Thread.currentThread().getContextClassLoader().loadClass("java.text.Normalizer$Form");
            java6NormalizerFormNFD = clsLoadClass.getField("NFD").get(null);
            java6NormalizeMethod = Thread.currentThread().getContextClassLoader().loadClass("java.text.Normalizer").getMethod("normalize", CharSequence.class, clsLoadClass);
            java6Available = true;
        } catch (ClassNotFoundException unused) {
            java6Available = false;
        } catch (IllegalAccessException unused2) {
            java6Available = false;
        } catch (NoSuchFieldException unused3) {
            java6Available = false;
        } catch (NoSuchMethodException unused4) {
            java6Available = false;
        }
        try {
            sunDecomposeMethod = Thread.currentThread().getContextClassLoader().loadClass("sun.text.Normalizer").getMethod("decompose", String.class, Boolean.TYPE, Integer.TYPE);
            sunAvailable = true;
        } catch (ClassNotFoundException unused5) {
            sunAvailable = false;
        } catch (NoSuchMethodException unused6) {
            sunAvailable = false;
        }
    }

    public static String abbreviate(String str, int i10) {
        return abbreviate(str, 0, i10);
    }

    public static String abbreviateMiddle(String str, String str2, int i10) {
        if (isEmpty(str) || isEmpty(str2) || i10 >= str.length() || i10 < str2.length() + 2) {
            return str;
        }
        int length = i10 - str2.length();
        int i11 = length / 2;
        int i12 = (length % 2) + i11;
        int length2 = str.length() - i11;
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(str.substring(0, i12));
        sb2.append(str2);
        sb2.append(str.substring(length2));
        return sb2.toString();
    }

    public static String capitalize(String str) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(Character.toTitleCase(str.charAt(0)));
        sb2.append(str.substring(1));
        return sb2.toString();
    }

    public static String center(String str, int i10) {
        return center(str, i10, ' ');
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String chomp(java.lang.String r6) {
        /*
            boolean r0 = isEmpty(r6)
            if (r0 == 0) goto L7
            return r6
        L7:
            int r0 = r6.length()
            r1 = 10
            r2 = 0
            r3 = 1
            r4 = 13
            if (r0 != r3) goto L20
            char r0 = r6.charAt(r2)
            if (r0 == r4) goto L1d
            if (r0 != r1) goto L1c
            goto L1d
        L1c:
            return r6
        L1d:
            java.lang.String r6 = ""
            return r6
        L20:
            int r0 = r6.length()
            int r3 = r0 + (-1)
            char r5 = r6.charAt(r3)
            if (r5 != r1) goto L37
            int r1 = r0 + (-2)
            char r1 = r6.charAt(r1)
            if (r1 != r4) goto L3a
            int r0 = r0 + (-2)
            goto L3b
        L37:
            if (r5 == r4) goto L3a
            goto L3b
        L3a:
            r0 = r3
        L3b:
            java.lang.String r6 = r6.substring(r2, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.StringUtils.chomp(java.lang.String):java.lang.String");
    }

    public static String chop(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length < 2) {
            return "";
        }
        int i10 = length - 1;
        String strSubstring = str.substring(0, i10);
        if (str.charAt(i10) == '\n') {
            int i11 = length - 2;
            if (strSubstring.charAt(i11) == '\r') {
                return strSubstring.substring(0, i11);
            }
        }
        return strSubstring;
    }

    public static boolean contains(CharSequence charSequence, int i10) {
        return !isEmpty(charSequence) && CharSequenceUtils.indexOf(charSequence, i10, 0) >= 0;
    }

    public static boolean containsAny(CharSequence charSequence, char... cArr) {
        if (!isEmpty(charSequence) && !ArrayUtils.isEmpty(cArr)) {
            int length = charSequence.length();
            int length2 = cArr.length;
            int i10 = length - 1;
            int i11 = length2 - 1;
            for (int i12 = 0; i12 < length; i12++) {
                char cCharAt = charSequence.charAt(i12);
                for (int i13 = 0; i13 < length2; i13++) {
                    if (cArr[i13] == cCharAt) {
                        if (!Character.isHighSurrogate(cCharAt) || i13 == i11) {
                            return true;
                        }
                        if (i12 < i10 && cArr[i13 + 1] == charSequence.charAt(i12 + 1)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean containsIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null && charSequence2 != null) {
            int length = charSequence2.length();
            int length2 = charSequence.length() - length;
            int i10 = 0;
            while (i10 <= length2) {
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                if (CharSequenceUtils.regionMatches(charSequence3, true, i10, charSequence4, 0, length)) {
                    return true;
                }
                i10++;
                charSequence = charSequence3;
                charSequence2 = charSequence4;
            }
        }
        return false;
    }

    public static boolean containsNone(CharSequence charSequence, char... cArr) {
        if (charSequence != null && cArr != null) {
            int length = charSequence.length();
            int i10 = length - 1;
            int length2 = cArr.length;
            int i11 = length2 - 1;
            for (int i12 = 0; i12 < length; i12++) {
                char cCharAt = charSequence.charAt(i12);
                for (int i13 = 0; i13 < length2; i13++) {
                    if (cArr[i13] == cCharAt) {
                        if (!Character.isHighSurrogate(cCharAt) || i13 == i11) {
                            return false;
                        }
                        if (i12 < i10 && cArr[i13 + 1] == charSequence.charAt(i12 + 1)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean containsOnly(CharSequence charSequence, char... cArr) {
        if (cArr != null && charSequence != null) {
            if (charSequence.length() == 0) {
                return true;
            }
            if (cArr.length != 0 && indexOfAnyBut(charSequence, cArr) == -1) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsWhitespace(CharSequence charSequence) {
        if (isEmpty(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (Character.isWhitespace(charSequence.charAt(i10))) {
                return true;
            }
        }
        return false;
    }

    public static int countMatches(CharSequence charSequence, CharSequence charSequence2) {
        int length = 0;
        if (isEmpty(charSequence) || isEmpty(charSequence2)) {
            return 0;
        }
        int i10 = 0;
        while (true) {
            int iIndexOf = CharSequenceUtils.indexOf(charSequence, charSequence2, length);
            if (iIndexOf == -1) {
                return i10;
            }
            i10++;
            length = iIndexOf + charSequence2.length();
        }
    }

    public static <T extends CharSequence> T defaultIfBlank(T t10, T t11) {
        return isBlank(t10) ? t11 : t10;
    }

    public static <T extends CharSequence> T defaultIfEmpty(T t10, T t11) {
        return isEmpty(t10) ? t11 : t10;
    }

    public static String defaultString(String str, String str2) {
        return str == null ? str2 : str;
    }

    public static String deleteWhitespace(String str) {
        if (isEmpty(str)) {
            return str;
        }
        int length = str.length();
        char[] cArr = new char[length];
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (!Character.isWhitespace(str.charAt(i11))) {
                cArr[i10] = str.charAt(i11);
                i10++;
            }
        }
        return i10 == length ? str : new String(cArr, 0, i10);
    }

    public static String difference(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        int iIndexOfDifference = indexOfDifference(str, str2);
        return iIndexOfDifference == -1 ? "" : str2.substring(iIndexOfDifference);
    }

    public static boolean endsWith(CharSequence charSequence, CharSequence charSequence2) {
        return endsWith(charSequence, charSequence2, false);
    }

    public static boolean endsWithAny(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (!isEmpty(charSequence) && !ArrayUtils.isEmpty(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (endsWith(charSequence, charSequence2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean endsWithIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        return endsWith(charSequence, charSequence2, true);
    }

    public static boolean equals(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == null ? charSequence2 == null : charSequence.equals(charSequence2);
    }

    public static boolean equalsIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        return (charSequence == null || charSequence2 == null) ? charSequence == charSequence2 : CharSequenceUtils.regionMatches(charSequence, true, 0, charSequence2, 0, Math.max(charSequence.length(), charSequence2.length()));
    }

    public static String getCommonPrefix(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        int iIndexOfDifference = indexOfDifference(strArr);
        if (iIndexOfDifference != -1) {
            return iIndexOfDifference == 0 ? "" : strArr[0].substring(0, iIndexOfDifference);
        }
        String str = strArr[0];
        return str == null ? "" : str;
    }

    public static int getLevenshteinDistance(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("Strings must not be null");
        }
        int length = charSequence.length();
        int length2 = charSequence2.length();
        if (length == 0) {
            return length2;
        }
        if (length2 == 0) {
            return length;
        }
        if (length > length2) {
            length2 = charSequence.length();
            length = length2;
        } else {
            charSequence2 = charSequence;
            charSequence = charSequence2;
        }
        int i10 = length + 1;
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        for (int i11 = 0; i11 <= length; i11++) {
            iArr[i11] = i11;
        }
        int i12 = 1;
        while (i12 <= length2) {
            char cCharAt = charSequence.charAt(i12 - 1);
            iArr2[0] = i12;
            for (int i13 = 1; i13 <= length; i13++) {
                int i14 = i13 - 1;
                iArr2[i13] = Math.min(Math.min(iArr2[i14] + 1, iArr[i13] + 1), iArr[i14] + (charSequence2.charAt(i14) == cCharAt ? 0 : 1));
            }
            i12++;
            int[] iArr3 = iArr;
            iArr = iArr2;
            iArr2 = iArr3;
        }
        return iArr[length];
    }

    public static int indexOf(CharSequence charSequence, int i10) {
        if (isEmpty(charSequence)) {
            return -1;
        }
        return CharSequenceUtils.indexOf(charSequence, i10, 0);
    }

    public static int indexOfAny(CharSequence charSequence, char... cArr) {
        if (!isEmpty(charSequence) && !ArrayUtils.isEmpty(cArr)) {
            int length = charSequence.length();
            int i10 = length - 1;
            int length2 = cArr.length;
            int i11 = length2 - 1;
            for (int i12 = 0; i12 < length; i12++) {
                char cCharAt = charSequence.charAt(i12);
                for (int i13 = 0; i13 < length2; i13++) {
                    if (cArr[i13] == cCharAt && (i12 >= i10 || i13 >= i11 || !Character.isHighSurrogate(cCharAt) || cArr[i13 + 1] == charSequence.charAt(i12 + 1))) {
                        return i12;
                    }
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        r6 = r6 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int indexOfAnyBut(java.lang.CharSequence r11, char... r12) {
        /*
            boolean r0 = isEmpty(r11)
            r1 = -1
            if (r0 != 0) goto L43
            boolean r0 = org.apache.commons.lang3.ArrayUtils.isEmpty(r12)
            if (r0 == 0) goto Le
            goto L43
        Le:
            int r0 = r11.length()
            int r2 = r0 + (-1)
            int r3 = r12.length
            int r4 = r3 + (-1)
            r5 = 0
            r6 = r5
        L19:
            if (r6 >= r0) goto L43
            char r7 = r11.charAt(r6)
            r8 = r5
        L20:
            if (r8 >= r3) goto L42
            char r9 = r12[r8]
            if (r9 != r7) goto L3f
            if (r6 >= r2) goto L3c
            if (r8 >= r4) goto L3c
            boolean r9 = java.lang.Character.isHighSurrogate(r7)
            if (r9 == 0) goto L3c
            int r9 = r8 + 1
            char r9 = r12[r9]
            int r10 = r6 + 1
            char r10 = r11.charAt(r10)
            if (r9 != r10) goto L3f
        L3c:
            int r6 = r6 + 1
            goto L19
        L3f:
            int r8 = r8 + 1
            goto L20
        L42:
            return r6
        L43:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.StringUtils.indexOfAnyBut(java.lang.CharSequence, char[]):int");
    }

    public static int indexOfDifference(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return -1;
        }
        int i10 = 0;
        if (charSequence != null && charSequence2 != null) {
            while (i10 < charSequence.length() && i10 < charSequence2.length() && charSequence.charAt(i10) == charSequence2.charAt(i10)) {
                i10++;
            }
            if (i10 >= charSequence2.length() && i10 >= charSequence.length()) {
                return -1;
            }
        }
        return i10;
    }

    public static int indexOfIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        return indexOfIgnoreCase(charSequence, charSequence2, 0);
    }

    public static boolean isAllLowerCase(CharSequence charSequence) {
        if (charSequence == null || isEmpty(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isLowerCase(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAllUpperCase(CharSequence charSequence) {
        if (charSequence == null || isEmpty(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isUpperCase(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAlpha(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isLetter(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAlphaSpace(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isLetter(charSequence.charAt(i10)) && charSequence.charAt(i10) != ' ') {
                return false;
            }
        }
        return true;
    }

    public static boolean isAlphanumeric(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isLetterOrDigit(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAlphanumericSpace(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isLetterOrDigit(charSequence.charAt(i10)) && charSequence.charAt(i10) != ' ') {
                return false;
            }
        }
        return true;
    }

    public static boolean isAsciiPrintable(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!CharUtils.isAsciiPrintable(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isBlank(CharSequence charSequence) {
        int length;
        if (charSequence != null && (length = charSequence.length()) != 0) {
            for (int i10 = 0; i10 < length; i10++) {
                if (!Character.isWhitespace(charSequence.charAt(i10))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean isNotBlank(CharSequence charSequence) {
        return !isBlank(charSequence);
    }

    public static boolean isNotEmpty(CharSequence charSequence) {
        return !isEmpty(charSequence);
    }

    public static boolean isNumeric(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isDigit(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNumericSpace(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isDigit(charSequence.charAt(i10)) && charSequence.charAt(i10) != ' ') {
                return false;
            }
        }
        return true;
    }

    public static boolean isWhitespace(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isWhitespace(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static <T> String join(T... tArr) {
        return join(tArr, (String) null);
    }

    public static int lastIndexOf(CharSequence charSequence, int i10) {
        if (isEmpty(charSequence)) {
            return -1;
        }
        return CharSequenceUtils.lastIndexOf(charSequence, i10, charSequence.length());
    }

    public static int lastIndexOfAny(CharSequence charSequence, CharSequence... charSequenceArr) {
        int iLastIndexOf;
        int i10 = -1;
        if (charSequence != null && charSequenceArr != null) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (charSequence2 != null && (iLastIndexOf = CharSequenceUtils.lastIndexOf(charSequence, charSequence2, charSequence.length())) > i10) {
                    i10 = iLastIndexOf;
                }
            }
        }
        return i10;
    }

    public static int lastIndexOfIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return lastIndexOfIgnoreCase(charSequence, charSequence2, charSequence.length());
    }

    public static int lastOrdinalIndexOf(CharSequence charSequence, CharSequence charSequence2, int i10) {
        return ordinalIndexOf(charSequence, charSequence2, i10, true);
    }

    public static String left(String str, int i10) {
        if (str == null) {
            return null;
        }
        return i10 < 0 ? "" : str.length() <= i10 ? str : str.substring(0, i10);
    }

    public static String leftPad(String str, int i10) {
        return leftPad(str, i10, ' ');
    }

    public static int length(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }

    public static String lowerCase(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase();
    }

    public static String mid(String str, int i10, int i11) {
        if (str == null) {
            return null;
        }
        if (i11 < 0 || i10 > str.length()) {
            return "";
        }
        if (i10 < 0) {
            i10 = 0;
        }
        int i12 = i11 + i10;
        return str.length() <= i12 ? str.substring(i10) : str.substring(i10, i12);
    }

    public static String normalizeSpace(String str) {
        if (str == null) {
            return null;
        }
        return WHITESPACE_BLOCK.matcher(trim(str)).replaceAll(q.f17581a);
    }

    public static int ordinalIndexOf(CharSequence charSequence, CharSequence charSequence2, int i10) {
        return ordinalIndexOf(charSequence, charSequence2, i10, false);
    }

    public static String overlay(String str, String str2, int i10, int i11) {
        if (str == null) {
            return null;
        }
        if (str2 == null) {
            str2 = "";
        }
        int length = str.length();
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 > length) {
            i10 = length;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        if (i11 > length) {
            i11 = length;
        }
        if (i10 > i11) {
            int i12 = i11;
            i11 = i10;
            i10 = i12;
        }
        StringBuilder sb2 = new StringBuilder(a.a(str2, (length + i10) - i11, 1));
        sb2.append(str.substring(0, i10));
        sb2.append(str2);
        sb2.append(str.substring(i11));
        return sb2.toString();
    }

    public static String remove(String str, String str2) {
        return (isEmpty(str) || isEmpty(str2)) ? str : replace(str, str2, "", -1);
    }

    private static String removeAccentsJava6(CharSequence charSequence) throws IllegalAccessException, InvocationTargetException {
        Object obj;
        if (!java6Available || (obj = java6NormalizerFormNFD) == null) {
            throw new IllegalStateException("java.text.Normalizer is not available");
        }
        return java6Pattern.matcher((String) java6NormalizeMethod.invoke(null, charSequence, obj)).replaceAll("");
    }

    private static String removeAccentsSUN(CharSequence charSequence) throws IllegalAccessException, InvocationTargetException {
        if (sunAvailable) {
            return sunPattern.matcher((String) sunDecomposeMethod.invoke(null, charSequence, Boolean.FALSE, 0)).replaceAll("");
        }
        throw new IllegalStateException("sun.text.Normalizer is not available");
    }

    public static String removeEnd(String str, String str2) {
        return (isEmpty(str) || isEmpty(str2) || !str.endsWith(str2)) ? str : str.substring(0, str.length() - str2.length());
    }

    public static String removeEndIgnoreCase(String str, String str2) {
        return (isEmpty(str) || isEmpty(str2) || !endsWithIgnoreCase(str, str2)) ? str : str.substring(0, str.length() - str2.length());
    }

    public static String removeStart(String str, String str2) {
        return (isEmpty(str) || isEmpty(str2) || !str.startsWith(str2)) ? str : str.substring(str2.length());
    }

    public static String removeStartIgnoreCase(String str, String str2) {
        return (isEmpty(str) || isEmpty(str2) || !startsWithIgnoreCase(str, str2)) ? str : str.substring(str2.length());
    }

    public static String repeat(String str, int i10) {
        if (str == null) {
            return null;
        }
        if (i10 <= 0) {
            return "";
        }
        int length = str.length();
        if (i10 == 1 || length == 0) {
            return str;
        }
        if (length == 1 && i10 <= 8192) {
            return repeat(str.charAt(0), i10);
        }
        int i11 = length * i10;
        if (length == 1) {
            return repeat(str.charAt(0), i10);
        }
        if (length != 2) {
            StringBuilder sb2 = new StringBuilder(i11);
            for (int i12 = 0; i12 < i10; i12++) {
                sb2.append(str);
            }
            return sb2.toString();
        }
        char cCharAt = str.charAt(0);
        char cCharAt2 = str.charAt(1);
        char[] cArr = new char[i11];
        for (int i13 = (i10 * 2) - 2; i13 >= 0; i13 -= 2) {
            cArr[i13] = cCharAt;
            cArr[i13 + 1] = cCharAt2;
        }
        return new String(cArr);
    }

    public static String replace(String str, String str2, String str3) {
        return replace(str, str2, str3, -1);
    }

    public static String replaceChars(String str, char c10, char c11) {
        if (str == null) {
            return null;
        }
        return str.replace(c10, c11);
    }

    public static String replaceEach(String str, String[] strArr, String[] strArr2) {
        return replaceEach(str, strArr, strArr2, false, 0);
    }

    public static String replaceEachRepeatedly(String str, String[] strArr, String[] strArr2) {
        return replaceEach(str, strArr, strArr2, true, strArr == null ? 0 : strArr.length);
    }

    public static String replaceOnce(String str, String str2, String str3) {
        return replace(str, str2, str3, 1);
    }

    public static String reverse(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    public static String reverseDelimited(String str, char c10) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = split(str, c10);
        ArrayUtils.reverse(strArrSplit);
        return join(strArrSplit, c10);
    }

    public static String right(String str, int i10) {
        if (str == null) {
            return null;
        }
        return i10 < 0 ? "" : str.length() <= i10 ? str : str.substring(str.length() - i10);
    }

    public static String rightPad(String str, int i10) {
        return rightPad(str, i10, ' ');
    }

    public static String[] split(String str) {
        return split(str, null, -1);
    }

    public static String[] splitByCharacterType(String str) {
        return splitByCharacterType(str, false);
    }

    public static String[] splitByCharacterTypeCamelCase(String str) {
        return splitByCharacterType(str, true);
    }

    public static String[] splitByWholeSeparator(String str, String str2) {
        return splitByWholeSeparatorWorker(str, str2, -1, false);
    }

    public static String[] splitByWholeSeparatorPreserveAllTokens(String str, String str2) {
        return splitByWholeSeparatorWorker(str, str2, -1, true);
    }

    private static String[] splitByWholeSeparatorWorker(String str, String str2, int i10, boolean z10) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        if (str2 == null || "".equals(str2)) {
            return splitWorker(str, null, i10, z10);
        }
        int length2 = str2.length();
        ArrayList arrayList = new ArrayList();
        int iIndexOf = 0;
        int i11 = 0;
        int i12 = 0;
        while (iIndexOf < length) {
            iIndexOf = str.indexOf(str2, i11);
            if (iIndexOf > -1) {
                if (iIndexOf > i11) {
                    i12++;
                    if (i12 == i10) {
                        arrayList.add(str.substring(i11));
                    } else {
                        arrayList.add(str.substring(i11, iIndexOf));
                    }
                } else if (z10) {
                    i12++;
                    if (i12 == i10) {
                        arrayList.add(str.substring(i11));
                        iIndexOf = length;
                    } else {
                        arrayList.add("");
                    }
                }
                i11 = iIndexOf + length2;
            } else {
                arrayList.add(str.substring(i11));
            }
            iIndexOf = length;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] splitPreserveAllTokens(String str) {
        return splitWorker(str, null, -1, true);
    }

    private static String[] splitWorker(String str, char c10, boolean z10) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        boolean z11 = false;
        boolean z12 = false;
        int i11 = 0;
        while (i10 < length) {
            if (str.charAt(i10) == c10) {
                if (z11 || z10) {
                    arrayList.add(str.substring(i11, i10));
                    z11 = false;
                    z12 = true;
                }
                i11 = i10 + 1;
                i10 = i11;
            } else {
                i10++;
                z12 = false;
                z11 = true;
            }
        }
        if (z11 || (z10 && z12)) {
            arrayList.add(str.substring(i11, i10));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean startsWith(CharSequence charSequence, CharSequence charSequence2) {
        return startsWith(charSequence, charSequence2, false);
    }

    public static boolean startsWithAny(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (!isEmpty(charSequence) && !ArrayUtils.isEmpty(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (startsWith(charSequence, charSequence2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean startsWithIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        return startsWith(charSequence, charSequence2, true);
    }

    public static String strip(String str) {
        return strip(str, null);
    }

    public static String stripAccents(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (java6Available) {
                return removeAccentsJava6(str);
            }
            if (sunAvailable) {
                return removeAccentsSUN(str);
            }
            throw new UnsupportedOperationException("The stripAccents(CharSequence) method requires at least Java 1.6 or a Sun JVM");
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("IllegalAccessException occurred", e10);
        } catch (IllegalArgumentException e11) {
            throw new RuntimeException("IllegalArgumentException occurred", e11);
        } catch (SecurityException e12) {
            throw new RuntimeException("SecurityException occurred", e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException("InvocationTargetException occurred", e13);
        }
    }

    public static String[] stripAll(String... strArr) {
        return stripAll(strArr, null);
    }

    public static String stripEnd(String str, String str2) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            return str;
        }
        if (str2 == null) {
            while (length != 0 && Character.isWhitespace(str.charAt(length - 1))) {
                length--;
            }
        } else {
            if (str2.length() == 0) {
                return str;
            }
            while (length != 0 && str2.indexOf(str.charAt(length - 1)) != -1) {
                length--;
            }
        }
        return str.substring(0, length);
    }

    public static String stripStart(String str, String str2) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            return str;
        }
        int i10 = 0;
        if (str2 == null) {
            while (i10 != length && Character.isWhitespace(str.charAt(i10))) {
                i10++;
            }
        } else {
            if (str2.length() == 0) {
                return str;
            }
            while (i10 != length && str2.indexOf(str.charAt(i10)) != -1) {
                i10++;
            }
        }
        return str.substring(i10);
    }

    public static String stripToEmpty(String str) {
        return str == null ? "" : strip(str, null);
    }

    public static String stripToNull(String str) {
        if (str == null) {
            return null;
        }
        String strStrip = strip(str, null);
        if (strStrip.length() == 0) {
            return null;
        }
        return strStrip;
    }

    public static String substring(String str, int i10) {
        if (str == null) {
            return null;
        }
        if (i10 < 0) {
            i10 += str.length();
        }
        if (i10 < 0) {
            i10 = 0;
        }
        return i10 > str.length() ? "" : str.substring(i10);
    }

    public static String substringAfter(String str, String str2) {
        int iIndexOf;
        return isEmpty(str) ? str : (str2 == null || (iIndexOf = str.indexOf(str2)) == -1) ? "" : str.substring(str2.length() + iIndexOf);
    }

    public static String substringAfterLast(String str, String str2) {
        int iLastIndexOf;
        return isEmpty(str) ? str : (isEmpty(str2) || (iLastIndexOf = str.lastIndexOf(str2)) == -1 || iLastIndexOf == str.length() - str2.length()) ? "" : str.substring(str2.length() + iLastIndexOf);
    }

    public static String substringBefore(String str, String str2) {
        if (isEmpty(str) || str2 == null) {
            return str;
        }
        if (str2.length() == 0) {
            return "";
        }
        int iIndexOf = str.indexOf(str2);
        return iIndexOf == -1 ? str : str.substring(0, iIndexOf);
    }

    public static String substringBeforeLast(String str, String str2) {
        int iLastIndexOf;
        return (isEmpty(str) || isEmpty(str2) || (iLastIndexOf = str.lastIndexOf(str2)) == -1) ? str : str.substring(0, iLastIndexOf);
    }

    public static String substringBetween(String str, String str2) {
        return substringBetween(str, str2, str2);
    }

    public static String[] substringsBetween(String str, String str2, String str3) {
        int iIndexOf;
        int i10;
        int iIndexOf2;
        if (str == null || isEmpty(str2) || isEmpty(str3)) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        int length2 = str3.length();
        int length3 = str2.length();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < length - length2 && (iIndexOf = str.indexOf(str2, i11)) >= 0 && (iIndexOf2 = str.indexOf(str3, (i10 = iIndexOf + length3))) >= 0) {
            arrayList.add(str.substring(i10, iIndexOf2));
            i11 = iIndexOf2 + length2;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String swapCase(String str) {
        if (isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i10 = 0; i10 < charArray.length; i10++) {
            char c10 = charArray[i10];
            if (Character.isUpperCase(c10)) {
                charArray[i10] = Character.toLowerCase(c10);
            } else if (Character.isTitleCase(c10)) {
                charArray[i10] = Character.toLowerCase(c10);
            } else if (Character.isLowerCase(c10)) {
                charArray[i10] = Character.toUpperCase(c10);
            }
        }
        return new String(charArray);
    }

    public static String trim(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    public static String trimToEmpty(String str) {
        return str == null ? "" : str.trim();
    }

    public static String trimToNull(String str) {
        String strTrim = trim(str);
        if (isEmpty(strTrim)) {
            return null;
        }
        return strTrim;
    }

    public static String uncapitalize(String str) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(Character.toLowerCase(str.charAt(0)));
        sb2.append(str.substring(1));
        return sb2.toString();
    }

    public static String upperCase(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }

    public static String abbreviate(String str, int i10, int i11) {
        if (str == null) {
            return null;
        }
        if (i11 < 4) {
            throw new IllegalArgumentException("Minimum abbreviation width is 4");
        }
        if (str.length() <= i11) {
            return str;
        }
        if (i10 > str.length()) {
            i10 = str.length();
        }
        int i12 = i11 - 3;
        if (str.length() - i10 < i12) {
            i10 = str.length() - i12;
        }
        if (i10 <= 4) {
            return str.substring(0, i12) + "...";
        }
        if (i11 < 7) {
            throw new IllegalArgumentException("Minimum abbreviation width with offset is 7");
        }
        if (i10 + i12 < str.length()) {
            return "..." + abbreviate(str.substring(i10), i12);
        }
        return "..." + str.substring(str.length() - i12);
    }

    public static String center(String str, int i10, char c10) {
        int length;
        int length2;
        return (str == null || i10 <= 0 || (length2 = i10 - (length = str.length())) <= 0) ? str : rightPad(leftPad(str, (length2 / 2) + length, c10), i10, c10);
    }

    public static String defaultString(String str) {
        return str == null ? "" : str;
    }

    private static boolean endsWith(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        if (charSequence == null || charSequence2 == null) {
            return charSequence == null && charSequence2 == null;
        }
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        return CharSequenceUtils.regionMatches(charSequence, z10, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length());
    }

    public static int indexOfIgnoreCase(CharSequence charSequence, CharSequence charSequence2, int i10) {
        if (charSequence != null && charSequence2 != null) {
            if (i10 < 0) {
                i10 = 0;
            }
            int length = (charSequence.length() - charSequence2.length()) + 1;
            if (i10 > length) {
                return -1;
            }
            if (charSequence2.length() == 0) {
                return i10;
            }
            int i11 = i10;
            while (i11 < length) {
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                if (CharSequenceUtils.regionMatches(charSequence3, true, i11, charSequence4, 0, charSequence2.length())) {
                    return i11;
                }
                i11++;
                charSequence = charSequence3;
                charSequence2 = charSequence4;
            }
        }
        return -1;
    }

    public static String join(Object[] objArr, char c10) {
        if (objArr == null) {
            return null;
        }
        return join(objArr, c10, 0, objArr.length);
    }

    public static int lastIndexOfIgnoreCase(CharSequence charSequence, CharSequence charSequence2, int i10) {
        if (charSequence != null && charSequence2 != null) {
            if (i10 > charSequence.length() - charSequence2.length()) {
                i10 = charSequence.length() - charSequence2.length();
            }
            if (i10 < 0) {
                return -1;
            }
            if (charSequence2.length() == 0) {
                return i10;
            }
            int i11 = i10;
            while (i11 >= 0) {
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                if (CharSequenceUtils.regionMatches(charSequence3, true, i11, charSequence4, 0, charSequence2.length())) {
                    return i11;
                }
                i11--;
                charSequence = charSequence3;
                charSequence2 = charSequence4;
            }
        }
        return -1;
    }

    public static String leftPad(String str, int i10, char c10) {
        if (str == null) {
            return null;
        }
        int length = i10 - str.length();
        return length <= 0 ? str : length > 8192 ? leftPad(str, i10, String.valueOf(c10)) : repeat(c10, length).concat(str);
    }

    public static String lowerCase(String str, Locale locale) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(locale);
    }

    private static int ordinalIndexOf(CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10) {
        if (charSequence != null && charSequence2 != null && i10 > 0) {
            int i11 = 0;
            if (charSequence2.length() == 0) {
                if (z10) {
                    return charSequence.length();
                }
                return 0;
            }
            length = z10 ? charSequence.length() : -1;
            do {
                length = z10 ? CharSequenceUtils.lastIndexOf(charSequence, charSequence2, length - 1) : CharSequenceUtils.indexOf(charSequence, charSequence2, length + 1);
                if (length < 0) {
                    break;
                }
                i11++;
            } while (i11 < i10);
        }
        return length;
    }

    public static String replace(String str, String str2, String str3, int i10) {
        int i11;
        if (isEmpty(str) || isEmpty(str2) || str3 == null || i10 == 0) {
            return str;
        }
        int i12 = 0;
        int iIndexOf = str.indexOf(str2, 0);
        if (iIndexOf == -1) {
            return str;
        }
        int length = str2.length();
        int length2 = str3.length() - length;
        if (length2 < 0) {
            length2 = 0;
        }
        if (i10 < 0) {
            i11 = 16;
        } else {
            i11 = 64;
            if (i10 <= 64) {
                i11 = i10;
            }
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length2 * i11));
        while (iIndexOf != -1) {
            sb2.append(str.substring(i12, iIndexOf));
            sb2.append(str3);
            i12 = iIndexOf + length;
            i10--;
            if (i10 == 0) {
                break;
            }
            iIndexOf = str.indexOf(str2, i12);
        }
        sb2.append(str.substring(i12));
        return sb2.toString();
    }

    public static String replaceChars(String str, String str2, String str3) {
        if (isEmpty(str) || isEmpty(str2)) {
            return str;
        }
        if (str3 == null) {
            str3 = "";
        }
        int length = str3.length();
        int length2 = str.length();
        StringBuilder sb2 = new StringBuilder(length2);
        boolean z10 = false;
        for (int i10 = 0; i10 < length2; i10++) {
            char cCharAt = str.charAt(i10);
            int iIndexOf = str2.indexOf(cCharAt);
            if (iIndexOf >= 0) {
                if (iIndexOf < length) {
                    sb2.append(str3.charAt(iIndexOf));
                }
                z10 = true;
            } else {
                sb2.append(cCharAt);
            }
        }
        return z10 ? sb2.toString() : str;
    }

    private static String replaceEach(String str, String[] strArr, String[] strArr2, boolean z10, int i10) {
        String str2;
        String str3;
        int length;
        String str4;
        if (str == null || str.length() == 0 || strArr == null || strArr.length == 0 || strArr2 == null || strArr2.length == 0) {
            return str;
        }
        if (i10 < 0) {
            throw new IllegalStateException("TimeToLive of " + i10 + " is less than 0: " + str);
        }
        int length2 = strArr.length;
        int length3 = strArr2.length;
        if (length2 != length3) {
            throw new IllegalArgumentException(C1758e.a("Search and Replace array lengths don't match: ", length2, " vs ", length3));
        }
        boolean[] zArr = new boolean[length2];
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < length2; i13++) {
            if (!zArr[i13] && (str4 = strArr[i13]) != null && str4.length() != 0 && strArr2[i13] != null) {
                int iIndexOf = str.indexOf(strArr[i13]);
                if (iIndexOf == -1) {
                    zArr[i13] = true;
                } else if (i11 == -1 || iIndexOf < i11) {
                    i12 = i13;
                    i11 = iIndexOf;
                }
            }
        }
        if (i11 == -1) {
            return str;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < strArr.length; i15++) {
            if (strArr[i15] != null && (str3 = strArr2[i15]) != null && (length = str3.length() - strArr[i15].length()) > 0) {
                i14 += length * 3;
            }
        }
        StringBuilder sb2 = new StringBuilder(str.length() + Math.min(i14, str.length() / 5));
        int length4 = 0;
        while (i11 != -1) {
            while (length4 < i11) {
                sb2.append(str.charAt(length4));
                length4++;
            }
            sb2.append(strArr2[i12]);
            length4 = strArr[i12].length() + i11;
            i11 = -1;
            i12 = -1;
            for (int i16 = 0; i16 < length2; i16++) {
                if (!zArr[i16] && (str2 = strArr[i16]) != null && str2.length() != 0 && strArr2[i16] != null) {
                    int iIndexOf2 = str.indexOf(strArr[i16], length4);
                    if (iIndexOf2 == -1) {
                        zArr[i16] = true;
                    } else if (i11 == -1 || iIndexOf2 < i11) {
                        i12 = i16;
                        i11 = iIndexOf2;
                    }
                }
            }
        }
        int length5 = str.length();
        while (length4 < length5) {
            sb2.append(str.charAt(length4));
            length4++;
        }
        String string = sb2.toString();
        return !z10 ? string : replaceEach(string, strArr, strArr2, z10, i10 - 1);
    }

    public static String rightPad(String str, int i10, char c10) {
        if (str == null) {
            return null;
        }
        int length = i10 - str.length();
        return length <= 0 ? str : length > 8192 ? rightPad(str, i10, String.valueOf(c10)) : str.concat(repeat(c10, length));
    }

    public static String[] split(String str, char c10) {
        return splitWorker(str, c10, false);
    }

    private static String[] splitByCharacterType(String str, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int type = Character.getType(charArray[0]);
        for (int i11 = 1; i11 < charArray.length; i11++) {
            int type2 = Character.getType(charArray[i11]);
            if (type2 != type) {
                if (z10 && type2 == 2 && type == 1) {
                    int i12 = i11 - 1;
                    if (i12 != i10) {
                        arrayList.add(new String(charArray, i10, i12 - i10));
                        i10 = i12;
                    }
                } else {
                    arrayList.add(new String(charArray, i10, i11 - i10));
                    i10 = i11;
                }
                type = type2;
            }
        }
        arrayList.add(new String(charArray, i10, charArray.length - i10));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] splitByWholeSeparator(String str, String str2, int i10) {
        return splitByWholeSeparatorWorker(str, str2, i10, false);
    }

    public static String[] splitByWholeSeparatorPreserveAllTokens(String str, String str2, int i10) {
        return splitByWholeSeparatorWorker(str, str2, i10, true);
    }

    public static String[] splitPreserveAllTokens(String str, char c10) {
        return splitWorker(str, c10, true);
    }

    private static boolean startsWith(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        if (charSequence == null || charSequence2 == null) {
            return charSequence == null && charSequence2 == null;
        }
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        return CharSequenceUtils.regionMatches(charSequence, z10, 0, charSequence2, 0, charSequence2.length());
    }

    public static String strip(String str, String str2) {
        return isEmpty(str) ? str : stripEnd(stripStart(str, str2), str2);
    }

    public static String[] stripAll(String[] strArr, String str) {
        int length;
        if (strArr == null || (length = strArr.length) == 0) {
            return strArr;
        }
        String[] strArr2 = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr2[i10] = strip(strArr[i10], str);
        }
        return strArr2;
    }

    public static String substringBetween(String str, String str2, String str3) {
        int iIndexOf;
        int iIndexOf2;
        if (str == null || str2 == null || str3 == null || (iIndexOf = str.indexOf(str2)) == -1 || (iIndexOf2 = str.indexOf(str3, str2.length() + iIndexOf)) == -1) {
            return null;
        }
        return str.substring(str2.length() + iIndexOf, iIndexOf2);
    }

    public static String upperCase(String str, Locale locale) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase(locale);
    }

    public static boolean contains(CharSequence charSequence, CharSequence charSequence2) {
        return (charSequence == null || charSequence2 == null || CharSequenceUtils.indexOf(charSequence, charSequence2, 0) < 0) ? false : true;
    }

    public static int indexOf(CharSequence charSequence, int i10, int i11) {
        if (isEmpty(charSequence)) {
            return -1;
        }
        return CharSequenceUtils.indexOf(charSequence, i10, i11);
    }

    public static String join(Object[] objArr, char c10, int i10, int i11) {
        if (objArr == null) {
            return null;
        }
        int i12 = i11 - i10;
        if (i12 <= 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(i12 * 16);
        for (int i13 = i10; i13 < i11; i13++) {
            if (i13 > i10) {
                sb2.append(c10);
            }
            Object obj = objArr[i13];
            if (obj != null) {
                sb2.append(obj);
            }
        }
        return sb2.toString();
    }

    public static int lastIndexOf(CharSequence charSequence, int i10, int i11) {
        if (isEmpty(charSequence)) {
            return -1;
        }
        return CharSequenceUtils.lastIndexOf(charSequence, i10, i11);
    }

    public static String remove(String str, char c10) {
        if (isEmpty(str) || str.indexOf(c10) == -1) {
            return str;
        }
        char[] charArray = str.toCharArray();
        int i10 = 0;
        for (char c11 : charArray) {
            if (c11 != c10) {
                charArray[i10] = c11;
                i10++;
            }
        }
        return new String(charArray, 0, i10);
    }

    public static String[] split(String str, String str2) {
        return splitWorker(str, str2, -1, false);
    }

    public static String[] splitPreserveAllTokens(String str, String str2) {
        return splitWorker(str, str2, -1, true);
    }

    public static boolean containsOnly(CharSequence charSequence, String str) {
        if (charSequence == null || str == null) {
            return false;
        }
        return containsOnly(charSequence, str.toCharArray());
    }

    public static int indexOfDifference(CharSequence... charSequenceArr) {
        if (charSequenceArr != null && charSequenceArr.length > 1) {
            int length = charSequenceArr.length;
            int iMin = Integer.MAX_VALUE;
            boolean z10 = true;
            int iMax = 0;
            boolean z11 = false;
            for (int i10 = 0; i10 < length; i10++) {
                CharSequence charSequence = charSequenceArr[i10];
                if (charSequence == null) {
                    z11 = true;
                    iMin = 0;
                } else {
                    iMin = Math.min(charSequence.length(), iMin);
                    iMax = Math.max(charSequenceArr[i10].length(), iMax);
                    z10 = false;
                }
            }
            if (!z10 && (iMax != 0 || z11)) {
                if (iMin == 0) {
                    return 0;
                }
                int i11 = -1;
                for (int i12 = 0; i12 < iMin; i12++) {
                    char cCharAt = charSequenceArr[0].charAt(i12);
                    int i13 = 1;
                    while (true) {
                        if (i13 >= length) {
                            break;
                        }
                        if (charSequenceArr[i13].charAt(i12) != cCharAt) {
                            i11 = i12;
                            break;
                        }
                        i13++;
                    }
                    if (i11 != -1) {
                        break;
                    }
                }
                return (i11 != -1 || iMin == iMax) ? i11 : iMin;
            }
        }
        return -1;
    }

    public static String[] split(String str, String str2, int i10) {
        return splitWorker(str, str2, i10, false);
    }

    public static String[] splitPreserveAllTokens(String str, String str2, int i10) {
        return splitWorker(str, str2, i10, true);
    }

    public static String center(String str, int i10, String str2) {
        if (str == null || i10 <= 0) {
            return str;
        }
        if (isEmpty(str2)) {
            str2 = q.f17581a;
        }
        int length = str.length();
        int i11 = i10 - length;
        return i11 <= 0 ? str : rightPad(leftPad(str, (i11 / 2) + length, str2), i10, str2);
    }

    public static int indexOf(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return CharSequenceUtils.indexOf(charSequence, charSequence2, 0);
    }

    public static int lastIndexOf(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return CharSequenceUtils.lastIndexOf(charSequence, charSequence2, charSequence.length());
    }

    public static String leftPad(String str, int i10, String str2) {
        if (str == null) {
            return null;
        }
        if (isEmpty(str2)) {
            str2 = q.f17581a;
        }
        int length = str2.length();
        int length2 = i10 - str.length();
        if (length2 <= 0) {
            return str;
        }
        if (length == 1 && length2 <= 8192) {
            return leftPad(str, i10, str2.charAt(0));
        }
        if (length2 == length) {
            return str2.concat(str);
        }
        if (length2 < length) {
            return str2.substring(0, length2).concat(str);
        }
        char[] cArr = new char[length2];
        char[] charArray = str2.toCharArray();
        for (int i11 = 0; i11 < length2; i11++) {
            cArr[i11] = charArray[i11 % length];
        }
        return new String(cArr).concat(str);
    }

    public static String rightPad(String str, int i10, String str2) {
        if (str == null) {
            return null;
        }
        if (isEmpty(str2)) {
            str2 = q.f17581a;
        }
        int length = str2.length();
        int length2 = i10 - str.length();
        if (length2 <= 0) {
            return str;
        }
        if (length == 1 && length2 <= 8192) {
            return rightPad(str, i10, str2.charAt(0));
        }
        if (length2 == length) {
            return str.concat(str2);
        }
        if (length2 < length) {
            return str.concat(str2.substring(0, length2));
        }
        char[] cArr = new char[length2];
        char[] charArray = str2.toCharArray();
        for (int i11 = 0; i11 < length2; i11++) {
            cArr[i11] = charArray[i11 % length];
        }
        return str.concat(new String(cArr));
    }

    public static String substring(String str, int i10, int i11) {
        if (str == null) {
            return null;
        }
        if (i11 < 0) {
            i11 += str.length();
        }
        if (i10 < 0) {
            i10 += str.length();
        }
        if (i11 > str.length()) {
            i11 = str.length();
        }
        if (i10 > i11) {
            return "";
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        return str.substring(i10, i11);
    }

    public static int indexOf(CharSequence charSequence, CharSequence charSequence2, int i10) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return CharSequenceUtils.indexOf(charSequence, charSequence2, i10);
    }

    public static int lastIndexOf(CharSequence charSequence, CharSequence charSequence2, int i10) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return CharSequenceUtils.lastIndexOf(charSequence, charSequence2, i10);
    }

    public static boolean containsNone(CharSequence charSequence, String str) {
        if (charSequence == null || str == null) {
            return true;
        }
        return containsNone(charSequence, str.toCharArray());
    }

    public static boolean containsAny(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2 == null) {
            return false;
        }
        return containsAny(charSequence, CharSequenceUtils.toCharArray(charSequence2));
    }

    public static int indexOfAny(CharSequence charSequence, String str) {
        if (isEmpty(charSequence) || isEmpty(str)) {
            return -1;
        }
        return indexOfAny(charSequence, str.toCharArray());
    }

    public static int indexOfAnyBut(CharSequence charSequence, CharSequence charSequence2) {
        if (!isEmpty(charSequence) && !isEmpty(charSequence2)) {
            int length = charSequence.length();
            int i10 = 0;
            while (i10 < length) {
                char cCharAt = charSequence.charAt(i10);
                boolean z10 = CharSequenceUtils.indexOf(charSequence2, cCharAt, 0) >= 0;
                int i11 = i10 + 1;
                if (i11 < length && Character.isHighSurrogate(cCharAt)) {
                    char cCharAt2 = charSequence.charAt(i11);
                    if (z10 && CharSequenceUtils.indexOf(charSequence2, cCharAt2, 0) < 0) {
                        return i10;
                    }
                    i10 = i11;
                } else {
                    if (!z10) {
                        return i10;
                    }
                    i10 = i11;
                }
            }
        }
        return -1;
    }

    private static String[] splitWorker(String str, String str2, int i10, boolean z10) {
        int i11;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        boolean z13;
        boolean z14;
        int i14;
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        ArrayList arrayList = new ArrayList();
        if (str2 == null) {
            i13 = 0;
            z13 = false;
            z14 = false;
            i14 = 0;
            int i15 = 1;
            while (i13 < length) {
                if (Character.isWhitespace(str.charAt(i13))) {
                    if (z13 || z10) {
                        int i16 = i15 + 1;
                        if (i15 == i10) {
                            i13 = length;
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        arrayList.add(str.substring(i14, i13));
                        i15 = i16;
                        z13 = false;
                    }
                    i14 = i13 + 1;
                    i13 = i14;
                } else {
                    i13++;
                    z14 = false;
                    z13 = true;
                }
            }
        } else {
            if (str2.length() == 1) {
                char cCharAt = str2.charAt(0);
                i11 = 0;
                z11 = false;
                z12 = false;
                i12 = 0;
                int i17 = 1;
                while (i11 < length) {
                    if (str.charAt(i11) == cCharAt) {
                        if (z11 || z10) {
                            int i18 = i17 + 1;
                            if (i17 == i10) {
                                i11 = length;
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            arrayList.add(str.substring(i12, i11));
                            i17 = i18;
                            z11 = false;
                        }
                        i12 = i11 + 1;
                        i11 = i12;
                    } else {
                        i11++;
                        z12 = false;
                        z11 = true;
                    }
                }
            } else {
                i11 = 0;
                z11 = false;
                z12 = false;
                i12 = 0;
                int i19 = 1;
                while (i11 < length) {
                    if (str2.indexOf(str.charAt(i11)) >= 0) {
                        if (z11 || z10) {
                            int i20 = i19 + 1;
                            if (i19 == i10) {
                                i11 = length;
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            arrayList.add(str.substring(i12, i11));
                            i19 = i20;
                            z11 = false;
                        }
                        i12 = i11 + 1;
                        i11 = i12;
                    } else {
                        i11++;
                        z12 = false;
                        z11 = true;
                    }
                }
            }
            i13 = i11;
            z13 = z11;
            z14 = z12;
            i14 = i12;
        }
        if (z13 || (z10 && z14)) {
            arrayList.add(str.substring(i14, i13));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String chomp(String str, String str2) {
        return (isEmpty(str) || str2 == null || !str.endsWith(str2)) ? str : str.substring(0, str.length() - str2.length());
    }

    public static String join(Object[] objArr, String str) {
        if (objArr == null) {
            return null;
        }
        return join(objArr, str, 0, objArr.length);
    }

    public static int indexOfAny(CharSequence charSequence, CharSequence... charSequenceArr) {
        int iIndexOf;
        if (charSequence == null || charSequenceArr == null) {
            return -1;
        }
        int i10 = Integer.MAX_VALUE;
        for (CharSequence charSequence2 : charSequenceArr) {
            if (charSequence2 != null && (iIndexOf = CharSequenceUtils.indexOf(charSequence, charSequence2, 0)) != -1 && iIndexOf < i10) {
                i10 = iIndexOf;
            }
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10;
    }

    public static String join(Object[] objArr, String str, int i10, int i11) {
        if (objArr == null) {
            return null;
        }
        if (str == null) {
            str = "";
        }
        int i12 = i11 - i10;
        if (i12 <= 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(i12 * 16);
        for (int i13 = i10; i13 < i11; i13++) {
            if (i13 > i10) {
                sb2.append(str);
            }
            Object obj = objArr[i13];
            if (obj != null) {
                sb2.append(obj);
            }
        }
        return sb2.toString();
    }

    public static int getLevenshteinDistance(CharSequence charSequence, CharSequence charSequence2, int i10) {
        int i11;
        int length;
        CharSequence charSequence3;
        CharSequence charSequence4;
        int i12;
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("Strings must not be null");
        }
        if (i10 >= 0) {
            int length2 = charSequence.length();
            int length3 = charSequence2.length();
            int i13 = -1;
            if (length2 == 0) {
                if (length3 <= i10) {
                    return length3;
                }
                return -1;
            }
            if (length3 == 0) {
                if (length2 <= i10) {
                    return length2;
                }
                return -1;
            }
            if (length2 > length3) {
                length = charSequence.length();
                i11 = length3;
                charSequence4 = charSequence;
                charSequence3 = charSequence2;
            } else {
                i11 = length2;
                length = length3;
                charSequence3 = charSequence;
                charSequence4 = charSequence2;
            }
            int i14 = i11 + 1;
            int[] iArr = new int[i14];
            int[] iArr2 = new int[i14];
            int i15 = 1;
            int iMin = Math.min(i11, i10) + 1;
            for (int i16 = 0; i16 < iMin; i16++) {
                iArr[i16] = i16;
            }
            Arrays.fill(iArr, iMin, i14, Integer.MAX_VALUE);
            Arrays.fill(iArr2, Integer.MAX_VALUE);
            int i17 = 1;
            while (i17 <= length) {
                char cCharAt = charSequence4.charAt(i17 - 1);
                iArr2[0] = i17;
                int iMax = Math.max(i15, i17 - i10);
                int iMin2 = Math.min(i11, i17 + i10);
                if (iMax > iMin2) {
                    return i13;
                }
                if (iMax > i15) {
                    iArr2[iMax - 1] = Integer.MAX_VALUE;
                }
                while (iMax <= iMin2) {
                    int i18 = iMax - 1;
                    int i19 = i13;
                    if (charSequence3.charAt(i18) == cCharAt) {
                        iArr2[iMax] = iArr[i18];
                        i12 = i15;
                    } else {
                        i12 = i15;
                        iArr2[iMax] = Math.min(Math.min(iArr2[i18], iArr[iMax]), iArr[i18]) + 1;
                    }
                    iMax++;
                    i15 = i12;
                    i13 = i19;
                }
                int i20 = i13;
                i17++;
                int[] iArr3 = iArr2;
                iArr2 = iArr;
                iArr = iArr3;
                i13 = i20;
            }
            int i21 = i13;
            int i22 = iArr[i11];
            return i22 <= i10 ? i22 : i21;
        }
        throw new IllegalArgumentException("Threshold must not be negative");
    }

    public static String repeat(String str, String str2, int i10) {
        if (str != null && str2 != null) {
            return removeEnd(repeat(str.concat(str2), i10), str2);
        }
        return repeat(str, i10);
    }

    public static String join(Iterator<?> it, char c10) {
        if (it == null) {
            return null;
        }
        if (!it.hasNext()) {
            return "";
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return ObjectUtils.toString(next);
        }
        StringBuilder sb2 = new StringBuilder(256);
        if (next != null) {
            sb2.append(next);
        }
        while (it.hasNext()) {
            sb2.append(c10);
            Object next2 = it.next();
            if (next2 != null) {
                sb2.append(next2);
            }
        }
        return sb2.toString();
    }

    public static String repeat(char c10, int i10) {
        char[] cArr = new char[i10];
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            cArr[i11] = c10;
        }
        return new String(cArr);
    }

    public static String join(Iterator<?> it, String str) {
        if (it == null) {
            return null;
        }
        if (!it.hasNext()) {
            return "";
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return ObjectUtils.toString(next);
        }
        StringBuilder sb2 = new StringBuilder(256);
        if (next != null) {
            sb2.append(next);
        }
        while (it.hasNext()) {
            if (str != null) {
                sb2.append(str);
            }
            Object next2 = it.next();
            if (next2 != null) {
                sb2.append(next2);
            }
        }
        return sb2.toString();
    }

    public static String join(Iterable<?> iterable, char c10) {
        if (iterable == null) {
            return null;
        }
        return join(iterable.iterator(), c10);
    }

    public static String join(Iterable<?> iterable, String str) {
        if (iterable == null) {
            return null;
        }
        return join(iterable.iterator(), str);
    }
}
