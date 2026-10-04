package com.prism.commons.utils;

import android.content.Context;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes5.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static DisplayMetrics f162135a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f162136b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f162137c = -1;

    public static int a(Context context, int i10) {
        return (int) ((i10 * b(context).density) + 0.5f);
    }

    public static DisplayMetrics b(Context context) {
        if (f162135a == null) {
            f162135a = context.getResources().getDisplayMetrics();
        }
        return f162135a;
    }

    public static int c(Context context) {
        if (f162137c == -1) {
            g(context);
        }
        return f162137c;
    }

    public static float d(Context context) {
        return c(context) / e(context);
    }

    public static int e(Context context) {
        if (f162136b == -1) {
            g(context);
        }
        return f162136b;
    }

    public static int f(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static void g(Context context) {
        DisplayMetrics displayMetricsB = b(context);
        f162137c = Math.max(displayMetricsB.heightPixels, displayMetricsB.widthPixels);
        f162136b = Math.min(displayMetricsB.heightPixels, displayMetricsB.widthPixels);
    }
}
