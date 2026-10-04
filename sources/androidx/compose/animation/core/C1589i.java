package androidx.compose.animation.core;

import androidx.compose.animation.core.C1586g0;
import androidx.compose.animation.core.C1590i0;
import androidx.compose.runtime.T1;
import e.InterfaceC4348w;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.animation.core.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1589i {
    public static final <T, V extends AbstractC1603p> V b(H0<T, V> h02, T t10) {
        if (t10 == null) {
            return null;
        }
        return h02.a().invoke(t10);
    }

    @T1
    @NotNull
    public static final <T> InterfaceC1587h<T> c(@NotNull InterfaceC1587h<T> interfaceC1587h, long j10) {
        return new C1621y0(interfaceC1587h, j10);
    }

    @T1
    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "This method has been deprecated in favor of the infinite repeatable function that accepts start offset.")
    public static final /* synthetic */ C1578c0 d(F f10, RepeatMode repeatMode) {
        return new C1578c0(f10, repeatMode, A0.d(0, 0, 2, null));
    }

    public static /* synthetic */ C1578c0 e(F f10, RepeatMode repeatMode, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        return d(f10, repeatMode);
    }

    @T1
    @NotNull
    public static final <T> C1578c0<T> f(@NotNull F<T> f10, @NotNull RepeatMode repeatMode, long j10) {
        return new C1578c0<>(f10, repeatMode, j10);
    }

    public static C1578c0 g(F f10, RepeatMode repeatMode, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i10 & 4) != 0) {
            j10 = A0.d(0, 0, 2, null);
        }
        return new C1578c0(f10, repeatMode, j10);
    }

    @T1
    @NotNull
    public static final <T> C1586g0<T> h(@NotNull ed.l<? super C1586g0.b<T>, kotlin.L0> lVar) {
        C1586g0.b bVar = new C1586g0.b();
        lVar.invoke(bVar);
        return new C1586g0<>(bVar);
    }

    @S
    @NotNull
    public static final <T> C1590i0<T> i(@InterfaceC4348w(from = 0.0d, to = 1.0d) float f10, @NotNull ed.l<? super C1590i0.a<T>, kotlin.L0> lVar) {
        C1590i0.a aVar = new C1590i0.a();
        lVar.invoke(aVar);
        return new C1590i0<>(aVar, f10);
    }

    @S
    @NotNull
    public static final <T> C1590i0<T> j(@NotNull ed.l<? super C1590i0.a<T>, kotlin.L0> lVar) {
        C1590i0.a aVar = new C1590i0.a();
        lVar.invoke(aVar);
        return new C1590i0<>(aVar);
    }

    @T1
    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "This method has been deprecated in favor of the repeatable function that accepts start offset.")
    public static final /* synthetic */ C1607r0 k(int i10, F f10, RepeatMode repeatMode) {
        return new C1607r0(i10, f10, repeatMode, A0.d(0, 0, 2, null));
    }

    public static /* synthetic */ C1607r0 l(int i10, F f10, RepeatMode repeatMode, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        return k(i10, f10, repeatMode);
    }

    @T1
    @NotNull
    public static final <T> C1607r0<T> m(int i10, @NotNull F<T> f10, @NotNull RepeatMode repeatMode, long j10) {
        return new C1607r0<>(i10, f10, repeatMode, j10);
    }

    public static C1607r0 n(int i10, F f10, RepeatMode repeatMode, long j10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        RepeatMode repeatMode2 = repeatMode;
        if ((i11 & 8) != 0) {
            j10 = A0.d(0, 0, 2, null);
        }
        return new C1607r0(i10, f10, repeatMode2, j10);
    }

    @T1
    @NotNull
    public static final <T> C1609s0<T> o(int i10) {
        return new C1609s0<>(i10);
    }

    public static C1609s0 p(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return new C1609s0(i10);
    }

    @T1
    @NotNull
    public static final <T> C1619x0<T> q(float f10, float f11, @Nullable T t10) {
        return new C1619x0<>(f10, f11, t10);
    }

    public static C1619x0 r(float f10, float f11, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1500.0f;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return new C1619x0(f10, f11, obj);
    }

    @T1
    @NotNull
    public static final <T> G0<T> s(int i10, int i11, @NotNull G g10) {
        return new G0<>(i10, i11, g10);
    }

    public static G0 t(int i10, int i11, G g10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 300;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            g10 = P.d();
        }
        return new G0(i10, i11, g10);
    }
}
