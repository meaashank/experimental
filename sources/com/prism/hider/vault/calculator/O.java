package com.prism.hider.vault.calculator;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes6.dex */
public final class O {
    public static /* synthetic */ void b(final View view, int i10, int i11, int i12, int i13, int i14, View view2, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22) {
        int i23;
        int i24;
        int systemWindowInsetTop;
        int systemWindowInsetRight;
        int i25 = Build.VERSION.SDK_INT;
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            i23 = 0;
            i24 = 0;
            systemWindowInsetTop = 0;
            systemWindowInsetRight = 0;
        } else if (i25 >= 30) {
            Insets insets = rootWindowInsets.getInsets(WindowInsets.Type.systemBars());
            i24 = insets.left;
            systemWindowInsetTop = insets.top;
            systemWindowInsetRight = insets.right;
            i23 = insets.bottom;
        } else {
            int systemWindowInsetLeft = rootWindowInsets.getSystemWindowInsetLeft();
            systemWindowInsetTop = rootWindowInsets.getSystemWindowInsetTop();
            systemWindowInsetRight = rootWindowInsets.getSystemWindowInsetRight();
            int systemWindowInsetBottom = rootWindowInsets.getSystemWindowInsetBottom();
            i24 = systemWindowInsetLeft;
            i23 = systemWindowInsetBottom;
        }
        int width = (view.getWidth() - i24) - systemWindowInsetRight;
        int height = (view.getHeight() - systemWindowInsetTop) - i23;
        if (i10 <= 0) {
            i10 = width;
        }
        if (height > 0) {
            i10 = Math.min(i10, (int) (height * 0.62f));
        }
        int iMin = Math.min(width, i10);
        int i26 = width > iMin ? (width - iMin) / 2 : 0;
        final int i27 = i11 + i24 + i26;
        final int i28 = i12 + systemWindowInsetTop;
        final int i29 = i13 + systemWindowInsetRight + i26;
        final int i30 = i14 + i23;
        if (i27 == view.getPaddingLeft() && i28 == view.getPaddingTop() && i29 == view.getPaddingRight() && i30 == view.getPaddingBottom()) {
            return;
        }
        view.post(new Runnable() { // from class: com.prism.hider.vault.calculator.N
            @Override // java.lang.Runnable
            public final void run() {
                view.setPadding(i27, i28, i29, i30);
            }
        });
    }

    public static /* synthetic */ WindowInsets c(int i10, int i11, int i12, int i13, View view, WindowInsets windowInsets) {
        int systemWindowInsetLeft;
        int systemWindowInsetTop;
        int systemWindowInsetRight;
        int systemWindowInsetBottom;
        if (Build.VERSION.SDK_INT >= 30) {
            Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars());
            systemWindowInsetLeft = insets.left;
            systemWindowInsetTop = insets.top;
            systemWindowInsetRight = insets.right;
            systemWindowInsetBottom = insets.bottom;
        } else {
            systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
            systemWindowInsetRight = windowInsets.getSystemWindowInsetRight();
            systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        }
        view.setPadding(i10 + systemWindowInsetLeft, i11 + systemWindowInsetTop, i12 + systemWindowInsetRight, i13 + systemWindowInsetBottom);
        return windowInsets;
    }

    public static void d(Activity activity, int i10, int i11) {
        if (activity == null) {
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        int i12 = Build.VERSION.SDK_INT;
        int iH = h(systemUiVisibility, 8192, e(i10));
        if (i12 >= 26) {
            iH = h(iH, 16, e(i11));
        }
        decorView.setSystemUiVisibility(iH);
    }

    public static boolean e(int i10) {
        if (Color.alpha(i10) < 128) {
            return true;
        }
        return ((((double) Color.blue(i10)) * 0.114d) + ((((double) Color.green(i10)) * 0.587d) + (((double) Color.red(i10)) * 0.299d))) / 255.0d > 0.6d;
    }

    public static void f(View view) {
        final int paddingLeft = view.getPaddingLeft();
        final int paddingTop = view.getPaddingTop();
        final int paddingRight = view.getPaddingRight();
        final int paddingBottom = view.getPaddingBottom();
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.prism.hider.vault.calculator.L
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                O.c(paddingLeft, paddingTop, paddingRight, paddingBottom, view2, windowInsets);
                return windowInsets;
            }
        });
        view.requestApplyInsets();
    }

    public static void g(final View view, int i10) {
        final int paddingLeft = view.getPaddingLeft();
        final int paddingTop = view.getPaddingTop();
        final int paddingRight = view.getPaddingRight();
        final int paddingBottom = view.getPaddingBottom();
        final int i11 = (int) (i10 * view.getResources().getDisplayMetrics().density);
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.prism.hider.vault.calculator.M
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                O.b(view, i11, paddingLeft, paddingTop, paddingRight, paddingBottom, view2, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        });
        view.requestLayout();
    }

    public static int h(int i10, int i11, boolean z10) {
        return z10 ? i10 | i11 : i10 & (~i11);
    }

    public static void i(Activity activity) {
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        window.clearFlags(201326592);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1280);
    }
}
