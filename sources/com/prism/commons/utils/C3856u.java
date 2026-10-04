package com.prism.commons.utils;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import androidx.core.view.M1;
import androidx.core.view.N0;

/* JADX INFO: renamed from: com.prism.commons.utils.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3856u {
    public static void a(Activity activity, boolean z10) {
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        N0.c(window, false);
        int i10 = Build.VERSION.SDK_INT;
        window.clearFlags(201326592);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        if (i10 >= 29) {
            window.setStatusBarContrastEnforced(false);
            window.setNavigationBarContrastEnforced(false);
        }
        M1 m12 = new M1(window, window.getDecorView());
        m12.i(!z10);
        m12.h(!z10);
    }
}
