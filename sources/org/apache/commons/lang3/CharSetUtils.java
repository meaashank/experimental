package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes6.dex */
public class CharSetUtils {
    public static int count(String str, String... strArr) {
        if (StringUtils.isEmpty(str) || deepEmpty(strArr)) {
            return 0;
        }
        CharSet charSet = CharSet.getInstance(strArr);
        int i10 = 0;
        for (char c10 : str.toCharArray()) {
            if (charSet.contains(c10)) {
                i10++;
            }
        }
        return i10;
    }

    private static boolean deepEmpty(String[] strArr) {
        if (strArr == null) {
            return true;
        }
        for (String str : strArr) {
            if (StringUtils.isNotEmpty(str)) {
                return false;
            }
        }
        return true;
    }

    public static String delete(String str, String... strArr) {
        return (StringUtils.isEmpty(str) || deepEmpty(strArr)) ? str : modify(str, strArr, false);
    }

    public static String keep(String str, String... strArr) {
        if (str == null) {
            return null;
        }
        return (str.length() == 0 || deepEmpty(strArr)) ? "" : modify(str, strArr, true);
    }

    private static String modify(String str, String[] strArr, boolean z10) {
        CharSet charSet = CharSet.getInstance(strArr);
        StringBuilder sb2 = new StringBuilder(str.length());
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (charSet.contains(charArray[i10]) == z10) {
                sb2.append(charArray[i10]);
            }
        }
        return sb2.toString();
    }

    public static String squeeze(String str, String... strArr) {
        if (StringUtils.isEmpty(str) || deepEmpty(strArr)) {
            return str;
        }
        CharSet charSet = CharSet.getInstance(strArr);
        StringBuilder sb2 = new StringBuilder(str.length());
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        char c10 = ' ';
        for (int i10 = 0; i10 < length; i10++) {
            char c11 = charArray[i10];
            if (c11 != c10 || i10 == 0 || !charSet.contains(c11)) {
                sb2.append(c11);
                c10 = c11;
            }
        }
        return sb2.toString();
    }
}
