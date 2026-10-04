package kotlinx.coroutines;

import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import kotlin.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlinx.coroutines.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC4982o(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@InterfaceC5120x0
public interface InterfaceC5115v extends A0 {

    /* JADX INFO: renamed from: kotlinx.coroutines.v$a */
    public static final class a {
        public static <R> R b(@NotNull InterfaceC5115v interfaceC5115v, R r10, @NotNull ed.p<? super R, ? super i.b, ? extends R> pVar) {
            return (R) i.b.a.a(interfaceC5115v, r10, pVar);
        }

        @Nullable
        public static <E extends i.b> E c(@NotNull InterfaceC5115v interfaceC5115v, @NotNull i.c<E> cVar) {
            return (E) i.b.a.b(interfaceC5115v, cVar);
        }

        @NotNull
        public static kotlin.coroutines.i d(@NotNull InterfaceC5115v interfaceC5115v, @NotNull i.c<?> cVar) {
            return i.b.a.c(interfaceC5115v, cVar);
        }

        @NotNull
        public static kotlin.coroutines.i e(@NotNull InterfaceC5115v interfaceC5115v, @NotNull kotlin.coroutines.i iVar) {
            return i.b.a.d(interfaceC5115v, iVar);
        }

        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static A0 f(@NotNull InterfaceC5115v interfaceC5115v, @NotNull A0 a02) {
            return a02;
        }
    }

    @InterfaceC5120x0
    void f(@NotNull P0 p02);
}
