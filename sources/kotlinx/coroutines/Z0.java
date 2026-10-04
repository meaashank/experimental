package kotlinx.coroutines;

import kotlin.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface Z0<S> extends i.b {

    public static final class a {
        public static <S, R> R a(@NotNull Z0<S> z02, R r10, @NotNull ed.p<? super R, ? super i.b, ? extends R> pVar) {
            return (R) i.b.a.a(z02, r10, pVar);
        }

        @Nullable
        public static <S, E extends i.b> E b(@NotNull Z0<S> z02, @NotNull i.c<E> cVar) {
            return (E) i.b.a.b(z02, cVar);
        }

        @NotNull
        public static <S> kotlin.coroutines.i c(@NotNull Z0<S> z02, @NotNull i.c<?> cVar) {
            return i.b.a.c(z02, cVar);
        }

        @NotNull
        public static <S> kotlin.coroutines.i d(@NotNull Z0<S> z02, @NotNull kotlin.coroutines.i iVar) {
            return i.b.a.d(z02, iVar);
        }
    }

    void u(@NotNull kotlin.coroutines.i iVar, S s10);

    S z2(@NotNull kotlin.coroutines.i iVar);
}
