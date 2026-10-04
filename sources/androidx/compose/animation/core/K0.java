package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC1603p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface K0<V extends AbstractC1603p> {

    public static final class a {
        @Deprecated
        @NotNull
        public static <V extends AbstractC1603p> V a(@NotNull K0<V> k02, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
            return (V) J0.a(k02, v10, v11, v12);
        }
    }

    boolean a();

    long b(@NotNull V v10, @NotNull V v11, @NotNull V v12);

    @NotNull
    V c(@NotNull V v10, @NotNull V v11, @NotNull V v12);

    @NotNull
    V d(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12);

    @NotNull
    V e(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12);
}
