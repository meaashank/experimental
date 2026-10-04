package com.prism.commons.utils;

import android.content.Context;

/* JADX INFO: renamed from: com.prism.commons.utils.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3846j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f162105a = "PREFERENCE_NAME_COMMON";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f162106b = "PREFERENCE_KEY_LAUNCH_COUNT";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static V f162107c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f162108d = -1;

    public static int a(Context context) {
        if (f162108d < 0) {
            f162108d = b().d(context, f162106b, 0);
        }
        return f162108d;
    }

    public static V b() {
        V v10 = f162107c;
        if (v10 != null) {
            return v10;
        }
        synchronized (C3846j.class) {
            try {
                V v11 = f162107c;
                if (v11 != null) {
                    return v11;
                }
                V v12 = new V(f162105a);
                f162107c = v12;
                return v12;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c(Context context) {
        f162108d = a(context) + 1;
        b().k(context, f162106b, f162108d);
    }
}
