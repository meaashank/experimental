package Y0;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import e.T;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    @T(21)
    public static class a {
        public static Interpolator a(float f10, float f11) {
            return new PathInterpolator(f10, f11);
        }

        public static Interpolator b(float f10, float f11, float f12, float f13) {
            return new PathInterpolator(f10, f11, f12, f13);
        }

        public static Interpolator c(Path path) {
            return new PathInterpolator(path);
        }
    }

    @NonNull
    public static Interpolator a(float f10, float f11) {
        return new PathInterpolator(f10, f11);
    }

    @NonNull
    public static Interpolator b(float f10, float f11, float f12, float f13) {
        return new PathInterpolator(f10, f11, f12, f13);
    }

    @NonNull
    public static Interpolator c(@NonNull Path path) {
        return new PathInterpolator(path);
    }
}
