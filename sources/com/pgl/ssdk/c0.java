package com.pgl.ssdk;

import android.content.Context;
import android.graphics.Point;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import q8.C5443b;

/* JADX INFO: loaded from: classes5.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f161809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f161810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f161811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f161812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f161813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f161814f;

    private static void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f161811c = (int) displayMetrics.density;
            f161812d = displayMetrics.densityDpi;
        } catch (Throwable unused) {
        }
    }

    private static void b(Context context) {
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f161813e = (int) displayMetrics.xdpi;
            f161814f = (int) displayMetrics.ydpi;
        } catch (Throwable unused) {
        }
    }

    private static void c(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService(C5443b.f226850e)).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            f161809a = point.x;
            f161810b = point.y;
        } catch (Throwable unused) {
        }
    }

    public static String d(Context context) {
        int i10 = -1;
        if (context != null) {
            try {
                i10 = Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
            } catch (Throwable unused) {
            }
        }
        return String.valueOf(i10);
    }

    public static String e(Context context) {
        try {
            c(context);
            a(context);
            b(context);
        } catch (Throwable unused) {
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f161812d);
        sb2.append("[<!>]");
        sb2.append(f161809a);
        sb2.append(",");
        return android.support.v4.media.d.a(sb2, f161810b, "[<!>]");
    }
}
