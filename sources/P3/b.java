package P3;

import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.compose.runtime.internal.r;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 1)
public final class b implements Interpolator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f65553b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f65552a = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Interpolator f65554c = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return f65554c.getInterpolation(f10);
    }
}
