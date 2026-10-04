package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes6.dex */
public class CharSequenceUtils {
    public static int indexOf(CharSequence charSequence, int i10, int i11) {
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(i10, i11);
        }
        int length = charSequence.length();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < length) {
            if (charSequence.charAt(i11) == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static int lastIndexOf(CharSequence charSequence, int i10, int i11) {
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(i10, i11);
        }
        int length = charSequence.length();
        if (i11 < 0) {
            return -1;
        }
        if (i11 >= length) {
            i11 = length - 1;
        }
        while (i11 >= 0) {
            if (charSequence.charAt(i11) == i10) {
                return i11;
            }
            i11--;
        }
        return -1;
    }

    public static boolean regionMatches(CharSequence charSequence, boolean z10, int i10, CharSequence charSequence2, int i11, int i12) {
        return ((charSequence instanceof String) && (charSequence2 instanceof String)) ? ((String) charSequence).regionMatches(z10, i10, (String) charSequence2, i11, i12) : charSequence.toString().regionMatches(z10, i10, charSequence2.toString(), i11, i12);
    }

    public static CharSequence subSequence(CharSequence charSequence, int i10) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.subSequence(i10, charSequence.length());
    }

    public static char[] toCharArray(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return ((String) charSequence).toCharArray();
        }
        int length = charSequence.length();
        char[] cArr = new char[charSequence.length()];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = charSequence.charAt(i10);
        }
        return cArr;
    }

    public static int indexOf(CharSequence charSequence, CharSequence charSequence2, int i10) {
        return charSequence.toString().indexOf(charSequence2.toString(), i10);
    }

    public static int lastIndexOf(CharSequence charSequence, CharSequence charSequence2, int i10) {
        return charSequence.toString().lastIndexOf(charSequence2.toString(), i10);
    }
}
