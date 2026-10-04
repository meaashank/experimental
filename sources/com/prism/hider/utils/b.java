package com.prism.hider.utils;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Display;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f168365a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f168366b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f168367c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static float f168368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static float f168369e;

    public static int a(float f10) {
        return (int) ((f10 * f168368d) + 0.5f);
    }

    public static int b(Activity activity) {
        if (!f168365a) {
            synchronized (b.class) {
                try {
                    if (!f168365a) {
                        c(activity);
                    }
                } finally {
                }
            }
        }
        return f168366b;
    }

    public static void c(Activity activity) {
        if (f168365a) {
            return;
        }
        f168365a = true;
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        f168366b = displayMetrics.widthPixels;
        f168367c = displayMetrics.heightPixels;
        f168368d = displayMetrics.density;
        f168369e = displayMetrics.scaledDensity;
    }

    public static int d(float f10) {
        return (int) ((f10 / f168368d) + 0.5f);
    }

    public static int e(float f10) {
        return (int) ((f10 / f168369e) + 0.5f);
    }

    public static int f(float f10) {
        return (int) ((f10 * f168369e) + 0.5f);
    }
}
