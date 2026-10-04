package androidx.transition;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.util.Log;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.transition.C2705q;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f117744a = "ViewGroupUtilsApi14";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f117745b = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static LayoutTransition f117746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Field f117747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f117748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Method f117749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f117750g;

    public class a extends LayoutTransition {
        @Override // android.animation.LayoutTransition
        public boolean isChangingLayout() {
            return true;
        }
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static void a(LayoutTransition layoutTransition) {
        if (!f117750g) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", null);
                f117749f = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.i(f117744a, "Failed to access cancel method by reflection");
            }
            f117750g = true;
        }
        Method method = f117749f;
        if (method != null) {
            try {
                method.invoke(layoutTransition, null);
            } catch (IllegalAccessException unused2) {
                Log.i(f117744a, "Failed to access cancel method by reflection");
            } catch (InvocationTargetException unused3) {
                Log.i(f117744a, "Failed to invoke cancel method by reflection");
            }
        }
    }

    public static void b(@NonNull ViewGroup viewGroup, boolean z10) {
        boolean z11 = false;
        if (f117746c == null) {
            a aVar = new a();
            f117746c = aVar;
            aVar.setAnimator(2, null);
            f117746c.setAnimator(0, null);
            f117746c.setAnimator(1, null);
            f117746c.setAnimator(3, null);
            f117746c.setAnimator(4, null);
        }
        if (z10) {
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null) {
                if (layoutTransition.isRunning()) {
                    a(layoutTransition);
                }
                if (layoutTransition != f117746c) {
                    viewGroup.setTag(C2705q.g.f118509S1, layoutTransition);
                }
            }
            viewGroup.setLayoutTransition(f117746c);
            return;
        }
        viewGroup.setLayoutTransition(null);
        if (!f117748e) {
            try {
                Field declaredField = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                f117747d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i(f117744a, "Failed to access mLayoutSuppressed field by reflection");
            }
            f117748e = true;
        }
        Field field = f117747d;
        if (field != null) {
            try {
                boolean z12 = field.getBoolean(viewGroup);
                if (z12) {
                    try {
                        f117747d.setBoolean(viewGroup, false);
                    } catch (IllegalAccessException unused2) {
                        z11 = z12;
                        Log.i(f117744a, "Failed to get mLayoutSuppressed field by reflection");
                    }
                }
                z11 = z12;
            } catch (IllegalAccessException unused3) {
            }
        }
        if (z11) {
            viewGroup.requestLayout();
        }
        int i10 = C2705q.g.f118509S1;
        LayoutTransition layoutTransition2 = (LayoutTransition) viewGroup.getTag(i10);
        if (layoutTransition2 != null) {
            viewGroup.setTag(i10, null);
            viewGroup.setLayoutTransition(layoutTransition2);
        }
    }
}
