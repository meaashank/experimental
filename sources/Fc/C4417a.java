package fc;

/* JADX INFO: renamed from: fc.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C4417a {
    public static boolean a(String str, String str2) {
        if (str == null || str2 == null || str2.length() > str.length()) {
            return false;
        }
        int i10 = 0;
        int i11 = 0;
        do {
            if (str2.charAt(i10) == str.charAt(i11)) {
                i11++;
                i10++;
            } else {
                if (i10 > 0) {
                    break;
                }
                i11++;
            }
            if (i11 >= str.length()) {
                break;
            }
        } while (i10 < str2.length());
        return i10 == str2.length();
    }
}
