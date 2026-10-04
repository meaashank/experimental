package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: loaded from: classes5.dex */
public class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f156813a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f156814b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f156815c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f156816d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f156817e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f156818f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f156819g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f156820h = true;

    static {
        if (MBridgeConstans.DEBUG) {
            return;
        }
        f156819g = false;
        f156813a = false;
        f156815c = false;
        f156820h = false;
        f156814b = false;
        f156818f = false;
        f156817e = false;
        f156816d = false;
    }

    public static void a(String str, String str2) {
        if (!f156813a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2);
    }

    public static void b(String str, String str2) {
        if (!f156814b || str2 == null) {
            return;
        }
        Log.e(a(str), str2);
    }

    public static void c(String str, String str2) {
        if (!f156815c || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(a(str), str2);
    }

    public static void d(String str, String str2) {
        if (!f156820h || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2);
    }

    public static void b(String str, String str2, Throwable th) {
        if (!f156814b || str2 == null || th == null) {
            return;
        }
        Log.e(a(str), str2, th);
    }

    private static String a(String str) {
        return !TextUtils.isEmpty(str) ? w.y.a("MBRIDGE_", str) : str;
    }

    public static void c(String str, String str2, Throwable th) {
        if (!f156820h || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2, th);
    }

    public static void a(String str, String str2, Throwable th) {
        if (!f156813a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2, th);
    }

    public static void a(String str, Throwable th) {
        if (!f156820h || th == null) {
            return;
        }
        Log.w(a(str), th);
    }
}
