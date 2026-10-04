package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
@e.T(23)
public class Y extends W {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f117820m = true;

    @Override // androidx.transition.a0
    @SuppressLint({"NewApi"})
    public void h(@NonNull View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.h(view, i10);
        } else if (f117820m) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f117820m = false;
            }
        }
    }
}
