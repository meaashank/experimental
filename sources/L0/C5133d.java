package l0;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.r;
import i.C4541d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: l0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
@r(parameters = 1)
public final class C5133d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C5133d f220908a = new C5133d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f220909b = 0;

    public final float a(float f10, float f11, float f12, float f13, float f14) {
        return b(f10, f11, Math.max(0.0f, Math.min(1.0f, c(f12, f13, f14))));
    }

    public final float b(float f10, float f11, float f12) {
        return C4541d.a(f11, f10, f12, f10);
    }

    public final float c(float f10, float f11, float f12) {
        if (f10 == f11) {
            return 0.0f;
        }
        return (f12 - f10) / (f11 - f10);
    }
}
