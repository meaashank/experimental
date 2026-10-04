package androidx.compose.ui.graphics;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class M {
    @NotNull
    public static final ColorFilter a(@NotNull float[] fArr) {
        return new ColorMatrixColorFilter(fArr);
    }

    @NotNull
    public static final float[] b(@NotNull ColorFilter colorFilter) {
        if ((colorFilter instanceof ColorMatrixColorFilter) && g()) {
            return Q0.f100794a.a((ColorMatrixColorFilter) colorFilter);
        }
        throw new IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
    }

    @NotNull
    public static final ColorFilter c(long j10, long j11) {
        return new LightingColorFilter(M0.t(j10), M0.t(j11));
    }

    @NotNull
    public static final ColorFilter d(long j10, int i10) {
        return Build.VERSION.SDK_INT >= 29 ? C2123x0.f101784a.a(j10, i10) : new PorterDuffColorFilter(M0.t(j10), F.d(i10));
    }

    @NotNull
    public static final ColorFilter e(@NotNull L0 l02) {
        return l02.f100754a;
    }

    @NotNull
    public static final L0 f(@NotNull ColorFilter colorFilter) {
        if (29 <= Build.VERSION.SDK_INT && I.a(colorFilter)) {
            return C2123x0.f101784a.b(J.a(colorFilter));
        }
        if (!(colorFilter instanceof LightingColorFilter) || !h()) {
            return ((colorFilter instanceof ColorMatrixColorFilter) && g()) ? new O0((float[]) null, colorFilter) : new L0(colorFilter);
        }
        LightingColorFilter lightingColorFilter = (LightingColorFilter) colorFilter;
        return new C2049k2(M0.b(lightingColorFilter.getColorMultiply()), M0.b(lightingColorFilter.getColorAdd()), colorFilter);
    }

    public static final boolean g() {
        return 26 <= Build.VERSION.SDK_INT;
    }

    public static final boolean h() {
        return 26 <= Build.VERSION.SDK_INT;
    }
}
