package com.prism.gaia.helper.compat;

import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.prism.gaia.naked.compat.android.app.ActivityManagerNativeCompat2;
import com.prism.gaia.naked.metadata.android.app.ActivityManagerCAG;
import com.prism.gaia.naked.metadata.android.app.IActivityManagerCAG;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f164978a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f164979b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f164980c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f164981d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f164982e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f164983f = -2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f164985h = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f164988k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f164989l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f164990m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f164991n = 3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f164992o = 4;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f164993p = 5;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f164994q = 5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f164995r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f164996s = -4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f164984g = ActivityManagerCAG.f165271G.START_INTENT_NOT_RESOLVED().get();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f164986i = ActivityManagerCAG.f165271G.START_CANCELED().get();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f164987j = ActivityManagerCAG.M23.START_NOT_CURRENT_USER_ACTIVITY().get();

    public static boolean a(IBinder iBinder, int i10, Intent intent) {
        return Build.VERSION.SDK_INT >= 24 ? IActivityManagerCAG.N24.finishActivity().call(ActivityManagerNativeCompat2.Util.getIActivityManager(), iBinder, Integer.valueOf(i10), intent, 0).booleanValue() : IActivityManagerCAG.L21_M23.finishActivity().call(ActivityManagerNativeCompat2.Util.getIActivityManager(), iBinder, Integer.valueOf(i10), intent, Boolean.FALSE).booleanValue();
    }
}
