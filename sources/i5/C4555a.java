package i5;

import android.content.Context;
import bb.C2850a;
import com.prism.commons.utils.C3846j;
import com.prism.commons.utils.V;

/* JADX INFO: renamed from: i5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4555a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f202847a = "CLOUD_SETTING_SYNC_WIFI_ONLY";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f202848b = "AUTO_ROTATE";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f202849c = "PREFERENCE_NAME_GALLERY";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f202850d = "ITEM_HAS_BEEN_LAUNCHED";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static V f202851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Boolean f202852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Boolean f202853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Boolean f202854h;

    public static boolean a(Context context) {
        if (f202853g == null) {
            f202853g = Boolean.valueOf(c().c(context, f202848b, false));
        }
        return f202853g.booleanValue();
    }

    public static String b(Context context, String str) {
        return context.getApplicationContext().getSharedPreferences("prism.gallery", 0).getString(C2850a.f126018c, str);
    }

    public static V c() {
        if (f202851e == null) {
            synchronized (C3846j.class) {
                try {
                    if (f202851e == null) {
                        f202851e = new V(f202849c);
                    }
                } finally {
                }
            }
        }
        return f202851e;
    }

    public static boolean d(Context context) {
        if (f202852f == null) {
            f202852f = Boolean.valueOf(c().c(context, f202847a, true));
        }
        return f202852f.booleanValue();
    }

    public static boolean e(Context context) {
        if (f202854h == null) {
            f202854h = Boolean.valueOf(c().c(context, f202850d, false));
        }
        return f202854h.booleanValue();
    }

    public static void f(Context context, boolean z10) {
        c().j(context, f202848b, z10);
        f202853g = Boolean.valueOf(z10);
    }

    public static void g(Context context, boolean z10) {
        c().j(context, f202850d, z10);
        f202854h = Boolean.valueOf(z10);
    }

    public static void h(Context context, boolean z10) {
        c().j(context, f202847a, z10);
        f202852f = Boolean.valueOf(z10);
    }
}
