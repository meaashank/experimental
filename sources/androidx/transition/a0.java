package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.C2705q;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f117821b = "ViewUtilsBase";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f117822c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f117823d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f117824e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f117825f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f117826g = 12;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f117827a;

    public void a(@NonNull View view) {
        if (view.getVisibility() == 0) {
            view.setTag(C2705q.g.f118526Y0, null);
        }
    }

    @SuppressLint({"PrivateApi", "SoonBlockedPrivateApi"})
    public final void b() {
        if (f117823d) {
            return;
        }
        try {
            Class cls = Integer.TYPE;
            Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
            f117822c = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e10) {
            Log.i(f117821b, "Failed to retrieve setFrame method", e10);
        }
        f117823d = true;
    }

    public float c(@NonNull View view) {
        Float f10 = (Float) view.getTag(C2705q.g.f118526Y0);
        return f10 != null ? view.getAlpha() / f10.floatValue() : view.getAlpha();
    }

    public void d(@NonNull View view) {
        int i10 = C2705q.g.f118526Y0;
        if (view.getTag(i10) == null) {
            view.setTag(i10, Float.valueOf(view.getAlpha()));
        }
    }

    public void e(@NonNull View view, @Nullable Matrix matrix) {
        if (matrix == null || matrix.isIdentity()) {
            view.setPivotX(view.getWidth() / 2);
            view.setPivotY(view.getHeight() / 2);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotation(0.0f);
            return;
        }
        float[] fArr = this.f117827a;
        if (fArr == null) {
            fArr = new float[9];
            this.f117827a = fArr;
        }
        matrix.getValues(fArr);
        float f10 = fArr[3];
        float fSqrt = ((float) Math.sqrt(1.0f - (f10 * f10))) * (fArr[0] < 0.0f ? -1 : 1);
        float degrees = (float) Math.toDegrees(Math.atan2(f10, fSqrt));
        float f11 = fArr[0] / fSqrt;
        float f12 = fArr[4] / fSqrt;
        float f13 = fArr[2];
        float f14 = fArr[5];
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationX(f13);
        view.setTranslationY(f14);
        view.setRotation(degrees);
        view.setScaleX(f11);
        view.setScaleY(f12);
    }

    public void f(@NonNull View view, int i10, int i11, int i12, int i13) {
        b();
        Method method = f117822c;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
    }

    public void g(@NonNull View view, float f10) {
        Float f11 = (Float) view.getTag(C2705q.g.f118526Y0);
        if (f11 != null) {
            view.setAlpha(f11.floatValue() * f10);
        } else {
            view.setAlpha(f10);
        }
    }

    public void h(@NonNull View view, int i10) {
        if (!f117825f) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f117824e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i(f117821b, "fetchViewFlagsField: ");
            }
            f117825f = true;
        }
        Field field = f117824e;
        if (field != null) {
            try {
                f117824e.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void i(@NonNull View view, @NonNull Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            i((View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    public void j(@NonNull View view, @NonNull Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            j((View) parent, matrix);
            matrix.postTranslate(r0.getScrollX(), r0.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        Matrix matrix3 = new Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }
}
