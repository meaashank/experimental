package androidx.compose.animation.core;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface W extends InterfaceC1587h<Float> {

    public static final class a {
        @Deprecated
        public static float a(@NotNull W w10, float f10, float f11, float f12) {
            return V.a(w10, f10, f11, f12);
        }

        @Deprecated
        @NotNull
        public static <V extends AbstractC1603p> R0<V> b(@NotNull W w10, @NotNull H0<Float, V> h02) {
            return new R0<>(w10);
        }
    }

    @Override // androidx.compose.animation.core.InterfaceC1587h
    /* bridge */ /* synthetic */ K0 a(H0 h02);

    @Override // androidx.compose.animation.core.InterfaceC1587h
    @NotNull
    <V extends AbstractC1603p> R0<V> a(@NotNull H0<Float, V> h02);

    float b(long j10, float f10, float f11, float f12);

    long c(float f10, float f11, float f12);

    float d(float f10, float f11, float f12);

    float e(long j10, float f10, float f11, float f12);
}
