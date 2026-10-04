package androidx.core.view;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.core.view.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2499v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<VelocityTracker, C2501w0> f111958a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: androidx.core.view.v0$a */
    @e.T(34)
    public static class a {
        public static float a(VelocityTracker velocityTracker, int i10) {
            return velocityTracker.getAxisVelocity(i10);
        }

        public static float b(VelocityTracker velocityTracker, int i10, int i11) {
            return velocityTracker.getAxisVelocity(i10, i11);
        }

        public static boolean c(VelocityTracker velocityTracker, int i10) {
            return velocityTracker.isAxisSupported(i10);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.v0$b */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface b {
    }

    public static void a(@NonNull VelocityTracker velocityTracker, @NonNull MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f111958a.containsKey(velocityTracker)) {
                f111958a.put(velocityTracker, new C2501w0());
            }
            f111958a.get(velocityTracker).a(motionEvent);
        }
    }

    public static void b(@NonNull VelocityTracker velocityTracker) {
        velocityTracker.clear();
        l(velocityTracker);
    }

    public static void c(@NonNull VelocityTracker velocityTracker, int i10) {
        d(velocityTracker, i10, Float.MAX_VALUE);
    }

    public static void d(@NonNull VelocityTracker velocityTracker, int i10, float f10) {
        velocityTracker.computeCurrentVelocity(i10, f10);
        C2501w0 c2501w0G = g(velocityTracker);
        if (c2501w0G != null) {
            c2501w0G.d(i10, f10);
        }
    }

    public static float e(@NonNull VelocityTracker velocityTracker, int i10) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(velocityTracker, i10);
        }
        if (i10 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i10 == 1) {
            return velocityTracker.getYVelocity();
        }
        C2501w0 c2501w0G = g(velocityTracker);
        if (c2501w0G != null) {
            return c2501w0G.e(i10);
        }
        return 0.0f;
    }

    public static float f(@NonNull VelocityTracker velocityTracker, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.b(velocityTracker, i10, i11);
        }
        if (i10 == 0) {
            return velocityTracker.getXVelocity(i11);
        }
        if (i10 == 1) {
            return velocityTracker.getYVelocity(i11);
        }
        return 0.0f;
    }

    @Nullable
    public static C2501w0 g(VelocityTracker velocityTracker) {
        return f111958a.get(velocityTracker);
    }

    @e.S(expression = "tracker.getXVelocity(pointerId)")
    @Deprecated
    public static float h(VelocityTracker velocityTracker, int i10) {
        return velocityTracker.getXVelocity(i10);
    }

    @e.S(expression = "tracker.getYVelocity(pointerId)")
    @Deprecated
    public static float i(VelocityTracker velocityTracker, int i10) {
        return velocityTracker.getYVelocity(i10);
    }

    public static boolean j(@NonNull VelocityTracker velocityTracker, int i10) {
        return Build.VERSION.SDK_INT >= 34 ? a.c(velocityTracker, i10) : i10 == 26 || i10 == 0 || i10 == 1;
    }

    public static void k(@NonNull VelocityTracker velocityTracker) {
        velocityTracker.recycle();
        l(velocityTracker);
    }

    public static void l(VelocityTracker velocityTracker) {
        f111958a.remove(velocityTracker);
    }
}
