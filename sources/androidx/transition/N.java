package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.C2507z0;

/* JADX INFO: loaded from: classes2.dex */
public class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f117759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f117760b = "ViewUtils";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Property<View, Float> f117761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Property<View, Rect> f117762d;

    public class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(N.c(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            N.h(view, f10.floatValue());
        }
    }

    public class b extends Property<View, Rect> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return C2507z0.Q(view);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            C2507z0.S1(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f117759a = new Z();
        } else {
            f117759a = new Y();
        }
        f117761c = new a(Float.class, "translationAlpha");
        f117762d = new b(Rect.class, "clipBounds");
    }

    public static void a(@NonNull View view) {
        f117759a.a(view);
    }

    public static M b(@NonNull View view) {
        return new L(view);
    }

    public static float c(@NonNull View view) {
        return f117759a.c(view);
    }

    public static e0 d(@NonNull View view) {
        return new d0(view);
    }

    public static void e(@NonNull View view) {
        f117759a.d(view);
    }

    public static void f(@NonNull View view, @Nullable Matrix matrix) {
        f117759a.e(view, matrix);
    }

    public static void g(@NonNull View view, int i10, int i11, int i12, int i13) {
        f117759a.f(view, i10, i11, i12, i13);
    }

    public static void h(@NonNull View view, float f10) {
        f117759a.g(view, f10);
    }

    public static void i(@NonNull View view, int i10) {
        f117759a.h(view, i10);
    }

    public static void j(@NonNull View view, @NonNull Matrix matrix) {
        f117759a.i(view, matrix);
    }

    public static void k(@NonNull View view, @NonNull Matrix matrix) {
        f117759a.j(view, matrix);
    }
}
