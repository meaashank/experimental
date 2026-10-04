package androidx.compose.ui.graphics;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@e.T(26)
public final class Q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Q0 f100794a = new Q0();

    @InterfaceC4345t
    @NotNull
    public final float[] a(@NotNull ColorMatrixColorFilter colorMatrixColorFilter) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrixColorFilter.getColorMatrix(colorMatrix);
        return colorMatrix.getArray();
    }
}
