package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: androidx.transition.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2700l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f117873a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f117874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f117875c;

    public static void a(@NonNull ImageView imageView, @Nullable Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            imageView.animateTransform(matrix);
            return;
        }
        if (matrix != null) {
            c(imageView, matrix);
            return;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
            imageView.invalidate();
        }
    }

    public static void b() {
        if (f117875c) {
            return;
        }
        try {
            Field declaredField = ImageView.class.getDeclaredField("mDrawMatrix");
            f117874b = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f117875c = true;
    }

    @e.T(21)
    @SuppressLint({"NewApi"})
    public static void c(@NonNull ImageView imageView, @Nullable Matrix matrix) {
        if (f117873a) {
            try {
                imageView.animateTransform(matrix);
            } catch (NoSuchMethodError unused) {
                f117873a = false;
            }
        }
    }
}
