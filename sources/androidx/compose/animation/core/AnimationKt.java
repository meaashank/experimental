package androidx.compose.animation.core;

import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.C4973z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AnimationKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f87626a = 1000000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f87627b = 1000;

    @NotNull
    public static final B<Float, C1595l> a(@NotNull X x10, float f10, float f11) {
        D d10 = new D(x10);
        H0<Float, C1595l> h0I = VectorConvertersKt.i(C4973z.f217984a);
        return new B<>((M0<C1595l>) d10.a(h0I), h0I, Float.valueOf(f10), new C1595l(f11));
    }

    public static /* synthetic */ B b(X x10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        return a(x10, f10, f11);
    }

    @NotNull
    public static final <T, V extends AbstractC1603p> C0<T, V> c(@NotNull InterfaceC1587h<T> interfaceC1587h, @NotNull H0<T, V> h02, T t10, T t11, T t12) {
        return new C0<>(interfaceC1587h, h02, t10, t11, h02.a().invoke(t12));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final <V extends AbstractC1603p> C0<V, V> d(@NotNull K0<V> k02, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return new C0<>(k02, (H0<V, V>) VectorConvertersKt.a(new ed.l<V, V>() { // from class: androidx.compose.animation.core.AnimationKt$createAnimation$1
            /* JADX WARN: Incorrect return type in method signature: (TV;)TV; */
            @NotNull
            public final AbstractC1603p e(@NotNull AbstractC1603p abstractC1603p) {
                return abstractC1603p;
            }

            @Override // ed.l
            public Object invoke(Object obj) {
                return (AbstractC1603p) obj;
            }
        }, new ed.l<V, V>() { // from class: androidx.compose.animation.core.AnimationKt$createAnimation$2
            /* JADX WARN: Incorrect return type in method signature: (TV;)TV; */
            @NotNull
            public final AbstractC1603p e(@NotNull AbstractC1603p abstractC1603p) {
                return abstractC1603p;
            }

            @Override // ed.l
            public Object invoke(Object obj) {
                return (AbstractC1603p) obj;
            }
        }), v10, v11, v12);
    }

    public static final long e(@NotNull InterfaceC1579d<?, ?> interfaceC1579d) {
        return interfaceC1579d.c() / 1000000;
    }

    public static final <T, V extends AbstractC1603p> T f(@NotNull InterfaceC1579d<T, V> interfaceC1579d, long j10) {
        return (T) interfaceC1579d.d().b().invoke(interfaceC1579d.g(j10));
    }
}
