package kotlinx.coroutines;

import kotlin.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@W
@InterfaceC5107q0
public interface F<S> extends Z0<S> {

    public static final class a {
        public static <S, R> R a(@NotNull F<S> f10, R r10, @NotNull ed.p<? super R, ? super i.b, ? extends R> pVar) {
            return (R) i.b.a.a(f10, r10, pVar);
        }

        @Nullable
        public static <S, E extends i.b> E b(@NotNull F<S> f10, @NotNull i.c<E> cVar) {
            return (E) i.b.a.b(f10, cVar);
        }

        @NotNull
        public static <S> kotlin.coroutines.i c(@NotNull F<S> f10, @NotNull i.c<?> cVar) {
            return i.b.a.c(f10, cVar);
        }

        @NotNull
        public static <S> kotlin.coroutines.i d(@NotNull F<S> f10, @NotNull kotlin.coroutines.i iVar) {
            return i.b.a.d(f10, iVar);
        }
    }

    @NotNull
    kotlin.coroutines.i e(@NotNull i.b bVar);

    @NotNull
    F<S> s();
}
