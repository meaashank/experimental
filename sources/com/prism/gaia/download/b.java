package com.prism.gaia.download;

import android.content.Context;
import android.drm.DrmManagerClient;
import com.android.launcher3.IconCache;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f164616a = "application/vnd.oma.drm.message";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f164617b = ".dm";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f164618c = ".fl";

    public static String a(Context context, String str, String str2) {
        DrmManagerClient drmManagerClient = new DrmManagerClient(context);
        try {
            if (drmManagerClient.canHandle(str, (String) null)) {
                return drmManagerClient.getOriginalMimeType(str);
            }
        } catch (IllegalArgumentException unused) {
            String str3 = a.f164590a;
        } catch (IllegalStateException unused2) {
            String str4 = a.f164590a;
        }
        return str2;
    }

    public static boolean b(String str) {
        return f164616a.equals(str);
    }

    public static boolean c(Context context, String str) {
        if (context == null) {
            return false;
        }
        try {
            DrmManagerClient drmManagerClient = new DrmManagerClient(context);
            if (str == null || str.length() <= 0) {
                return false;
            }
            return drmManagerClient.canHandle("", str);
        } catch (IllegalArgumentException unused) {
            String str2 = a.f164590a;
            return false;
        } catch (IllegalStateException unused2) {
            String str3 = a.f164590a;
            return false;
        }
    }

    public static String d(String str) {
        if (str == null) {
            return str;
        }
        int iLastIndexOf = str.lastIndexOf(IconCache.EMPTY_CLASS_NAME);
        if (iLastIndexOf != -1) {
            str = str.substring(0, iLastIndexOf);
        }
        return str.concat(f164618c);
    }
}
