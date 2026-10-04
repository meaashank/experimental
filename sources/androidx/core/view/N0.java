package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.core.text.BidiFormatter;

/* JADX INFO: loaded from: classes2.dex */
public final class N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f111580a = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f111581b = 9;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f111582c = 10;

    public static class a {
        public static void a(@NonNull Window window, boolean z10) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z10 ? systemUiVisibility & (-1793) : systemUiVisibility | BidiFormatter.a.f111332f);
        }
    }

    @e.T(28)
    public static class b {
        public static <T> T a(Window window, int i10) {
            return (T) window.requireViewById(i10);
        }
    }

    @e.T(30)
    public static class c {
        public static void a(@NonNull Window window, boolean z10) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z10 ? systemUiVisibility & (-257) : systemUiVisibility | 256);
            window.setDecorFitsSystemWindows(z10);
        }
    }

    @e.T(35)
    public static class d {
        public static void a(@NonNull Window window, boolean z10) {
            window.setDecorFitsSystemWindows(z10);
        }
    }

    @NonNull
    public static M1 a(@NonNull Window window, @NonNull View view) {
        return new M1(window, view);
    }

    @NonNull
    public static <T extends View> T b(@NonNull Window window, @e.C int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) b.a(window, i10);
        }
        T t10 = (T) window.findViewById(i10);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    }

    public static void c(@NonNull Window window, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            d.a(window, z10);
        } else if (i10 >= 30) {
            c.a(window, z10);
        } else {
            a.a(window, z10);
        }
    }
}
