package com.prism.commons.utils;

import android.annotation.SuppressLint;
import android.os.Build;

/* JADX INFO: renamed from: com.prism.commons.utils.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3841e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f162085a = "samsung";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f162086b = "huawei";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f162087c = "xiaomi";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f162088d = "vivo";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f162089e = "oppo";

    public static boolean A() {
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 31) {
            if (i11 != 30) {
                return false;
            }
            try {
                i10 = Build.VERSION.PREVIEW_SDK_INT;
            } catch (Throwable unused) {
                i10 = 0;
            }
            if (i10 <= 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean B() {
        return Build.VERSION.SDK_INT >= 32;
    }

    public static boolean C() {
        return b().toLowerCase().contains(f162085a.toLowerCase()) || a().equalsIgnoreCase(f162085a);
    }

    public static boolean D() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static boolean E() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public static boolean F() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static boolean G() {
        return Build.VERSION.SDK_INT >= 36;
    }

    public static boolean H() {
        return Build.VERSION.SDK_INT >= 37;
    }

    public static boolean I() {
        return b().toLowerCase().contains(f162088d.toLowerCase());
    }

    public static boolean J() {
        return b().toLowerCase().contains(f162087c.toLowerCase());
    }

    public static String a() {
        String str = Build.BRAND;
        return str == null ? "" : str.trim();
    }

    public static String b() {
        String str = Build.MANUFACTURER;
        return str == null ? "" : str.trim();
    }

    public static int c() {
        try {
            return Build.VERSION.PREVIEW_SDK_INT;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static boolean d() {
        String lowerCase = b().toLowerCase();
        return lowerCase.contains(f162086b.toLowerCase()) || lowerCase.contains("honor");
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public static boolean e() {
        return true;
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public static boolean f() {
        return true;
    }

    public static boolean g() {
        return true;
    }

    public static boolean h() {
        return true;
    }

    public static boolean i() {
        return true;
    }

    public static boolean j() {
        return true;
    }

    public static boolean k() {
        return true;
    }

    public static boolean l() {
        return true;
    }

    public static boolean m() {
        return false;
    }

    public static boolean n() {
        return true;
    }

    public static boolean o() {
        return true;
    }

    public static boolean p() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean q() {
        return Build.VERSION.SDK_INT >= 25;
    }

    public static boolean r() {
        return Build.VERSION.SDK_INT == 25;
    }

    public static boolean s() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean t() {
        return Build.VERSION.SDK_INT >= 27;
    }

    public static boolean u() {
        return b().toLowerCase().contains(f162089e.toLowerCase());
    }

    public static boolean v() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean w() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean x() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean y() {
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 30) {
            if (i11 != 29) {
                return false;
            }
            try {
                i10 = Build.VERSION.PREVIEW_SDK_INT;
            } catch (Throwable unused) {
                i10 = 0;
            }
            if (i10 <= 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean z() {
        return Build.VERSION.SDK_INT >= 31;
    }
}
