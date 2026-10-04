package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
@e.T(19)
public class Q extends a0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f117766h = true;

    @Override // androidx.transition.a0
    public void a(@NonNull View view) {
    }

    @Override // androidx.transition.a0
    @SuppressLint({"NewApi"})
    public float c(@NonNull View view) {
        if (f117766h) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f117766h = false;
            }
        }
        return view.getAlpha();
    }

    @Override // androidx.transition.a0
    public void d(@NonNull View view) {
    }

    @Override // androidx.transition.a0
    @SuppressLint({"NewApi"})
    public void g(@NonNull View view, float f10) {
        if (f117766h) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f117766h = false;
            }
        }
        view.setAlpha(f10);
    }
}
