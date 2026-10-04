package com.prism.commons.utils;

import android.app.Activity;

/* JADX INFO: loaded from: classes5.dex */
public class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f162035a = 600;

    public static void a(Activity activity) {
        if (activity == null) {
            return;
        }
        int i10 = activity.getResources().getConfiguration().smallestScreenWidthDp >= 600 ? -1 : 1;
        if (activity.getRequestedOrientation() != i10) {
            activity.setRequestedOrientation(i10);
        }
    }
}
