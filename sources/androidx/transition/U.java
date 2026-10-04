package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@e.T(21)
public class U extends Q {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f117800i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f117801j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static boolean f117802k = true;

    @Override // androidx.transition.a0
    @SuppressLint({"NewApi"})
    public void e(@NonNull View view, @Nullable Matrix matrix) {
        if (f117800i) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f117800i = false;
            }
        }
    }

    @Override // androidx.transition.a0
    @SuppressLint({"NewApi"})
    public void i(@NonNull View view, @NonNull Matrix matrix) {
        if (f117801j) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f117801j = false;
            }
        }
    }

    @Override // androidx.transition.a0
    @SuppressLint({"NewApi"})
    public void j(@NonNull View view, @NonNull Matrix matrix) {
        if (f117802k) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f117802k = false;
            }
        }
    }
}
