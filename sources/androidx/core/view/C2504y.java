package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.core.view.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2504y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f111972a;

    /* JADX INFO: renamed from: androidx.core.view.y$a */
    @e.T(28)
    public static class a {
        public static DisplayCutout a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        public static List<Rect> b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        public static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        public static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        public static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        public static int f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.y$b */
    @e.T(29)
    public static class b {
        public static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.y$c */
    @e.T(30)
    public static class c {
        public static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }

        public static Insets b(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.y$d */
    @e.T(31)
    public static class d {
        @Nullable
        public static Path a(DisplayCutout displayCutout) {
            return displayCutout.getCutoutPath();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.y$e */
    @e.T(33)
    public static class e {
        public static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2, Path path) {
            return new DisplayCutout.Builder().setSafeInsets(insets).setBoundingRectLeft(rect).setBoundingRectTop(rect2).setBoundingRectRight(rect3).setBoundingRectBottom(rect4).setWaterfallInsets(insets2).setCutoutPath(path).build();
        }
    }

    public C2504y(@Nullable Rect rect, @Nullable List<Rect> list) {
        this(Build.VERSION.SDK_INT >= 28 ? a.a(rect, list) : null);
    }

    public static DisplayCutout a(@NonNull G0.D d10, @Nullable Rect rect, @Nullable Rect rect2, @Nullable Rect rect3, @Nullable Rect rect4, @NonNull G0.D d11, @Nullable Path path) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return e.a(d10.h(), rect, rect2, rect3, rect4, d11.h(), path);
        }
        if (i10 >= 30) {
            return c.a(d10.h(), rect, rect2, rect3, rect4, d11.h());
        }
        if (i10 >= 29) {
            return b.a(d10.h(), rect, rect2, rect3, rect4);
        }
        if (i10 < 28) {
            return null;
        }
        Rect rect5 = new Rect(d10.f40031a, d10.f40032b, d10.f40033c, d10.f40034d);
        ArrayList arrayList = new ArrayList();
        if (rect != null) {
            arrayList.add(rect);
        }
        if (rect2 != null) {
            arrayList.add(rect2);
        }
        if (rect3 != null) {
            arrayList.add(rect3);
        }
        if (rect4 != null) {
            arrayList.add(rect4);
        }
        return a.a(rect5, arrayList);
    }

    public static C2504y j(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C2504y(displayCutout);
    }

    @NonNull
    public List<Rect> b() {
        return Build.VERSION.SDK_INT >= 28 ? a.b(this.f111972a) : Collections.EMPTY_LIST;
    }

    @Nullable
    public Path c() {
        if (Build.VERSION.SDK_INT >= 31) {
            return d.a(this.f111972a);
        }
        return null;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.c(this.f111972a);
        }
        return 0;
    }

    public int e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.d(this.f111972a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2504y.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f111972a, ((C2504y) obj).f111972a);
    }

    public int f() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.e(this.f111972a);
        }
        return 0;
    }

    public int g() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.f(this.f111972a);
        }
        return 0;
    }

    @NonNull
    public G0.D h() {
        return Build.VERSION.SDK_INT >= 30 ? G0.D.g(c.b(this.f111972a)) : G0.D.f40030e;
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f111972a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    @e.T(28)
    public DisplayCutout i() {
        return this.f111972a;
    }

    @NonNull
    public String toString() {
        return "DisplayCutoutCompat{" + this.f111972a + "}";
    }

    public C2504y(@NonNull G0.D d10, @Nullable Rect rect, @Nullable Rect rect2, @Nullable Rect rect3, @Nullable Rect rect4, @NonNull G0.D d11) {
        this(a(d10, rect, rect2, rect3, rect4, d11, null));
    }

    public C2504y(@NonNull G0.D d10, @Nullable Rect rect, @Nullable Rect rect2, @Nullable Rect rect3, @Nullable Rect rect4, @NonNull G0.D d11, @Nullable Path path) {
        this(a(d10, rect, rect2, rect3, rect4, d11, path));
    }

    public C2504y(DisplayCutout displayCutout) {
        this.f111972a = displayCutout;
    }
}
