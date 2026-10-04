package com.prism.gaia.helper.utils;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f165225a = "preferences_gaia";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static w f165226b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final String f165227c = "pkg_has_dex_ext";

    @Deprecated
    public static String a(String str) {
        return w.y.a("pkg_has_dex_ext_", str);
    }

    public static void b(Context context) {
        f165226b = new w(context, "preferences_gaia");
    }

    @Deprecated
    public static boolean c(String str) {
        return f165226b.a(a(str), false);
    }

    @Deprecated
    public static void d(String str, boolean z10) {
        f165226b.f(a(str), z10);
    }
}
