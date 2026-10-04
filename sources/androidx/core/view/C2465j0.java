package androidx.core.view;

import android.view.ScaleGestureDetector;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: androidx.core.view.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2465j0 {
    @e.S(expression = "scaleGestureDetector.isQuickScaleEnabled()")
    @Deprecated
    public static boolean a(@NonNull ScaleGestureDetector scaleGestureDetector) {
        return scaleGestureDetector.isQuickScaleEnabled();
    }

    @Deprecated
    public static boolean b(Object obj) {
        return ((ScaleGestureDetector) obj).isQuickScaleEnabled();
    }

    @e.S(expression = "scaleGestureDetector.setQuickScaleEnabled(enabled)")
    @Deprecated
    public static void c(@NonNull ScaleGestureDetector scaleGestureDetector, boolean z10) {
        scaleGestureDetector.setQuickScaleEnabled(z10);
    }

    @Deprecated
    public static void d(Object obj, boolean z10) {
        ((ScaleGestureDetector) obj).setQuickScaleEnabled(z10);
    }
}
