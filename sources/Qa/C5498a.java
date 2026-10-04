package qa;

import Ra.b;
import android.app.Activity;
import android.net.Uri;
import com.android.launcher3.IconCache;
import com.cookiegames.smartcookie.i;

/* JADX INFO: renamed from: qa.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5498a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f226973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f226974b = {"com.cn", "gov.cn", "edu.cn"};

    public static boolean a(String str) {
        for (String str2 : f226974b) {
            if (str.endsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static void b(Activity activity) {
        if (f226973a != null) {
            try {
                i.f141335i.getClass();
                i.f141338l.k().d().b(activity, f226973a);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            f226973a = null;
        }
    }

    public static void c(Activity activity, String str) {
        String strReplace;
        try {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            if ("https".equalsIgnoreCase(scheme) || "http".equalsIgnoreCase(scheme)) {
                String host = uri.getHost();
                if (host == null) {
                    strReplace = "host_null";
                } else {
                    String lowerCase = host.toLowerCase();
                    String[] strArrSplit = lowerCase.split("\\.");
                    if (strArrSplit.length > 2) {
                        if (a(lowerCase)) {
                            lowerCase = strArrSplit[strArrSplit.length - 3] + IconCache.EMPTY_CLASS_NAME + strArrSplit[strArrSplit.length - 2] + IconCache.EMPTY_CLASS_NAME + strArrSplit[strArrSplit.length - 1];
                        } else {
                            lowerCase = strArrSplit[strArrSplit.length - 2] + IconCache.EMPTY_CLASS_NAME + strArrSplit[strArrSplit.length - 1];
                        }
                    }
                    strReplace = lowerCase.replace('.', b.f67799c);
                }
            } else {
                strReplace = "scheme_" + scheme;
            }
        } catch (Throwable unused) {
            strReplace = "failed";
        }
        b(activity);
        f226973a = strReplace;
        try {
            i.f141335i.getClass();
            i.f141338l.k().d().a(activity, f226973a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
