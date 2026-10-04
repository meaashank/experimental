package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC1603p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface O0<V extends AbstractC1603p> extends Q0<V> {

    public static final class a {
        @Deprecated
        public static <V extends AbstractC1603p> long a(@NotNull O0<V> o02, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
            return N0.a(o02, v10, v11, v12);
        }

        @Deprecated
        @NotNull
        public static <V extends AbstractC1603p> V b(@NotNull O0<V> o02, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
            return (V) J0.a(o02, v10, v11, v12);
        }

        @Deprecated
        public static <V extends AbstractC1603p> boolean c(@NotNull O0<V> o02) {
            return false;
        }
    }

    @Override // androidx.compose.animation.core.K0
    long b(@NotNull V v10, @NotNull V v11, @NotNull V v12);

    int f();

    int g();
}
