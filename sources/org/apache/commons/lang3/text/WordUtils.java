package org.apache.commons.lang3.text;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;

/* JADX INFO: loaded from: classes6.dex */
public class WordUtils {
    public static String capitalize(String str) {
        return capitalize(str, null);
    }

    public static String capitalizeFully(String str) {
        return capitalizeFully(str, null);
    }

    public static String initials(String str) {
        return initials(str, null);
    }

    private static boolean isDelimiter(char c10, char[] cArr) {
        if (cArr == null) {
            return Character.isWhitespace(c10);
        }
        for (char c11 : cArr) {
            if (c10 == c11) {
                return true;
            }
        }
        return false;
    }

    public static String swapCase(String str) {
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        boolean zIsWhitespace = true;
        int i10 = 0;
        while (i10 < charArray.length) {
            char c10 = charArray[i10];
            if (Character.isUpperCase(c10) || Character.isTitleCase(c10)) {
                charArray[i10] = Character.toLowerCase(c10);
            } else {
                if (!Character.isLowerCase(c10)) {
                    zIsWhitespace = Character.isWhitespace(c10);
                } else if (zIsWhitespace) {
                    charArray[i10] = Character.toTitleCase(c10);
                } else {
                    charArray[i10] = Character.toUpperCase(c10);
                }
                i10++;
            }
            zIsWhitespace = false;
            i10++;
        }
        return new String(charArray);
    }

    public static String uncapitalize(String str) {
        return uncapitalize(str, null);
    }

    public static String wrap(String str, int i10) {
        return wrap(str, i10, null, false);
    }

    public static String capitalize(String str, char... cArr) {
        int length = cArr == null ? -1 : cArr.length;
        if (StringUtils.isEmpty(str) || length == 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        boolean z10 = true;
        for (int i10 = 0; i10 < charArray.length; i10++) {
            char c10 = charArray[i10];
            if (isDelimiter(c10, cArr)) {
                z10 = true;
            } else if (z10) {
                charArray[i10] = Character.toTitleCase(c10);
                z10 = false;
            }
        }
        return new String(charArray);
    }

    public static String capitalizeFully(String str, char... cArr) {
        return (StringUtils.isEmpty(str) || (cArr == null ? -1 : cArr.length) == 0) ? str : capitalize(str.toLowerCase(), cArr);
    }

    public static String initials(String str, char... cArr) {
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        if (cArr != null && cArr.length == 0) {
            return "";
        }
        int length = str.length();
        char[] cArr2 = new char[(length / 2) + 1];
        boolean z10 = true;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (isDelimiter(cCharAt, cArr)) {
                z10 = true;
            } else if (z10) {
                cArr2[i10] = cCharAt;
                i10++;
                z10 = false;
            }
        }
        return new String(cArr2, 0, i10);
    }

    public static String uncapitalize(String str, char... cArr) {
        int length = cArr == null ? -1 : cArr.length;
        if (StringUtils.isEmpty(str) || length == 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        boolean z10 = true;
        for (int i10 = 0; i10 < charArray.length; i10++) {
            char c10 = charArray[i10];
            if (isDelimiter(c10, cArr)) {
                z10 = true;
            } else if (z10) {
                charArray[i10] = Character.toLowerCase(c10);
                z10 = false;
            }
        }
        return new String(charArray);
    }

    public static String wrap(String str, int i10, String str2, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str2 == null) {
            str2 = SystemUtils.LINE_SEPARATOR;
        }
        if (i10 < 1) {
            i10 = 1;
        }
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length + 32);
        int i11 = 0;
        while (length - i11 > i10) {
            if (str.charAt(i11) == ' ') {
                i11++;
            } else {
                int i12 = i10 + i11;
                int iLastIndexOf = str.lastIndexOf(32, i12);
                if (iLastIndexOf >= i11) {
                    sb2.append(str.substring(i11, iLastIndexOf));
                    sb2.append(str2);
                    i11 = iLastIndexOf + 1;
                } else {
                    if (z10) {
                        sb2.append(str.substring(i11, i12));
                        sb2.append(str2);
                    } else {
                        int iIndexOf = str.indexOf(32, i12);
                        if (iIndexOf >= 0) {
                            sb2.append(str.substring(i11, iIndexOf));
                            sb2.append(str2);
                            i12 = iIndexOf + 1;
                        } else {
                            sb2.append(str.substring(i11));
                            i11 = length;
                        }
                    }
                    i11 = i12;
                }
            }
        }
        sb2.append(str.substring(i11));
        return sb2.toString();
    }
}
