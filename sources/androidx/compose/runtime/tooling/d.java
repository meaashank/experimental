package androidx.compose.runtime.tooling;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface d extends b {

    public static final class a {
        @Deprecated
        @Nullable
        public static d a(@NotNull d dVar, @NotNull Object obj) {
            return null;
        }

        @Deprecated
        public static int b(@NotNull d dVar) {
            return 0;
        }

        @Deprecated
        @Nullable
        public static Object c(@NotNull d dVar) {
            return null;
        }

        @Deprecated
        public static int d(@NotNull d dVar) {
            return 0;
        }
    }

    @Nullable
    Object g0();

    @NotNull
    Iterable<Object> getData();

    @NotNull
    Object getKey();

    @Nullable
    String h0();

    int i0();

    @Nullable
    Object j0();

    int k0();
}
