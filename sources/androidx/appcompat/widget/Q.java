package androidx.appcompat.widget;

import G0.C1162y;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import g.C4426a;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f86130a = "ThemeUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f86131b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f86132c = {-16842910};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f86133d = {R.attr.state_focused};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f86134e = {R.attr.state_activated};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f86135f = {R.attr.state_pressed};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f86136g = {R.attr.state_checked};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f86137h = {R.attr.state_selected};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f86138i = {-16842919, -16842908};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f86139j = new int[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f86140k = new int[1];

    public static void a(@NonNull View view, @NonNull Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C4426a.m.f201887S0);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(C4426a.m.f202008g3)) {
                Log.e(f86130a, "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @NonNull
    public static ColorStateList b(int i10, int i11) {
        return new ColorStateList(new int[][]{f86132c, f86139j}, new int[]{i11, i10});
    }

    public static int c(@NonNull Context context, int i10) {
        ColorStateList colorStateListF = f(context, i10);
        if (colorStateListF != null && colorStateListF.isStateful()) {
            return colorStateListF.getColorForState(f86132c, colorStateListF.getDefaultColor());
        }
        TypedValue typedValueG = g();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueG, true);
        return e(context, i10, typedValueG.getFloat());
    }

    public static int d(@NonNull Context context, int i10) {
        int[] iArr = f86140k;
        iArr[0] = i10;
        W wF = W.F(context, null, iArr);
        try {
            return wF.f86249b.getColor(0, 0);
        } finally {
            wF.I();
        }
    }

    public static int e(@NonNull Context context, int i10, float f10) {
        return C1162y.D(d(context, i10), Math.round(Color.alpha(r0) * f10));
    }

    @Nullable
    public static ColorStateList f(@NonNull Context context, int i10) {
        int[] iArr = f86140k;
        iArr[0] = i10;
        W wF = W.F(context, null, iArr);
        try {
            return wF.d(0);
        } finally {
            wF.I();
        }
    }

    public static TypedValue g() {
        ThreadLocal<TypedValue> threadLocal = f86131b;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
