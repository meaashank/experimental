package kotlinx.coroutines;

import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import kotlin.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface S<T> extends A0 {

    public static final class a {
        public static <T, R> R b(@NotNull S<? extends T> s10, R r10, @NotNull ed.p<? super R, ? super i.b, ? extends R> pVar) {
            return (R) i.b.a.a(s10, r10, pVar);
        }

        @Nullable
        public static <T, E extends i.b> E c(@NotNull S<? extends T> s10, @NotNull i.c<E> cVar) {
            return (E) i.b.a.b(s10, cVar);
        }

        @NotNull
        public static <T> kotlin.coroutines.i d(@NotNull S<? extends T> s10, @NotNull i.c<?> cVar) {
            return i.b.a.c(s10, cVar);
        }

        @NotNull
        public static <T> kotlin.coroutines.i e(@NotNull S<? extends T> s10, @NotNull kotlin.coroutines.i iVar) {
            return i.b.a.d(s10, iVar);
        }

        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static <T> A0 f(@NotNull S<? extends T> s10, @NotNull A0 a02) {
            return a02;
        }
    }

    @InterfaceC5107q0
    @Nullable
    Throwable X0();

    @NotNull
    kotlinx.coroutines.selects.e<T> Y1();

    @InterfaceC5107q0
    T n();

    @Nullable
    Object o(@NotNull kotlin.coroutines.e<? super T> eVar);
}
