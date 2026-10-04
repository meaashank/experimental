package C4;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f17581a = " ";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f17582b = "";

    public static boolean a(@NonNull StringBuilder sb2, @NonNull String str) {
        return sb2.indexOf(str) >= 0;
    }

    public static boolean b(@NonNull StringBuilder sb2, @NonNull String str) {
        int length = sb2.length();
        if (length != str.length()) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (sb2.charAt(i10) != str.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(@NonNull StringBuilder sb2) {
        return sb2.length() == 0;
    }

    public static void d(@NonNull StringBuilder sb2, @NonNull String str, @NonNull String str2) {
        int iIndexOf = sb2.indexOf(str);
        if (iIndexOf >= 0) {
            sb2.replace(iIndexOf, str.length() + iIndexOf, str2);
        }
    }

    public static boolean e(@NonNull StringBuilder sb2, @NonNull String str) {
        return sb2.indexOf(str) == 0;
    }

    @NonNull
    public static StringBuilder f(@NonNull StringBuilder sb2, int i10, int i11) {
        StringBuilder sb3 = new StringBuilder(sb2);
        sb3.replace(i11, sb2.length(), "");
        sb3.replace(0, i10, "");
        return sb3;
    }

    public static void g(@NonNull StringBuilder sb2) {
        while (sb2.indexOf(f17581a) == 0) {
            sb2.replace(0, 1, "");
        }
        while (sb2.lastIndexOf(f17581a) == sb2.length() - 1 && sb2.length() > 0) {
            sb2.replace(sb2.length() - 1, sb2.length(), "");
        }
    }
}
