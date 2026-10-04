package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
@e.T(22)
public class W extends U {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f117819l = true;

    @Override // androidx.transition.a0
    @SuppressLint({"NewApi"})
    public void f(@NonNull View view, int i10, int i11, int i12, int i13) {
        if (f117819l) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f117819l = false;
            }
        }
    }
}
