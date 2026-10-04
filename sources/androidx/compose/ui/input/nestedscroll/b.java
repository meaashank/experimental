package androidx.compose.ui.input.nestedscroll;

import k0.E;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface b {

    public static final class a {
        @Deprecated
        @Nullable
        public static Object a(@NotNull b bVar, long j10, long j11, @NotNull kotlin.coroutines.e<? super E> eVar) {
            return androidx.compose.ui.input.nestedscroll.a.i(bVar, j10, j11, eVar);
        }

        @Deprecated
        public static long b(@NotNull b bVar, long j10, long j11, int i10) {
            return androidx.compose.ui.input.nestedscroll.a.b(bVar, j10, j11, i10);
        }

        @Deprecated
        @Nullable
        public static Object c(@NotNull b bVar, long j10, @NotNull kotlin.coroutines.e<? super E> eVar) {
            return androidx.compose.ui.input.nestedscroll.a.j(bVar, j10, eVar);
        }

        @Deprecated
        public static long d(@NotNull b bVar, long j10, int i10) {
            return androidx.compose.ui.input.nestedscroll.a.d(bVar, j10, i10);
        }
    }

    long H0(long j10, long j11, int i10);

    long j2(long j10, int i10);

    @Nullable
    Object m1(long j10, @NotNull kotlin.coroutines.e<? super E> eVar);

    @Nullable
    Object s0(long j10, long j11, @NotNull kotlin.coroutines.e<? super E> eVar);
}
