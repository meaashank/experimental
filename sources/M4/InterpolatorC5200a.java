package m4;

import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.compose.runtime.internal.r;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: m4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 1)
public final class InterpolatorC5200a implements Interpolator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f221101b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C0835a f221100a = new C0835a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Interpolator f221102c = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);

    /* JADX INFO: renamed from: m4.a$a, reason: collision with other inner class name */
    public static final class C0835a {
        public C0835a() {
        }

        public C0835a(C4969v c4969v) {
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return f221102c.getInterpolation(f10);
    }
}
