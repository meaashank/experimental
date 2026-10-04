package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C1589i;
import androidx.compose.animation.core.InterfaceC1587h;
import androidx.compose.foundation.L;
import androidx.compose.runtime.T1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@L
@T1
public interface InterfaceC1658f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f90023a = a.f90024a;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.f$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f90024a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final InterfaceC1587h<Float> f90025b = C1589i.r(0.0f, 0.0f, null, 7, null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final InterfaceC1658f f90026c = new C0195a();

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.f$a$a, reason: collision with other inner class name */
        public static final class C0195a implements InterfaceC1658f {
            @Override // androidx.compose.foundation.gestures.InterfaceC1658f
            public /* synthetic */ InterfaceC1587h a() {
                return C1657e.b(this);
            }

            @Override // androidx.compose.foundation.gestures.InterfaceC1658f
            public float b(float f10, float f11, float f12) {
                return InterfaceC1658f.f90023a.a(f10, f11, f12);
            }
        }

        public final float a(float f10, float f11, float f12) {
            float f13 = f11 + f10;
            if (f10 >= 0.0f && f13 <= f12) {
                return 0.0f;
            }
            if (f10 < 0.0f && f13 > f12) {
                return 0.0f;
            }
            float f14 = f13 - f12;
            return Math.abs(f10) < Math.abs(f14) ? f10 : f14;
        }

        @NotNull
        public final InterfaceC1658f b() {
            return f90026c;
        }

        @NotNull
        public final InterfaceC1587h<Float> c() {
            return f90025b;
        }
    }

    @NotNull
    InterfaceC1587h<Float> a();

    float b(float f10, float f11, float f12);
}
