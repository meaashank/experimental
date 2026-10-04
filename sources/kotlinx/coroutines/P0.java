package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import kotlin.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC4982o(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@InterfaceC5120x0
public interface P0 extends A0 {

    public static final class a {
        public static <R> R b(@NotNull P0 p02, R r10, @NotNull ed.p<? super R, ? super i.b, ? extends R> pVar) {
            return (R) i.b.a.a(p02, r10, pVar);
        }

        @Nullable
        public static <E extends i.b> E c(@NotNull P0 p02, @NotNull i.c<E> cVar) {
            return (E) i.b.a.b(p02, cVar);
        }

        @NotNull
        public static kotlin.coroutines.i d(@NotNull P0 p02, @NotNull i.c<?> cVar) {
            return i.b.a.c(p02, cVar);
        }

        @NotNull
        public static kotlin.coroutines.i e(@NotNull P0 p02, @NotNull kotlin.coroutines.i iVar) {
            return i.b.a.d(p02, iVar);
        }

        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static A0 f(@NotNull P0 p02, @NotNull A0 a02) {
            return a02;
        }
    }

    @InterfaceC5120x0
    @NotNull
    CancellationException N1();
}
