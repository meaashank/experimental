package androidx.core.view;

import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f111492a = 8388608;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f111493b = 8388611;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f111494c = 8388613;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f111495d = 8388615;

    public static void a(int i10, int i11, int i12, @NonNull Rect rect, int i13, int i14, @NonNull Rect rect2, int i15) {
        Gravity.apply(i10, i11, i12, rect, i13, i14, rect2, i15);
    }

    public static void b(int i10, int i11, int i12, @NonNull Rect rect, @NonNull Rect rect2, int i13) {
        Gravity.apply(i10, i11, i12, rect, rect2, i13);
    }

    public static void c(int i10, @NonNull Rect rect, @NonNull Rect rect2, int i11) {
        Gravity.applyDisplay(i10, rect, rect2, i11);
    }

    public static int d(int i10, int i11) {
        return Gravity.getAbsoluteGravity(i10, i11);
    }
}
