package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC1603p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface Q0<V extends AbstractC1603p> extends K0<V> {

    public static final class a {
        @Deprecated
        @NotNull
        public static <V extends AbstractC1603p> V a(@NotNull Q0<V> q02, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
            return (V) J0.a(q02, v10, v11, v12);
        }

        @Deprecated
        public static <V extends AbstractC1603p> boolean b(@NotNull Q0<V> q02) {
            return false;
        }
    }

    @Override // androidx.compose.animation.core.K0
    boolean a();
}
