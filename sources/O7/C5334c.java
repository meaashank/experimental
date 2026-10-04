package o7;

import B0.C0922f;
import com.android.launcher3.IconCache;

/* JADX INFO: renamed from: o7.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C5334c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f223352a = ".guestbox.invalid";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f223353b = "app";

    public static String a(String str, String str2) {
        if (!c(str2) || str == null) {
            return str2;
        }
        String str3 = d(str) + IconCache.EMPTY_CLASS_NAME;
        String strA = C0922f.a(str2, 17, 0);
        if (!strA.startsWith(str3)) {
            return str2;
        }
        String strSubstring = strA.substring(str3.length());
        if ("app".equals(strSubstring)) {
            return null;
        }
        return strSubstring;
    }

    public static String b(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        if (str2 == null || str2.isEmpty()) {
            str2 = "app";
        }
        return d(str) + IconCache.EMPTY_CLASS_NAME + str2 + f223352a;
    }

    public static boolean c(String str) {
        return str != null && str.endsWith(f223352a);
    }

    public static String d(String str) {
        String[] strArrSplit = str.split("\\.");
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int length = strArrSplit.length - 1; length >= 0; length--) {
            if (sb2.length() > 0) {
                sb2.append('.');
            }
            sb2.append(strArrSplit[length]);
        }
        return sb2.toString();
    }
}
